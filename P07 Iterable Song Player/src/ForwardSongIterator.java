import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardSongIterator implements Iterator<Song> {
    private LinkedNode<Song> next; // reference to the next linked node in a list of nodes.

    /**
     * Creates a new iterator which iterates through songs in front/head to back/tail order
     *
     * @param first - reference to the head of a doubly linked list of songs
     */
    public ForwardSongIterator(LinkedNode<Song> first) {
        next = first;
    }

    /**
     * Checks whether there are more songs to return
     *
     * @return true if there are more songs to return
     */
    @Override
    public boolean hasNext() {
        if (next != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the next song in the iteration
     *
     * @throws NoSuchElementException - with a descriptive error message if there are no more songs
     *                                to return in the reverse order (meaning if this.hasNext()
     *                                returns false)
     */
    @Override
    public Song next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException("no more songs to return in the reverse order");
        }

        Song toReturn = next.getData();
        next = next.getNext();
        return toReturn;

    }

}
