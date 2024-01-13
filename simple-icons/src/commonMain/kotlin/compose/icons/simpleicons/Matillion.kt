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

public val SimpleIcons.Matillion: ImageVector
    get() {
        if (_matillion != null) {
            return _matillion!!
        }
        _matillion = Builder(name = "Matillion", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.104f, 0.142f, -1.598f, 0.428f)
                lineTo(2.777f, 4.831f)
                arcTo(3.195f, 3.195f, 0.0f, false, false, 1.18f, 7.597f)
                verticalLineToRelative(8.806f)
                curveToRelative(0.0f, 1.141f, 0.609f, 2.195f, 1.597f, 2.766f)
                lineToRelative(7.625f, 4.403f)
                arcToRelative(3.194f, 3.194f, 0.0f, false, false, 3.195f, 0.0f)
                lineToRelative(7.626f, -4.403f)
                arcToRelative(3.195f, 3.195f, 0.0f, false, false, 1.597f, -2.766f)
                lineTo(22.82f, 7.597f)
                arcToRelative(3.194f, 3.194f, 0.0f, false, false, -1.597f, -2.766f)
                lineTo(13.597f, 0.428f)
                arcTo(3.183f, 3.183f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.033f, 6.215f)
                arcToRelative(1.383f, 1.383f, 0.0f, false, true, 1.012f, 2.286f)
                lineToRelative(-7.277f, 8.403f)
                arcToRelative(1.382f, 1.382f, 0.0f, false, true, -2.09f, -1.81f)
                lineToRelative(7.278f, -8.402f)
                arcToRelative(1.374f, 1.374f, 0.0f, false, true, 1.077f, -0.477f)
                close()
                moveTo(14.722f, 9.32f)
                lineTo(14.747f, 9.321f)
                lineTo(14.806f, 9.323f)
                lineTo(14.888f, 9.328f)
                lineTo(14.943f, 9.335f)
                arcToRelative(1.373f, 1.373f, 0.0f, false, true, 0.135f, 0.026f)
                lineToRelative(0.073f, 0.019f)
                lineToRelative(0.035f, 0.012f)
                lineToRelative(0.091f, 0.034f)
                lineToRelative(0.038f, 0.017f)
                curveToRelative(0.03f, 0.013f, 0.058f, 0.027f, 0.087f, 0.043f)
                lineToRelative(0.033f, 0.018f)
                curveToRelative(0.026f, 0.015f, 0.052f, 0.031f, 0.077f, 0.048f)
                lineToRelative(0.045f, 0.031f)
                lineToRelative(0.071f, 0.055f)
                curveToRelative(0.005f, 0.005f, 0.012f, 0.008f, 0.018f, 0.013f)
                lineToRelative(0.019f, 0.019f)
                curveToRelative(0.023f, 0.02f, 0.044f, 0.041f, 0.065f, 0.062f)
                lineToRelative(0.037f, 0.039f)
                lineToRelative(0.031f, 0.033f)
                lineToRelative(4.533f, 5.296f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, true, -1.049f, 2.281f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, true, -1.05f, -0.484f)
                lineToRelative(-3.484f, -4.07f)
                lineToRelative(-3.482f, 4.07f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, true, -1.051f, 0.484f)
                horizontalLineToRelative(-0.001f)
                arcTo(1.38f, 1.38f, 0.0f, false, true, 9.164f, 15.1f)
                lineToRelative(4.533f, -5.296f)
                lineToRelative(0.03f, -0.033f)
                lineToRelative(0.037f, -0.039f)
                lineToRelative(0.062f, -0.059f)
                lineToRelative(0.023f, -0.022f)
                lineToRelative(0.022f, -0.017f)
                lineToRelative(0.066f, -0.05f)
                curveToRelative(0.016f, -0.011f, 0.031f, -0.023f, 0.047f, -0.033f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, true, 0.067f, -0.042f)
                lineToRelative(0.049f, -0.027f)
                lineToRelative(0.072f, -0.036f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, true, 0.177f, -0.066f)
                arcToRelative(0.932f, 0.932f, 0.0f, false, true, 0.141f, -0.035f)
                lineToRelative(0.06f, -0.01f)
                lineToRelative(0.058f, -0.007f)
                lineToRelative(0.081f, -0.005f)
                lineToRelative(0.033f, -0.003f)
                close()
            }
        }
        .build()
        return _matillion!!
    }

private var _matillion: ImageVector? = null
