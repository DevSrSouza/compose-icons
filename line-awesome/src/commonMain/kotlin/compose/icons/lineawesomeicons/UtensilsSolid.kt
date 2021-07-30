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

public val LineAwesomeIcons.UtensilsSolid: ImageVector
    get() {
        if (_utensilsSolid != null) {
            return _utensilsSolid!!
        }
        _utensilsSolid = Builder(name = "UtensilsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                curveTo(9.3633f, 5.0f, 8.1367f, 6.2109f, 7.3125f, 7.5625f)
                curveTo(6.4883f, 8.9141f, 6.0f, 10.5156f, 6.0f, 12.0f)
                curveTo(6.0f, 14.582f, 7.7813f, 16.4648f, 10.0f, 16.9063f)
                lineTo(10.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                lineTo(12.0f, 16.9063f)
                curveTo(14.2188f, 16.4648f, 16.0f, 14.582f, 16.0f, 12.0f)
                curveTo(16.0f, 10.5156f, 15.5117f, 8.9141f, 14.6875f, 7.5625f)
                curveTo(13.8633f, 6.2109f, 12.6367f, 5.0f, 11.0f, 5.0f)
                close()
                moveTo(18.0f, 5.0f)
                lineTo(18.0f, 12.0f)
                curveTo(18.0f, 13.8516f, 19.2813f, 15.3984f, 21.0f, 15.8438f)
                lineTo(21.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 15.8438f)
                curveTo(24.7188f, 15.3984f, 26.0f, 13.8516f, 26.0f, 12.0f)
                lineTo(26.0f, 5.0f)
                lineTo(24.0f, 5.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.0f, 13.1172f, 23.1172f, 14.0f, 22.0f, 14.0f)
                curveTo(20.8828f, 14.0f, 20.0f, 13.1172f, 20.0f, 12.0f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(21.0f, 5.0f)
                lineTo(21.0f, 12.0f)
                curveTo(21.0f, 12.5508f, 21.4492f, 13.0f, 22.0f, 13.0f)
                curveTo(22.5508f, 13.0f, 23.0f, 12.5508f, 23.0f, 12.0f)
                lineTo(23.0f, 5.0f)
                close()
                moveTo(11.0f, 7.0f)
                curveTo(11.5742f, 7.0f, 12.3438f, 7.5664f, 12.9688f, 8.5938f)
                curveTo(13.5938f, 9.6211f, 14.0f, 10.9961f, 14.0f, 12.0f)
                curveTo(14.0f, 14.0039f, 12.75f, 15.0f, 11.0f, 15.0f)
                curveTo(9.25f, 15.0f, 8.0f, 14.0039f, 8.0f, 12.0f)
                curveTo(8.0f, 10.9961f, 8.4063f, 9.6211f, 9.0313f, 8.5938f)
                curveTo(9.6563f, 7.5664f, 10.4258f, 7.0f, 11.0f, 7.0f)
                close()
            }
        }
        .build()
        return _utensilsSolid!!
    }

private var _utensilsSolid: ImageVector? = null
