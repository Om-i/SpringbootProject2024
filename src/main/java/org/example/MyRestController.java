package org.example;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/api/daysUntilNextYear")
    public int daysUntilNextYear() {
        LocalDate today = LocalDate.now();
        LocalDate nextYear = new LocalDate(today.getYear() + 1, 1, 1);
        return Days.daysBetween(today,nextYear).getDays();
    }
}
