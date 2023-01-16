package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.EthernetCableOff: ImageVector
    get() {
        if (_ethernetCableOff != null) {
            return _ethernetCableOff!!
        }
        _ethernetCableOff = Builder(name = "EthernetCableOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                moveTo(8.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.82f)
                lineTo(8.0f, 6.18f)
                verticalLineTo(4.0f)
                moveTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(14.0f, 17.27f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.27f)
                lineTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                close()
            }
        }
        .build()
        return _ethernetCableOff!!
    }

private var _ethernetCableOff: ImageVector? = null
