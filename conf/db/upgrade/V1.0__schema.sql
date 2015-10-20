ALTER TABLE HostCapacityVO ADD totalPhysicalMemory bigint unsigned NOT NULL DEFAULT 0;
ALTER TABLE HostCapacityVO ADD availablePhysicalMemory bigint unsigned NOT NULL DEFAULT 0;

ALTER TABLE HostCapacityVO MODIFY availableMemory bigint signed NOT NULL DEFAULT 0;
ALTER TABLE PrimaryStorageCapacityVO MODIFY availableCapacity bigint signed NOT NULL DEFAULT 0;
ALTER TABLE LocalStorageHostRefVO MODIFY availableCapacity bigint signed NOT NULL DEFAULT 0;