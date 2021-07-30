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

public val SimpleIcons.Slackware: ImageVector
    get() {
        if (_slackware != null) {
            return _slackware!!
        }
        _slackware = Builder(name = "Slackware", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.924f, 1.228f)
                curveToRelative(-0.584f, -0.01f, -1.251f, 0.0f, -1.485f, 0.027f)
                curveToRelative(-2.46f, 0.282f, -4.138f, 1.3f, -4.753f, 2.891f)
                curveToRelative(-0.218f, 0.552f, -0.274f, 1.002f, -0.243f, 1.772f)
                curveToRelative(0.048f, 1.21f, 0.419f, 2.004f, 1.262f, 2.742f)
                curveToRelative(1.225f, 1.06f, 2.98f, 1.508f, 5.998f, 1.508f)
                curveToRelative(2.737f, 0.0f, 3.71f, 0.413f, 3.916f, 1.675f)
                curveToRelative(0.313f, 1.867f, -1.57f, 3.07f, -4.414f, 2.827f)
                curveToRelative(-1.878f, -0.16f, -3.496f, -0.912f, -4.223f, -1.967f)
                arcToRelative(7.772f, 7.772f, 0.0f, false, true, -0.355f, -0.62f)
                curveToRelative(-0.382f, -0.76f, -0.64f, -0.978f, -1.176f, -0.978f)
                curveToRelative(-0.43f, 0.005f, -0.732f, 0.165f, -0.918f, 0.494f)
                lineToRelative(-0.133f, 0.24f)
                verticalLineToRelative(4.03f)
                lineToRelative(0.137f, 0.296f)
                curveToRelative(0.165f, 0.344f, 0.4f, 0.546f, 0.744f, 0.63f)
                curveToRelative(0.35f, 0.09f, 0.794f, -0.036f, 1.42f, -0.402f)
                lineToRelative(0.5f, -0.29f)
                lineToRelative(0.826f, 0.185f)
                curveToRelative(1.82f, 0.403f, 2.75f, 0.523f, 4.065f, 0.523f)
                curveToRelative(1.103f, 0.005f, 1.548f, -0.046f, 2.455f, -0.285f)
                curveToRelative(1.124f, -0.297f, 1.974f, -0.785f, 2.717f, -1.57f)
                curveToRelative(0.8f, -0.844f, 1.15f, -1.853f, 1.097f, -3.147f)
                curveToRelative(-0.069f, -1.628f, -0.695f, -2.698f, -2.0f, -3.414f)
                curveToRelative(-0.96f, -0.525f, -2.292f, -0.79f, -4.377f, -0.88f)
                curveToRelative(-2.042f, -0.086f, -2.794f, -0.155f, -3.515f, -0.32f)
                curveToRelative(-0.51f, -0.12f, -0.785f, -0.25f, -1.076f, -0.515f)
                curveToRelative(-0.653f, -0.589f, -0.59f, -1.755f, 0.136f, -2.482f)
                curveToRelative(0.642f, -0.637f, 1.511f, -0.928f, 2.774f, -0.928f)
                curveToRelative(1.432f, 0.005f, 2.393f, 0.27f, 3.412f, 0.955f)
                curveToRelative(0.185f, 0.127f, 0.721f, 0.62f, 1.193f, 1.092f)
                curveToRelative(0.886f, 0.902f, 1.135f, 1.082f, 1.506f, 1.082f)
                curveToRelative(0.244f, 0.0f, 0.59f, -0.163f, 0.732f, -0.344f)
                curveToRelative(0.26f, -0.329f, 0.303f, -0.63f, 0.303f, -2.2f)
                curveToRelative(0.0f, -1.66f, -0.043f, -1.91f, -0.377f, -2.282f)
                curveToRelative(-0.387f, -0.425f, -0.848f, -0.42f, -1.75f, 0.031f)
                lineToRelative(-0.59f, 0.297f)
                lineToRelative(-0.63f, -0.17f)
                curveToRelative(-1.496f, -0.392f, -2.038f, -0.477f, -3.178f, -0.504f)
                close()
                moveTo(0.0f, 13.775f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _slackware!!
    }

private var _slackware: ImageVector? = null
