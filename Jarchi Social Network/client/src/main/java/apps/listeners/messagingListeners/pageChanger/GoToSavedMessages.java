package apps.listeners.messagingListeners.pageChanger;

import controller.LogicalAgent;
import listeners.ButtonListener;

import java.io.IOException;

public class GoToSavedMessages implements ButtonListener {
    @Override
    public void buttonPressed() throws IOException {
        LogicalAgent.viewManager.LoadScene("savedMessages");
    }
}
