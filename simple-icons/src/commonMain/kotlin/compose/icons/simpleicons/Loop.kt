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

public val SimpleIcons.Loop: ImageVector
    get() {
        if (_loop != null) {
            return _loop!!
        }
        _loop = Builder(name = "Loop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.371f, 0.0f, 0.0f, 5.371f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.371f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.371f, 12.0f, -12.0f)
                curveTo(24.011f, 5.371f, 18.629f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.7f, 22.611f)
                curveTo(6.837f, 22.611f, 2.089f, 17.863f, 2.089f, 12.0f)
                reflectiveCurveTo(6.837f, 1.389f, 12.7f, 1.389f)
                reflectiveCurveTo(23.311f, 6.137f, 23.311f, 12.0f)
                reflectiveCurveTo(18.563f, 22.611f, 12.7f, 22.611f)
                close()
                moveTo(7.045f, 3.413f)
                curveToRelative(-4.747f, 2.735f, -6.366f, 8.795f, -3.632f, 13.542f)
                curveToRelative(2.735f, 4.737f, 8.806f, 6.366f, 13.542f, 3.632f)
                curveToRelative(4.747f, -2.735f, 6.366f, -8.806f, 3.632f, -13.542f)
                curveTo(17.852f, 2.297f, 11.792f, 0.678f, 7.045f, 3.413f)
                close()
                moveTo(16.868f, 19.034f)
                curveToRelative(-4.08f, 2.352f, -9.287f, 0.952f, -11.639f, -3.118f)
                curveToRelative(-2.352f, -4.08f, -0.952f, -9.287f, 3.118f, -11.639f)
                curveToRelative(4.08f, -2.352f, 9.287f, -0.952f, 11.639f, 3.118f)
                curveTo(22.337f, 11.464f, 20.948f, 16.682f, 16.868f, 19.034f)
                close()
                moveTo(5.229f, 8.084f)
                curveToRelative(-2.166f, 3.741f, -0.875f, 8.532f, 2.866f, 10.687f)
                curveToRelative(3.741f, 2.166f, 8.532f, 0.875f, 10.698f, -2.866f)
                reflectiveCurveToRelative(0.875f, -8.532f, -2.866f, -10.687f)
                curveTo(12.175f, 3.063f, 7.384f, 4.343f, 5.229f, 8.084f)
                close()
                moveTo(18.071f, 14.702f)
                curveToRelative(-1.827f, 3.161f, -5.863f, 4.244f, -9.025f, 2.417f)
                curveToRelative(-3.161f, -1.827f, -4.244f, -5.863f, -2.418f, -9.025f)
                reflectiveCurveToRelative(5.863f, -4.244f, 9.025f, -2.418f)
                curveTo(18.815f, 7.493f, 19.898f, 11.541f, 18.071f, 14.702f)
                close()
                moveTo(6.093f, 12.0f)
                curveToRelative(0.0f, 3.271f, 2.647f, 5.918f, 5.918f, 5.918f)
                reflectiveCurveToRelative(5.918f, -2.647f, 5.918f, -5.918f)
                reflectiveCurveToRelative(-2.647f, -5.918f, -5.918f, -5.918f)
                curveTo(8.74f, 6.082f, 6.093f, 8.729f, 6.093f, 12.0f)
                close()
                moveTo(16.704f, 11.3f)
                curveToRelative(0.0f, 2.593f, -2.1f, 4.693f, -4.693f, 4.693f)
                reflectiveCurveToRelative(-4.693f, -2.1f, -4.693f, -4.693f)
                reflectiveCurveToRelative(2.1f, -4.693f, 4.693f, -4.693f)
                curveTo(14.593f, 6.607f, 16.704f, 8.707f, 16.704f, 11.3f)
                close()
            }
        }
        .build()
        return _loop!!
    }

private var _loop: ImageVector? = null
