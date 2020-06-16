package BasicProblem.greedy;

//class Pair implements Comparable<Pair> {
class Pair  {
    int front;
    int second;

    public Pair(int front, int second) {
        this.front = front;
        this.second = second;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

//    @Override
//    public int compareTo(Pair o) {
//        return front - o.getFront();
//    }
}

