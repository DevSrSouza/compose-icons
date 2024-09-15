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

public val LineAwesomeIcons.RecycleSolid: ImageVector
    get() {
        if (_recycleSolid != null) {
            return _recycleSolid!!
        }
        _recycleSolid = Builder(name = "RecycleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.969f)
                curveTo(14.945f, 3.969f, 13.883f, 4.484f, 13.25f, 5.469f)
                lineTo(10.438f, 10.094f)
                lineTo(12.156f, 11.125f)
                lineTo(14.969f, 6.531f)
                curveTo(15.508f, 5.727f, 16.531f, 5.707f, 17.063f, 6.531f)
                lineTo(20.188f, 11.531f)
                lineTo(18.688f, 12.406f)
                lineTo(23.313f, 15.0f)
                lineTo(23.313f, 9.688f)
                lineTo(21.875f, 10.531f)
                lineTo(18.75f, 5.469f)
                curveTo(18.117f, 4.484f, 17.055f, 3.969f, 16.0f, 3.969f)
                close()
                moveTo(10.406f, 12.094f)
                lineTo(5.906f, 14.688f)
                lineTo(7.156f, 15.438f)
                lineTo(4.594f, 19.656f)
                lineTo(4.563f, 19.625f)
                curveTo(4.551f, 19.645f, 4.574f, 19.668f, 4.563f, 19.688f)
                curveTo(3.09f, 21.918f, 4.789f, 25.0f, 7.5f, 25.0f)
                lineTo(13.0f, 25.0f)
                lineTo(13.0f, 23.0f)
                lineTo(7.5f, 23.0f)
                curveTo(6.234f, 23.0f, 5.555f, 21.75f, 6.219f, 20.781f)
                lineTo(6.25f, 20.75f)
                lineTo(6.25f, 20.719f)
                lineTo(8.875f, 16.469f)
                lineTo(10.406f, 17.406f)
                close()
                moveTo(25.063f, 15.656f)
                lineTo(23.344f, 16.719f)
                lineTo(25.844f, 20.719f)
                curveTo(26.484f, 21.809f, 25.758f, 23.0f, 24.594f, 23.0f)
                lineTo(19.0f, 23.0f)
                lineTo(19.0f, 21.0f)
                lineTo(14.094f, 24.0f)
                lineTo(19.0f, 27.0f)
                lineTo(19.0f, 25.0f)
                lineTo(24.594f, 25.0f)
                curveTo(27.23f, 25.0f, 28.922f, 22.0f, 27.563f, 19.688f)
                lineTo(27.563f, 19.656f)
                close()
            }
        }
        .build()
        return _recycleSolid!!
    }

private var _recycleSolid: ImageVector? = null
