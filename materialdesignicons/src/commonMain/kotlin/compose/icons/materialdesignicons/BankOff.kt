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

public val MaterialDesignIcons.BankOff: ImageVector
    get() {
        if (_bankOff != null) {
            return _bankOff!!
        }
        _bankOff = Builder(name = "BankOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(20.1f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.1f)
                lineTo(13.0f, 14.9f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.9f)
                lineTo(6.1f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                lineTo(3.4f, 5.3f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(4.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                moveTo(21.0f, 8.0f)
                verticalLineTo(6.0f)
                lineTo(11.5f, 1.0f)
                lineTo(6.7f, 3.5f)
                lineTo(11.2f, 8.0f)
                horizontalLineTo(21.0f)
                moveTo(19.0f, 15.8f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.8f)
                lineTo(19.0f, 15.8f)
                close()
            }
        }
        .build()
        return _bankOff!!
    }

private var _bankOff: ImageVector? = null
