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

public val MaterialDesignIcons.ReceiptTextRemove: ImageVector
    get() {
        if (_receiptTextRemove != null) {
            return _receiptTextRemove!!
        }
        _receiptTextRemove = Builder(name = "ReceiptTextRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.12f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                lineTo(21.12f, 15.46f)
                moveTo(19.5f, 3.5f)
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
                verticalLineTo(22.0f)
                lineTo(4.5f, 20.5f)
                lineTo(6.0f, 22.0f)
                lineTo(7.5f, 20.5f)
                lineTo(9.0f, 22.0f)
                lineTo(10.5f, 20.5f)
                lineTo(12.0f, 22.0f)
                lineTo(13.26f, 20.74f)
                curveTo(13.09f, 20.18f, 13.0f, 19.59f, 13.0f, 19.0f)
                curveTo(13.0f, 18.32f, 13.12f, 17.64f, 13.34f, 17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.53f)
                curveTo(15.67f, 13.73f, 17.29f, 13.0f, 19.0f, 13.0f)
                curveTo(19.68f, 13.0f, 20.36f, 13.12f, 21.0f, 13.34f)
                verticalLineTo(2.0f)
                lineTo(19.5f, 3.5f)
                moveTo(18.0f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                moveTo(18.0f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _receiptTextRemove!!
    }

private var _receiptTextRemove: ImageVector? = null
