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

public val LineAwesomeIcons.VenusDoubleSolid: ImageVector
    get() {
        if (_venusDoubleSolid != null) {
            return _venusDoubleSolid!!
        }
        _venusDoubleSolid = Builder(name = "VenusDoubleSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveTo(6.59f, 3.0f, 3.0f, 6.59f, 3.0f, 11.0f)
                curveTo(3.0f, 15.07f, 6.059f, 18.441f, 10.0f, 18.938f)
                lineTo(10.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 25.0f)
                lineTo(10.0f, 25.0f)
                lineTo(10.0f, 29.0f)
                lineTo(12.0f, 29.0f)
                lineTo(12.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(20.0f, 29.0f)
                lineTo(22.0f, 29.0f)
                lineTo(22.0f, 25.0f)
                lineTo(26.0f, 25.0f)
                lineTo(26.0f, 23.0f)
                lineTo(22.0f, 23.0f)
                lineTo(22.0f, 18.938f)
                curveTo(25.941f, 18.441f, 29.0f, 15.07f, 29.0f, 11.0f)
                curveTo(29.0f, 6.59f, 25.41f, 3.0f, 21.0f, 3.0f)
                curveTo(19.48f, 3.0f, 18.055f, 3.449f, 16.844f, 4.188f)
                curveTo(17.363f, 4.633f, 17.844f, 5.137f, 18.25f, 5.688f)
                curveTo(19.078f, 5.258f, 20.004f, 5.0f, 21.0f, 5.0f)
                curveTo(24.309f, 5.0f, 27.0f, 7.691f, 27.0f, 11.0f)
                curveTo(27.0f, 14.309f, 24.309f, 17.0f, 21.0f, 17.0f)
                curveTo(17.691f, 17.0f, 15.0f, 14.309f, 15.0f, 11.0f)
                curveTo(15.0f, 10.203f, 15.156f, 9.445f, 15.438f, 8.75f)
                curveTo(15.102f, 8.086f, 14.617f, 7.516f, 14.031f, 7.063f)
                curveTo(13.371f, 8.227f, 13.0f, 9.566f, 13.0f, 11.0f)
                curveTo(13.0f, 15.07f, 16.059f, 18.441f, 20.0f, 18.938f)
                lineTo(20.0f, 23.0f)
                lineTo(12.0f, 23.0f)
                lineTo(12.0f, 18.906f)
                curveTo(13.145f, 18.762f, 14.215f, 18.387f, 15.156f, 17.813f)
                curveTo(14.637f, 17.367f, 14.156f, 16.863f, 13.75f, 16.313f)
                curveTo(12.922f, 16.742f, 11.996f, 17.0f, 11.0f, 17.0f)
                curveTo(7.691f, 17.0f, 5.0f, 14.309f, 5.0f, 11.0f)
                curveTo(5.0f, 7.691f, 7.691f, 5.0f, 11.0f, 5.0f)
                curveTo(14.309f, 5.0f, 17.0f, 7.691f, 17.0f, 11.0f)
                curveTo(17.0f, 11.797f, 16.844f, 12.555f, 16.563f, 13.25f)
                curveTo(16.898f, 13.914f, 17.383f, 14.484f, 17.969f, 14.938f)
                curveTo(18.629f, 13.773f, 19.0f, 12.434f, 19.0f, 11.0f)
                curveTo(19.0f, 6.59f, 15.41f, 3.0f, 11.0f, 3.0f)
                close()
            }
        }
        .build()
        return _venusDoubleSolid!!
    }

private var _venusDoubleSolid: ImageVector? = null
