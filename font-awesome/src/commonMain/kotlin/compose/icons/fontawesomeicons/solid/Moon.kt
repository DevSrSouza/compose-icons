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

public val SolidGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.5f, 32.0f)
                curveTo(100.0f, 32.0f, 0.0f, 132.3f, 0.0f, 256.0f)
                reflectiveCurveTo(100.0f, 480.0f, 223.5f, 480.0f)
                curveToRelative(60.6f, 0.0f, 115.5f, -24.2f, 155.8f, -63.4f)
                curveToRelative(5.0f, -4.9f, 6.3f, -12.5f, 3.1f, -18.7f)
                reflectiveCurveToRelative(-10.1f, -9.7f, -17.0f, -8.5f)
                curveToRelative(-9.8f, 1.7f, -19.8f, 2.6f, -30.1f, 2.6f)
                curveToRelative(-96.9f, 0.0f, -175.5f, -78.8f, -175.5f, -176.0f)
                curveToRelative(0.0f, -65.8f, 36.0f, -123.1f, 89.3f, -153.3f)
                curveToRelative(6.1f, -3.5f, 9.2f, -10.5f, 7.7f, -17.3f)
                reflectiveCurveToRelative(-7.3f, -11.9f, -14.3f, -12.5f)
                curveToRelative(-6.3f, -0.5f, -12.6f, -0.8f, -19.0f, -0.8f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
