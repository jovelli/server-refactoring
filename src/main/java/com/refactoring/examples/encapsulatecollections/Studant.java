package com.refactoring.examples.encapsulatecollections;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.stream.Stream;

public class Studant {

    public Studant() {
        initialize();
    }

    private Set courses = new HashSet();

    public void setCourse(Set courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public Set getCourses() {
        return Collections.unmodifiableSet(courses);
    }

    public long advancedCoursesCount() {
        Stream<Course> s = this.courses.stream();
        return s.filter(a -> a.isAdvanced()).count();
    }

    public void initialize() {
        this.addCourse(new Course("Refactoring", true));
        this.addCourse(new Course("DataBases in depth", true));
        this.addCourse(new Course("CSS basics", false));

        Course lonelyCourse = new Course("Lonely Course", false);

        this.addCourse(lonelyCourse);
    }
}
