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

public val SimpleIcons.Askfm: ImageVector
    get() {
        if (_askfm != null) {
            return _askfm!!
        }
        _askfm = Builder(name = "Askfm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-2.172f, 0.0f, -4.195f, -0.547f, -6.07f, -1.64f)
                arcToRelative(12.003f, 12.003f, 0.0f, false, true, -4.29f, -4.29f)
                arcTo(11.842f, 11.842f, 0.0f, false, true, 0.0f, 12.0f)
                curveToRelative(0.0f, -2.172f, 0.547f, -4.195f, 1.64f, -6.07f)
                arcToRelative(12.003f, 12.003f, 0.0f, false, true, 4.29f, -4.29f)
                arcTo(11.842f, 11.842f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(2.172f, 0.0f, 4.195f, 0.547f, 6.07f, 1.64f)
                arcToRelative(12.003f, 12.003f, 0.0f, false, true, 4.29f, 4.29f)
                arcTo(11.842f, 11.842f, 0.0f, false, true, 24.0f, 12.0f)
                curveToRelative(0.0f, 2.172f, -0.547f, 4.195f, -1.64f, 6.07f)
                arcToRelative(12.003f, 12.003f, 0.0f, false, true, -4.29f, 4.29f)
                arcTo(11.842f, 11.842f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(14.133f, 9.773f)
                curveToRelative(-0.39f, 0.282f, -0.664f, 0.688f, -0.82f, 1.22f)
                curveToRelative(-0.157f, 0.53f, -0.188f, 1.109f, -0.094f, 1.734f)
                reflectiveCurveToRelative(0.312f, 1.222f, 0.656f, 1.793f)
                curveToRelative(0.344f, 0.57f, 0.754f, 1.027f, 1.23f, 1.37f)
                curveToRelative(0.477f, 0.344f, 0.961f, 0.54f, 1.454f, 0.587f)
                curveToRelative(0.492f, 0.046f, 0.933f, -0.07f, 1.324f, -0.352f)
                curveToRelative(0.39f, -0.281f, 0.664f, -0.688f, 0.82f, -1.219f)
                curveToRelative(0.156f, -0.531f, 0.188f, -1.11f, 0.094f, -1.734f)
                arcToRelative(4.839f, 4.839f, 0.0f, false, false, -0.656f, -1.793f)
                arcToRelative(4.564f, 4.564f, 0.0f, false, false, -1.23f, -1.371f)
                curveToRelative(-0.477f, -0.344f, -0.962f, -0.54f, -1.454f, -0.586f)
                arcToRelative(1.887f, 1.887f, 0.0f, false, false, -1.324f, 0.351f)
                close()
                moveTo(16.617f, 14.953f)
                curveToRelative(-0.469f, 0.188f, -0.937f, 0.152f, -1.406f, -0.105f)
                curveToRelative(-0.469f, -0.258f, -0.813f, -0.66f, -1.031f, -1.207f)
                arcToRelative(3.082f, 3.082f, 0.0f, false, true, -0.164f, -0.797f)
                horizontalLineToRelative(0.023f)
                curveToRelative(0.063f, 0.0f, 0.14f, -0.016f, 0.234f, -0.047f)
                horizontalLineToRelative(-0.023f)
                curveToRelative(0.188f, -0.063f, 0.316f, -0.211f, 0.387f, -0.445f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, -0.012f, -0.633f)
                arcToRelative(0.842f, 0.842f, 0.0f, false, false, -0.164f, -0.305f)
                verticalLineToRelative(0.024f)
                curveToRelative(0.187f, -0.235f, 0.406f, -0.399f, 0.656f, -0.493f)
                curveToRelative(0.469f, -0.203f, 0.938f, -0.175f, 1.406f, 0.082f)
                curveToRelative(0.47f, 0.258f, 0.809f, 0.668f, 1.02f, 1.23f)
                curveToRelative(0.21f, 0.563f, 0.227f, 1.106f, 0.047f, 1.63f)
                curveToRelative(-0.18f, 0.523f, -0.504f, 0.879f, -0.973f, 1.066f)
                close()
                moveTo(13.031f, 15.188f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, false, -0.515f, -0.106f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, false, -0.47f, 0.27f)
                lineToRelative(-0.187f, 0.234f)
                arcToRelative(0.348f, 0.348f, 0.0f, false, false, -0.093f, 0.258f)
                curveToRelative(0.0f, 0.062f, 0.015f, 0.125f, 0.046f, 0.187f)
                curveToRelative(0.391f, 0.735f, 0.711f, 1.242f, 0.961f, 1.524f)
                arcToRelative(0.124f, 0.124f, 0.0f, false, false, 0.13f, 0.058f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, 0.128f, -0.082f)
                curveToRelative(0.094f, -0.234f, 0.219f, -0.734f, 0.375f, -1.5f)
                lineToRelative(0.047f, -0.258f)
                verticalLineToRelative(-0.07f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, -0.164f, -0.328f)
                close()
                moveTo(8.227f, 10.547f)
                curveToRelative(-0.47f, 0.062f, -0.891f, 0.289f, -1.266f, 0.68f)
                curveToRelative(-0.375f, 0.39f, -0.664f, 0.882f, -0.867f, 1.476f)
                arcToRelative(5.391f, 5.391f, 0.0f, false, false, -0.282f, 1.887f)
                curveToRelative(0.016f, 0.664f, 0.149f, 1.262f, 0.399f, 1.793f)
                curveToRelative(0.25f, 0.531f, 0.574f, 0.93f, 0.973f, 1.195f)
                curveToRelative(0.398f, 0.266f, 0.832f, 0.367f, 1.3f, 0.305f)
                curveToRelative(0.47f, -0.063f, 0.891f, -0.285f, 1.266f, -0.668f)
                curveToRelative(0.375f, -0.383f, 0.664f, -0.871f, 0.867f, -1.465f)
                arcToRelative(5.391f, 5.391f, 0.0f, false, false, 0.281f, -1.887f)
                curveToRelative(-0.015f, -0.664f, -0.148f, -1.261f, -0.398f, -1.793f)
                curveToRelative(-0.25f, -0.53f, -0.574f, -0.933f, -0.973f, -1.207f)
                arcToRelative(1.806f, 1.806f, 0.0f, false, false, -1.3f, -0.316f)
                close()
                moveTo(10.055f, 14.18f)
                curveToRelative(0.03f, 0.593f, -0.102f, 1.113f, -0.399f, 1.558f)
                curveToRelative(-0.297f, 0.446f, -0.68f, 0.692f, -1.148f, 0.739f)
                curveToRelative(-0.469f, 0.046f, -0.883f, -0.118f, -1.242f, -0.493f)
                curveToRelative(-0.36f, -0.375f, -0.563f, -0.851f, -0.61f, -1.43f)
                verticalLineToRelative(-0.187f)
                curveToRelative(0.0f, -0.219f, 0.024f, -0.43f, 0.07f, -0.633f)
                verticalLineToRelative(0.024f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, false, 0.235f, 0.023f)
                arcToRelative(0.703f, 0.703f, 0.0f, false, false, 0.469f, -0.316f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, 0.14f, -0.598f)
                arcToRelative(0.725f, 0.725f, 0.0f, false, false, -0.07f, -0.328f)
                curveToRelative(0.203f, -0.156f, 0.445f, -0.258f, 0.727f, -0.305f)
                curveToRelative(0.468f, -0.047f, 0.882f, 0.121f, 1.242f, 0.504f)
                reflectiveCurveToRelative(0.554f, 0.864f, 0.586f, 1.442f)
                close()
                moveTo(5.602f, 7.547f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -0.329f, -0.305f)
                curveToRelative(-0.156f, -0.094f, -0.304f, -0.125f, -0.445f, -0.094f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, false, -0.328f, 0.258f)
                arcToRelative(0.961f, 0.961f, 0.0f, false, false, -0.117f, 0.375f)
                lineToRelative(-0.281f, 2.766f)
                lineToRelative(0.304f, -0.516f)
                curveToRelative(0.25f, -0.39f, 0.516f, -0.726f, 0.797f, -1.008f)
                curveToRelative(0.406f, -0.406f, 0.797f, -0.671f, 1.172f, -0.796f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, -0.445f, -0.329f)
                curveToRelative(-0.12f, -0.104f, -0.227f, -0.243f, -0.328f, -0.351f)
                close()
                moveTo(17.25f, 5.016f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, -0.48f, -0.141f)
                curveToRelative(-0.18f, 0.031f, -0.34f, 0.164f, -0.48f, 0.398f)
                curveToRelative(-0.08f, 0.157f, -0.142f, 0.32f, -0.188f, 0.493f)
                curveToRelative(-0.027f, 0.058f, -0.032f, 0.125f, -0.047f, 0.187f)
                lineToRelative(-0.024f, 0.07f)
                curveToRelative(-0.11f, 0.25f, -0.21f, 0.43f, -0.304f, 0.54f)
                curveToRelative(0.453f, 0.015f, 0.89f, 0.101f, 1.312f, 0.257f)
                arcToRelative(4.83f, 4.83f, 0.0f, false, true, 1.594f, 0.961f)
                lineToRelative(0.21f, 0.211f)
                lineToRelative(-1.265f, -2.578f)
                arcToRelative(0.925f, 0.925f, 0.0f, false, false, -0.328f, -0.398f)
                close()
            }
        }
        .build()
        return _askfm!!
    }

private var _askfm: ImageVector? = null
