package com.example.movies.data;

import com.example.movies.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieData {

    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        Movie fastAndFuriousHobbsAndShaw = new Movie(
                "Fast & Furious Presents: Hobbs & Shaw",
                "Action | Adventure", "$200,000,000",
                "https://m.media-amazon.com/images/M/MV5BOTIzYmUyMmEtMWQzNC00YzExLTk3MzYtZTUzYjMyMmRiYzIwXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_SY1000_CR0,0,685,1000_AL_.jpg"
        );

        Movie nowYouSeeMe = new Movie(
                "Now You See Me", "Crime | Mystery | Thriller",
                "$75,000,000",
                "https://m.media-amazon.com/images/M/MV5BMTY0NDY3MDMxN15BMl5BanBnXkFtZTcwOTM5NzMzOQ@@._V1_SY1000_CR0,0,642,1000_AL_.jpg"
        );

        Movie nowYouSeeMeTwo = new Movie("Now You See Me 2", "Action | Adventure | Comedy | Crime | Mystery | Thriller", "$90,000,000", "https://m.media-amazon.com/images/M/MV5BYjhlNDljNTgtZjc4My00NmZmLTk2YzAtYWE5MDYwYjM4MTkzXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SY1000_CR0,0,662,1000_AL_.jpg");

        Movie forrestGump = new Movie("Forrest Gump", "Drama | Romance", "$55,000,000", "https://m.media-amazon.com/images/M/MV5BNWIwODRlZTUtY2U3ZS00Yzg1LWJhNzYtMmZiYmEyNmU1NjMzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg");

        Movie bttf = new Movie(
                "Back to the Future", "Adventure | Comedy | Sci-Fi", "$19,000,000",
                "https://m.media-amazon.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SY1000_CR0,0,643,1000_AL_.jpg"
        );

        Movie hobbit = new Movie(
                "The Hobbit: An Unexpected Journey",
                "Adventure | Family | Fantasy",
                "$180,000,000",
                "https://m.media-amazon.com/images/M/MV5BMTcwNTE4MTUxMl5BMl5BanBnXkFtZTcwMDIyODM4OA@@._V1_SY1000_CR0,0,674,1000_AL_.jpg"
        );

        Movie forbiddenKingdom = new Movie(
                "The Forbidden Kingdom",
                "Action | Adventure | Fantasy",
                "$55,000,000",
                "https://m.media-amazon.com/images/M/MV5BMTUwNTExMTg3NF5BMl5BanBnXkFtZTcwNDYyMTM2MQ@@._V1_.jpg"
        );

        Movie again = new Movie(
                "17 Again", "Comedy | Drama | Fantasy", "$20,000,000",
                "https://m.media-amazon.com/images/M/MV5BMjA2NTI1Mzg3N15BMl5BanBnXkFtZTcwMjYwNjAzMg@@._V1_.jpg"
        );

        Movie silence = new Movie(
            "Silence", "Drama | History", "$46,000,000",
                "https://m.media-amazon.com/images/M/MV5BMjY3OTk0NjA2NV5BMl5BanBnXkFtZTgwNTg3Mjc2MDI@._V1_SY1000_CR0,0,640,1000_AL_.jpg"
        );

        Movie titanic = new Movie(
                "Titanic", "Drama | Romance", "$200,000,000",
                "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,671,1000_AL_.jpg"
        );

        movies.add(fastAndFuriousHobbsAndShaw);
        movies.add(nowYouSeeMe);
        movies.add(nowYouSeeMeTwo);
        movies.add(forrestGump);
        movies.add(bttf);
        movies.add(hobbit);
        movies.add(forbiddenKingdom);
        movies.add(again);
        movies.add(silence);
        movies.add(titanic);

        return movies;
    }

}
