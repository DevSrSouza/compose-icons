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

public val SimpleIcons.Bugatti: ImageVector
    get() {
        if (_bugatti != null) {
            return _bugatti!!
        }
        _bugatti = Builder(name = "Bugatti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.978f)
                horizontalLineToRelative(18.593f)
                curveToRelative(0.021f, 0.004f, 0.042f, 0.012f, 0.063f, 0.013f)
                curveToRelative(0.436f, 0.019f, 0.863f, 0.09f, 1.279f, 0.218f)
                curveToRelative(1.459f, 0.451f, 2.507f, 1.367f, 3.117f, 2.772f)
                curveToRelative(0.454f, 1.046f, 0.5f, 2.259f, 0.316f, 3.156f)
                arcToRelative(4.634f, 4.634f, 0.0f, false, true, -1.37f, 2.482f)
                curveToRelative(-0.014f, 0.014f, -0.027f, 0.03f, -0.04f, 0.045f)
                curveToRelative(0.021f, 0.026f, 0.052f, 0.04f, 0.077f, 0.061f)
                arcToRelative(4.774f, 4.774f, 0.0f, false, true, 1.951f, 3.564f)
                curveToRelative(0.001f, 0.021f, 0.01f, 0.042f, 0.014f, 0.063f)
                verticalLineToRelative(0.79f)
                curveToRelative(-0.005f, 0.027f, -0.012f, 0.053f, -0.014f, 0.08f)
                curveToRelative(-0.004f, 0.046f, -0.002f, 0.093f, -0.007f, 0.14f)
                arcToRelative(5.501f, 5.501f, 0.0f, false, true, -0.21f, 1.047f)
                curveToRelative(-0.398f, 1.278f, -1.167f, 2.262f, -2.336f, 2.924f)
                curveToRelative(-0.836f, 0.474f, -1.744f, 0.686f, -2.7f, 0.687f)
                curveToRelative(-6.24f, 0.004f, -12.48f, 0.002f, -18.72f, 0.002f)
                verticalLineToRelative(-4.74f)
                horizontalLineToRelative(2.988f)
                lineToRelative(0.001f, 1.738f)
                curveToRelative(0.134f, 0.016f, 7.226f, 0.01f, 7.286f, -0.006f)
                verticalLineToRelative(-4.668f)
                horizontalLineToRelative(-3.06f)
                verticalLineToRelative(1.425f)
                curveToRelative(-0.102f, 0.019f, -2.928f, 0.014f, -2.986f, -0.004f)
                lineTo(4.242f, 8.912f)
                horizontalLineToRelative(2.986f)
                verticalLineToRelative(1.424f)
                curveToRelative(0.103f, 0.019f, 3.003f, 0.014f, 3.06f, -0.003f)
                lineTo(10.288f, 5.976f)
                lineTo(3.0f, 5.976f)
                lineTo(3.0f, 7.51f)
                lineTo(0.008f, 7.51f)
                close()
                moveTo(13.753f, 18.028f)
                horizontalLineToRelative(4.744f)
                curveToRelative(0.254f, 0.0f, 0.505f, -0.023f, 0.75f, -0.09f)
                curveToRelative(0.77f, -0.21f, 1.3f, -0.683f, 1.546f, -1.447f)
                arcToRelative(2.605f, 2.605f, 0.0f, false, false, -0.007f, -1.636f)
                arcToRelative(2.068f, 2.068f, 0.0f, false, false, -1.12f, -1.274f)
                arcToRelative(2.553f, 2.553f, 0.0f, false, false, -1.092f, -0.239f)
                horizontalLineToRelative(-4.82f)
                close()
                moveTo(13.756f, 5.97f)
                verticalLineToRelative(4.377f)
                horizontalLineToRelative(4.397f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.723f, -0.103f)
                curveToRelative(0.678f, -0.203f, 1.147f, -0.63f, 1.376f, -1.304f)
                curveToRelative(0.145f, -0.428f, 0.163f, -0.868f, 0.068f, -1.308f)
                curveToRelative(-0.161f, -0.742f, -0.598f, -1.251f, -1.313f, -1.515f)
                arcToRelative(2.711f, 2.711f, 0.0f, false, false, -0.947f, -0.147f)
                close()
            }
        }
        .build()
        return _bugatti!!
    }

private var _bugatti: ImageVector? = null
