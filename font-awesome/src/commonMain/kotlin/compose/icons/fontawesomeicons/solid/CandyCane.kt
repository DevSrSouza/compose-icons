package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CandyCane: ImageVector
    get() {
        if (_candyCane != null) {
            return _candyCane!!
        }
        _candyCane = Builder(name = "CandyCane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.5f, 92.0f)
                curveTo(469.6f, 33.1f, 411.8f, 0.0f, 352.4f, 0.0f)
                curveToRelative(-27.9f, 0.0f, -56.2f, 7.3f, -81.8f, 22.6f)
                lineTo(243.1f, 39.0f)
                curveToRelative(-15.2f, 9.1f, -20.1f, 28.7f, -11.0f, 43.9f)
                lineToRelative(32.8f, 54.9f)
                curveToRelative(6.0f, 10.0f, 16.6f, 15.6f, 27.5f, 15.6f)
                curveToRelative(5.6f, 0.0f, 11.2f, -1.5f, 16.4f, -4.5f)
                lineToRelative(27.5f, -16.4f)
                curveToRelative(5.1f, -3.1f, 10.8f, -4.5f, 16.4f, -4.5f)
                curveToRelative(10.9f, 0.0f, 21.5f, 5.6f, 27.5f, 15.6f)
                curveToRelative(9.1f, 15.1f, 4.1f, 34.8f, -11.0f, 43.9f)
                lineTo(15.6f, 397.6f)
                curveToRelative(-15.2f, 9.1f, -20.1f, 28.7f, -11.0f, 43.9f)
                lineToRelative(32.8f, 54.9f)
                curveToRelative(6.0f, 10.0f, 16.6f, 15.6f, 27.5f, 15.6f)
                curveToRelative(5.6f, 0.0f, 11.2f, -1.5f, 16.4f, -4.5f)
                lineTo(428.6f, 301.0f)
                curveToRelative(71.7f, -42.9f, 104.6f, -133.5f, 68.9f, -209.0f)
                close()
                moveTo(319.8f, 105.0f)
                lineToRelative(-2.5f, 1.5f)
                lineTo(296.8f, 45.0f)
                curveToRelative(9.7f, -4.7f, 19.8f, -8.1f, 30.3f, -10.2f)
                lineToRelative(20.6f, 61.8f)
                curveToRelative(-9.8f, 0.8f, -19.4f, 3.3f, -27.9f, 8.4f)
                close()
                moveTo(145.9f, 431.8f)
                lineToRelative(-60.5f, -38.5f)
                lineToRelative(30.8f, -18.3f)
                lineToRelative(60.5f, 38.5f)
                lineToRelative(-30.8f, 18.3f)
                close()
                moveTo(253.4f, 367.9f)
                lineToRelative(-60.5f, -38.5f)
                lineToRelative(30.8f, -18.3f)
                lineToRelative(60.5f, 38.5f)
                lineToRelative(-30.8f, 18.3f)
                close()
                moveTo(364.3f, 302.0f)
                lineToRelative(-60.5f, -38.5f)
                lineToRelative(30.8f, -18.3f)
                lineToRelative(60.5f, 38.5f)
                lineToRelative(-30.8f, 18.3f)
                close()
                moveTo(384.7f, 104.7f)
                lineToRelative(46.0f, -46.0f)
                curveToRelative(8.4f, 6.5f, 16.0f, 14.1f, 22.6f, 22.6f)
                lineTo(407.6f, 127.0f)
                curveToRelative(-5.7f, -9.3f, -13.7f, -16.9f, -22.9f, -22.3f)
                close()
                moveTo(466.8f, 212.5f)
                lineToRelative(-59.5f, -19.8f)
                curveToRelative(3.2f, -5.3f, 5.8f, -10.9f, 7.4f, -17.1f)
                curveToRelative(1.1f, -4.5f, 1.7f, -9.1f, 1.8f, -13.6f)
                lineToRelative(60.4f, 20.1f)
                curveToRelative(-2.1f, 10.4f, -5.5f, 20.6f, -10.1f, 30.4f)
                close()
            }
        }
        .build()
        return _candyCane!!
    }

private var _candyCane: ImageVector? = null
