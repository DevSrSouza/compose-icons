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

public val LineAwesomeIcons.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 8.559f)
                curveTo(27.117f, 8.949f, 26.168f, 9.215f, 25.172f, 9.332f)
                curveTo(26.188f, 8.723f, 26.969f, 7.758f, 27.336f, 6.609f)
                curveTo(26.387f, 7.172f, 25.332f, 7.582f, 24.211f, 7.805f)
                curveTo(23.313f, 6.848f, 22.031f, 6.246f, 20.617f, 6.246f)
                curveTo(17.898f, 6.246f, 15.691f, 8.453f, 15.691f, 11.172f)
                curveTo(15.691f, 11.559f, 15.734f, 11.934f, 15.82f, 12.293f)
                curveTo(11.727f, 12.09f, 8.098f, 10.129f, 5.672f, 7.148f)
                curveTo(5.246f, 7.875f, 5.004f, 8.723f, 5.004f, 9.625f)
                curveTo(5.004f, 11.332f, 5.871f, 12.84f, 7.195f, 13.723f)
                curveTo(6.387f, 13.695f, 5.629f, 13.477f, 4.965f, 13.105f)
                curveTo(4.965f, 13.129f, 4.965f, 13.148f, 4.965f, 13.168f)
                curveTo(4.965f, 15.555f, 6.66f, 17.547f, 8.914f, 17.996f)
                curveTo(8.5f, 18.109f, 8.066f, 18.172f, 7.617f, 18.172f)
                curveTo(7.301f, 18.172f, 6.988f, 18.141f, 6.691f, 18.082f)
                curveTo(7.316f, 20.039f, 9.137f, 21.461f, 11.289f, 21.504f)
                curveTo(9.605f, 22.824f, 7.48f, 23.609f, 5.176f, 23.609f)
                curveTo(4.777f, 23.609f, 4.387f, 23.586f, 4.0f, 23.539f)
                curveTo(6.18f, 24.938f, 8.766f, 25.754f, 11.547f, 25.754f)
                curveTo(20.605f, 25.754f, 25.559f, 18.25f, 25.559f, 11.742f)
                curveTo(25.559f, 11.531f, 25.551f, 11.316f, 25.543f, 11.105f)
                curveTo(26.504f, 10.41f, 27.34f, 9.543f, 28.0f, 8.559f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
