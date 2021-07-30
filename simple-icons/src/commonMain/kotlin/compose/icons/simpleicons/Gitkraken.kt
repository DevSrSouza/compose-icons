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

public val SimpleIcons.Gitkraken: ImageVector
    get() {
        if (_gitkraken != null) {
            return _gitkraken!!
        }
        _gitkraken = Builder(name = "Gitkraken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.225f, 6.252f)
                arcToRelative(0.478f, 0.478f, 0.0f, false, false, -0.923f, 0.171f)
                curveToRelative(0.0f, 0.053f, 0.013f, 0.119f, 0.026f, 0.171f)
                curveToRelative(2.15f, 5.71f, -0.751f, 12.077f, -6.46f, 14.226f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, true, -2.426f, 0.607f)
                verticalLineToRelative(-5.155f)
                curveToRelative(0.33f, -0.066f, 0.646f, -0.158f, 0.962f, -0.264f)
                verticalLineToRelative(4.338f)
                curveToRelative(5.445f, -1.332f, 8.794f, -6.817f, 7.463f, -12.262f)
                arcToRelative(10.147f, 10.147f, 0.0f, false, false, -4.958f, -6.487f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, -0.646f, 0.185f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, 0.185f, 0.646f)
                curveToRelative(4.443f, 2.452f, 6.051f, 8.056f, 3.6f, 12.499f)
                arcToRelative(9.13f, 9.13f, 0.0f, false, true, -4.681f, 4.1f)
                verticalLineToRelative(-3.836f)
                arcToRelative(1.472f, 1.472f, 0.0f, false, false, 1.028f, -1.398f)
                curveToRelative(0.0f, -0.527f, -0.264f, -1.002f, -0.725f, -1.266f)
                curveToRelative(0.343f, -3.309f, 1.859f, -2.439f, 1.859f, -3.493f)
                verticalLineToRelative(-0.62f)
                curveToRelative(0.0f, -1.582f, -3.665f, -6.737f, -5.38f, -6.856f)
                horizontalLineToRelative(-0.316f)
                curveToRelative(-1.714f, 0.119f, -5.379f, 5.274f, -5.379f, 6.856f)
                verticalLineToRelative(0.62f)
                curveToRelative(0.0f, 1.054f, 1.503f, 0.184f, 1.859f, 3.493f)
                arcToRelative(1.461f, 1.461f, 0.0f, false, false, -0.725f, 1.266f)
                curveToRelative(0.0f, 0.646f, 0.422f, 1.2f, 1.028f, 1.398f)
                verticalLineToRelative(3.836f)
                curveTo(3.91f, 17.168f, 1.59f, 11.83f, 3.448f, 7.11f)
                arcToRelative(9.24f, 9.24f, 0.0f, false, true, 4.1f, -4.68f)
                arcToRelative(0.479f, 0.479f, 0.0f, false, false, 0.185f, -0.66f)
                arcToRelative(0.487f, 0.487f, 0.0f, false, false, -0.422f, -0.237f)
                arcToRelative(0.444f, 0.444f, 0.0f, false, false, -0.224f, 0.065f)
                arcToRelative(10.142f, 10.142f, 0.0f, false, false, -3.982f, 13.791f)
                arcToRelative(10.147f, 10.147f, 0.0f, false, false, 6.487f, 4.958f)
                lineTo(9.592f, 16.02f)
                curveToRelative(0.316f, 0.106f, 0.633f, 0.198f, 0.962f, 0.264f)
                verticalLineToRelative(5.155f)
                curveTo(4.503f, 20.636f, 0.257f, 15.085f, 1.062f, 9.034f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, true, 0.606f, -2.426f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, false, -0.277f, -0.62f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, false, -0.62f, 0.277f)
                curveToRelative(-2.333f, 6.21f, 0.805f, 13.131f, 7.015f, 15.452f)
                curveToRelative(1.2f, 0.448f, 2.452f, 0.699f, 3.73f, 0.751f)
                verticalLineToRelative(-6.09f)
                curveToRelative(0.172f, 0.012f, 0.489f, 0.012f, 0.489f, 0.012f)
                reflectiveCurveToRelative(0.316f, 0.0f, 0.488f, -0.013f)
                verticalLineToRelative(6.078f)
                curveToRelative(6.631f, -0.277f, 11.773f, -5.867f, 11.496f, -12.499f)
                arcToRelative(12.458f, 12.458f, 0.0f, false, false, -0.764f, -3.704f)
                close()
                moveTo(14.206f, 13.094f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 1.398f, 0.0f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 0.0f, 1.398f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, -1.398f, 0.0f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, true, 0.0f, -1.398f)
                close()
                moveTo(9.776f, 14.492f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, true, -1.384f, 0.0f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 0.0f, -1.398f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 1.398f, 0.0f)
                arcToRelative(0.983f, 0.983f, 0.0f, false, true, -0.013f, 1.398f)
                close()
            }
        }
        .build()
        return _gitkraken!!
    }

private var _gitkraken: ImageVector? = null
