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

public val SimpleIcons.Bt: ImageVector
    get() {
        if (_bt != null) {
            return _bt!!
        }
        _bt = Builder(name = "Bt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.589f, 7.91f)
                horizontalLineToRelative(5.977f)
                verticalLineToRelative(1.753f)
                horizontalLineTo(16.56f)
                verticalLineToRelative(6.41f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(-6.41f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 22.523f)
                curveTo(6.193f, 22.523f, 1.477f, 17.807f, 1.477f, 12.0f)
                curveTo(1.477f, 6.193f, 6.193f, 1.477f, 12.0f, 1.477f)
                curveToRelative(5.807f, 0.0f, 10.523f, 4.716f, 10.523f, 10.523f)
                curveToRelative(0.0f, 5.807f, -4.716f, 10.523f, -10.523f, 10.523f)
                moveTo(12.0f, 24.0f)
                curveToRelative(6.626f, 0.0f, 12.0f, -5.374f, 12.0f, -12.0f)
                reflectiveCurveTo(18.626f, 0.0f, 12.0f, 0.0f)
                curveTo(5.379f, 0.0f, 0.0f, 5.374f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.379f, 12.0f, 12.0f, 12.0f)
                moveTo(9.97f, 13.574f)
                curveToRelative(0.0f, -0.516f, -0.321f, -0.865f, -0.873f, -0.865f)
                horizontalLineToRelative(-1.32f)
                verticalLineToRelative(1.702f)
                horizontalLineToRelative(1.32f)
                curveToRelative(0.552f, 0.0f, 0.874f, -0.345f, 0.874f, -0.837f)
                moveToRelative(-0.24f, -3.276f)
                curveToRelative(0.0f, -0.433f, -0.275f, -0.732f, -0.745f, -0.732f)
                horizontalLineToRelative(-1.21f)
                verticalLineToRelative(1.486f)
                horizontalLineToRelative(1.21f)
                curveToRelative(0.47f, 0.0f, 0.746f, -0.299f, 0.746f, -0.754f)
                moveToRelative(2.231f, 3.372f)
                curveToRelative(0.0f, 1.546f, -1.09f, 2.402f, -2.65f, 2.402f)
                horizontalLineTo(5.834f)
                verticalLineTo(7.91f)
                horizontalLineToRelative(3.249f)
                curveToRelative(1.573f, 0.0f, 2.64f, 0.805f, 2.64f, 2.277f)
                curveToRelative(0.0f, 0.672f, -0.298f, 1.27f, -0.781f, 1.634f)
                curveToRelative(0.552f, 0.326f, 1.021f, 0.947f, 1.021f, 1.85f)
                close()
            }
        }
        .build()
        return _bt!!
    }

private var _bt: ImageVector? = null
