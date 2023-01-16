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

public val MaterialDesignIcons.SerialPort: ImageVector
    get() {
        if (_serialPort != null) {
            return _serialPort!!
        }
        _serialPort = Builder(name = "SerialPort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                moveTo(17.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                moveTo(5.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _serialPort!!
    }

private var _serialPort: ImageVector? = null
