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

public val LineAwesomeIcons.EyeDropperSolid: ImageVector
    get() {
        if (_eyeDropperSolid != null) {
            return _eyeDropperSolid!!
        }
        _eyeDropperSolid = Builder(name = "EyeDropperSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.656f, 3.031f)
                curveTo(23.547f, 3.031f, 22.434f, 3.441f, 21.594f, 4.281f)
                lineTo(18.813f, 7.094f)
                lineTo(17.813f, 6.094f)
                lineTo(16.406f, 7.5f)
                lineTo(17.406f, 8.5f)
                lineTo(7.906f, 18.0f)
                curveTo(6.867f, 19.039f, 6.273f, 19.793f, 5.906f, 20.469f)
                curveTo(5.539f, 21.145f, 5.41f, 21.754f, 5.344f, 22.156f)
                curveTo(5.277f, 22.559f, 5.242f, 22.777f, 5.0f, 23.219f)
                curveTo(4.758f, 23.66f, 4.266f, 24.297f, 3.281f, 25.281f)
                lineTo(2.594f, 26.0f)
                lineTo(3.281f, 26.719f)
                lineTo(5.281f, 28.719f)
                lineTo(6.0f, 29.406f)
                lineTo(6.719f, 28.719f)
                curveTo(7.68f, 27.758f, 8.293f, 27.293f, 8.719f, 27.063f)
                curveTo(9.145f, 26.832f, 9.371f, 26.789f, 9.781f, 26.719f)
                curveTo(10.191f, 26.648f, 10.781f, 26.535f, 11.469f, 26.156f)
                curveTo(12.156f, 25.777f, 12.938f, 25.156f, 14.0f, 24.094f)
                lineTo(23.5f, 14.594f)
                lineTo(24.5f, 15.594f)
                lineTo(25.906f, 14.188f)
                lineTo(24.906f, 13.188f)
                lineTo(27.719f, 10.406f)
                curveTo(29.398f, 8.727f, 29.398f, 5.961f, 27.719f, 4.281f)
                curveTo(26.879f, 3.441f, 25.766f, 3.031f, 24.656f, 3.031f)
                close()
                moveTo(24.656f, 5.031f)
                curveTo(25.246f, 5.031f, 25.82f, 5.258f, 26.281f, 5.719f)
                curveTo(27.199f, 6.637f, 27.199f, 8.082f, 26.281f, 9.0f)
                lineTo(23.5f, 11.781f)
                lineTo(20.219f, 8.5f)
                lineTo(23.0f, 5.719f)
                curveTo(23.461f, 5.258f, 24.066f, 5.031f, 24.656f, 5.031f)
                close()
                moveTo(18.813f, 9.906f)
                lineTo(22.094f, 13.188f)
                lineTo(12.594f, 22.688f)
                curveTo(11.609f, 23.672f, 10.941f, 24.164f, 10.5f, 24.406f)
                curveTo(10.059f, 24.648f, 9.84f, 24.684f, 9.438f, 24.75f)
                curveTo(9.035f, 24.816f, 8.457f, 24.914f, 7.781f, 25.281f)
                curveTo(7.32f, 25.531f, 6.695f, 26.129f, 6.094f, 26.656f)
                lineTo(5.344f, 25.906f)
                curveTo(5.891f, 25.289f, 6.492f, 24.656f, 6.75f, 24.188f)
                curveTo(7.129f, 23.5f, 7.242f, 22.879f, 7.313f, 22.469f)
                curveTo(7.383f, 22.059f, 7.426f, 21.863f, 7.656f, 21.438f)
                curveTo(7.887f, 21.012f, 8.352f, 20.367f, 9.313f, 19.406f)
                close()
            }
        }
        .build()
        return _eyeDropperSolid!!
    }

private var _eyeDropperSolid: ImageVector? = null
