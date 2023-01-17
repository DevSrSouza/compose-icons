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

public val SolidGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(316.9f, 18.0f)
                curveTo(311.6f, 7.0f, 300.4f, 0.0f, 288.1f, 0.0f)
                reflectiveCurveToRelative(-23.4f, 7.0f, -28.8f, 18.0f)
                lineTo(195.0f, 150.3f)
                lineTo(51.4f, 171.5f)
                curveToRelative(-12.0f, 1.8f, -22.0f, 10.2f, -25.7f, 21.7f)
                reflectiveCurveToRelative(-0.7f, 24.2f, 7.9f, 32.7f)
                lineTo(137.8f, 329.0f)
                lineTo(113.2f, 474.7f)
                curveToRelative(-2.0f, 12.0f, 3.0f, 24.2f, 12.9f, 31.3f)
                reflectiveCurveToRelative(23.0f, 8.0f, 33.8f, 2.3f)
                lineToRelative(128.3f, -68.5f)
                lineToRelative(128.3f, 68.5f)
                curveToRelative(10.8f, 5.7f, 23.9f, 4.9f, 33.8f, -2.3f)
                reflectiveCurveToRelative(14.9f, -19.3f, 12.9f, -31.3f)
                lineTo(438.5f, 329.0f)
                lineTo(542.7f, 225.9f)
                curveToRelative(8.6f, -8.5f, 11.7f, -21.2f, 7.9f, -32.7f)
                reflectiveCurveToRelative(-13.7f, -19.9f, -25.7f, -21.7f)
                lineTo(381.2f, 150.3f)
                lineTo(316.9f, 18.0f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
