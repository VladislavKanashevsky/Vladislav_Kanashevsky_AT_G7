package day6.playground.processors;

import day6.playground.essence.creatures.Crawlable;
import day6.playground.utils.CoordinatesGenerator;
import day6.playground.utils.DirectionGenerator;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        crawlable.crawl(DirectionGenerator.generateDirection(), CoordinatesGenerator.generateCoordinate());
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        crawlable.crawl(direction, CoordinatesGenerator.generateCoordinate());
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }
}
