package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(11.134f, 1.535f)
                curveTo(9.722f, 2.562f, 8.16f, 4.057f, 6.889f, 5.312f)
                curveTo(5.8f, 6.387f, 5.041f, 7.401f, 4.575f, 8.294f)
                arcToRelative(3.745f, 3.745f, 0.0f, false, false, -3.227f, 1.054f)
                curveToRelative(-0.43f, 0.431f, -0.69f, 1.066f, -0.86f, 1.657f)
                arcToRelative(11.982f, 11.982f, 0.0f, false, false, -0.358f, 1.914f)
                arcTo(21.263f, 21.263f, 0.0f, false, false, 0.0f, 15.203f)
                verticalLineToRelative(0.054f)
                lineToRelative(0.75f, -0.007f)
                lineToRelative(-0.007f, 0.75f)
                horizontalLineToRelative(0.054f)
                arcToRelative(14.404f, 14.404f, 0.0f, false, false, 0.654f, -0.012f)
                arcToRelative(21.243f, 21.243f, 0.0f, false, false, 1.63f, -0.118f)
                curveToRelative(0.62f, -0.07f, 1.3f, -0.18f, 1.914f, -0.357f)
                curveToRelative(0.592f, -0.17f, 1.226f, -0.43f, 1.657f, -0.861f)
                arcToRelative(3.745f, 3.745f, 0.0f, false, false, 1.055f, -3.217f)
                curveToRelative(0.908f, -0.461f, 1.942f, -1.216f, 3.04f, -2.3f)
                curveToRelative(1.279f, -1.262f, 2.764f, -2.825f, 3.775f, -4.249f)
                curveToRelative(0.501f, -0.706f, 0.923f, -1.428f, 1.125f, -2.096f)
                curveToRelative(0.2f, -0.659f, 0.235f, -1.469f, -0.368f, -2.07f)
                curveToRelative(-0.606f, -0.607f, -1.42f, -0.55f, -2.069f, -0.34f)
                curveToRelative(-0.66f, 0.213f, -1.376f, 0.646f, -2.076f, 1.155f)
                close()
                moveTo(7.184f, 10.015f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, -1.19f, -1.192f)
                arcToRelative(9.758f, 9.758f, 0.0f, false, true, 1.161f, -1.607f)
                lineToRelative(1.658f, 1.658f)
                arcToRelative(9.853f, 9.853f, 0.0f, false, true, -1.63f, 1.142f)
                close()
                moveTo(0.742f, 16.0f)
                lineToRelative(0.007f, -0.75f)
                lineToRelative(-0.75f, 0.008f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 0.743f, 16.0f)
                close()
                moveTo(12.016f, 2.749f)
                curveToRelative(-1.224f, 0.89f, -2.605f, 2.189f, -3.822f, 3.384f)
                lineToRelative(1.718f, 1.718f)
                curveToRelative(1.21f, -1.205f, 2.51f, -2.597f, 3.387f, -3.833f)
                curveToRelative(0.47f, -0.662f, 0.78f, -1.227f, 0.912f, -1.662f)
                curveToRelative(0.134f, -0.444f, 0.032f, -0.551f, 0.009f, -0.575f)
                horizontalLineToRelative(-0.001f)
                lineTo(14.219f, 1.78f)
                curveToRelative(-0.014f, -0.014f, -0.112f, -0.113f, -0.548f, 0.027f)
                curveToRelative(-0.432f, 0.14f, -0.995f, 0.462f, -1.655f, 0.942f)
                close()
                moveTo(1.62f, 13.089f)
                arcToRelative(19.56f, 19.56f, 0.0f, false, false, -0.104f, 1.395f)
                arcToRelative(19.55f, 19.55f, 0.0f, false, false, 1.396f, -0.104f)
                arcToRelative(10.528f, 10.528f, 0.0f, false, false, 1.668f, -0.309f)
                curveToRelative(0.526f, -0.151f, 0.856f, -0.325f, 1.011f, -0.48f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.182f, -3.182f)
                curveToRelative(-0.155f, 0.155f, -0.329f, 0.485f, -0.48f, 1.01f)
                arcToRelative(10.515f, 10.515f, 0.0f, false, false, -0.309f, 1.67f)
                close()
            }
        }
        .build()
        return _paintbrush16!!
    }

private var _paintbrush16: ImageVector? = null
