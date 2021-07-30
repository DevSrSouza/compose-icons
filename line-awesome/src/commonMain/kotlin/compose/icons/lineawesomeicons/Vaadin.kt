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
                lineTo(13.5996f, 11.0f)
                curveTo(14.3996f, 11.0f, 15.0f, 11.6004f, 15.0f, 12.4004f)
                lineTo(15.0f, 13.0f)
                curveTo(15.0f, 13.6f, 15.4f, 14.0f, 16.0f, 14.0f)
                curveTo(16.6f, 14.0f, 17.0f, 13.6f, 17.0f, 13.0f)
                lineTo(17.0f, 12.4004f)
                curveTo(17.0f, 11.6004f, 17.6004f, 11.0f, 18.4004f, 11.0f)
                lineTo(25.5f, 11.0f)
                curveTo(27.4f, 11.0f, 29.0f, 9.4f, 29.0f, 7.5f)
                lineTo(29.0f, 5.0f)
                curveTo(29.0f, 4.4f, 28.6f, 4.0f, 28.0f, 4.0f)
                curveTo(27.4f, 4.0f, 27.0f, 4.4f, 27.0f, 5.0f)
                lineTo(27.0f, 5.5996f)
                curveTo(27.0f, 6.3996f, 26.3996f, 7.0f, 25.5996f, 7.0f)
                lineTo(19.0f, 7.0f)
                curveTo(17.3f, 7.0f, 16.0f, 8.3f, 16.0f, 10.0f)
                curveTo(16.0f, 8.3f, 14.7f, 7.0f, 13.0f, 7.0f)
                lineTo(6.4004f, 7.0f)
                curveTo(5.6004f, 7.0f, 5.0f, 6.3996f, 5.0f, 5.5996f)
                lineTo(5.0f, 5.0f)
                curveTo(5.0f, 4.4f, 4.6f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(10.3516f, 15.0273f)
                curveTo(10.1625f, 15.0445f, 9.9758f, 15.0992f, 9.8008f, 15.1992f)
                curveTo(9.1008f, 15.5992f, 8.7992f, 16.4992f, 9.1992f, 17.1992f)
                lineTo(14.6992f, 27.1992f)
                curveTo(14.8992f, 27.6992f, 15.5f, 28.0f, 16.0f, 28.0f)
                curveTo(16.5f, 28.0f, 17.1008f, 27.6992f, 17.3008f, 27.1992f)
                lineTo(22.8008f, 17.1992f)
                curveTo(23.2008f, 16.4992f, 22.8992f, 15.5992f, 22.1992f, 15.1992f)
                curveTo(21.4992f, 14.7992f, 20.5992f, 15.1008f, 20.1992f, 15.8008f)
                lineTo(16.0f, 23.4004f)
                lineTo(11.8008f, 15.8008f)
                curveTo(11.5008f, 15.2758f, 10.9187f, 14.9758f, 10.3516f, 15.0273f)
                close()
            }
        }
        .build()
        return _vaadin!!
    }

private var _vaadin: ImageVector? = null
