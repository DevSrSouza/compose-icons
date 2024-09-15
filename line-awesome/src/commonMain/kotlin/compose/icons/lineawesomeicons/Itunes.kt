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

public val LineAwesomeIcons.Itunes: ImageVector
    get() {
        if (_itunes != null) {
            return _itunes!!
        }
        _itunes = Builder(name = "Itunes", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.049f, 5.0f)
                curveTo(7.255f, 5.0f, 5.0f, 7.255f, 5.0f, 10.049f)
                lineTo(5.0f, 21.951f)
                curveTo(5.0f, 24.745f, 7.255f, 27.0f, 10.049f, 27.0f)
                lineTo(21.951f, 27.0f)
                curveTo(24.75f, 27.0f, 27.0f, 24.745f, 27.0f, 21.951f)
                lineTo(27.0f, 10.049f)
                curveTo(27.0f, 7.255f, 24.745f, 5.0f, 21.951f, 5.0f)
                lineTo(10.049f, 5.0f)
                close()
                moveTo(15.98f, 7.0f)
                curveTo(20.95f, 7.0f, 24.98f, 11.03f, 24.98f, 16.0f)
                curveTo(24.98f, 20.97f, 20.95f, 25.0f, 15.98f, 25.0f)
                curveTo(11.01f, 25.0f, 6.98f, 20.97f, 6.98f, 16.0f)
                curveTo(6.98f, 11.03f, 11.01f, 7.0f, 15.98f, 7.0f)
                close()
                moveTo(15.98f, 8.025f)
                curveTo(11.568f, 8.025f, 8.0f, 11.603f, 8.0f, 16.01f)
                curveTo(8.0f, 20.417f, 11.568f, 24.0f, 15.98f, 24.0f)
                curveTo(20.392f, 24.0f, 23.965f, 20.424f, 23.965f, 16.016f)
                curveTo(23.965f, 11.604f, 20.388f, 8.025f, 15.98f, 8.025f)
                close()
                moveTo(19.316f, 11.0f)
                curveTo(19.578f, 10.982f, 19.73f, 11.138f, 19.73f, 11.4f)
                curveTo(19.726f, 19.236f, 19.749f, 18.523f, 19.684f, 18.807f)
                curveTo(19.537f, 19.432f, 19.064f, 19.781f, 18.43f, 19.9f)
                curveTo(17.874f, 20.001f, 17.41f, 20.029f, 16.965f, 19.67f)
                curveTo(16.423f, 19.211f, 16.413f, 18.457f, 16.9f, 17.98f)
                curveTo(17.286f, 17.613f, 17.833f, 17.54f, 18.646f, 17.393f)
                curveTo(18.784f, 17.37f, 18.903f, 17.338f, 19.0f, 17.223f)
                curveTo(19.147f, 17.058f, 19.102f, 17.422f, 19.102f, 13.803f)
                curveTo(19.102f, 13.546f, 18.977f, 13.475f, 18.715f, 13.521f)
                curveTo(18.531f, 13.553f, 14.494f, 14.307f, 14.494f, 14.307f)
                curveTo(14.264f, 14.358f, 14.186f, 14.425f, 14.186f, 14.688f)
                curveTo(14.186f, 20.02f, 14.209f, 19.487f, 14.131f, 19.84f)
                curveTo(14.035f, 20.253f, 13.782f, 20.564f, 13.447f, 20.738f)
                curveTo(13.066f, 20.949f, 12.373f, 21.043f, 12.006f, 20.979f)
                curveTo(11.023f, 20.795f, 10.678f, 19.66f, 11.344f, 19.008f)
                curveTo(11.73f, 18.641f, 12.277f, 18.567f, 13.09f, 18.42f)
                curveTo(13.228f, 18.397f, 13.346f, 18.365f, 13.443f, 18.25f)
                curveTo(13.673f, 17.988f, 13.484f, 12.707f, 13.563f, 12.4f)
                curveTo(13.58f, 12.281f, 13.631f, 12.181f, 13.723f, 12.107f)
                curveTo(13.819f, 12.029f, 13.989f, 11.982f, 14.031f, 11.982f)
                curveTo(18.67f, 11.109f, 19.234f, 11.0f, 19.316f, 11.0f)
                close()
            }
        }
        .build()
        return _itunes!!
    }

private var _itunes: ImageVector? = null
