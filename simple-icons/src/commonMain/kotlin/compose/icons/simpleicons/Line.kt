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

public val SimpleIcons.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.365f, 9.863f)
                curveToRelative(0.349f, 0.0f, 0.63f, 0.285f, 0.63f, 0.631f)
                curveToRelative(0.0f, 0.345f, -0.281f, 0.63f, -0.63f, 0.63f)
                lineTo(17.61f, 11.124f)
                verticalLineToRelative(1.125f)
                horizontalLineToRelative(1.755f)
                curveToRelative(0.349f, 0.0f, 0.63f, 0.283f, 0.63f, 0.63f)
                curveToRelative(0.0f, 0.344f, -0.281f, 0.629f, -0.63f, 0.629f)
                horizontalLineToRelative(-2.386f)
                curveToRelative(-0.345f, 0.0f, -0.627f, -0.285f, -0.627f, -0.629f)
                lineTo(16.352f, 8.108f)
                curveToRelative(0.0f, -0.345f, 0.282f, -0.63f, 0.63f, -0.63f)
                horizontalLineToRelative(2.386f)
                curveToRelative(0.346f, 0.0f, 0.627f, 0.285f, 0.627f, 0.63f)
                curveToRelative(0.0f, 0.349f, -0.281f, 0.63f, -0.63f, 0.63f)
                lineTo(17.61f, 8.738f)
                verticalLineToRelative(1.125f)
                horizontalLineToRelative(1.755f)
                close()
                moveTo(15.51f, 12.879f)
                curveToRelative(0.0f, 0.27f, -0.174f, 0.51f, -0.432f, 0.596f)
                curveToRelative(-0.064f, 0.021f, -0.133f, 0.031f, -0.199f, 0.031f)
                curveToRelative(-0.211f, 0.0f, -0.391f, -0.09f, -0.51f, -0.25f)
                lineToRelative(-2.443f, -3.317f)
                verticalLineToRelative(2.94f)
                curveToRelative(0.0f, 0.344f, -0.279f, 0.629f, -0.631f, 0.629f)
                curveToRelative(-0.346f, 0.0f, -0.626f, -0.285f, -0.626f, -0.629f)
                lineTo(10.669f, 8.108f)
                curveToRelative(0.0f, -0.27f, 0.173f, -0.51f, 0.43f, -0.595f)
                curveToRelative(0.06f, -0.023f, 0.136f, -0.033f, 0.194f, -0.033f)
                curveToRelative(0.195f, 0.0f, 0.375f, 0.104f, 0.495f, 0.254f)
                lineToRelative(2.462f, 3.33f)
                lineTo(14.25f, 8.108f)
                curveToRelative(0.0f, -0.345f, 0.282f, -0.63f, 0.63f, -0.63f)
                curveToRelative(0.345f, 0.0f, 0.63f, 0.285f, 0.63f, 0.63f)
                verticalLineToRelative(4.771f)
                close()
                moveTo(9.769f, 12.879f)
                curveToRelative(0.0f, 0.344f, -0.282f, 0.629f, -0.631f, 0.629f)
                curveToRelative(-0.345f, 0.0f, -0.627f, -0.285f, -0.627f, -0.629f)
                lineTo(8.511f, 8.108f)
                curveToRelative(0.0f, -0.345f, 0.282f, -0.63f, 0.63f, -0.63f)
                curveToRelative(0.346f, 0.0f, 0.628f, 0.285f, 0.628f, 0.63f)
                verticalLineToRelative(4.771f)
                close()
                moveTo(7.303f, 13.508f)
                lineTo(4.917f, 13.508f)
                curveToRelative(-0.345f, 0.0f, -0.63f, -0.285f, -0.63f, -0.629f)
                lineTo(4.287f, 8.108f)
                curveToRelative(0.0f, -0.345f, 0.285f, -0.63f, 0.63f, -0.63f)
                curveToRelative(0.348f, 0.0f, 0.63f, 0.285f, 0.63f, 0.63f)
                verticalLineToRelative(4.141f)
                horizontalLineToRelative(1.756f)
                curveToRelative(0.348f, 0.0f, 0.629f, 0.283f, 0.629f, 0.63f)
                curveToRelative(0.0f, 0.344f, -0.282f, 0.629f, -0.629f, 0.629f)
                moveTo(24.0f, 10.314f)
                curveTo(24.0f, 4.943f, 18.615f, 0.572f, 12.0f, 0.572f)
                reflectiveCurveTo(0.0f, 4.943f, 0.0f, 10.314f)
                curveToRelative(0.0f, 4.811f, 4.27f, 8.842f, 10.035f, 9.608f)
                curveToRelative(0.391f, 0.082f, 0.923f, 0.258f, 1.058f, 0.59f)
                curveToRelative(0.12f, 0.301f, 0.079f, 0.766f, 0.038f, 1.08f)
                lineToRelative(-0.164f, 1.02f)
                curveToRelative(-0.045f, 0.301f, -0.24f, 1.186f, 1.049f, 0.645f)
                curveToRelative(1.291f, -0.539f, 6.916f, -4.078f, 9.436f, -6.975f)
                curveTo(23.176f, 14.393f, 24.0f, 12.458f, 24.0f, 10.314f)
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
