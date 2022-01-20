package com.nttdata.actividad1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@SpringBootApplication
public class ObserverAct1 {

	public static void main(String[] args) {
        
        Observable<String> messageSender = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
        
        messageSender.subscribe(new Observer<String>() {

        	@Override
            public void onSubscribe(Disposable d) {
                System.out.println("Observer. Subscribed");
            }

            @Override
            public void onNext(String t) {
                System.out.println("Observer. Received " + t);
            }

            @Override
            public void onError(Throwable e) {    
                System.out.println("Observer. Error: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Observer. Completed");
            }
            
        });
    }

 

}

