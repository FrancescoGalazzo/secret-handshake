import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<>();
        int code = number & 0b1_1111;

        if ((code & 0b00001) != 0) {
            signals.add(Signal.WINK);
        }
        if ((code & 0b00010) != 0) {
            signals.add(Signal.DOUBLE_BLINK);
        }
        if ((code & 0b00100) != 0) {
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((code & 0b01000) != 0) {
            signals.add(Signal.JUMP);
        }
        if ((code & 0b10000) != 0) {
            Collections.reverse(signals);
        }

        return signals;
    }

}
