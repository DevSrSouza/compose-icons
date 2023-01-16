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

public val MaterialDesignIcons.PumpOff: ImageVector
    get() {
        if (_pumpOff != null) {
            return _pumpOff!!
        }
        _pumpOff = Builder(name = "PumpOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(4.8f, 6.7f)
                curveTo(3.7f, 8.2f, 3.0f, 10.0f, 3.0f, 12.0f)
                curveTo(3.0f, 13.0f, 3.2f, 14.1f, 3.5f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                curveTo(14.0f, 21.0f, 15.8f, 20.3f, 17.3f, 19.2f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(5.9f, 15.5f)
                curveTo(5.3f, 14.5f, 5.0f, 13.3f, 5.0f, 12.0f)
                curveTo(5.0f, 10.6f, 5.5f, 9.2f, 6.2f, 8.1f)
                lineTo(9.2f, 11.1f)
                curveTo(9.1f, 11.3f, 9.0f, 11.7f, 9.0f, 12.0f)
                curveTo(9.0f, 12.5f, 9.2f, 13.1f, 9.4f, 13.5f)
                lineTo(5.9f, 15.5f)
                moveTo(12.0f, 19.0f)
                horizontalLineTo(11.3f)
                lineTo(11.7f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(12.3f, 15.0f, 12.6f, 14.9f, 12.9f, 14.8f)
                lineTo(15.9f, 17.8f)
                curveTo(14.8f, 18.5f, 13.4f, 19.0f, 12.0f, 19.0f)
                moveTo(12.0f, 8.8f)
                lineTo(7.4f, 4.2f)
                curveTo(8.8f, 3.5f, 10.3f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.5f)
                curveTo(20.8f, 9.9f, 21.0f, 11.0f, 21.0f, 12.0f)
                curveTo(21.0f, 13.7f, 20.5f, 15.2f, 19.8f, 16.6f)
                lineTo(12.2f, 9.0f)
                curveTo(13.3f, 9.1f, 14.3f, 9.8f, 14.7f, 10.7f)
                lineTo(18.3f, 9.0f)
                curveTo(17.3f, 6.7f, 14.8f, 5.0f, 12.0f, 5.0f)
                verticalLineTo(8.8f)
                close()
            }
        }
        .build()
        return _pumpOff!!
    }

private var _pumpOff: ImageVector? = null
