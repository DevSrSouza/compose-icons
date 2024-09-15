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

public val LineAwesomeIcons.SocksSolid: ImageVector
    get() {
        if (_socksSolid != null) {
            return _socksSolid!!
        }
        _socksSolid = Builder(name = "SocksSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.938f, 2.0f)
                lineTo(9.656f, 2.969f)
                lineTo(5.219f, 18.531f)
                lineTo(5.219f, 18.563f)
                curveTo(4.52f, 20.883f, 5.578f, 23.383f, 7.75f, 24.469f)
                lineTo(7.781f, 24.5f)
                lineTo(7.813f, 24.5f)
                lineTo(19.75f, 29.469f)
                curveTo(19.77f, 29.48f, 19.793f, 29.488f, 19.813f, 29.5f)
                curveTo(20.508f, 29.836f, 21.27f, 30.0f, 22.0f, 30.0f)
                curveTo(23.836f, 30.0f, 25.594f, 28.992f, 26.469f, 27.25f)
                curveTo(27.695f, 24.789f, 26.711f, 21.762f, 24.25f, 20.531f)
                lineTo(24.188f, 20.5f)
                lineTo(24.156f, 20.5f)
                lineTo(23.5f, 20.219f)
                curveTo(23.492f, 20.223f, 23.477f, 20.215f, 23.469f, 20.219f)
                lineTo(16.469f, 17.438f)
                lineTo(19.719f, 5.938f)
                lineTo(19.969f, 5.0f)
                lineTo(10.906f, 2.281f)
                close()
                moveTo(11.313f, 4.469f)
                lineTo(17.531f, 6.344f)
                lineTo(17.0f, 8.219f)
                lineTo(10.781f, 6.344f)
                close()
                moveTo(10.219f, 8.281f)
                lineTo(16.438f, 10.156f)
                lineTo(14.281f, 17.75f)
                lineTo(14.063f, 18.625f)
                lineTo(14.875f, 18.969f)
                lineTo(21.656f, 21.656f)
                curveTo(20.238f, 23.066f, 19.289f, 24.938f, 19.063f, 27.031f)
                lineTo(11.688f, 23.938f)
                curveTo(11.891f, 23.332f, 12.0f, 22.672f, 12.0f, 22.0f)
                curveTo(12.0f, 19.367f, 10.277f, 17.148f, 7.906f, 16.344f)
                close()
                moveTo(7.375f, 18.25f)
                curveTo(8.906f, 18.805f, 10.0f, 20.262f, 10.0f, 22.0f)
                curveTo(10.0f, 22.406f, 9.926f, 22.785f, 9.813f, 23.156f)
                lineTo(8.656f, 22.688f)
                curveTo(7.34f, 22.027f, 6.691f, 20.535f, 7.125f, 19.125f)
                lineTo(7.125f, 19.094f)
                close()
                moveTo(23.656f, 22.5f)
                curveTo(24.914f, 23.328f, 25.379f, 24.961f, 24.688f, 26.344f)
                curveTo(24.156f, 27.402f, 23.098f, 28.0f, 22.0f, 28.0f)
                curveTo(21.668f, 28.0f, 21.328f, 27.926f, 21.0f, 27.813f)
                curveTo(21.055f, 25.656f, 22.082f, 23.746f, 23.656f, 22.5f)
                close()
            }
        }
        .build()
        return _socksSolid!!
    }

private var _socksSolid: ImageVector? = null
