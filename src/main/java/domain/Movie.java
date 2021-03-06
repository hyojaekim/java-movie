package domain;

import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private static final char NEW_LINE = '\n';

    private final int id;
    private final String name;
    private final int price;

    private List<PlaySchedule> playSchedules = new ArrayList<>();

    public Movie(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void addPlaySchedule(PlaySchedule playSchedule) {
        playSchedules.add(playSchedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (PlaySchedule playSchedule : playSchedules) {
            sb.append(playSchedule);
        }
        return id + " - " + name + ", " + price + "원" + NEW_LINE
                + sb.toString();
    }

    public void toStringInfo(int time, int people) {
        String movieData = (id + " - " + name + ", " + price + "원");
        String movieTime = playSchedules.get(time).toStringData();
        OutputView.printMoviePayState(movieData, movieTime, people);
    }

    public int getTotalPrice(int people) {
        return this.price * people;
    }

    public int setPeople(int time, int people) {
        return playSchedules.get(time).setCapacity(people);
    }

    public int getPeople(int time) {
        return playSchedules.get(time).getCapacity();
    }

    public int getTimeSize() {
        return playSchedules.size();
    }
}
