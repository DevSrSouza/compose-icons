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

public val LineAwesomeIcons.Audible: ImageVector
    get() {
        if (_audible != null) {
            return _audible!!
        }
        _audible = Builder(name = "Audible", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveTo(10.922f, 8.0f, 6.535f, 10.918f, 4.398f, 15.16f)
                curveTo(6.668f, 12.039f, 10.344f, 10.0f, 14.5f, 10.0f)
                curveTo(19.039f, 10.0f, 23.004f, 12.43f, 25.191f, 16.051f)
                lineTo(27.48f, 14.906f)
                curveTo(25.297f, 10.801f, 20.977f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(12.289f, 12.0f, 9.109f, 14.246f, 7.73f, 17.449f)
                curveTo(9.273f, 15.359f, 11.742f, 14.0f, 14.531f, 14.0f)
                curveTo(17.492f, 14.0f, 20.094f, 15.531f, 21.609f, 17.844f)
                lineTo(23.906f, 16.691f)
                curveTo(22.379f, 13.895f, 19.41f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(1.0f, 15.379f)
                lineTo(1.0f, 17.617f)
                curveTo(6.223f, 20.227f, 15.551f, 24.895f, 15.551f, 24.895f)
                lineTo(16.0f, 25.117f)
                lineTo(31.0f, 17.617f)
                lineTo(31.0f, 15.383f)
                lineTo(16.0f, 22.883f)
                curveTo(7.691f, 18.727f, 3.313f, 16.539f, 1.0f, 15.379f)
                close()
                moveTo(15.969f, 16.0f)
                curveTo(13.773f, 16.0f, 11.934f, 17.434f, 11.27f, 19.414f)
                curveTo(12.086f, 18.547f, 13.234f, 18.0f, 14.516f, 18.0f)
                curveTo(15.914f, 18.0f, 17.148f, 18.652f, 17.969f, 19.66f)
                lineTo(20.266f, 18.512f)
                curveTo(19.406f, 17.02f, 17.816f, 16.0f, 15.969f, 16.0f)
                close()
            }
        }
        .build()
        return _audible!!
    }

private var _audible: ImageVector? = null
