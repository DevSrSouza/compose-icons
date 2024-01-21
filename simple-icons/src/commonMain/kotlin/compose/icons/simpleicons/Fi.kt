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

public val SimpleIcons.Fi: ImageVector
    get() {
        if (_fi != null) {
            return _fi!!
        }
        _fi = Builder(name = "Fi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.908f, 4.621f)
                curveToRelative(0.0f, -1.749f, 1.472f, -3.162f, 3.286f, -3.162f)
                curveToRelative(1.813f, 0.0f, 3.287f, 1.416f, 3.287f, 3.162f)
                reflectiveCurveToRelative(-1.472f, 3.162f, -3.287f, 3.162f)
                curveToRelative(-1.816f, 0.0f, -3.286f, -1.414f, -3.286f, -3.162f)
                close()
                moveTo(24.0f, 17.077f)
                horizontalLineToRelative(-0.735f)
                curveToRelative(-1.507f, 0.0f, -2.267f, -1.069f, -2.267f, -2.753f)
                verticalLineToRelative(-3.162f)
                horizontalLineToRelative(-5.569f)
                verticalLineToRelative(4.482f)
                curveToRelative(0.0f, 4.869f, 3.228f, 6.913f, 6.353f, 6.913f)
                horizontalLineTo(24.0f)
                close()
                moveTo(5.578f, 18.581f)
                curveToRelative(0.0f, -1.628f, 0.901f, -2.369f, 2.731f, -2.369f)
                horizontalLineToRelative(4.541f)
                verticalLineToRelative(-5.064f)
                horizontalLineTo(5.578f)
                verticalLineTo(9.057f)
                curveToRelative(0.0f, -1.654f, 1.427f, -2.552f, 3.132f, -2.552f)
                horizontalLineToRelative(4.133f)
                verticalLineTo(1.443f)
                horizontalLineTo(7.289f)
                curveTo(2.925f, 1.443f, 0.0f, 3.753f, 0.0f, 8.594f)
                verticalLineToRelative(13.95f)
                horizontalLineToRelative(5.578f)
                close()
            }
        }
        .build()
        return _fi!!
    }

private var _fi: ImageVector? = null
