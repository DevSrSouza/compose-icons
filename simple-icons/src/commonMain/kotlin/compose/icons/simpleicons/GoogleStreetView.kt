package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.GoogleStreetView: ImageVector
    get() {
        if (_googleStreetView != null) {
            return _googleStreetView!!
        }
        _googleStreetView = Builder(name = "GoogleStreetView", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.285f, 0.0f)
                curveToRelative(-0.11f, 0.0f, -0.218f, 0.004f, -0.326f, 0.01f)
                curveToRelative(-0.03f, 0.001f, -0.062f, 0.005f, -0.092f, 0.008f)
                arcToRelative(5.723f, 5.723f, 0.0f, false, false, -0.549f, 0.064f)
                curveToRelative(-0.037f, 0.006f, -0.074f, 0.015f, -0.111f, 0.022f)
                curveToRelative(-0.07f, 0.013f, -0.138f, 0.027f, -0.207f, 0.042f)
                lineToRelative(-0.1f, 0.024f)
                arcToRelative(5.635f, 5.635f, 0.0f, false, false, -0.273f, 0.074f)
                lineToRelative(-0.023f, 0.008f)
                arcToRelative(5.67f, 5.67f, 0.0f, false, false, -0.301f, 0.102f)
                curveToRelative(-0.022f, 0.007f, -0.043f, 0.017f, -0.065f, 0.025f)
                arcToRelative(5.669f, 5.669f, 0.0f, false, false, -0.22f, 0.09f)
                lineToRelative(-0.096f, 0.043f)
                arcToRelative(5.765f, 5.765f, 0.0f, false, false, -0.184f, 0.088f)
                lineToRelative(-0.097f, 0.05f)
                curveToRelative(-0.061f, 0.032f, -0.122f, 0.064f, -0.182f, 0.098f)
                lineToRelative(-0.088f, 0.05f)
                curveToRelative(-0.066f, 0.04f, -0.13f, 0.082f, -0.195f, 0.124f)
                lineToRelative(-0.063f, 0.039f)
                arcToRelative(5.746f, 5.746f, 0.0f, false, false, -0.488f, 0.367f)
                lineToRelative(-0.072f, 0.063f)
                arcToRelative(5.803f, 5.803f, 0.0f, false, false, -0.451f, 0.433f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -0.14f, 0.156f)
                lineToRelative(-0.06f, 0.07f)
                arcToRelative(5.692f, 5.692f, 0.0f, false, false, -1.33f, 3.664f)
                arcToRelative(5.712f, 5.712f, 0.0f, false, false, 9.143f, 4.571f)
                lineToRelative(0.017f, -0.014f)
                arcToRelative(5.778f, 5.778f, 0.0f, false, false, 0.452f, -0.38f)
                lineToRelative(0.062f, -0.06f)
                arcToRelative(5.747f, 5.747f, 0.0f, false, false, 0.37f, -0.39f)
                lineToRelative(0.054f, -0.062f)
                curveToRelative(0.06f, -0.07f, 0.116f, -0.143f, 0.172f, -0.217f)
                lineToRelative(0.017f, -0.021f)
                lineToRelative(0.002f, -0.004f)
                curveToRelative(0.06f, -0.08f, 0.118f, -0.163f, 0.174f, -0.246f)
                curveToRelative(0.018f, -0.026f, 0.034f, -0.054f, 0.05f, -0.08f)
                curveToRelative(0.04f, -0.06f, 0.078f, -0.12f, 0.114f, -0.182f)
                lineToRelative(0.051f, -0.088f)
                curveToRelative(0.035f, -0.061f, 0.069f, -0.123f, 0.102f, -0.186f)
                curveToRelative(0.016f, -0.03f, 0.033f, -0.06f, 0.048f, -0.091f)
                curveToRelative(0.03f, -0.06f, 0.058f, -0.121f, 0.086f, -0.182f)
                lineToRelative(0.047f, -0.103f)
                curveToRelative(0.031f, -0.072f, 0.06f, -0.144f, 0.088f, -0.217f)
                lineToRelative(0.025f, -0.065f)
                curveToRelative(0.036f, -0.097f, 0.07f, -0.195f, 0.1f, -0.295f)
                lineToRelative(0.02f, -0.07f)
                curveToRelative(0.022f, -0.075f, 0.043f, -0.15f, 0.062f, -0.227f)
                arcToRelative(5.675f, 5.675f, 0.0f, false, false, 0.068f, -0.313f)
                arcToRelative(5.758f, 5.758f, 0.0f, false, false, 0.086f, -0.645f)
                lineToRelative(0.008f, -0.112f)
                arcToRelative(5.759f, 5.759f, 0.0f, false, false, -0.056f, -1.191f)
                arcToRelative(5.677f, 5.677f, 0.0f, false, false, -0.114f, -0.559f)
                arcToRelative(5.655f, 5.655f, 0.0f, false, false, -0.648f, -1.533f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, -0.477f, -0.672f)
                arcTo(5.76f, 5.76f, 0.0f, false, false, 21.248f, 0.826f)
                lineToRelative(-0.086f, -0.049f)
                arcToRelative(5.716f, 5.716f, 0.0f, false, false, -0.398f, -0.215f)
                arcTo(5.681f, 5.681f, 0.0f, false, false, 18.285f, 0.0f)
                close()
                moveTo(1.715f, 2.285f)
                arcTo(1.72f, 1.72f, 0.0f, false, false, 0.0f, 3.995f)
                verticalLineToRelative(18.29f)
                lineTo(12.941f, 9.344f)
                arcToRelative(6.426f, 6.426f, 0.0f, false, true, -1.12f, -3.63f)
                curveToRelative(0.0f, -1.26f, 0.38f, -2.432f, 1.007f, -3.429f)
                lineTo(1.715f, 2.285f)
                close()
                moveTo(4.857f, 4.0f)
                curveToRelative(0.848f, 0.0f, 1.557f, 0.31f, 2.102f, 0.818f)
                lineToRelative(-0.912f, 0.891f)
                arcToRelative(1.698f, 1.698f, 0.0f, false, false, -1.19f, -0.459f)
                curveToRelative(-0.818f, 0.0f, -1.512f, 0.551f, -1.76f, 1.295f)
                arcToRelative(1.889f, 1.889f, 0.0f, false, false, 0.0f, 1.195f)
                curveToRelative(0.248f, 0.744f, 0.942f, 1.295f, 1.76f, 1.295f)
                curveToRelative(0.46f, 0.0f, 0.808f, -0.121f, 1.067f, -0.297f)
                curveToRelative(0.396f, -0.27f, 0.624f, -0.722f, 0.623f, -1.025f)
                horizontalLineToRelative(-1.69f)
                lineTo(4.857f, 6.57f)
                horizontalLineToRelative(2.94f)
                curveToRelative(0.045f, 0.197f, 0.078f, 0.386f, 0.078f, 0.645f)
                curveToRelative(0.0f, 0.957f, -0.342f, 1.765f, -0.936f, 2.312f)
                curveToRelative(-0.52f, 0.48f, -1.233f, 0.758f, -2.082f, 0.758f)
                arcToRelative(3.142f, 3.142f, 0.0f, true, true, 0.0f, -6.285f)
                close()
                moveTo(14.657f, 11.059f)
                lineToRelative(-2.452f, 2.45f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.428f, -1.56f)
                arcToRelative(6.456f, 6.456f, 0.0f, false, true, -1.977f, -0.89f)
                close()
                moveTo(21.715f, 11.172f)
                arcToRelative(6.601f, 6.601f, 0.0f, false, true, -1.774f, 0.775f)
                curveToRelative(0.607f, 0.087f, 1.2f, 0.22f, 1.774f, 0.395f)
                verticalLineToRelative(-1.17f)
                close()
                moveTo(18.285f, 12.572f)
                curveToRelative(-2.51f, 0.0f, -4.868f, 0.864f, -6.73f, 2.264f)
                curveToRelative(-0.425f, 0.34f, -0.698f, 0.863f, -0.698f, 1.45f)
                lineTo(10.857f, 24.0f)
                lineTo(20.0f, 24.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, 1.715f, -1.715f)
                verticalLineToRelative(-9.164f)
                arcToRelative(11.078f, 11.078f, 0.0f, false, false, -3.43f, -0.549f)
                close()
                moveTo(10.26f, 15.455f)
                lineTo(1.715f, 24.0f)
                horizontalLineToRelative(8.392f)
                verticalLineToRelative(-7.715f)
                curveToRelative(0.0f, -0.292f, 0.063f, -0.567f, 0.153f, -0.83f)
                close()
            }
        }
        .build()
        return _googleStreetView!!
    }

private var _googleStreetView: ImageVector? = null
