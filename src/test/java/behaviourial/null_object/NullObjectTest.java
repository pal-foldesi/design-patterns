package behaviourial.null_object;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NullObjectTest {

    @Test
    void canGetNullObject() {
        ReportRepository repository = new ReportRepository();
        Report nullObject = repository.obtainReport("");
        assertThat(nullObject.getAuthors()).isEmpty();
        assertThat(nullObject.getSummary()).isEmpty();
    }
}
