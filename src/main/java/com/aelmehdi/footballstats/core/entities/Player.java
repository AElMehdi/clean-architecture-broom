package com.aelmehdi.footballstats.core.entities;

import java.util.Objects;

public class Player {
    private String firstName;
    private String lastName;
    private String nationality;
    private int age;
    private int goals;
    private int assists;

    private Player(String firstName, String lastName, String nationality, int age, int goals, int assists) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.age = age;
        this.goals = goals;
        this.assists = assists;
    }

    public static PlayerBuilder builder() {
        return new PlayerBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (age != player.age) return false;
        if (goals != player.goals) return false;
        if (assists != player.assists) return false;
        if (!firstName.equals(player.firstName)) return false;
        if (!lastName.equals(player.lastName)) return false;
        return Objects.equals(nationality, player.nationality);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + goals;
        result = 31 * result + assists;
        return result;
    }

    public static class PlayerBuilder {
        private String firstName;
        private String lastName;
        private String nationality;
        private int age;
        private int goals;
        private int assists;

        public PlayerBuilder firstName(String first) {
            this.firstName = first;
            return this;
        }

        public PlayerBuilder lastName(String last) {
            this.lastName = last;
            return this;
        }

        public PlayerBuilder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public PlayerBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PlayerBuilder goals(int goals) {
            this.goals = goals;
            return this;
        }

        public PlayerBuilder assists(int assists) {
            this.assists = assists;
            return this;
        }

        public Player build() {
            return new Player(firstName, lastName, nationality, age, goals, assists);
        }
    }
}
