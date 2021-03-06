package org.zstack.kvm;

import org.zstack.header.core.Completion;
import org.zstack.header.storage.primary.PrimaryStorageInventory;

/**
 * Created by xing5 on 2016/5/10.
 */
public interface KvmSetupSelfFencerExtensionPoint {
    class KvmSetupSelfFencerParam {
        private String hostUuid;
        private long interval;
        private int maxAttempts;
        private int storageCheckerTimeout;
        private PrimaryStorageInventory primaryStorage;

        public String getHostUuid() {
            return hostUuid;
        }

        public void setHostUuid(String hostUuid) {
            this.hostUuid = hostUuid;
        }

        public long getInterval() {
            return interval;
        }

        public void setInterval(long interval) {
            this.interval = interval;
        }

        public int getMaxAttempts() {
            return maxAttempts;
        }

        public void setMaxAttempts(int maxAttempts) {
            this.maxAttempts = maxAttempts;
        }

        public int getStorageCheckerTimeout() {
            return storageCheckerTimeout;
        }

        public void setStorageCheckerTimeout(int storageCheckerTimeout) {
            this.storageCheckerTimeout = storageCheckerTimeout;
        }

        public PrimaryStorageInventory getPrimaryStorage() {
            return primaryStorage;
        }

        public void setPrimaryStorage(PrimaryStorageInventory primaryStorage) {
            this.primaryStorage = primaryStorage;
        }
    }

    String kvmSetupSelfFencerStorageType();

    void kvmSetupSelfFencer(KvmSetupSelfFencerParam param, Completion completion);
}
