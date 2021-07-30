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

public val SimpleIcons.Javascript: ImageVector
    get() {
        if (_javascript != null) {
            return _javascript!!
        }
        _javascript = Builder(name = "Javascript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(22.034f, 18.276f)
                curveToRelative(-0.175f, -1.095f, -0.888f, -2.015f, -3.003f, -2.873f)
                curveToRelative(-0.736f, -0.345f, -1.554f, -0.585f, -1.797f, -1.14f)
                curveToRelative(-0.091f, -0.33f, -0.105f, -0.51f, -0.046f, -0.705f)
                curveToRelative(0.15f, -0.646f, 0.915f, -0.84f, 1.515f, -0.66f)
                curveToRelative(0.39f, 0.12f, 0.75f, 0.42f, 0.976f, 0.9f)
                curveToRelative(1.034f, -0.676f, 1.034f, -0.676f, 1.755f, -1.125f)
                curveToRelative(-0.27f, -0.42f, -0.404f, -0.601f, -0.586f, -0.78f)
                curveToRelative(-0.63f, -0.705f, -1.469f, -1.065f, -2.834f, -1.034f)
                lineToRelative(-0.705f, 0.089f)
                curveToRelative(-0.676f, 0.165f, -1.32f, 0.525f, -1.71f, 1.005f)
                curveToRelative(-1.14f, 1.291f, -0.811f, 3.541f, 0.569f, 4.471f)
                curveToRelative(1.365f, 1.02f, 3.361f, 1.244f, 3.616f, 2.205f)
                curveToRelative(0.24f, 1.17f, -0.87f, 1.545f, -1.966f, 1.41f)
                curveToRelative(-0.811f, -0.18f, -1.26f, -0.586f, -1.755f, -1.336f)
                lineToRelative(-1.83f, 1.051f)
                curveToRelative(0.21f, 0.48f, 0.45f, 0.689f, 0.81f, 1.109f)
                curveToRelative(1.74f, 1.756f, 6.09f, 1.666f, 6.871f, -1.004f)
                curveToRelative(0.029f, -0.09f, 0.24f, -0.705f, 0.074f, -1.65f)
                lineToRelative(0.046f, 0.067f)
                close()
                moveTo(13.051f, 11.031f)
                horizontalLineToRelative(-2.248f)
                curveToRelative(0.0f, 1.938f, -0.009f, 3.864f, -0.009f, 5.805f)
                curveToRelative(0.0f, 1.232f, 0.063f, 2.363f, -0.138f, 2.711f)
                curveToRelative(-0.33f, 0.689f, -1.18f, 0.601f, -1.566f, 0.48f)
                curveToRelative(-0.396f, -0.196f, -0.597f, -0.466f, -0.83f, -0.855f)
                curveToRelative(-0.063f, -0.105f, -0.11f, -0.196f, -0.127f, -0.196f)
                lineToRelative(-1.825f, 1.125f)
                curveToRelative(0.305f, 0.63f, 0.75f, 1.172f, 1.324f, 1.517f)
                curveToRelative(0.855f, 0.51f, 2.004f, 0.675f, 3.207f, 0.405f)
                curveToRelative(0.783f, -0.226f, 1.458f, -0.691f, 1.811f, -1.411f)
                curveToRelative(0.51f, -0.93f, 0.402f, -2.07f, 0.397f, -3.346f)
                curveToRelative(0.012f, -2.054f, 0.0f, -4.109f, 0.0f, -6.179f)
                lineToRelative(0.004f, -0.056f)
                close()
            }
        }
        .build()
        return _javascript!!
    }

private var _javascript: ImageVector? = null
