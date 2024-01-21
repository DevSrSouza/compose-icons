package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Tools24: ImageVector
    get() {
        if (_tools24 != null) {
            return _tools24!!
        }
        _tools24 = Builder(name = "Tools24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.875f, 2.292f)
                arcToRelative(0.114f, 0.114f, 0.0f, false, false, -0.032f, 0.018f)
                arcTo(7.239f, 7.239f, 0.0f, false, false, 4.75f, 8.25f)
                arcToRelative(7.248f, 7.248f, 0.0f, false, false, 3.654f, 6.297f)
                curveToRelative(0.57f, 0.327f, 0.982f, 0.955f, 0.941f, 1.682f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.317f, 6.058f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.498f, -0.078f)
                lineToRelative(0.317f, -6.062f)
                verticalLineToRelative(-0.004f)
                curveToRelative(0.006f, -0.09f, -0.047f, -0.215f, -0.188f, -0.296f)
                arcTo(8.749f, 8.749f, 0.0f, false, true, 3.25f, 8.25f)
                arcToRelative(8.738f, 8.738f, 0.0f, false, true, 3.732f, -7.169f)
                arcToRelative(1.547f, 1.547f, 0.0f, false, true, 1.709f, -0.064f)
                curveToRelative(0.484f, 0.292f, 0.809f, 0.835f, 0.809f, 1.46f)
                verticalLineToRelative(4.714f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.119f, 0.213f)
                lineToRelative(2.25f, 1.385f)
                curveToRelative(0.08f, 0.05f, 0.182f, 0.05f, 0.262f, 0.0f)
                lineToRelative(2.25f, -1.385f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.119f, -0.213f)
                verticalLineTo(2.478f)
                curveToRelative(0.0f, -0.626f, 0.325f, -1.169f, 0.81f, -1.461f)
                arcToRelative(1.547f, 1.547f, 0.0f, false, true, 1.708f, 0.064f)
                arcToRelative(8.741f, 8.741f, 0.0f, false, true, 3.732f, 7.17f)
                arcToRelative(8.747f, 8.747f, 0.0f, false, true, -4.41f, 7.598f)
                curveToRelative(-0.14f, 0.081f, -0.193f, 0.206f, -0.188f, 0.296f)
                verticalLineToRelative(0.004f)
                lineToRelative(0.318f, 6.062f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.498f, 0.078f)
                lineToRelative(-0.317f, -6.058f)
                verticalLineToRelative(-0.002f)
                curveToRelative(-0.041f, -0.727f, 0.37f, -1.355f, 0.94f, -1.682f)
                arcTo(7.247f, 7.247f, 0.0f, false, false, 19.25f, 8.25f)
                arcToRelative(7.239f, 7.239f, 0.0f, false, false, -3.093f, -5.94f)
                arcToRelative(0.114f, 0.114f, 0.0f, false, false, -0.032f, -0.018f)
                lineToRelative(-0.01f, -0.001f)
                curveToRelative(-0.003f, 0.0f, -0.014f, 0.0f, -0.031f, 0.01f)
                curveToRelative(-0.036f, 0.022f, -0.084f, 0.079f, -0.084f, 0.177f)
                verticalLineTo(7.19f)
                curveToRelative(0.0f, 0.608f, -0.315f, 1.172f, -0.833f, 1.49f)
                lineToRelative(-2.25f, 1.385f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.834f, 0.0f)
                lineToRelative(-2.25f, -1.384f)
                arcTo(1.752f, 1.752f, 0.0f, false, true, 8.0f, 7.192f)
                verticalLineTo(2.477f)
                curveToRelative(0.0f, -0.098f, -0.048f, -0.155f, -0.084f, -0.176f)
                arcToRelative(0.068f, 0.068f, 0.0f, false, false, -0.031f, -0.011f)
                lineToRelative(-0.01f, 0.001f)
                close()
            }
        }
        .build()
        return _tools24!!
    }

private var _tools24: ImageVector? = null
