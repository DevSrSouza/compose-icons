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

public val LineAwesomeIcons.IglooSolid: ImageVector
    get() {
        if (_iglooSolid != null) {
            return _iglooSolid!!
        }
        _iglooSolid = Builder(name = "IglooSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(8.832f, 6.0f, 3.0f, 11.832f, 3.0f, 19.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 19.0f)
                curveTo(29.0f, 11.832f, 23.168f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(16.3375f, 8.0f, 16.6701f, 8.0209f, 17.0f, 8.0508f)
                lineTo(17.0f, 12.0f)
                lineTo(7.5234f, 12.0f)
                curveTo(9.5428f, 9.5592f, 12.5924f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(19.0f, 8.4277f)
                curveTo(21.1716f, 9.045f, 23.0741f, 10.3048f, 24.4766f, 12.0f)
                lineTo(19.0f, 12.0f)
                lineTo(19.0f, 8.4277f)
                close()
                moveTo(6.2148f, 14.0f)
                lineTo(8.0f, 14.0f)
                lineTo(8.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                curveTo(5.0f, 17.1987f, 5.4439f, 15.5023f, 6.2148f, 14.0f)
                close()
                moveTo(10.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 19.0f)
                lineTo(20.5781f, 19.0f)
                curveTo(19.8047f, 17.2366f, 18.0456f, 16.0f, 16.0f, 16.0f)
                curveTo(13.9544f, 16.0f, 12.1953f, 17.2366f, 11.4219f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 14.0f)
                close()
                moveTo(24.0f, 14.0f)
                lineTo(25.7852f, 14.0f)
                curveTo(26.5561f, 15.5023f, 27.0f, 17.1987f, 27.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 14.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(17.654f, 18.0f, 19.0f, 19.346f, 19.0f, 21.0f)
                lineTo(19.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 21.0f)
                curveTo(13.0f, 19.346f, 14.346f, 18.0f, 16.0f, 18.0f)
                close()
                moveTo(5.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(27.0f, 21.0f)
                lineTo(27.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 21.0f)
                close()
            }
        }
        .build()
        return _iglooSolid!!
    }

private var _iglooSolid: ImageVector? = null
