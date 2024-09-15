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

public val LineAwesomeIcons.Slideshare: ImageVector
    get() {
        if (_slideshare != null) {
            return _slideshare!!
        }
        _slideshare = Builder(name = "Slideshare", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(6.355f, 4.0f, 5.0f, 5.355f, 5.0f, 7.0f)
                lineTo(5.0f, 15.406f)
                curveTo(4.23f, 14.961f, 3.629f, 14.563f, 3.5f, 14.563f)
                curveTo(3.141f, 14.563f, 3.0f, 14.906f, 3.0f, 15.125f)
                curveTo(3.0f, 16.246f, 6.336f, 18.406f, 8.438f, 19.188f)
                curveTo(8.438f, 19.188f, 7.906f, 20.738f, 7.906f, 22.5f)
                curveTo(7.906f, 24.262f, 8.992f, 28.0f, 12.438f, 28.0f)
                curveTo(12.438f, 28.0f, 15.0f, 27.992f, 15.0f, 25.469f)
                lineTo(15.0f, 20.5f)
                lineTo(17.0f, 21.094f)
                lineTo(17.0f, 25.469f)
                curveTo(17.0f, 27.992f, 19.563f, 28.0f, 19.563f, 28.0f)
                curveTo(23.008f, 28.0f, 24.094f, 24.262f, 24.094f, 22.5f)
                curveTo(24.094f, 20.738f, 23.563f, 19.188f, 23.563f, 19.188f)
                curveTo(25.664f, 18.406f, 29.0f, 16.246f, 29.0f, 15.125f)
                curveTo(29.0f, 14.906f, 28.859f, 14.563f, 28.5f, 14.563f)
                curveTo(28.371f, 14.563f, 27.77f, 14.961f, 27.0f, 15.406f)
                lineTo(27.0f, 7.0f)
                curveTo(27.0f, 5.355f, 25.645f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(8.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                curveTo(24.566f, 6.0f, 25.0f, 6.434f, 25.0f, 7.0f)
                lineTo(25.0f, 16.406f)
                curveTo(23.887f, 16.871f, 22.602f, 17.25f, 21.281f, 17.25f)
                curveTo(19.82f, 17.25f, 18.902f, 17.156f, 18.281f, 17.156f)
                curveTo(17.078f, 17.156f, 17.0f, 18.438f, 17.0f, 18.438f)
                lineTo(17.0f, 19.344f)
                lineTo(14.656f, 17.563f)
                curveTo(14.469f, 17.34f, 14.168f, 17.156f, 13.719f, 17.156f)
                curveTo(13.098f, 17.156f, 12.18f, 17.25f, 10.719f, 17.25f)
                curveTo(9.398f, 17.25f, 8.113f, 16.871f, 7.0f, 16.406f)
                lineTo(7.0f, 7.0f)
                curveTo(7.0f, 6.434f, 7.434f, 6.0f, 8.0f, 6.0f)
                close()
                moveTo(12.313f, 10.969f)
                curveTo(10.836f, 10.969f, 9.656f, 12.113f, 9.656f, 13.5f)
                curveTo(9.656f, 14.887f, 10.836f, 16.0f, 12.313f, 16.0f)
                curveTo(13.789f, 16.0f, 15.0f, 14.887f, 15.0f, 13.5f)
                curveTo(15.0f, 12.113f, 13.789f, 10.969f, 12.313f, 10.969f)
                close()
                moveTo(19.688f, 10.969f)
                curveTo(18.211f, 10.969f, 17.0f, 12.113f, 17.0f, 13.5f)
                curveTo(17.0f, 14.887f, 18.211f, 16.0f, 19.688f, 16.0f)
                curveTo(21.164f, 16.0f, 22.344f, 14.887f, 22.344f, 13.5f)
                curveTo(22.344f, 12.113f, 21.164f, 10.969f, 19.688f, 10.969f)
                close()
            }
        }
        .build()
        return _slideshare!!
    }

private var _slideshare: ImageVector? = null
