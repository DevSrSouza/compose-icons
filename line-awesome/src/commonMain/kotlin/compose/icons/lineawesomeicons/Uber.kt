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

public val LineAwesomeIcons.Uber: ImageVector
    get() {
        if (_uber != null) {
            return _uber!!
        }
        _uber = Builder(name = "Uber", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.8f, 3.0f, 3.0f, 8.8f, 3.0f, 16.0f)
                curveTo(3.0f, 23.2f, 8.8f, 29.0f, 16.0f, 29.0f)
                curveTo(23.2f, 29.0f, 29.0f, 23.2f, 29.0f, 16.0f)
                curveTo(29.0f, 8.8f, 23.2f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.1f, 5.0f, 27.0f, 9.9f, 27.0f, 16.0f)
                curveTo(27.0f, 22.1f, 22.1f, 27.0f, 16.0f, 27.0f)
                curveTo(10.238f, 27.0f, 5.553f, 22.626f, 5.051f, 17.0f)
                lineTo(13.0f, 17.0f)
                lineTo(13.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                lineTo(13.0f, 15.0f)
                lineTo(5.051f, 15.0f)
                curveTo(5.553f, 9.374f, 10.238f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _uber!!
    }

private var _uber: ImageVector? = null
