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

public val MaterialDesignIcons.BankOffOutline: ImageVector
    get() {
        if (_bankOffOutline != null) {
            return _bankOffOutline!!
        }
        _bankOffOutline = Builder(name = "BankOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(19.1f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.1f)
                lineTo(12.5f, 14.4f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(12.4f)
                lineTo(6.1f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                lineTo(3.4f, 5.3f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(4.5f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.5f)
                moveTo(11.5f, 3.3f)
                lineTo(16.7f, 6.0f)
                horizontalLineTo(9.2f)
                lineTo(11.2f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                lineTo(11.5f, 1.0f)
                lineTo(6.7f, 3.5f)
                lineTo(8.2f, 5.0f)
                lineTo(11.5f, 3.3f)
                moveTo(18.5f, 15.3f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.3f)
                lineTo(18.5f, 15.3f)
                close()
            }
        }
        .build()
        return _bankOffOutline!!
    }

private var _bankOffOutline: ImageVector? = null
