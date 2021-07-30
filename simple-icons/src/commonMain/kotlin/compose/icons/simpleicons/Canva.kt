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

public val SimpleIcons.Canva: ImageVector
    get() {
        if (_canva != null) {
            return _canva!!
        }
        _canva = Builder(name = "Canva", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(6.962f, 7.68f)
                curveToRelative(0.754f, 0.0f, 1.337f, 0.549f, 1.405f, 1.2f)
                curveToRelative(0.069f, 0.583f, -0.171f, 1.097f, -0.822f, 1.406f)
                curveToRelative(-0.343f, 0.171f, -0.48f, 0.172f, -0.549f, 0.069f)
                curveToRelative(-0.034f, -0.069f, 0.0f, -0.137f, 0.069f, -0.206f)
                curveToRelative(0.617f, -0.514f, 0.617f, -0.926f, 0.548f, -1.508f)
                curveToRelative(-0.034f, -0.378f, -0.308f, -0.618f, -0.583f, -0.618f)
                curveToRelative(-1.2f, 0.0f, -2.914f, 2.674f, -2.674f, 4.629f)
                curveToRelative(0.103f, 0.754f, 0.549f, 1.646f, 1.509f, 1.646f)
                curveToRelative(0.308f, 0.0f, 0.65f, -0.103f, 0.96f, -0.24f)
                curveToRelative(0.5f, -0.264f, 0.799f, -0.47f, 1.097f, -0.8f)
                curveToRelative(-0.073f, -0.885f, 0.704f, -2.046f, 1.851f, -2.046f)
                curveToRelative(0.515f, 0.0f, 0.926f, 0.205f, 0.96f, 0.583f)
                curveToRelative(0.068f, 0.514f, -0.377f, 0.582f, -0.514f, 0.582f)
                reflectiveCurveToRelative(-0.378f, -0.034f, -0.378f, -0.17f)
                curveToRelative(-0.034f, -0.138f, 0.309f, -0.07f, 0.275f, -0.378f)
                curveToRelative(-0.035f, -0.206f, -0.24f, -0.274f, -0.446f, -0.274f)
                curveToRelative(-0.72f, 0.0f, -1.131f, 0.994f, -1.029f, 1.611f)
                curveToRelative(0.035f, 0.275f, 0.172f, 0.549f, 0.447f, 0.549f)
                curveToRelative(0.205f, 0.0f, 0.514f, -0.31f, 0.617f, -0.755f)
                curveToRelative(0.068f, -0.308f, 0.343f, -0.514f, 0.583f, -0.514f)
                curveToRelative(0.102f, 0.0f, 0.17f, 0.034f, 0.205f, 0.171f)
                verticalLineToRelative(0.138f)
                curveToRelative(-0.034f, 0.137f, -0.137f, 0.548f, -0.102f, 0.651f)
                curveToRelative(0.0f, 0.069f, 0.034f, 0.171f, 0.17f, 0.171f)
                curveToRelative(0.092f, 0.0f, 0.436f, -0.18f, 0.777f, -0.459f)
                curveToRelative(0.117f, -0.59f, 0.253f, -1.298f, 0.253f, -1.357f)
                curveToRelative(0.034f, -0.24f, 0.137f, -0.48f, 0.617f, -0.48f)
                curveToRelative(0.103f, 0.0f, 0.171f, 0.034f, 0.205f, 0.171f)
                verticalLineToRelative(0.138f)
                lineToRelative(-0.136f, 0.617f)
                curveToRelative(0.445f, -0.583f, 1.097f, -0.994f, 1.508f, -0.994f)
                curveToRelative(0.172f, 0.0f, 0.309f, 0.102f, 0.309f, 0.274f)
                curveToRelative(0.0f, 0.103f, 0.0f, 0.274f, -0.069f, 0.446f)
                curveToRelative(-0.137f, 0.377f, -0.309f, 0.96f, -0.412f, 1.474f)
                curveToRelative(0.0f, 0.137f, 0.035f, 0.274f, 0.207f, 0.274f)
                curveToRelative(0.171f, 0.0f, 0.685f, -0.206f, 1.096f, -0.754f)
                lineToRelative(0.007f, -0.004f)
                curveToRelative(-0.002f, -0.068f, -0.007f, -0.134f, -0.007f, -0.202f)
                curveToRelative(0.0f, -0.411f, 0.035f, -0.754f, 0.104f, -0.994f)
                curveToRelative(0.068f, -0.274f, 0.411f, -0.514f, 0.617f, -0.514f)
                curveToRelative(0.103f, 0.0f, 0.205f, 0.069f, 0.205f, 0.171f)
                curveToRelative(0.0f, 0.035f, 0.0f, 0.103f, -0.034f, 0.137f)
                curveToRelative(-0.137f, 0.446f, -0.24f, 0.857f, -0.24f, 1.269f)
                curveToRelative(0.0f, 0.24f, 0.034f, 0.582f, 0.102f, 0.788f)
                curveToRelative(0.0f, 0.034f, 0.035f, 0.069f, 0.07f, 0.069f)
                curveToRelative(0.068f, 0.0f, 0.548f, -0.445f, 0.89f, -1.028f)
                curveToRelative(-0.308f, -0.206f, -0.48f, -0.549f, -0.48f, -0.96f)
                curveToRelative(0.0f, -0.72f, 0.446f, -1.097f, 0.858f, -1.097f)
                curveToRelative(0.343f, 0.0f, 0.617f, 0.24f, 0.617f, 0.72f)
                curveToRelative(0.0f, 0.308f, -0.103f, 0.65f, -0.274f, 0.96f)
                horizontalLineToRelative(0.102f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, false, 0.584f, -0.24f)
                arcToRelative(0.293f, 0.293f, 0.0f, false, true, 0.134f, -0.117f)
                curveToRelative(0.335f, -0.425f, 0.83f, -0.74f, 1.41f, -0.74f)
                curveToRelative(0.48f, 0.0f, 0.924f, 0.205f, 0.959f, 0.582f)
                curveToRelative(0.068f, 0.515f, -0.378f, 0.618f, -0.515f, 0.618f)
                lineToRelative(-0.002f, -0.002f)
                curveToRelative(-0.138f, 0.0f, -0.377f, -0.035f, -0.377f, -0.172f)
                curveToRelative(0.0f, -0.137f, 0.309f, -0.068f, 0.274f, -0.376f)
                curveToRelative(-0.034f, -0.206f, -0.24f, -0.275f, -0.446f, -0.275f)
                curveToRelative(-0.686f, 0.0f, -1.13f, 0.891f, -1.028f, 1.611f)
                curveToRelative(0.034f, 0.275f, 0.171f, 0.583f, 0.445f, 0.583f)
                curveToRelative(0.206f, 0.0f, 0.515f, -0.308f, 0.652f, -0.754f)
                curveToRelative(0.068f, -0.274f, 0.343f, -0.514f, 0.583f, -0.514f)
                curveToRelative(0.103f, 0.0f, 0.17f, 0.034f, 0.205f, 0.171f)
                curveToRelative(0.0f, 0.069f, 0.0f, 0.206f, -0.137f, 0.652f)
                curveToRelative(-0.17f, 0.308f, -0.171f, 0.48f, -0.137f, 0.617f)
                curveToRelative(0.034f, 0.274f, 0.171f, 0.48f, 0.309f, 0.583f)
                curveToRelative(0.034f, 0.034f, 0.068f, 0.102f, 0.068f, 0.102f)
                curveToRelative(0.0f, 0.069f, -0.034f, 0.138f, -0.137f, 0.138f)
                curveToRelative(-0.034f, 0.0f, -0.068f, 0.0f, -0.103f, -0.035f)
                curveToRelative(-0.514f, -0.205f, -0.72f, -0.548f, -0.789f, -0.891f)
                curveToRelative(-0.205f, 0.24f, -0.445f, 0.377f, -0.72f, 0.377f)
                curveToRelative(-0.445f, 0.0f, -0.89f, -0.411f, -0.96f, -0.926f)
                arcToRelative(1.609f, 1.609f, 0.0f, false, true, 0.075f, -0.649f)
                curveToRelative(-0.203f, 0.13f, -0.422f, 0.203f, -0.623f, 0.203f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-0.447f, 0.652f, -0.927f, 1.098f, -1.27f, 1.303f)
                arcToRelative(0.896f, 0.896f, 0.0f, false, true, -0.377f, 0.104f)
                curveToRelative(-0.068f, 0.0f, -0.171f, -0.035f, -0.205f, -0.104f)
                curveToRelative(-0.095f, -0.152f, -0.156f, -0.392f, -0.193f, -0.667f)
                curveToRelative(-0.481f, 0.527f, -1.145f, 0.805f, -1.453f, 0.805f)
                curveToRelative(-0.343f, 0.0f, -0.548f, -0.206f, -0.582f, -0.55f)
                verticalLineToRelative(-0.376f)
                curveToRelative(0.102f, -0.754f, 0.377f, -1.2f, 0.377f, -1.337f)
                arcToRelative(0.074f, 0.074f, 0.0f, false, false, -0.069f, -0.07f)
                curveToRelative(-0.24f, 0.0f, -1.028f, 0.824f, -1.166f, 1.373f)
                lineToRelative(-0.103f, 0.445f)
                curveToRelative(-0.068f, 0.309f, -0.377f, 0.515f, -0.582f, 0.515f)
                curveToRelative(-0.103f, 0.0f, -0.172f, -0.035f, -0.206f, -0.172f)
                verticalLineToRelative(-0.137f)
                lineToRelative(0.046f, -0.233f)
                curveToRelative(-0.435f, 0.31f, -0.87f, 0.508f, -1.075f, 0.508f)
                curveToRelative(-0.308f, 0.0f, -0.48f, -0.172f, -0.514f, -0.412f)
                curveToRelative(-0.206f, 0.274f, -0.445f, 0.412f, -0.754f, 0.412f)
                curveToRelative(-0.352f, 0.0f, -0.696f, -0.24f, -0.862f, -0.593f)
                curveToRelative(-0.244f, 0.275f, -0.523f, 0.553f, -0.852f, 0.764f)
                curveToRelative(-0.48f, 0.309f, -1.028f, 0.549f, -1.68f, 0.549f)
                curveToRelative(-0.582f, 0.0f, -1.097f, -0.309f, -1.371f, -0.583f)
                curveToRelative(-0.412f, -0.377f, -0.651f, -0.96f, -0.686f, -1.509f)
                curveToRelative(-0.205f, -1.68f, 0.823f, -3.84f, 2.4f, -4.8f)
                curveToRelative(0.378f, -0.205f, 0.755f, -0.343f, 1.132f, -0.343f)
                close()
                moveTo(16.732f, 10.971f)
                curveToRelative(-0.104f, 0.0f, -0.172f, 0.172f, -0.172f, 0.343f)
                curveToRelative(0.0f, 0.274f, 0.137f, 0.583f, 0.309f, 0.755f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 0.102f, -0.583f)
                curveToRelative(0.0f, -0.343f, -0.137f, -0.515f, -0.24f, -0.515f)
                close()
            }
        }
        .build()
        return _canva!!
    }

private var _canva: ImageVector? = null
