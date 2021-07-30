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

public val SimpleIcons.Cucumber: ImageVector
    get() {
        if (_cucumber != null) {
            return _cucumber!!
        }
        _cucumber = Builder(name = "Cucumber", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.16f, 0.0f)
                curveTo(7.523f, -0.03f, 3.223f, 3.007f, 1.886f, 7.715f)
                curveTo(0.241f, 13.51f, 3.746f, 19.51f, 9.601f, 20.925f)
                lineTo(9.601f, 24.0f)
                lineToRelative(0.626f, -0.094f)
                curveToRelative(6.715f, -1.008f, 11.876f, -6.254f, 12.271f, -12.472f)
                curveToRelative(0.258f, -4.041f, -1.795f, -8.064f, -5.108f, -10.01f)
                arcToRelative(9.62f, 9.62f, 0.0f, false, false, -1.999f, -0.895f)
                arcTo(10.606f, 10.606f, 0.0f, false, false, 12.16f, 0.0f)
                close()
                moveTo(12.076f, 1.087f)
                horizontalLineToRelative(0.013f)
                curveToRelative(1.011f, 0.0f, 2.015f, 0.161f, 2.976f, 0.477f)
                arcToRelative(8.511f, 8.511f, 0.0f, false, true, 1.769f, 0.792f)
                curveToRelative(2.97f, 1.744f, 4.809f, 5.363f, 4.576f, 9.008f)
                curveToRelative(-0.35f, 5.52f, -4.816f, 10.208f, -10.72f, 11.36f)
                lineTo(10.69f, 20.04f)
                lineToRelative(-0.44f, -0.085f)
                arcToRelative(9.518f, 9.518f, 0.0f, false, true, 1.826f, -18.868f)
                close()
                moveTo(14.118f, 5.393f)
                arcToRelative(0.958f, 0.958f, 0.0f, false, false, -0.843f, 0.333f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, -0.366f, 0.632f)
                curveToRelative(-0.321f, 0.743f, -0.436f, 1.803f, 0.043f, 2.385f)
                lineToRelative(-0.001f, 0.003f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, 1.918f, -1.641f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, 0.165f, -0.698f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.916f, -1.014f)
                close()
                moveTo(10.057f, 5.485f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, false, -0.926f, 0.982f)
                curveToRelative(0.01f, 0.241f, 0.07f, 0.478f, 0.18f, 0.694f)
                arcToRelative(3.282f, 3.282f, 0.0f, false, false, 2.062f, 1.6f)
                curveToRelative(0.413f, -0.593f, 0.216f, -1.65f, -0.118f, -2.386f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, false, -0.377f, -0.574f)
                arcToRelative(0.934f, 0.934f, 0.0f, false, false, -0.821f, -0.316f)
                close()
                moveTo(7.628f, 8.0f)
                curveToRelative(-0.858f, 0.035f, -1.2f, 1.126f, -0.516f, 1.645f)
                curveToRelative(0.198f, 0.146f, 0.41f, 0.273f, 0.632f, 0.38f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.53f, -0.07f)
                arcTo(3.17f, 3.17f, 0.0f, false, false, 8.54f, 8.167f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 7.628f, 8.0f)
                close()
                moveTo(15.39f, 11.216f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, false, -1.228f, 0.296f)
                arcToRelative(3.087f, 3.087f, 0.0f, false, false, 1.718f, 1.755f)
                curveToRelative(0.236f, 0.105f, 0.49f, 0.161f, 0.747f, 0.166f)
                arcToRelative(0.933f, 0.933f, 0.0f, false, false, 0.681f, -1.663f)
                curveToRelative(-0.659f, -0.46f, -1.105f, -0.575f, -1.918f, -0.554f)
                close()
                moveTo(9.54f, 11.246f)
                curveToRelative(-0.297f, -0.012f, -0.635f, 0.01f, -0.983f, 0.026f)
                curveToRelative(-0.559f, 0.0f, -1.228f, 0.278f, -1.494f, 0.565f)
                curveToRelative(-0.695f, 0.61f, -0.188f, 1.751f, 0.73f, 1.644f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 0.747f, -0.167f)
                curveToRelative(0.744f, -0.322f, 1.628f, -1.202f, 1.734f, -1.89f)
                curveToRelative(-0.182f, -0.12f, -0.438f, -0.165f, -0.735f, -0.178f)
                close()
                moveTo(11.626f, 12.46f)
                curveToRelative(-0.863f, 0.32f, -1.56f, 0.975f, -1.93f, 1.817f)
                arcToRelative(1.601f, 1.601f, 0.0f, false, false, -0.167f, 0.681f)
                curveToRelative(-0.02f, 0.908f, 1.091f, 1.361f, 1.711f, 0.698f)
                curveToRelative(0.14f, -0.199f, 0.262f, -0.41f, 0.362f, -0.632f)
                curveToRelative(0.322f, -0.69f, 0.449f, -1.928f, 0.024f, -2.564f)
                close()
                moveTo(13.123f, 12.633f)
                arcToRelative(2.792f, 2.792f, 0.0f, false, false, -0.116f, 2.442f)
                curveToRelative(0.089f, 0.211f, 0.21f, 0.408f, 0.362f, 0.58f)
                curveToRelative(0.577f, 0.627f, 1.81f, 0.186f, 1.763f, -0.63f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, false, -0.167f, -0.697f)
                arcToRelative(3.043f, 3.043f, 0.0f, false, false, -1.842f, -1.695f)
                close()
            }
        }
        .build()
        return _cucumber!!
    }

private var _cucumber: ImageVector? = null
