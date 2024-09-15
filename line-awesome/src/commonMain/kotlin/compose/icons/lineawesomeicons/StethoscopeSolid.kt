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

public val LineAwesomeIcons.StethoscopeSolid: ImageVector
    get() {
        if (_stethoscopeSolid != null) {
            return _stethoscopeSolid!!
        }
        _stethoscopeSolid = Builder(name = "StethoscopeSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                curveTo(6.211f, 4.0f, 5.543f, 4.461f, 5.219f, 5.125f)
                curveTo(3.953f, 5.477f, 3.0f, 6.629f, 3.0f, 8.0f)
                lineTo(3.0f, 17.375f)
                lineTo(3.25f, 17.656f)
                curveTo(3.25f, 17.656f, 5.605f, 20.414f, 9.0f, 20.906f)
                lineTo(9.0f, 23.0f)
                curveTo(9.0f, 26.301f, 11.699f, 29.0f, 15.0f, 29.0f)
                curveTo(18.301f, 29.0f, 21.0f, 26.301f, 21.0f, 23.0f)
                lineTo(21.0f, 18.0f)
                curveTo(21.0f, 16.883f, 21.883f, 16.0f, 23.0f, 16.0f)
                curveTo(24.117f, 16.0f, 25.0f, 16.883f, 25.0f, 18.0f)
                lineTo(25.0f, 18.188f)
                curveTo(23.844f, 18.605f, 23.0f, 19.707f, 23.0f, 21.0f)
                curveTo(23.0f, 22.645f, 24.355f, 24.0f, 26.0f, 24.0f)
                curveTo(27.645f, 24.0f, 29.0f, 22.645f, 29.0f, 21.0f)
                curveTo(29.0f, 19.707f, 28.156f, 18.605f, 27.0f, 18.188f)
                lineTo(27.0f, 18.0f)
                curveTo(27.0f, 15.801f, 25.199f, 14.0f, 23.0f, 14.0f)
                curveTo(20.801f, 14.0f, 19.0f, 15.801f, 19.0f, 18.0f)
                lineTo(19.0f, 23.0f)
                curveTo(19.0f, 25.219f, 17.219f, 27.0f, 15.0f, 27.0f)
                curveTo(12.781f, 27.0f, 11.0f, 25.219f, 11.0f, 23.0f)
                lineTo(11.0f, 20.906f)
                curveTo(14.395f, 20.414f, 16.75f, 17.656f, 16.75f, 17.656f)
                lineTo(17.0f, 17.375f)
                lineTo(17.0f, 8.0f)
                curveTo(17.0f, 6.629f, 16.047f, 5.477f, 14.781f, 5.125f)
                curveTo(14.457f, 4.461f, 13.789f, 4.0f, 13.0f, 4.0f)
                curveTo(11.895f, 4.0f, 11.0f, 4.895f, 11.0f, 6.0f)
                curveTo(11.0f, 7.105f, 11.895f, 8.0f, 13.0f, 8.0f)
                curveTo(13.656f, 8.0f, 14.23f, 7.68f, 14.594f, 7.188f)
                curveTo(14.844f, 7.367f, 15.0f, 7.66f, 15.0f, 8.0f)
                lineTo(15.0f, 16.563f)
                curveTo(14.641f, 16.926f, 12.512f, 19.0f, 10.0f, 19.0f)
                curveTo(7.488f, 19.0f, 5.359f, 16.926f, 5.0f, 16.563f)
                lineTo(5.0f, 8.0f)
                curveTo(5.0f, 7.66f, 5.156f, 7.367f, 5.406f, 7.188f)
                curveTo(5.77f, 7.68f, 6.344f, 8.0f, 7.0f, 8.0f)
                curveTo(8.105f, 8.0f, 9.0f, 7.105f, 9.0f, 6.0f)
                curveTo(9.0f, 4.895f, 8.105f, 4.0f, 7.0f, 4.0f)
                close()
                moveTo(26.0f, 20.0f)
                curveTo(26.563f, 20.0f, 27.0f, 20.438f, 27.0f, 21.0f)
                curveTo(27.0f, 21.563f, 26.563f, 22.0f, 26.0f, 22.0f)
                curveTo(25.438f, 22.0f, 25.0f, 21.563f, 25.0f, 21.0f)
                curveTo(25.0f, 20.438f, 25.438f, 20.0f, 26.0f, 20.0f)
                close()
            }
        }
        .build()
        return _stethoscopeSolid!!
    }

private var _stethoscopeSolid: ImageVector? = null
