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

public val LineAwesomeIcons.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(name = "Figma", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 1.0f)
                curveTo(9.467f, 1.0f, 7.0f, 3.467f, 7.0f, 6.5f)
                curveTo(7.0f, 8.1579f, 7.7405f, 9.6432f, 8.9043f, 10.6523f)
                curveTo(7.1774f, 11.581f, 6.0f, 13.4055f, 6.0f, 15.5f)
                curveTo(6.0f, 17.3606f, 6.9317f, 19.0043f, 8.3496f, 20.0f)
                curveTo(6.9317f, 20.9957f, 6.0f, 22.6394f, 6.0f, 24.5f)
                curveTo(6.0f, 27.533f, 8.467f, 30.0f, 11.5f, 30.0f)
                curveTo(14.533f, 30.0f, 17.0f, 27.533f, 17.0f, 24.5f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 12.0f)
                lineTo(20.5f, 12.0f)
                curveTo(23.533f, 12.0f, 26.0f, 9.533f, 26.0f, 6.5f)
                curveTo(26.0f, 3.467f, 23.533f, 1.0f, 20.5f, 1.0f)
                lineTo(12.5f, 1.0f)
                close()
                moveTo(12.5f, 3.0f)
                lineTo(20.5f, 3.0f)
                curveTo(22.43f, 3.0f, 24.0f, 4.57f, 24.0f, 6.5f)
                curveTo(24.0f, 8.43f, 22.43f, 10.0f, 20.5f, 10.0f)
                lineTo(17.0f, 10.0f)
                lineTo(12.5f, 10.0f)
                curveTo(10.57f, 10.0f, 9.0f, 8.43f, 9.0f, 6.5f)
                curveTo(9.0f, 4.57f, 10.57f, 3.0f, 12.5f, 3.0f)
                close()
                moveTo(11.5f, 12.0f)
                lineTo(12.5f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 19.0f)
                lineTo(11.5f, 19.0f)
                curveTo(9.57f, 19.0f, 8.0f, 17.43f, 8.0f, 15.5f)
                curveTo(8.0f, 13.57f, 9.57f, 12.0f, 11.5f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 21.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 21.0f, 12.0f)
                close()
                moveTo(11.5f, 21.0f)
                lineTo(15.0f, 21.0f)
                lineTo(15.0f, 24.5f)
                curveTo(15.0f, 26.43f, 13.43f, 28.0f, 11.5f, 28.0f)
                curveTo(9.57f, 28.0f, 8.0f, 26.43f, 8.0f, 24.5f)
                curveTo(8.0f, 22.57f, 9.57f, 21.0f, 11.5f, 21.0f)
                close()
            }
        }
        .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
