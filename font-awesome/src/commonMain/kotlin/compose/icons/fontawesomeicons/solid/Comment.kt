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

public val SolidGroup.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 240.0f)
                curveToRelative(0.0f, 114.9f, -114.6f, 208.0f, -256.0f, 208.0f)
                curveToRelative(-37.1f, 0.0f, -72.3f, -6.4f, -104.1f, -17.9f)
                curveToRelative(-11.9f, 8.7f, -31.3f, 20.6f, -54.3f, 30.6f)
                curveTo(73.6f, 471.1f, 44.7f, 480.0f, 16.0f, 480.0f)
                curveToRelative(-6.5f, 0.0f, -12.3f, -3.9f, -14.8f, -9.9f)
                curveToRelative(-2.5f, -6.0f, -1.1f, -12.8f, 3.4f, -17.4f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.3f, -0.3f)
                curveToRelative(0.3f, -0.3f, 0.7f, -0.7f, 1.3f, -1.4f)
                curveToRelative(1.1f, -1.2f, 2.8f, -3.1f, 4.9f, -5.7f)
                curveToRelative(4.1f, -5.0f, 9.6f, -12.4f, 15.2f, -21.6f)
                curveToRelative(10.0f, -16.6f, 19.5f, -38.4f, 21.4f, -62.9f)
                curveTo(17.7f, 326.8f, 0.0f, 285.1f, 0.0f, 240.0f)
                curveTo(0.0f, 125.1f, 114.6f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(256.0f, 93.1f, 256.0f, 208.0f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
