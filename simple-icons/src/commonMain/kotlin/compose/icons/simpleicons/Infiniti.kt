package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Infiniti: ImageVector
    get() {
        if (_infiniti != null) {
            return _infiniti!!
        }
        _infiniti = Builder(name = "Infiniti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.953f, 11.643f)
                curveToRelative(0.0f, 1.51f, 1.83f, 2.69f, 4.601f, 3.344f)
                lineToRelative(4.841f, -5.523f)
                horizontalLineTo(12.0f)
                lineToRelative(-4.19f, 8.06f)
                curveTo(3.25f, 16.744f, 0.0f, 14.71f, 0.0f, 12.233f)
                curveToRelative(0.0f, -3.184f, 5.376f, -5.757f, 12.0f, -5.757f)
                reflectiveCurveToRelative(12.0f, 2.573f, 12.0f, 5.757f)
                curveToRelative(0.0f, 2.477f, -3.25f, 4.511f, -7.81f, 5.293f)
                lineTo(12.0f, 9.464f)
                horizontalLineToRelative(0.605f)
                lineToRelative(4.84f, 5.523f)
                curveToRelative(2.772f, -0.654f, 4.601f, -1.834f, 4.601f, -3.344f)
                curveToRelative(0.0f, -2.664f, -4.484f, -4.88f, -10.047f, -4.88f)
                curveToRelative(-5.562f, 0.0f, -10.046f, 2.216f, -10.046f, 4.88f)
                close()
            }
        }
        .build()
        return _infiniti!!
    }

private var _infiniti: ImageVector? = null
