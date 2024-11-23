package hash_equals;

import java.util.Objects;

public class Message {
    private String value;

    public Message(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Message message = (Message) obj;
        return this.value.equals(message.value);
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value){
        this.value =value;
    }
}
