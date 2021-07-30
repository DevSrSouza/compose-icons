package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.UserNinjaSolid: ImageVector
    get() {
        if (_userNinjaSolid != null) {
            return _userNinjaSolid!!
        }
        _userNinjaSolid = Builder(name = "UserNinjaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(13.179f, 5.0f, 10.7833f, 6.6266f, 9.6699f, 9.0f)
                lineTo(9.5996f, 9.0f)
                lineTo(9.4512f, 9.5234f)
                curveTo(9.3853f, 9.7002f, 9.3253f, 9.879f, 9.2734f, 10.0625f)
                curveTo(9.267f, 10.0823f, 9.2581f, 10.1012f, 9.252f, 10.1211f)
                lineTo(5.5996f, 7.1992f)
                lineTo(4.4004f, 8.8008f)
                lineTo(7.0996f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 13.0f)
                lineTo(9.0664f, 13.0f)
                curveTo(9.1079f, 13.3189f, 9.1741f, 13.6296f, 9.2695f, 13.9277f)
                curveTo(9.322f, 14.1146f, 9.3841f, 14.2966f, 9.4512f, 14.4766f)
                lineTo(9.5996f, 15.0f)
                lineTo(9.6699f, 15.0f)
                curveTo(10.2061f, 16.143f, 11.0335f, 17.1153f, 12.0703f, 17.8125f)
                curveTo(8.51f, 19.3473f, 6.0f, 22.8936f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.6f, 11.6f, 19.0f, 16.0f, 19.0f)
                curveTo(20.4f, 19.0f, 24.0f, 22.6f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 22.8933f, 23.4904f, 19.3452f, 19.9297f, 17.8105f)
                curveTo(20.9655f, 17.1135f, 21.7943f, 16.1421f, 22.3301f, 15.0f)
                lineTo(22.4004f, 15.0f)
                lineTo(22.4297f, 14.791f)
                curveTo(22.7957f, 13.9377f, 23.0f, 12.996f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(17.661f, 7.0f, 19.0972f, 7.7856f, 20.002f, 9.0f)
                lineTo(11.998f, 9.0f)
                curveTo(12.9028f, 7.7856f, 14.339f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(11.0996f, 11.0f)
                lineTo(20.9004f, 11.0f)
                curveTo(20.9107f, 11.031f, 20.9097f, 11.0706f, 20.918f, 11.1035f)
                curveTo(20.9688f, 11.3941f, 21.0f, 11.6929f, 21.0f, 12.0f)
                curveTo(21.0f, 12.3071f, 20.9688f, 12.6059f, 20.918f, 12.8965f)
                curveTo(20.9097f, 12.9294f, 20.9107f, 12.969f, 20.9004f, 13.0f)
                lineTo(11.0996f, 13.0f)
                curveTo(11.0893f, 12.969f, 11.0903f, 12.9294f, 11.082f, 12.8965f)
                curveTo(11.0312f, 12.6059f, 11.0f, 12.3071f, 11.0f, 12.0f)
                curveTo(11.0f, 11.6929f, 11.0312f, 11.3941f, 11.082f, 11.1035f)
                curveTo(11.0903f, 11.0706f, 11.0893f, 11.031f, 11.0996f, 11.0f)
                close()
                moveTo(11.998f, 15.0f)
                lineTo(20.002f, 15.0f)
                curveTo(19.0972f, 16.2144f, 17.661f, 17.0f, 16.0f, 17.0f)
                curveTo(14.339f, 17.0f, 12.9028f, 16.2144f, 11.998f, 15.0f)
                close()
            }
        }
        .build()
        return _userNinjaSolid!!
    }

private var _userNinjaSolid: ImageVector? = null
