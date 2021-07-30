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

public val LineAwesomeIcons.RingSolid: ImageVector
    get() {
        if (_ringSolid != null) {
            return _ringSolid!!
        }
        _ringSolid = Builder(name = "RingSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 7.0f)
                lineTo(25.6992f, 6.6992f)
                curveTo(24.0f, 4.8008f, 21.5f, 4.1992f, 21.5f, 4.1992f)
                curveTo(18.5f, 3.3008f, 13.8008f, 5.3008f, 9.6016f, 9.3984f)
                curveTo(6.1016f, 12.6992f, 4.0f, 16.6992f, 4.0f, 19.6992f)
                curveTo(4.0f, 20.1016f, 4.1016f, 20.5f, 4.1016f, 20.8984f)
                curveTo(4.3008f, 22.8984f, 5.6016f, 25.0f, 6.6992f, 26.0f)
                curveTo(8.1016f, 27.3984f, 9.8984f, 28.1016f, 11.8984f, 28.1016f)
                curveTo(15.1992f, 28.1016f, 19.1016f, 26.1992f, 22.6992f, 22.8008f)
                curveTo(28.3008f, 17.3008f, 29.6992f, 10.8008f, 26.0f, 7.0f)
                close()
                moveTo(10.0f, 21.6992f)
                curveTo(10.0f, 20.3984f, 11.3984f, 17.6992f, 14.3984f, 14.6992f)
                curveTo(17.3008f, 11.8008f, 20.3008f, 11.0f, 21.6992f, 10.6992f)
                curveTo(21.0f, 12.6016f, 19.5f, 14.8984f, 17.3008f, 17.1016f)
                curveTo(15.1992f, 19.1016f, 12.8008f, 20.6992f, 10.6992f, 21.5f)
                curveTo(10.5f, 21.6016f, 10.1992f, 21.6016f, 10.0f, 21.6992f)
                close()
                moveTo(11.0f, 10.8008f)
                curveTo(14.3008f, 7.5f, 17.8008f, 5.8984f, 20.0f, 5.8984f)
                curveTo(20.6992f, 5.8984f, 21.3008f, 6.1016f, 21.6992f, 6.5f)
                curveTo(22.1016f, 6.8984f, 22.3008f, 7.6992f, 22.1992f, 8.6016f)
                curveTo(21.0f, 8.6992f, 16.8984f, 9.3984f, 13.0f, 13.3008f)
                curveTo(10.5f, 15.8008f, 7.8984f, 19.3984f, 8.1016f, 21.8984f)
                curveTo(7.5f, 21.8984f, 6.8984f, 21.6992f, 6.6016f, 21.3984f)
                curveTo(6.3984f, 21.1992f, 6.1992f, 20.8984f, 6.1016f, 20.5f)
                curveTo(6.1016f, 20.5f, 6.0f, 20.0f, 6.0f, 19.6992f)
                curveTo(6.1016f, 17.1992f, 8.0f, 13.6992f, 11.0f, 10.8008f)
                close()
                moveTo(21.3008f, 21.3008f)
                curveTo(16.5f, 26.1016f, 11.0f, 27.3984f, 8.1016f, 24.6016f)
                curveTo(7.8984f, 24.3984f, 7.6992f, 24.1992f, 7.5f, 23.8984f)
                curveTo(7.6992f, 24.0f, 8.0f, 24.0f, 8.3008f, 24.0f)
                curveTo(9.1992f, 24.0f, 10.3008f, 23.8008f, 11.3984f, 23.3984f)
                curveTo(13.8008f, 22.5f, 16.3984f, 20.8008f, 18.6992f, 18.5f)
                curveTo(22.1992f, 15.0f, 24.1992f, 11.0f, 24.1992f, 8.1016f)
                lineTo(24.3008f, 8.1992f)
                lineTo(24.6016f, 8.3984f)
                curveTo(27.3984f, 11.3008f, 26.0f, 16.6992f, 21.3008f, 21.3008f)
                close()
            }
        }
        .build()
        return _ringSolid!!
    }

private var _ringSolid: ImageVector? = null
