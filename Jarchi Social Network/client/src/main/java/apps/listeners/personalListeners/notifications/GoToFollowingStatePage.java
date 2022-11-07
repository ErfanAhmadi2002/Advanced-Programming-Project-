package apps.listeners.personalListeners.notifications;

import controller.LogicalAgent;
import listeners.ButtonListener;

import java.io.IOException;

public class GoToFollowingStatePage implements ButtonListener {
    @Override
    public void buttonPressed() throws IOException {
        LogicalAgent.viewManager.LoadScene("followingState");
    }
}
