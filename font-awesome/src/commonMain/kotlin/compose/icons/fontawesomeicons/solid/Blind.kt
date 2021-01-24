package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Blind: ImageVector
    get() {
        if (_blind != null) {
            return _blind!!
        }
        _blind = Builder(name = "Blind", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.15f, 510.837f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.989f, -2.687f)
                lineToRelative(-125.33f, -206.427f)
                arcToRelative(31.923f, 31.923f, 0.0f, false, false, 12.958f, -9.485f)
                lineToRelative(126.048f, 207.608f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.687f, 10.991f)
                close()
                moveTo(142.803f, 314.338f)
                lineToRelative(-32.54f, 89.485f)
                lineToRelative(36.12f, 88.285f)
                curveToRelative(6.693f, 16.36f, 25.377f, 24.192f, 41.733f, 17.501f)
                curveToRelative(16.357f, -6.692f, 24.193f, -25.376f, 17.501f, -41.734f)
                lineToRelative(-62.814f, -153.537f)
                close()
                moveTo(96.0f, 88.0f)
                curveToRelative(24.301f, 0.0f, 44.0f, -19.699f, 44.0f, -44.0f)
                reflectiveCurveTo(120.301f, 0.0f, 96.0f, 0.0f)
                reflectiveCurveTo(52.0f, 19.699f, 52.0f, 44.0f)
                reflectiveCurveToRelative(19.699f, 44.0f, 44.0f, 44.0f)
                close()
                moveTo(250.837f, 257.128f)
                lineToRelative(-120.0f, -152.0f)
                curveToRelative(-4.733f, -5.995f, -11.75f, -9.108f, -18.837f, -9.112f)
                lineTo(112.0f, 96.0f)
                lineTo(80.0f, 96.0f)
                verticalLineToRelative(0.026f)
                curveToRelative(-7.146f, 0.003f, -14.217f, 3.161f, -18.944f, 9.24f)
                lineTo(0.0f, 183.766f)
                verticalLineToRelative(95.694f)
                curveToRelative(0.0f, 13.455f, 11.011f, 24.791f, 24.464f, 24.536f)
                curveTo(37.505f, 303.748f, 48.0f, 293.1f, 48.0f, 280.0f)
                verticalLineToRelative(-79.766f)
                lineToRelative(16.0f, -20.571f)
                verticalLineToRelative(140.698f)
                lineTo(9.927f, 469.055f)
                curveToRelative(-6.04f, 16.609f, 2.528f, 34.969f, 19.138f, 41.009f)
                curveToRelative(16.602f, 6.039f, 34.968f, -2.524f, 41.009f, -19.138f)
                lineTo(136.0f, 309.638f)
                lineTo(136.0f, 202.441f)
                lineToRelative(-31.406f, -39.816f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.269f, -4.971f)
                lineToRelative(102.3f, 129.217f)
                curveToRelative(9.145f, 11.584f, 24.368f, 11.339f, 33.708f, 3.965f)
                curveToRelative(10.41f, -8.216f, 12.159f, -23.334f, 3.966f, -33.708f)
                close()
            }
        }
        .build()
        return _blind!!
    }

private var _blind: ImageVector? = null
