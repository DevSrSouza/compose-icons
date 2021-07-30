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

public val LineAwesomeIcons.RadiationAltSolid: ImageVector
    get() {
        if (_radiationAltSolid != null) {
            return _radiationAltSolid!!
        }
        _radiationAltSolid = Builder(name = "RadiationAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.0859f, 5.0f, 27.0f, 9.9141f, 27.0f, 16.0f)
                curveTo(27.0f, 22.0859f, 22.0859f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9141f, 27.0f, 5.0f, 22.0859f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9141f, 9.9141f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.5f, 8.1875f)
                curveTo(8.8008f, 9.7891f, 7.0f, 12.6992f, 7.0f, 16.0f)
                lineTo(13.5f, 16.0f)
                curveTo(13.5f, 15.1016f, 14.0117f, 14.3125f, 14.8125f, 13.8125f)
                close()
                moveTo(20.5f, 8.1875f)
                lineTo(17.3125f, 13.8125f)
                curveTo(18.1133f, 14.2109f, 18.5938f, 15.0f, 18.5938f, 16.0f)
                lineTo(25.0f, 16.0f)
                curveTo(25.0f, 12.6992f, 23.1992f, 9.7891f, 20.5f, 8.1875f)
                close()
                moveTo(10.9063f, 11.1875f)
                lineTo(12.1875f, 13.5f)
                curveTo(12.0859f, 13.6992f, 12.0078f, 13.8008f, 11.9063f, 14.0f)
                lineTo(9.3125f, 14.0f)
                curveTo(9.6133f, 13.0f, 10.207f, 11.9883f, 10.9063f, 11.1875f)
                close()
                moveTo(21.0938f, 11.1875f)
                curveTo(21.8945f, 11.9883f, 22.3867f, 13.0f, 22.6875f, 14.0f)
                lineTo(20.0938f, 14.0f)
                curveTo(19.9922f, 13.8008f, 19.9141f, 13.6016f, 19.8125f, 13.5f)
                close()
                moveTo(16.0f, 14.4063f)
                curveTo(15.1016f, 14.4063f, 14.4063f, 15.1016f, 14.4063f, 16.0f)
                curveTo(14.4063f, 16.8984f, 15.1016f, 17.5938f, 16.0f, 17.5938f)
                curveTo(16.8984f, 17.5938f, 17.5938f, 16.8984f, 17.5938f, 16.0f)
                curveTo(17.5938f, 15.1016f, 16.8984f, 14.4063f, 16.0f, 14.4063f)
                close()
                moveTo(14.6875f, 18.1875f)
                lineTo(11.5f, 23.8125f)
                curveTo(12.8008f, 24.6133f, 14.3984f, 25.0f, 16.0f, 25.0f)
                curveTo(17.6016f, 25.0f, 19.1992f, 24.6133f, 20.5f, 23.8125f)
                lineTo(17.3125f, 18.1875f)
                curveTo(16.9141f, 18.3867f, 16.5f, 18.5f, 16.0f, 18.5f)
                curveTo(15.5f, 18.5f, 15.0859f, 18.3867f, 14.6875f, 18.1875f)
                close()
                moveTo(15.6875f, 20.5f)
                lineTo(16.3125f, 20.5f)
                lineTo(17.5938f, 22.8125f)
                curveTo(17.0938f, 22.9141f, 16.5f, 23.0f, 16.0f, 23.0f)
                curveTo(15.5f, 23.0f, 14.9063f, 22.9141f, 14.4063f, 22.8125f)
                close()
            }
        }
        .build()
        return _radiationAltSolid!!
    }

private var _radiationAltSolid: ImageVector? = null
