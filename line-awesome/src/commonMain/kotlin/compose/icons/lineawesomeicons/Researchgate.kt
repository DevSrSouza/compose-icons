package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Researchgate: ImageVector
    get() {
        if (_researchgate != null) {
            return _researchgate!!
        }
        _researchgate = Builder(name = "Researchgate", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(19.164f, 10.002f)
                curveTo(17.881f, 10.002f, 17.441f, 10.919f, 17.441f, 11.535f)
                lineTo(17.441f, 13.17f)
                curveTo(17.441f, 14.0f, 17.893f, 14.793f, 19.063f, 14.793f)
                curveTo(21.024f, 14.791f, 20.787f, 13.306f, 20.787f, 12.275f)
                lineTo(19.254f, 12.275f)
                lineTo(19.254f, 12.816f)
                lineTo(20.158f, 12.816f)
                curveTo(20.158f, 13.621f, 19.781f, 14.162f, 19.064f, 14.162f)
                curveTo(18.498f, 14.162f, 18.172f, 13.671f, 18.172f, 12.992f)
                lineTo(18.172f, 11.635f)
                curveTo(18.172f, 11.006f, 18.762f, 10.643f, 19.164f, 10.643f)
                curveTo(19.881f, 10.643f, 20.156f, 11.271f, 20.156f, 11.271f)
                lineTo(20.697f, 10.906f)
                curveTo(20.697f, 10.906f, 20.434f, 10.002f, 19.164f, 10.002f)
                close()
                moveTo(13.584f, 13.092f)
                curveTo(12.679f, 13.092f, 11.297f, 13.179f, 10.002f, 13.129f)
                lineTo(10.002f, 13.531f)
                curveTo(10.782f, 13.682f, 11.107f, 13.606f, 11.107f, 14.738f)
                lineTo(11.107f, 20.27f)
                curveTo(11.107f, 21.414f, 10.781f, 21.326f, 10.002f, 21.477f)
                lineTo(10.002f, 21.893f)
                curveTo(10.379f, 21.88f, 11.031f, 21.842f, 11.697f, 21.842f)
                curveTo(12.326f, 21.842f, 13.144f, 21.868f, 13.496f, 21.893f)
                lineTo(13.496f, 21.477f)
                curveTo(12.49f, 21.339f, 12.188f, 21.452f, 12.188f, 20.27f)
                lineTo(12.188f, 17.932f)
                curveTo(12.528f, 17.957f, 12.818f, 17.955f, 13.27f, 17.955f)
                curveTo(14.125f, 19.489f, 14.941f, 20.635f, 15.406f, 21.176f)
                curveTo(16.248f, 22.194f, 17.595f, 22.044f, 17.922f, 21.893f)
                lineTo(17.922f, 21.516f)
                curveTo(17.419f, 21.515f, 16.915f, 21.175f, 16.551f, 20.773f)
                curveTo(15.935f, 20.107f, 15.105f, 19.026f, 14.426f, 17.807f)
                curveTo(15.558f, 17.53f, 16.4f, 16.461f, 16.4f, 15.404f)
                curveTo(16.4f, 13.82f, 15.18f, 13.092f, 13.584f, 13.092f)
                close()
                moveTo(13.32f, 13.73f)
                curveTo(14.502f, 13.73f, 15.205f, 14.347f, 15.205f, 15.479f)
                curveTo(15.204f, 16.587f, 14.45f, 17.326f, 13.193f, 17.326f)
                curveTo(12.728f, 17.326f, 12.514f, 17.314f, 12.188f, 17.289f)
                lineTo(12.188f, 13.768f)
                curveTo(12.514f, 13.73f, 12.942f, 13.73f, 13.32f, 13.73f)
                close()
            }
        }
        .build()
        return _researchgate!!
    }

private var _researchgate: ImageVector? = null
