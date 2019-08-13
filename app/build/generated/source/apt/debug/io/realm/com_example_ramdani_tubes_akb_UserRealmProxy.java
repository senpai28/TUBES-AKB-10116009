package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_ramdani_tubes_akb_UserRealmProxy extends com.example.ramdani.tubes_akb.User
    implements RealmObjectProxy, com_example_ramdani_tubes_akb_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long namaIndex;
        long nimIndex;
        long notelpIndex;
        long emailIndex;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.namaIndex = addColumnDetails("nama", "nama", objectSchemaInfo);
            this.nimIndex = addColumnDetails("nim", "nim", objectSchemaInfo);
            this.notelpIndex = addColumnDetails("notelp", "notelp", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.namaIndex = src.namaIndex;
            dst.nimIndex = src.nimIndex;
            dst.notelpIndex = src.notelpIndex;
            dst.emailIndex = src.emailIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.example.ramdani.tubes_akb.User> proxyState;

    com_example_ramdani_tubes_akb_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.ramdani.tubes_akb.User>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaIndex);
    }

    @Override
    public void realmSet$nama(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'nama' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nim() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nimIndex);
    }

    @Override
    public void realmSet$nim(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'nim' to null.");
            }
            row.getTable().setString(columnInfo.nimIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'nim' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nimIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$notelp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.notelpIndex);
    }

    @Override
    public void realmSet$notelp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'notelp' to null.");
            }
            row.getTable().setString(columnInfo.notelpIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'notelp' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.notelpIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", 4, 0);
        builder.addPersistedProperty("nama", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nim", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("notelp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.example.ramdani.tubes_akb.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.ramdani.tubes_akb.User obj = null;
        if (update) {
            Table table = realm.getTable(com.example.ramdani.tubes_akb.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.example.ramdani.tubes_akb.User.class);
            long pkColumnIndex = columnInfo.namaIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("nama")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("nama"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.ramdani.tubes_akb.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_ramdani_tubes_akb_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("nama")) {
                if (json.isNull("nama")) {
                    obj = (io.realm.com_example_ramdani_tubes_akb_UserRealmProxy) realm.createObjectInternal(com.example.ramdani.tubes_akb.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_ramdani_tubes_akb_UserRealmProxy) realm.createObjectInternal(com.example.ramdani.tubes_akb.User.class, json.getString("nama"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'nama'.");
            }
        }

        final com_example_ramdani_tubes_akb_UserRealmProxyInterface objProxy = (com_example_ramdani_tubes_akb_UserRealmProxyInterface) obj;
        if (json.has("nim")) {
            if (json.isNull("nim")) {
                objProxy.realmSet$nim(null);
            } else {
                objProxy.realmSet$nim((String) json.getString("nim"));
            }
        }
        if (json.has("notelp")) {
            if (json.isNull("notelp")) {
                objProxy.realmSet$notelp(null);
            } else {
                objProxy.realmSet$notelp((String) json.getString("notelp"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.ramdani.tubes_akb.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.ramdani.tubes_akb.User obj = new com.example.ramdani.tubes_akb.User();
        final com_example_ramdani_tubes_akb_UserRealmProxyInterface objProxy = (com_example_ramdani_tubes_akb_UserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("nama")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nim")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nim((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nim(null);
                }
            } else if (name.equals("notelp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$notelp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$notelp(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'nama'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_example_ramdani_tubes_akb_UserRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.ramdani.tubes_akb.User.class), false, Collections.<String>emptyList());
        io.realm.com_example_ramdani_tubes_akb_UserRealmProxy obj = new io.realm.com_example_ramdani_tubes_akb_UserRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.ramdani.tubes_akb.User copyOrUpdate(Realm realm, UserColumnInfo columnInfo, com.example.ramdani.tubes_akb.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.ramdani.tubes_akb.User) cachedRealmObject;
        }

        com.example.ramdani.tubes_akb.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.ramdani.tubes_akb.User.class);
            long pkColumnIndex = columnInfo.namaIndex;
            String value = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nama();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_ramdani_tubes_akb_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.ramdani.tubes_akb.User copy(Realm realm, UserColumnInfo columnInfo, com.example.ramdani.tubes_akb.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.ramdani.tubes_akb.User) cachedRealmObject;
        }

        com_example_ramdani_tubes_akb_UserRealmProxyInterface realmObjectSource = (com_example_ramdani_tubes_akb_UserRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.ramdani.tubes_akb.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.namaIndex, realmObjectSource.realmGet$nama());
        builder.addString(columnInfo.nimIndex, realmObjectSource.realmGet$nim());
        builder.addString(columnInfo.notelpIndex, realmObjectSource.realmGet$notelp());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_ramdani_tubes_akb_UserRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.example.ramdani.tubes_akb.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.ramdani.tubes_akb.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.example.ramdani.tubes_akb.User.class);
        long pkColumnIndex = columnInfo.namaIndex;
        String primaryKeyValue = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nama();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$nim = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nim();
        if (realmGet$nim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim, false);
        }
        String realmGet$notelp = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$notelp();
        if (realmGet$notelp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.notelpIndex, rowIndex, realmGet$notelp, false);
        }
        String realmGet$email = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.ramdani.tubes_akb.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.example.ramdani.tubes_akb.User.class);
        long pkColumnIndex = columnInfo.namaIndex;
        com.example.ramdani.tubes_akb.User object = null;
        while (objects.hasNext()) {
            object = (com.example.ramdani.tubes_akb.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nama();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$nim = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nim();
            if (realmGet$nim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim, false);
            }
            String realmGet$notelp = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$notelp();
            if (realmGet$notelp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.notelpIndex, rowIndex, realmGet$notelp, false);
            }
            String realmGet$email = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.ramdani.tubes_akb.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.ramdani.tubes_akb.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.example.ramdani.tubes_akb.User.class);
        long pkColumnIndex = columnInfo.namaIndex;
        String primaryKeyValue = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nama();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$nim = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nim();
        if (realmGet$nim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nimIndex, rowIndex, false);
        }
        String realmGet$notelp = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$notelp();
        if (realmGet$notelp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.notelpIndex, rowIndex, realmGet$notelp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.notelpIndex, rowIndex, false);
        }
        String realmGet$email = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.ramdani.tubes_akb.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.example.ramdani.tubes_akb.User.class);
        long pkColumnIndex = columnInfo.namaIndex;
        com.example.ramdani.tubes_akb.User object = null;
        while (objects.hasNext()) {
            object = (com.example.ramdani.tubes_akb.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nama();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$nim = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$nim();
            if (realmGet$nim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nimIndex, rowIndex, false);
            }
            String realmGet$notelp = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$notelp();
            if (realmGet$notelp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.notelpIndex, rowIndex, realmGet$notelp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.notelpIndex, rowIndex, false);
            }
            String realmGet$email = ((com_example_ramdani_tubes_akb_UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
        }
    }

    public static com.example.ramdani.tubes_akb.User createDetachedCopy(com.example.ramdani.tubes_akb.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.ramdani.tubes_akb.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.ramdani.tubes_akb.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.ramdani.tubes_akb.User) cachedObject.object;
            }
            unmanagedObject = (com.example.ramdani.tubes_akb.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_ramdani_tubes_akb_UserRealmProxyInterface unmanagedCopy = (com_example_ramdani_tubes_akb_UserRealmProxyInterface) unmanagedObject;
        com_example_ramdani_tubes_akb_UserRealmProxyInterface realmSource = (com_example_ramdani_tubes_akb_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$nama(realmSource.realmGet$nama());
        unmanagedCopy.realmSet$nim(realmSource.realmGet$nim());
        unmanagedCopy.realmSet$notelp(realmSource.realmGet$notelp());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());

        return unmanagedObject;
    }

    static com.example.ramdani.tubes_akb.User update(Realm realm, UserColumnInfo columnInfo, com.example.ramdani.tubes_akb.User realmObject, com.example.ramdani.tubes_akb.User newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_ramdani_tubes_akb_UserRealmProxyInterface realmObjectTarget = (com_example_ramdani_tubes_akb_UserRealmProxyInterface) realmObject;
        com_example_ramdani_tubes_akb_UserRealmProxyInterface realmObjectSource = (com_example_ramdani_tubes_akb_UserRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.ramdani.tubes_akb.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.namaIndex, realmObjectSource.realmGet$nama());
        builder.addString(columnInfo.nimIndex, realmObjectSource.realmGet$nim());
        builder.addString(columnInfo.notelpIndex, realmObjectSource.realmGet$notelp());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{nama:");
        stringBuilder.append(realmGet$nama() != null ? realmGet$nama() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nim:");
        stringBuilder.append(realmGet$nim());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{notelp:");
        stringBuilder.append(realmGet$notelp());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_ramdani_tubes_akb_UserRealmProxy aUser = (com_example_ramdani_tubes_akb_UserRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUser.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUser.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
