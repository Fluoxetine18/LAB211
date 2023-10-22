package mock;

import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Intern;

import java.util.ArrayList;
import java.util.List;

/**
 * Mock initial data.
 */
public class Data {

    public static List<Candidate> listCandidate = new ArrayList<Candidate>() {
        {
            add(new Experience(1, "Luka", "Show", 1995, "Kingston upon Thames", "0987654321", "lukashaw@uk.com", 0, 4, "Java, CSD"));
            add(new Intern(2, "Kelly", "Burke", 2000, "Box 626, 8725 Pede, Street", "(419) 945-1223", "feugiat@outlook.edu", 2, "SE", 4, "Swinburne University"));
            add(new Intern(3, "Rylee", "Lott", 2001, "Los Angeles", "0989336666", "lectus.justo@icloud.net", 2, "SE", 2, "Harvard University"));
            add(new Intern(4, "Truong", "Vu", 2001, "Vietnam", "0989663333", "vutruong201@gmail.com", 2, "SE", 5, "FPT University"));
            add(new Fresher(5, "Eugenia", "Trevino", 1992, "San Antonio", "0866221234", "orci.phasellus@protonmail.edu", 1, 2012, "Good", "Harvard University"));
            add(new Experience(6, "Jesse", "Reeves", 1996, "Houston", "0978345678", "urna.nec@hotmail.org", 0, 7, "Java, C++"));
            add(new Fresher(7, "Sierra", "Ruiz", 1992, "San Francisco", "0386226789", "sierrablue@gmail.com", 1, 2012, "Excellence", "Oxford University"));
        }
    };
}
