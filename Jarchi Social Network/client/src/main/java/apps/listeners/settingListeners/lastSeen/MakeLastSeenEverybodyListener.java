package apps.listeners.settingListeners.lastSeen;

import apps.controller.setting.LastSeenController;
import listeners.ButtonListener;

import java.io.IOException;

public class MakeLastSeenEverybodyListener implements ButtonListener {
    private LastSeenController lastSeenController;
    @Override
    public void buttonPressed() throws IOException {
        lastSeenController = new LastSeenController();
        lastSeenController.makeLastSeenEveryBody();
    }
}
