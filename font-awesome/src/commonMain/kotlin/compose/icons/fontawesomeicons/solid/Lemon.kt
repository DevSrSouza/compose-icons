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

public val SolidGroup.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                curveToRelative(-6.6f, 0.0f, -13.0f, 1.0f, -19.0f, 2.9f)
                curveToRelative(-22.5f, 7.0f, -48.1f, 14.9f, -71.0f, 9.0f)
                curveToRelative(-75.2f, -19.1f, -156.4f, 11.0f, -213.7f, 68.3f)
                reflectiveCurveTo(-7.2f, 250.8f, 11.9f, 326.0f)
                curveToRelative(5.8f, 22.9f, -2.0f, 48.4f, -9.0f, 71.0f)
                curveTo(1.0f, 403.0f, 0.0f, 409.4f, 0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                curveToRelative(6.6f, 0.0f, 13.0f, -1.0f, 19.1f, -2.9f)
                curveToRelative(22.5f, -7.0f, 48.1f, -14.9f, 71.0f, -9.0f)
                curveToRelative(75.2f, 19.1f, 156.4f, -11.0f, 213.7f, -68.3f)
                reflectiveCurveToRelative(87.5f, -138.5f, 68.3f, -213.7f)
                curveToRelative(-5.8f, -22.9f, 2.0f, -48.4f, 9.0f, -71.0f)
                curveToRelative(1.9f, -6.0f, 2.9f, -12.4f, 2.9f, -19.1f)
                close()
                moveTo(212.5f, 127.4f)
                curveToRelative(-54.6f, 16.0f, -101.1f, 62.5f, -117.1f, 117.1f)
                curveTo(92.9f, 253.0f, 84.0f, 257.8f, 75.5f, 255.4f)
                reflectiveCurveTo(62.2f, 244.0f, 64.6f, 235.5f)
                curveToRelative(19.1f, -65.1f, 73.7f, -119.8f, 138.9f, -138.9f)
                curveToRelative(8.5f, -2.5f, 17.4f, 2.4f, 19.9f, 10.9f)
                reflectiveCurveToRelative(-2.4f, 17.4f, -10.9f, 19.9f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
