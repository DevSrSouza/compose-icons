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

public val LineAwesomeIcons.Vaadin: ImageVector
    get() {
        if (_vaadin != null) {
            return _vaadin!!
        }
        _vaadin = Builder(name = "Vaadin", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                curveTo(3.4f, 4.0f, 3.0f, 4.4f, 3.0f, 5.0f)
                lineTo(3.0f, 7.5f)
                curveTo(3.0f, 9.4f, 4.6f, 11.0f, 6.5f, 11.0f)
                lineTo(13.6f, 11.0f)
                curveTo(14.4f, 11.0f, 15.0f, 11.6f, 15.0f, 12.4f)
                lineTo(15.0f, 13.0f)
                curveTo(15.0f, 13.6f, 15.4f, 14.0f, 16.0f, 14.0f)
                curveTo(16.6f, 14.0f, 17.0f, 13.6f, 17.0f, 13.0f)
                lineTo(17.0f, 12.4f)
                curveTo(17.0f, 11.6f, 17.6f, 11.0f, 18.4f, 11.0f)
                lineTo(25.5f, 11.0f)
                curveTo(27.4f, 11.0f, 29.0f, 9.4f, 29.0f, 7.5f)
                lineTo(29.0f, 5.0f)
                curveTo(29.0f, 4.4f, 28.6f, 4.0f, 28.0f, 4.0f)
                curveTo(27.4f, 4.0f, 27.0f, 4.4f, 27.0f, 5.0f)
                lineTo(27.0f, 5.6f)
                curveTo(27.0f, 6.4f, 26.4f, 7.0f, 25.6f, 7.0f)
                lineTo(19.0f, 7.0f)
                curveTo(17.3f, 7.0f, 16.0f, 8.3f, 16.0f, 10.0f)
                curveTo(16.0f, 8.3f, 14.7f, 7.0f, 13.0f, 7.0f)
                lineTo(6.4f, 7.0f)
                curveTo(5.6f, 7.0f, 5.0f, 6.4f, 5.0f, 5.6f)
                lineTo(5.0f, 5.0f)
                curveTo(5.0f, 4.4f, 4.6f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(10.352f, 15.027f)
                curveTo(10.163f, 15.045f, 9.976f, 15.099f, 9.801f, 15.199f)
                curveTo(9.101f, 15.599f, 8.799f, 16.499f, 9.199f, 17.199f)
                lineTo(14.699f, 27.199f)
                curveTo(14.899f, 27.699f, 15.5f, 28.0f, 16.0f, 28.0f)
                curveTo(16.5f, 28.0f, 17.101f, 27.699f, 17.301f, 27.199f)
                lineTo(22.801f, 17.199f)
                curveTo(23.201f, 16.499f, 22.899f, 15.599f, 22.199f, 15.199f)
                curveTo(21.499f, 14.799f, 20.599f, 15.101f, 20.199f, 15.801f)
                lineTo(16.0f, 23.4f)
                lineTo(11.801f, 15.801f)
                curveTo(11.501f, 15.276f, 10.919f, 14.976f, 10.352f, 15.027f)
                close()
            }
        }
        .build()
        return _vaadin!!
    }

private var _vaadin: ImageVector? = null
