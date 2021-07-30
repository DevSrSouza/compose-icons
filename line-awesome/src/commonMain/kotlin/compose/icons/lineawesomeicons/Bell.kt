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

public val LineAwesomeIcons.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.8945f, 3.0f, 14.0f, 3.8945f, 14.0f, 5.0f)
                curveTo(14.0f, 5.0859f, 14.0195f, 5.168f, 14.0313f, 5.25f)
                curveTo(10.5742f, 6.1328f, 8.0f, 9.2734f, 8.0f, 13.0f)
                lineTo(8.0f, 22.0f)
                curveTo(8.0f, 22.5664f, 7.5664f, 23.0f, 7.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 25.0f)
                lineTo(13.1875f, 25.0f)
                curveTo(13.0742f, 25.3164f, 13.0f, 25.6484f, 13.0f, 26.0f)
                curveTo(13.0f, 27.6445f, 14.3555f, 29.0f, 16.0f, 29.0f)
                curveTo(17.6445f, 29.0f, 19.0f, 27.6445f, 19.0f, 26.0f)
                curveTo(19.0f, 25.6484f, 18.9258f, 25.3164f, 18.8125f, 25.0f)
                lineTo(26.0f, 25.0f)
                lineTo(26.0f, 23.0f)
                lineTo(25.0f, 23.0f)
                curveTo(24.4336f, 23.0f, 24.0f, 22.5664f, 24.0f, 22.0f)
                lineTo(24.0f, 13.2813f)
                curveTo(24.0f, 9.5234f, 21.4883f, 6.1719f, 17.9688f, 5.25f)
                curveTo(17.9805f, 5.168f, 18.0f, 5.0859f, 18.0f, 5.0f)
                curveTo(18.0f, 3.8945f, 17.1055f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(15.5625f, 7.0f)
                curveTo(15.707f, 6.9883f, 15.8516f, 7.0f, 16.0f, 7.0f)
                curveTo(16.0625f, 7.0f, 16.125f, 7.0f, 16.1875f, 7.0f)
                curveTo(19.4531f, 7.0977f, 22.0f, 9.9609f, 22.0f, 13.2813f)
                lineTo(22.0f, 22.0f)
                curveTo(22.0f, 22.3516f, 22.0742f, 22.6836f, 22.1875f, 23.0f)
                lineTo(9.8125f, 23.0f)
                curveTo(9.9258f, 22.6836f, 10.0f, 22.3516f, 10.0f, 22.0f)
                lineTo(10.0f, 13.0f)
                curveTo(10.0f, 9.8242f, 12.4453f, 7.2266f, 15.5625f, 7.0f)
                close()
                moveTo(16.0f, 25.0f)
                curveTo(16.5625f, 25.0f, 17.0f, 25.4375f, 17.0f, 26.0f)
                curveTo(17.0f, 26.5625f, 16.5625f, 27.0f, 16.0f, 27.0f)
                curveTo(15.4375f, 27.0f, 15.0f, 26.5625f, 15.0f, 26.0f)
                curveTo(15.0f, 25.4375f, 15.4375f, 25.0f, 16.0f, 25.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
