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

public val LineAwesomeIcons.Flickr: ImageVector
    get() {
        if (_flickr != null) {
            return _flickr!!
        }
        _flickr = Builder(name = "Flickr", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveTo(6.355f, 5.0f, 5.0f, 6.355f, 5.0f, 8.0f)
                lineTo(5.0f, 24.0f)
                curveTo(5.0f, 25.645f, 6.355f, 27.0f, 8.0f, 27.0f)
                lineTo(24.0f, 27.0f)
                curveTo(25.645f, 27.0f, 27.0f, 25.645f, 27.0f, 24.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.0f, 6.355f, 25.645f, 5.0f, 24.0f, 5.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(24.0f, 7.0f)
                curveTo(24.566f, 7.0f, 25.0f, 7.434f, 25.0f, 8.0f)
                lineTo(25.0f, 24.0f)
                curveTo(25.0f, 24.566f, 24.566f, 25.0f, 24.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                curveTo(7.434f, 25.0f, 7.0f, 24.566f, 7.0f, 24.0f)
                lineTo(7.0f, 8.0f)
                curveTo(7.0f, 7.434f, 7.434f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(11.5f, 12.5f)
                curveTo(9.566f, 12.5f, 8.0f, 14.066f, 8.0f, 16.0f)
                curveTo(8.0f, 17.934f, 9.566f, 19.5f, 11.5f, 19.5f)
                curveTo(13.434f, 19.5f, 15.0f, 17.934f, 15.0f, 16.0f)
                curveTo(15.0f, 14.066f, 13.434f, 12.5f, 11.5f, 12.5f)
                close()
                moveTo(20.5f, 12.5f)
                curveTo(18.566f, 12.5f, 17.0f, 14.066f, 17.0f, 16.0f)
                curveTo(17.0f, 17.934f, 18.566f, 19.5f, 20.5f, 19.5f)
                curveTo(22.434f, 19.5f, 24.0f, 17.934f, 24.0f, 16.0f)
                curveTo(24.0f, 14.066f, 22.434f, 12.5f, 20.5f, 12.5f)
                close()
            }
        }
        .build()
        return _flickr!!
    }

private var _flickr: ImageVector? = null
