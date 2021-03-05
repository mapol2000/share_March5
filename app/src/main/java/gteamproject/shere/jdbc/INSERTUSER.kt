package gteamproject.shere.jdbc

import android.os.AsyncTask
import android.util.Log
import org.intellij.lang.annotations.JdkConstants
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class INSERTUSER : AsyncTask<Void?, Void?, Void?>() {

    companion object{
        const val insertSQL ="insert into exUser (user_id,user_pw) values(?,?)"
    }


    override fun doInBackground(vararg params: Void?): Void? {
        var conn: Connection? = null
        var pstmt: PreparedStatement? = null
        var rs: ResultSet? = null

        try {
            conn = JDBCUtil.makeConn()
            pstmt = conn!!.prepareStatement(insertSQL)
            pstmt.setString(1, "userid1")
            pstmt.setString(2, "userpw2")
            // pstmt.setString(2, emp.getFname())

            var cnt = pstmt.executeUpdate()
        } catch (se: SQLException) {
            println("insertEmp 에서 오류발생!!")
            se.printStackTrace()
        }

        return null
    }
}