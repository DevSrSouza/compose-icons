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

public val MaterialDesignIcons.ReceiptText: ImageVector
    get() {
        if (_receiptText != null) {
            return _receiptText!!
        }
        _receiptText = Builder(name = "ReceiptText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                lineTo(4.5f, 20.5f)
                lineTo(6.0f, 22.0f)
                lineTo(7.5f, 20.5f)
                lineTo(9.0f, 22.0f)
                lineTo(10.5f, 20.5f)
                lineTo(12.0f, 22.0f)
                lineTo(13.5f, 20.5f)
                lineTo(15.0f, 22.0f)
                lineTo(16.5f, 20.5f)
                lineTo(18.0f, 22.0f)
                lineTo(19.5f, 20.5f)
                lineTo(21.0f, 22.0f)
                verticalLineTo(2.0f)
                lineTo(19.5f, 3.5f)
                lineTo(18.0f, 2.0f)
                lineTo(16.5f, 3.5f)
                lineTo(15.0f, 2.0f)
                lineTo(13.5f, 3.5f)
                lineTo(12.0f, 2.0f)
                lineTo(10.5f, 3.5f)
                lineTo(9.0f, 2.0f)
                lineTo(7.5f, 3.5f)
                lineTo(6.0f, 2.0f)
                lineTo(4.5f, 3.5f)
                lineTo(3.0f, 2.0f)
                moveTo(18.0f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _receiptText!!
    }

private var _receiptText: ImageVector? = null
