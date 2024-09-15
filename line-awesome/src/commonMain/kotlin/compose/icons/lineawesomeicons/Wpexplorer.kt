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

public val LineAwesomeIcons.Wpexplorer: ImageVector
    get() {
        if (_wpexplorer != null) {
            return _wpexplorer!!
        }
        _wpexplorer = Builder(name = "Wpexplorer", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                curveTo(9.9f, 27.0f, 5.0f, 22.1f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9f, 9.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.199f, 10.0f)
                lineTo(9.4f, 14.301f)
                lineTo(13.699f, 16.1f)
                lineTo(15.5f, 11.801f)
                lineTo(11.199f, 10.0f)
                close()
                moveTo(16.0f, 12.6f)
                lineTo(14.6f, 16.0f)
                lineTo(17.9f, 17.4f)
                lineTo(17.916f, 17.365f)
                lineTo(18.0f, 17.4f)
                lineTo(19.5f, 14.0f)
                lineTo(16.0f, 12.6f)
                close()
                moveTo(20.0f, 14.699f)
                lineTo(18.9f, 17.4f)
                lineTo(21.6f, 18.5f)
                lineTo(22.801f, 15.801f)
                lineTo(20.0f, 14.699f)
                close()
                moveTo(14.301f, 16.6f)
                lineTo(14.0f, 17.199f)
                lineTo(15.1f, 17.699f)
                lineTo(12.6f, 23.0f)
                lineTo(13.301f, 23.0f)
                lineTo(15.699f, 18.1f)
                lineTo(18.199f, 23.0f)
                lineTo(18.9f, 23.0f)
                lineTo(16.6f, 18.4f)
                lineTo(17.4f, 18.699f)
                lineTo(17.699f, 18.0f)
                lineTo(14.301f, 16.6f)
                close()
            }
        }
        .build()
        return _wpexplorer!!
    }

private var _wpexplorer: ImageVector? = null
