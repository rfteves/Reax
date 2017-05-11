/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.data;

import java.lang.reflect.Field;
import java.util.List;
import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.mappings.DatabaseMapping;

/**
 *
 * @author rfteves
 */
public class ColumnPositionCustomizer implements DescriptorCustomizer {

    @Override
    public void customize(ClassDescriptor cd) throws Exception {
           List<DatabaseMapping> mappings = cd.getMappings();
           Field[] fields = cd.getJavaClass().getDeclaredFields();
           for (DatabaseMapping mapping : mappings) {  
                String key = mapping.getAttributeName();  
                Field f = null;
                int weight = 0;
                for (Field field : fields) {
                    if (field.getName().equalsIgnoreCase(key)) {
                        f = field;
                        break;
                    }
                    ++weight;
                }
                mapping.setWeight(weight);  
          }  
    }
    
}
