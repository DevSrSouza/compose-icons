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

public val SimpleIcons.Brandfolder: ImageVector
    get() {
        if (_brandfolder != null) {
            return _brandfolder!!
        }
        _brandfolder = Builder(name = "Brandfolder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 23.291f)
                horizontalLineToRelative(19.601f)
                verticalLineToRelative(-2.978f)
                horizontalLineTo(2.98f)
                verticalLineTo(3.689f)
                horizontalLineToRelative(16.626f)
                verticalLineToRelative(10.911f)
                horizontalLineToRelative(-1.422f)
                lineToRelative(2.908f, 2.909f)
                lineTo(24.0f, 14.599f)
                horizontalLineToRelative(-1.417f)
                verticalLineTo(0.709f)
                horizontalLineTo(0.0f)
                verticalLineTo(23.291f)
                close()
                moveTo(16.148f, 13.356f)
                curveToRelative(-0.191f, -0.406f, -0.432f, -0.739f, -0.72f, -0.997f)
                curveToRelative(-0.287f, -0.258f, -0.599f, -0.454f, -0.933f, -0.583f)
                curveToRelative(-0.337f, -0.132f, -0.641f, -0.217f, -0.916f, -0.254f)
                curveToRelative(0.251f, -0.034f, 0.496f, -0.134f, 0.735f, -0.296f)
                curveToRelative(0.241f, -0.161f, 0.455f, -0.364f, 0.647f, -0.609f)
                curveToRelative(0.192f, -0.247f, 0.345f, -0.535f, 0.458f, -0.863f)
                curveToRelative(0.115f, -0.33f, 0.171f, -0.686f, 0.171f, -1.069f)
                curveToRelative(0.0f, -0.648f, -0.126f, -1.186f, -0.377f, -1.617f)
                curveToRelative(-0.252f, -0.432f, -0.597f, -0.775f, -1.033f, -1.033f)
                curveToRelative(-0.436f, -0.258f, -0.948f, -0.44f, -1.536f, -0.547f)
                curveToRelative(-0.586f, -0.108f, -1.21f, -0.162f, -1.868f, -0.162f)
                curveToRelative(-0.754f, 0.0f, -1.382f, 0.018f, -1.887f, 0.054f)
                curveTo(8.387f, 5.417f, 7.944f, 5.463f, 7.56f, 5.525f)
                verticalLineToRelative(12.933f)
                curveToRelative(0.684f, 0.083f, 1.293f, 0.141f, 1.834f, 0.171f)
                curveToRelative(0.539f, 0.03f, 1.082f, 0.044f, 1.634f, 0.044f)
                curveToRelative(0.718f, 0.0f, 1.404f, -0.054f, 2.057f, -0.162f)
                curveToRelative(0.652f, -0.107f, 1.227f, -0.304f, 1.723f, -0.592f)
                curveToRelative(0.499f, -0.288f, 0.893f, -0.68f, 1.187f, -1.177f)
                curveToRelative(0.294f, -0.498f, 0.441f, -1.135f, 0.441f, -1.914f)
                curveTo(16.436f, 14.253f, 16.34f, 13.763f, 16.148f, 13.356f)
                close()
                moveTo(10.165f, 7.321f)
                curveToRelative(0.91f, -0.111f, 1.873f, -0.054f, 2.301f, 0.304f)
                curveToRelative(0.38f, 0.317f, 0.607f, 0.599f, 0.607f, 1.42f)
                curveToRelative(0.0f, 0.751f, -0.357f, 1.195f, -0.608f, 1.356f)
                curveToRelative(-0.251f, 0.161f, -0.59f, 0.368f, -1.403f, 0.368f)
                reflectiveCurveToRelative(-0.897f, 0.0f, -0.897f, 0.0f)
                verticalLineTo(7.321f)
                close()
                moveTo(13.194f, 16.001f)
                curveToRelative(-0.449f, 0.39f, -1.114f, 0.552f, -1.816f, 0.552f)
                curveToRelative(-0.79f, 0.0f, -1.213f, -0.072f, -1.213f, -0.072f)
                verticalLineToRelative(-3.737f)
                horizontalLineToRelative(1.132f)
                curveToRelative(0.711f, 0.0f, 1.438f, 0.126f, 1.832f, 0.464f)
                curveToRelative(0.509f, 0.437f, 0.611f, 0.895f, 0.611f, 1.505f)
                curveTo(13.741f, 15.322f, 13.528f, 15.711f, 13.194f, 16.001f)
                close()
            }
        }
        .build()
        return _brandfolder!!
    }

private var _brandfolder: ImageVector? = null
