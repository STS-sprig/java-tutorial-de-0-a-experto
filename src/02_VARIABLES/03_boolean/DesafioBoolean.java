/*
Estás construyendo un panel de estado del sistema. Crea múltiples variables booleanas para rastrear diferentes estados del sistema:

1.- Crear estas variables booleanas con los valores especificados:
    isServerOnline con valor true
    isMaintenanceMode con valor false
    hasBackup con valor true
    isUpdating con valor false
    isDatabaseConnected con valor true
    needsRestart con valor false
2.- Presta atención a:
    Nombres de variables correctos (exactamente como se muestran)
    Usando solo valores true o false
    Sintaxis correcta de declaración booleana
*/

public class DesafioBoolean {
    public static void main(String[] args){
        boolean  isServerOnline = true,
                isMaintenanceMode = false,
                hasBackup = true,
                isUpdating = false,
                isDatabaseConnected = true,
                needsRestart = false;

        System.out.println("Server Status:");
        System.out.println("-------------");
        System.out.println("Server Online: " + isServerOnline);
        System.out.println("Maintenance Mode: " + isMaintenanceMode);
        System.out.println("Backup Available: " + hasBackup);
        System.out.println("Update in Progress: " + isUpdating);
        System.out.println("Database Connected: " + isDatabaseConnected);
        System.out.println("Restart Required: " + needsRestart);
    }
}
