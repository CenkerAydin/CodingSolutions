package Java;

import java.util.List;

public class PriorityQueue<S> {
    class Student implements Comparable<Student> {
        private int id;
        private String name;
        private double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCGPA() {
            return cgpa;
        }

        @Override
        public int compareTo(Student other) {
            if (cgpa != other.cgpa) {
                return Double.compare(other.cgpa, cgpa); // Higher CGPA has higher priority
            } else if (!name.equals(other.name)) {
                return name.compareTo(other.name); // Sort by name in ascending order
            } else {
                return Integer.compare(id, other.id); // Sort by ID in ascending order
            }
        }
    }

    class Priorities {
        public Priorities(){

        }
        public List<Student> getStudents(List<String> events) {
            PriorityQueue<Student> queue = new PriorityQueue<>();

            for (String event : events) {
                String[] parts = event.split(" ");
                if (parts[0].equals("ENTER")) {
                    String name = parts[1];
                    double cgpa = Double.parseDouble(parts[2]);
                    int id = Integer.parseInt(parts[3]);
                    Student student = new Student(id, name, cgpa);
                    queue.add(student);
                } else if (parts[0].equals("SERVED")) {
                    queue.poll();
                }
            }

            List<Student> students = new ArrayList<>();
            while (!queue.isEmpty()) {
                students.add(queue.poll());
            }
            return students;
        }
    }
