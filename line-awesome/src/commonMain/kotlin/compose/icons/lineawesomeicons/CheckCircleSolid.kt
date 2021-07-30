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

public val LineAwesomeIcons.CheckCircleSolid: ImageVector
    get() {
        if (_checkCircleSolid != null) {
            return _checkCircleSolid!!
        }
        _checkCircleSolid = Builder(name = "CheckCircleSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.8008f, 3.0f, 3.0f, 8.8008f, 3.0f, 16.0f)
                curveTo(3.0f, 23.1992f, 8.8008f, 29.0f, 16.0f, 29.0f)
                curveTo(23.1992f, 29.0f, 29.0f, 23.1992f, 29.0f, 16.0f)
                curveTo(29.0f, 14.6016f, 28.8125f, 13.207f, 28.3125f, 11.9063f)
                lineTo(26.6875f, 13.5f)
                curveTo(26.8867f, 14.3008f, 27.0f, 15.1016f, 27.0f, 16.0f)
                curveTo(27.0f, 22.1016f, 22.1016f, 27.0f, 16.0f, 27.0f)
                curveTo(9.8984f, 27.0f, 5.0f, 22.1016f, 5.0f, 16.0f)
                curveTo(5.0f, 9.8984f, 9.8984f, 5.0f, 16.0f, 5.0f)
                curveTo(19.0f, 5.0f, 21.6953f, 6.1953f, 23.5938f, 8.0938f)
                lineTo(25.0f, 6.6875f)
                curveTo(22.6992f, 4.3867f, 19.5f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(27.2813f, 7.2813f)
                lineTo(16.0f, 18.5625f)
                lineTo(11.7188f, 14.2813f)
                lineTo(10.2813f, 15.7188f)
                lineTo(15.2813f, 20.7188f)
                lineTo(16.0f, 21.4063f)
                lineTo(16.7188f, 20.7188f)
                lineTo(28.7188f, 8.7188f)
                close()
            }
        }
        .build()
        return _checkCircleSolid!!
    }

private var _checkCircleSolid: ImageVector? = null
