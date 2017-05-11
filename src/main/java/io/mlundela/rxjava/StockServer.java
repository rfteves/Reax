package io.mlundela.rxjava;

import rx.Observable;

import java.util.List;

public class StockServer {
    
    public static Observable<StockInfo> getFeed(List<String> symbols) {
        return Observable.create(subscriber -> {
            while (!subscriber.isUnsubscribed()) {
                symbols.stream().map(StockInfo::fetch).forEach(subscriber::onNext);
                System.out.println("done");
                symbols.clear();
            }
        });
    }
}
