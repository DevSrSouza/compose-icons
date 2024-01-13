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

public val SimpleIcons.Nikon: ImageVector
    get() {
        if (_nikon != null) {
            return _nikon!!
        }
        _nikon = Builder(name = "Nikon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.267f, 8.681f)
                curveToRelative(-0.69f, 0.0f, -1.054f, 0.463f, -1.054f, 0.873f)
                curveToRelative(0.0f, 0.144f, 0.032f, 0.653f, 0.949f, 0.653f)
                curveToRelative(0.762f, 0.0f, 1.057f, -0.488f, 1.057f, -0.854f)
                curveToRelative(0.0f, -0.244f, -0.2f, -0.672f, -0.952f, -0.672f)
                close()
                moveTo(1.397f, 8.896f)
                lineTo(0.0f, 15.146f)
                horizontalLineToRelative(1.72f)
                curveToRelative(0.194f, -1.0f, 0.455f, -2.056f, 0.711f, -3.138f)
                lineToRelative(1.206f, 3.136f)
                lineTo(5.27f, 15.144f)
                lineTo(6.681f, 8.9f)
                lineTo(5.0f, 8.9f)
                lineToRelative(-0.715f, 3.176f)
                lineToRelative(-1.18f, -3.18f)
                close()
                moveTo(9.984f, 8.9f)
                lineTo(8.6f, 15.144f)
                horizontalLineToRelative(1.663f)
                lineToRelative(0.558f, -2.375f)
                lineToRelative(0.703f, 2.375f)
                horizontalLineToRelative(1.705f)
                lineToRelative(-0.707f, -2.508f)
                lineToRelative(1.715f, -2.08f)
                horizontalLineToRelative(-1.91f)
                lineToRelative(-1.38f, 1.664f)
                lineToRelative(0.743f, -3.32f)
                close()
                moveTo(16.592f, 10.365f)
                curveToRelative(-2.582f, 0.0f, -2.962f, 2.01f, -3.034f, 2.379f)
                curveToRelative(-0.19f, 0.93f, 0.02f, 2.137f, 1.235f, 2.457f)
                curveToRelative(0.8f, 0.21f, 2.051f, 0.187f, 2.855f, -0.47f)
                curveToRelative(0.736f, -0.6f, 1.1f, -1.619f, 1.088f, -2.575f)
                curveToRelative(-0.012f, -0.92f, -0.79f, -1.791f, -2.144f, -1.791f)
                close()
                moveTo(22.785f, 10.437f)
                curveToRelative(-0.573f, 0.038f, -1.156f, 0.35f, -1.486f, 0.807f)
                curveToRelative(0.044f, -0.188f, 0.088f, -0.404f, 0.14f, -0.658f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(-0.999f, 4.558f)
                horizontalLineToRelative(1.695f)
                lineToRelative(0.563f, -2.586f)
                curveToRelative(0.104f, -0.476f, 0.488f, -0.68f, 0.826f, -0.591f)
                curveToRelative(0.146f, 0.04f, 0.35f, 0.15f, 0.281f, 0.548f)
                lineToRelative(-0.574f, 2.63f)
                horizontalLineToRelative(1.674f)
                lineToRelative(0.767f, -3.51f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, -0.627f, -1.14f)
                arcToRelative(1.594f, 1.594f, 0.0f, false, false, -0.56f, -0.058f)
                close()
                moveTo(7.125f, 10.558f)
                lineTo(6.105f, 15.144f)
                horizontalLineToRelative(1.676f)
                lineToRelative(1.022f, -4.586f)
                close()
                moveTo(16.355f, 11.662f)
                curveToRelative(0.372f, -0.002f, 0.472f, 0.218f, 0.44f, 0.426f)
                curveToRelative(-0.09f, 0.545f, -0.245f, 1.081f, -0.362f, 1.539f)
                curveToRelative(-0.082f, 0.254f, -0.321f, 0.4f, -0.601f, 0.4f)
                curveToRelative(-0.286f, 0.0f, -0.458f, -0.178f, -0.432f, -0.406f)
                curveToRelative(0.04f, -0.384f, 0.286f, -1.357f, 0.356f, -1.549f)
                curveToRelative(0.12f, -0.334f, 0.451f, -0.408f, 0.6f, -0.41f)
                close()
            }
        }
        .build()
        return _nikon!!
    }

private var _nikon: ImageVector? = null
