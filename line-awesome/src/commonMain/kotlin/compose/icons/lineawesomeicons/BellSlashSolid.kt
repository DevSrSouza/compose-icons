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

public val LineAwesomeIcons.BellSlashSolid: ImageVector
    get() {
        if (_bellSlashSolid != null) {
            return _bellSlashSolid!!
        }
        _bellSlashSolid = Builder(name = "BellSlashSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7188f, 2.2813f)
                lineTo(2.2813f, 3.7188f)
                lineTo(28.2813f, 29.7188f)
                lineTo(29.7188f, 28.2813f)
                lineTo(26.0f, 24.5625f)
                lineTo(26.0f, 23.0f)
                lineTo(25.0f, 23.0f)
                curveTo(24.4492f, 23.0f, 24.0f, 22.5508f, 24.0f, 22.0f)
                lineTo(24.0f, 13.2813f)
                curveTo(24.0f, 9.4531f, 21.418f, 6.2031f, 17.9688f, 5.2813f)
                curveTo(17.9805f, 5.1875f, 18.0f, 5.0977f, 18.0f, 5.0f)
                curveTo(18.0f, 3.8945f, 17.1055f, 3.0f, 16.0f, 3.0f)
                curveTo(14.8945f, 3.0f, 14.0f, 3.8945f, 14.0f, 5.0f)
                curveTo(14.0f, 5.0859f, 14.0195f, 5.168f, 14.0313f, 5.25f)
                curveTo(12.6914f, 5.5898f, 11.457f, 6.2617f, 10.4375f, 7.25f)
                curveTo(10.1367f, 7.5391f, 9.8711f, 7.8633f, 9.625f, 8.1875f)
                close()
                moveTo(15.5625f, 7.0f)
                curveTo(15.7656f, 6.9844f, 15.9844f, 6.9922f, 16.1875f, 7.0f)
                curveTo(19.3945f, 7.0977f, 22.0f, 9.9102f, 22.0f, 13.2813f)
                lineTo(22.0f, 20.5625f)
                lineTo(11.0625f, 9.625f)
                curveTo(11.2852f, 9.2969f, 11.5195f, 8.9688f, 11.8125f, 8.6875f)
                curveTo(12.8398f, 7.6875f, 14.1523f, 7.0977f, 15.5625f, 7.0f)
                close()
                moveTo(8.0313f, 12.25f)
                curveTo(8.0078f, 12.5039f, 8.0f, 12.7422f, 8.0f, 13.0f)
                lineTo(8.0f, 22.0f)
                curveTo(8.0f, 22.5508f, 7.5508f, 23.0f, 7.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 25.0f)
                lineTo(13.1875f, 25.0f)
                curveTo(13.0742f, 25.3164f, 13.0f, 25.6484f, 13.0f, 26.0f)
                curveTo(13.0f, 27.6445f, 14.3555f, 29.0f, 16.0f, 29.0f)
                curveTo(17.6445f, 29.0f, 19.0f, 27.6445f, 19.0f, 26.0f)
                curveTo(19.0f, 25.6484f, 18.9258f, 25.3164f, 18.8125f, 25.0f)
                lineTo(20.8125f, 25.0f)
                lineTo(18.8125f, 23.0f)
                lineTo(9.8125f, 23.0f)
                curveTo(9.9258f, 22.6875f, 10.0f, 22.3516f, 10.0f, 22.0f)
                lineTo(10.0f, 14.1875f)
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
        return _bellSlashSolid!!
    }

private var _bellSlashSolid: ImageVector? = null
