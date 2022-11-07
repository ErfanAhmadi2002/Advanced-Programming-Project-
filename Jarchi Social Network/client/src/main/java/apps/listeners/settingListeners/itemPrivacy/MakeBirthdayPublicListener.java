package apps.listeners.settingListeners.itemPrivacy;

import apps.controller.setting.ItemPrivacyController;
import listeners.ButtonListener;

import java.io.IOException;

public class MakeBirthdayPublicListener implements ButtonListener {
    private ItemPrivacyController itemPrivacyController;
    @Override
    public void buttonPressed() throws IOException {
        itemPrivacyController = new ItemPrivacyController();
        itemPrivacyController.makeBirthDayPublic();
    }
}
