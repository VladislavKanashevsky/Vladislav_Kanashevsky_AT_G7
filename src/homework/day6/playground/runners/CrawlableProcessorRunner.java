package day6.playground.runners;

import day6.playground.essence.creatures.*;
import day6.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {

        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }

            @Override
            public String getName() {
                return null;
            }
        };

        crawlableProcessor.runCrawlable(crawlableCrocodile);
        System.out.println();
        crawlableProcessor.runCrawlable(crawlableBeetle);
        System.out.println();
        crawlableProcessor.runCrawlable(vertebrataCrocodile);
        System.out.println();
        crawlableProcessor.runCrawlable(insectBeetle);
        System.out.println();
        crawlableProcessor.runCrawlable(aCrocodile);
        System.out.println();
        crawlableProcessor.runCrawlable(aBeetle);
        System.out.println();

        crawlableProcessor.runCrawlable(crawlableCrocodile, "nowhere");
        System.out.println();
        crawlableProcessor.runCrawlable(crawlableBeetle, "everywhere");
        System.out.println();
        crawlableProcessor.runCrawlable(vertebrataCrocodile, "back", 37);
        System.out.println();
        crawlableProcessor.runCrawlable(anonymousCrawlable, "down", 37);
        System.out.println();

    }
}
