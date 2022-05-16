package behaviourial.null_object;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportRepository {
    private final Map<String, Report> reports = new HashMap<>();

    public static final Report NULL = new Report() {
        @Override
        public String getSummary() {
            return "";
        }

        @Override
        public List<String> getAuthors() {
            return Collections.emptyList();
        }
    };

    public ReportRepository() {
        reports.put("Environmental Pollution in the 2110s", new Report() {
            @Override
            public String getSummary() {
                return "It's bad... but not quite as bad as it was in the 2050s.";
            }

            @Override
            public List<String> getAuthors() {
                return List.of("AI a5f2c9e2");
            }
        });
        reports.put("The trend towards 8\" smartphones", new Report() {
            @Override
            public String getSummary() {
                return "Not even expert industry analysts understand why this inconvenient format " +
                        "has become so prevalent.";
            }

            @Override
            public List<String> getAuthors() {
                return List.of("Kilo Buhorn");
            }
        });
    }

    public Report obtainReport(String name) {
        return reports.getOrDefault(name, NULL);
    }
}
