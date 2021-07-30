package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Bitcoin: ImageVector
    get() {
        if (_bitcoin != null) {
            return _bitcoin!!
        }
        _bitcoin = Builder(name = "Bitcoin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 136.967f, -111.033f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.967f, 8.0f, 256.0f)
                reflectiveCurveTo(119.033f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.033f, 248.0f, 248.0f)
                close()
                moveTo(362.349f, 220.67f)
                curveToRelative(4.937f, -32.999f, -20.191f, -50.739f, -54.55f, -62.573f)
                lineToRelative(11.146f, -44.702f)
                lineToRelative(-27.213f, -6.781f)
                lineToRelative(-10.851f, 43.524f)
                curveToRelative(-7.154f, -1.783f, -14.502f, -3.464f, -21.803f, -5.13f)
                lineToRelative(10.929f, -43.81f)
                lineToRelative(-27.198f, -6.781f)
                lineToRelative(-11.153f, 44.686f)
                curveToRelative(-5.922f, -1.349f, -11.735f, -2.682f, -17.377f, -4.084f)
                lineToRelative(0.031f, -0.14f)
                lineToRelative(-37.53f, -9.37f)
                lineToRelative(-7.239f, 29.062f)
                reflectiveCurveToRelative(20.191f, 4.627f, 19.765f, 4.913f)
                curveToRelative(11.022f, 2.751f, 13.014f, 10.044f, 12.68f, 15.825f)
                lineToRelative(-12.696f, 50.925f)
                curveToRelative(0.76f, 0.194f, 1.744f, 0.473f, 2.829f, 0.907f)
                curveToRelative(-0.907f, -0.225f, -1.876f, -0.473f, -2.876f, -0.713f)
                lineToRelative(-17.796f, 71.338f)
                curveToRelative(-1.349f, 3.348f, -4.767f, 8.37f, -12.471f, 6.464f)
                curveToRelative(0.271f, 0.395f, -19.78f, -4.937f, -19.78f, -4.937f)
                lineToRelative(-13.51f, 31.147f)
                lineToRelative(35.414f, 8.827f)
                curveToRelative(6.588f, 1.651f, 13.045f, 3.379f, 19.4f, 5.006f)
                lineToRelative(-11.262f, 45.213f)
                lineToRelative(27.182f, 6.781f)
                lineToRelative(11.153f, -44.733f)
                arcToRelative(1038.209f, 1038.209f, 0.0f, false, false, 21.687f, 5.627f)
                lineToRelative(-11.115f, 44.523f)
                lineToRelative(27.213f, 6.781f)
                lineToRelative(11.262f, -45.128f)
                curveToRelative(46.404f, 8.781f, 81.299f, 5.239f, 95.986f, -36.727f)
                curveToRelative(11.836f, -33.79f, -0.589f, -53.281f, -25.004f, -65.991f)
                curveToRelative(17.78f, -4.098f, 31.174f, -15.792f, 34.747f, -39.949f)
                close()
                moveTo(300.172f, 307.849f)
                curveToRelative(-8.41f, 33.79f, -65.308f, 15.523f, -83.755f, 10.943f)
                lineToRelative(14.944f, -59.899f)
                curveToRelative(18.446f, 4.603f, 77.6f, 13.717f, 68.811f, 48.956f)
                close()
                moveTo(308.589f, 220.182f)
                curveToRelative(-7.673f, 30.736f, -55.031f, 15.12f, -70.393f, 11.292f)
                lineToRelative(13.548f, -54.327f)
                curveToRelative(15.363f, 3.828f, 64.836f, 10.973f, 56.845f, 43.035f)
                close()
            }
        }
        .build()
        return _bitcoin!!
    }

private var _bitcoin: ImageVector? = null
