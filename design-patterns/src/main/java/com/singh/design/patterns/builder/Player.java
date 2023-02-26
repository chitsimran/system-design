package com.singh.design.patterns.builder;

public class Player {
    private String name;
    private String country;
    private Integer debutYear;
    private Integer matchesPlayed;

    private Player(PlayerBuilder playerBuilder) {
        this.name = playerBuilder.name;
        this.country = playerBuilder.country;
        this.debutYear = playerBuilder.debutYear;
        this.matchesPlayed = playerBuilder.matchesPlayed;
    }

    public String toString() {
        return "[" + name + ", " + country + ", " + debutYear + ", " + matchesPlayed + "]";
    }

    public static class PlayerBuilder {
        private String name;
        private String country;
        private Integer debutYear;
        private Integer matchesPlayed;

        public PlayerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PlayerBuilder country(String country) {
            this.country = country;
            return this;
        }

        public PlayerBuilder debutYear(Integer debutYear) {
            this.debutYear = debutYear;
            return this;
        }

        public PlayerBuilder matchesPlayed(Integer matchesPlayed) {
            this.matchesPlayed = matchesPlayed;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
