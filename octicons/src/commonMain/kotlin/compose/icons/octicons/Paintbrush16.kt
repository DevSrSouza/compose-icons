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

public val Octicons.Paintbrush16: ImageVector
    get() {
        if (_paintbrush16 != null) {
            return _paintbrush16!!
        }
        _paintbrush16 = Builder(name = "Paintbrush16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.134f, 1.535f)
                curveToRelative(0.7f, -0.509f, 1.416f, -0.942f, 2.076f, -1.155f)
                curveToRelative(0.649f, -0.21f, 1.463f, -0.267f, 2.069f, 0.34f)
                curveToRelative(0.603f, 0.601f, 0.568f, 1.411f, 0.368f, 2.07f)
                curveToRelative(-0.202f, 0.668f, -0.624f, 1.39f, -1.125f, 2.096f)
                curveToRelative(-1.011f, 1.424f, -2.496f, 2.987f, -3.775f, 4.249f)
                curveToRelative(-1.098f, 1.084f, -2.132f, 1.839f, -3.04f, 2.3f)
                arcToRelative(3.744f, 3.744f, 0.0f, false, true, -1.055f, 3.217f)
                curveToRelative(-0.431f, 0.431f, -1.065f, 0.691f, -1.657f, 0.861f)
                curveToRelative(-0.614f, 0.177f, -1.294f, 0.287f, -1.914f, 0.357f)
                arcTo(21.151f, 21.151f, 0.0f, false, true, 0.797f, 16.0f)
                lineTo(0.743f, 16.0f)
                lineToRelative(0.007f, -0.75f)
                lineTo(0.749f, 15.25f)
                lineTo(0.742f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.743f, -0.742f)
                lineToRelative(0.743f, -0.008f)
                lineToRelative(-0.742f, 0.007f)
                verticalLineToRelative(-0.054f)
                arcToRelative(21.25f, 21.25f, 0.0f, false, true, 0.13f, -2.284f)
                curveToRelative(0.067f, -0.647f, 0.187f, -1.287f, 0.358f, -1.914f)
                curveToRelative(0.17f, -0.591f, 0.43f, -1.226f, 0.86f, -1.657f)
                arcToRelative(3.746f, 3.746f, 0.0f, false, true, 3.227f, -1.054f)
                curveToRelative(0.466f, -0.893f, 1.225f, -1.907f, 2.314f, -2.982f)
                curveToRelative(1.271f, -1.255f, 2.833f, -2.75f, 4.245f, -3.777f)
                close()
                moveTo(1.62f, 13.089f)
                curveToRelative(-0.051f, 0.464f, -0.086f, 0.929f, -0.104f, 1.395f)
                curveToRelative(0.466f, -0.018f, 0.932f, -0.053f, 1.396f, -0.104f)
                arcToRelative(10.511f, 10.511f, 0.0f, false, false, 1.668f, -0.309f)
                curveToRelative(0.526f, -0.151f, 0.856f, -0.325f, 1.011f, -0.48f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, -3.182f, -3.182f)
                curveToRelative(-0.155f, 0.155f, -0.329f, 0.485f, -0.48f, 1.01f)
                arcToRelative(10.515f, 10.515f, 0.0f, false, false, -0.309f, 1.67f)
                close()
                moveTo(12.016f, 2.749f)
                curveToRelative(-1.224f, 0.89f, -2.605f, 2.189f, -3.822f, 3.384f)
                lineToRelative(1.718f, 1.718f)
                curveToRelative(1.21f, -1.205f, 2.51f, -2.597f, 3.387f, -3.833f)
                curveToRelative(0.47f, -0.662f, 0.78f, -1.227f, 0.912f, -1.662f)
                curveToRelative(0.134f, -0.444f, 0.032f, -0.551f, 0.009f, -0.575f)
                horizontalLineToRelative(-0.001f)
                lineTo(14.219f, 1.78f)
                curveToRelative(-0.014f, -0.014f, -0.113f, -0.113f, -0.548f, 0.027f)
                curveToRelative(-0.432f, 0.14f, -0.995f, 0.462f, -1.655f, 0.942f)
                close()
                moveTo(7.184f, 10.015f)
                lineTo(7.183f, 10.016f)
                arcToRelative(9.859f, 9.859f, 0.0f, false, false, 1.63f, -1.142f)
                lineTo(7.155f, 7.216f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, -1.161f, 1.607f)
                curveToRelative(0.482f, 0.302f, 0.889f, 0.71f, 1.19f, 1.192f)
                close()
            }
        }
        .build()
        return _paintbrush16!!
    }

private var _paintbrush16: ImageVector? = null
