package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Omega: ImageVector
    get() {
        if (_omega != null) {
            return _omega!!
        }
        _omega = Builder(name = "Omega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                verticalLineToRelative(-2.157f)
                curveToRelative(1.863f, -1.192f, 3.5f, -3.875f, 3.5f, -6.959f)
                curveToRelative(0.0f, -3.073f, -2.0f, -6.029f, -5.5f, -6.029f)
                reflectiveCurveToRelative(-5.5f, 2.956f, -5.5f, 6.03f)
                curveToRelative(0.0f, 3.083f, 1.637f, 5.766f, 3.5f, 6.958f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.76f)
                curveTo(5.666f, 16.505f, 4.0f, 13.989f, 4.0f, 10.884f)
                curveTo(4.0f, 6.247f, 7.5f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(8.0f, 3.247f, 8.0f, 7.884f)
                curveToRelative(0.0f, 3.105f, -1.666f, 5.621f, -3.76f, 7.116f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _omega!!
    }

private var _omega: ImageVector? = null
