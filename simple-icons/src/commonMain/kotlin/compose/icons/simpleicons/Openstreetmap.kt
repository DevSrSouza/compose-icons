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

public val SimpleIcons.Openstreetmap: ImageVector
    get() {
        if (_openstreetmap != null) {
            return _openstreetmap!!
        }
        _openstreetmap = Builder(name = "Openstreetmap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.672f, 23.969f)
                curveToRelative(-0.352f, -0.089f, -0.534f, -0.234f, -1.471f, -1.168f)
                curveTo(0.085f, 21.688f, 0.014f, 21.579f, 0.018f, 20.999f)
                curveToRelative(0.0f, -0.645f, -0.196f, -0.414f, 3.368f, -3.986f)
                curveToRelative(3.6f, -3.608f, 3.415f, -3.451f, 4.064f, -3.449f)
                curveToRelative(0.302f, 0.0f, 0.378f, 0.016f, 0.62f, 0.14f)
                lineToRelative(0.277f, 0.14f)
                lineToRelative(1.744f, -1.744f)
                lineToRelative(-0.218f, -0.343f)
                curveToRelative(-0.425f, -0.662f, -0.825f, -1.629f, -1.006f, -2.429f)
                arcToRelative(7.657f, 7.657f, 0.0f, false, true, 1.479f, -6.44f)
                curveToRelative(2.49f, -3.12f, 6.959f, -3.812f, 10.26f, -1.588f)
                curveToRelative(1.812f, 1.218f, 2.99f, 3.099f, 3.328f, 5.314f)
                curveToRelative(0.07f, 0.467f, 0.07f, 1.579f, 0.0f, 2.074f)
                arcToRelative(7.554f, 7.554f, 0.0f, false, true, -2.205f, 4.402f)
                arcToRelative(6.712f, 6.712f, 0.0f, false, true, -1.943f, 1.401f)
                curveToRelative(-0.959f, 0.483f, -1.775f, 0.71f, -2.881f, 0.803f)
                curveToRelative(-1.573f, 0.131f, -3.32f, -0.305f, -4.656f, -1.163f)
                lineToRelative(-0.343f, -0.218f)
                lineToRelative(-1.744f, 1.744f)
                lineToRelative(0.14f, 0.28f)
                curveToRelative(0.125f, 0.241f, 0.14f, 0.316f, 0.14f, 0.617f)
                curveToRelative(0.003f, 0.651f, 0.156f, 0.467f, -3.426f, 4.049f)
                curveToRelative(-2.761f, 2.756f, -3.186f, 3.164f, -3.398f, 3.261f)
                curveToRelative(-0.271f, 0.125f, -0.69f, 0.171f, -0.945f, 0.106f)
                close()
                moveTo(17.485f, 13.95f)
                arcToRelative(6.425f, 6.425f, 0.0f, false, false, 4.603f, -3.51f)
                curveToRelative(1.391f, -2.899f, 0.455f, -6.306f, -2.227f, -8.108f)
                curveToRelative(-0.638f, -0.43f, -1.529f, -0.794f, -2.367f, -0.962f)
                curveToRelative(-0.581f, -0.117f, -1.809f, -0.104f, -2.414f, 0.025f)
                arcToRelative(6.593f, 6.593f, 0.0f, false, false, -2.452f, 1.064f)
                curveToRelative(-0.444f, 0.315f, -1.177f, 1.048f, -1.487f, 1.487f)
                arcToRelative(6.384f, 6.384f, 0.0f, false, false, 0.38f, 7.907f)
                arcToRelative(6.406f, 6.406f, 0.0f, false, false, 3.901f, 2.136f)
                curveToRelative(0.509f, 0.078f, 1.542f, 0.058f, 2.065f, -0.037f)
                close()
                moveTo(13.747f, 21.326f)
                arcToRelative(80.97f, 80.97f, 0.0f, false, true, -2.196f, -0.651f)
                curveToRelative(-0.025f, -0.028f, 1.207f, -4.396f, 1.257f, -4.449f)
                curveToRelative(0.023f, -0.026f, 4.242f, 1.152f, 4.414f, 1.236f)
                curveToRelative(0.062f, 0.026f, -0.003f, 0.288f, -0.525f, 2.102f)
                arcToRelative(398.513f, 398.513f, 0.0f, false, false, -0.635f, 2.236f)
                curveToRelative(-0.025f, 0.087f, -0.069f, 0.156f, -0.097f, 0.156f)
                curveToRelative(-0.028f, -0.003f, -1.028f, -0.287f, -2.219f, -0.631f)
                close()
                moveTo(16.659f, 21.85f)
                curveToRelative(0.0f, -0.053f, 1.227f, -4.333f, 1.246f, -4.347f)
                curveToRelative(0.047f, -0.034f, 4.324f, -1.23f, 4.341f, -1.211f)
                curveToRelative(0.019f, 0.019f, -1.199f, 4.337f, -1.23f, 4.36f)
                curveToRelative(-0.02f, 0.019f, -4.126f, 1.191f, -4.259f, 1.218f)
                curveToRelative(-0.054f, 0.011f, -0.098f, 0.0f, -0.098f, -0.019f)
                close()
                moveTo(9.554f, 19.939f)
                curveToRelative(0.846f, -0.852f, 1.599f, -1.627f, 1.674f, -1.728f)
                curveToRelative(0.171f, -0.218f, 0.405f, -0.732f, 0.472f, -1.015f)
                curveToRelative(0.026f, -0.118f, 0.053f, -0.352f, 0.058f, -0.522f)
                lineToRelative(0.011f, -0.307f)
                lineToRelative(0.182f, -0.051f)
                curveToRelative(0.103f, -0.028f, 0.193f, -0.044f, 0.202f, -0.034f)
                curveToRelative(0.023f, 0.025f, -1.207f, 4.321f, -1.246f, 4.36f)
                curveToRelative(-0.02f, 0.016f, -0.677f, 0.213f, -1.464f, 0.436f)
                lineToRelative(-1.425f, 0.405f)
                lineToRelative(1.537f, -1.542f)
                close()
                moveTo(17.843f, 16.879f)
                arcToRelative(1.371f, 1.371f, 0.0f, false, true, -0.059f, -0.187f)
                lineToRelative(-0.044f, -0.156f)
                lineToRelative(0.156f, -0.028f)
                curveToRelative(1.339f, -0.227f, 2.776f, -0.856f, 3.908f, -1.713f)
                curveToRelative(0.16f, -0.125f, 0.252f, -0.171f, 0.265f, -0.134f)
                curveToRelative(0.054f, 0.165f, 0.272f, 0.95f, 0.265f, 0.959f)
                curveToRelative(-0.034f, 0.034f, -4.48f, 1.282f, -4.492f, 1.261f)
                close()
                moveTo(2.76f, 15.579f)
                curveToRelative(-0.05f, -0.039f, -1.179f, -3.866f, -1.264f, -4.29f)
                curveToRelative(-0.016f, -0.084f, 0.146f, -0.044f, 2.174f, 0.536f)
                curveToRelative(2.121f, 0.604f, 2.192f, 0.629f, 2.222f, 0.74f)
                curveToRelative(0.028f, 0.098f, 0.011f, 0.129f, -0.125f, 0.223f)
                curveToRelative(-0.084f, 0.059f, -0.769f, 0.724f, -1.523f, 1.479f)
                arcToRelative(63.877f, 63.877f, 0.0f, false, true, -1.39f, 1.367f)
                curveToRelative(-0.016f, 0.0f, -0.056f, -0.025f, -0.093f, -0.054f)
                close()
                moveTo(3.581f, 11.201f)
                curveToRelative(-1.188f, -0.343f, -2.164f, -0.623f, -2.167f, -0.626f)
                curveToRelative(-0.016f, -0.012f, 1.261f, -4.433f, 1.285f, -4.46f)
                curveToRelative(0.022f, -0.022f, 4.422f, 1.211f, 4.469f, 1.252f)
                curveToRelative(0.009f, 0.009f, -0.269f, 1.017f, -0.618f, 2.239f)
                curveToRelative(-0.576f, 2.02f, -0.643f, 2.224f, -0.723f, 2.22f)
                curveToRelative(-0.05f, -0.003f, -1.059f, -0.285f, -2.247f, -0.626f)
                close()
                moveTo(6.54f, 11.739f)
                curveToRelative(0.012f, -0.031f, 0.212f, -0.723f, 0.444f, -1.534f)
                lineToRelative(0.42f, -1.476f)
                lineToRelative(0.056f, 0.321f)
                curveToRelative(0.093f, 0.556f, 0.265f, 1.188f, 0.464f, 1.741f)
                curveToRelative(0.106f, 0.296f, 0.187f, 0.539f, 0.181f, 0.545f)
                curveToRelative(-0.008f, 0.006f, -0.332f, 0.101f, -0.719f, 0.212f)
                curveToRelative(-0.389f, 0.109f, -0.741f, 0.21f, -0.786f, 0.224f)
                curveToRelative(-0.058f, 0.016f, -0.075f, 0.006f, -0.059f, -0.034f)
                close()
                moveTo(4.905f, 6.112f)
                curveToRelative(-1.187f, -0.339f, -2.167f, -0.635f, -2.18f, -0.654f)
                curveToRelative(-0.04f, -0.062f, -1.246f, -4.321f, -1.23f, -4.338f)
                curveToRelative(0.026f, -0.025f, 4.31f, 1.204f, 4.351f, 1.246f)
                curveToRelative(0.047f, 0.051f, 1.28f, 4.379f, 1.246f, 4.376f)
                lineTo(4.91f, 6.113f)
                close()
                moveTo(7.053f, 4.399f)
                lineToRelative(-0.519f, -1.806f)
                lineToRelative(-0.078f, -0.28f)
                lineToRelative(1.693f, -0.483f)
                curveToRelative(0.934f, -0.265f, 1.724f, -0.495f, 1.76f, -0.508f)
                curveToRelative(0.034f, -0.016f, -0.083f, 0.14f, -0.26f, 0.336f)
                arcTo(8.729f, 8.729f, 0.0f, false, false, 7.69f, 5.23f)
                arcToRelative(4.348f, 4.348f, 0.0f, false, false, -0.132f, 0.561f)
                curveToRelative(0.0f, 0.293f, -0.115f, -0.025f, -0.505f, -1.39f)
                close()
            }
        }
        .build()
        return _openstreetmap!!
    }

private var _openstreetmap: ImageVector? = null
