package creational.builder;

public class CupOfTea {
    private final String teaType;
    private final boolean sugar;
    private final boolean nutraSweet;
    private final boolean stevia;
    private final boolean honey;
    private final boolean lemon;

    private CupOfTea(Builder builder) {
        teaType = builder.teaType;
        sugar = builder.sugar;
        nutraSweet = builder.nutraSweet;
        stevia = builder.stevia;
        honey = builder.honey;
        lemon = builder.lemon;
    }

    public String getTeaType() {
        return teaType;
    }

    public boolean isSugar() {
        return sugar;
    }

    public boolean isNutraSweet() {
        return nutraSweet;
    }

    public boolean isStevia() {
        return stevia;
    }

    public boolean isHoney() {
        return honey;
    }

    public boolean isLemon() {
        return lemon;
    }

    public static class Builder {
        // required
        private final String teaType;

        // optional
        private boolean sugar = false;
        private boolean nutraSweet = false;
        private boolean stevia = false;
        private boolean honey = false;
        private boolean lemon = false;

        public Builder(String teaType) {
            this.teaType = teaType;
        }

        public Builder withSugar(boolean withSugar) {
            this.sugar = withSugar;
            return this;
        }

        public Builder withNutraSweet(boolean withNutraSweet) {
            this.nutraSweet = withNutraSweet;
            return this;
        }

        public Builder withStevia(boolean withStevia) {
            this.stevia = withStevia;
            return this;
        }

        public Builder withHoney(boolean withHoney) {
            this.honey = withHoney;
            return this;
        }

        public Builder withLemon(boolean withLemon) {
            this.lemon = withLemon;
            return this;
        }

        public CupOfTea build() {
            return new CupOfTea(this);
        }
    }
}
