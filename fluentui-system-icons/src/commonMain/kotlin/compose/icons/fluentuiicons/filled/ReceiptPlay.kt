package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ReceiptPlay: ImageVector
    get() {
        if (_receiptPlay != null) {
            return _receiptPlay!!
        }
        _receiptPlay = Builder(name = "ReceiptPlay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.25f)
                curveTo(5.0f, 3.0074f, 6.0074f, 2.0f, 7.25f, 2.0f)
                horizontalLineTo(15.75f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.5f)
                verticalLineTo(15.25f)
                curveTo(21.5f, 17.0449f, 20.0449f, 18.5f, 18.25f, 18.5f)
                horizontalLineTo(12.9236f)
                curveTo(12.9739f, 18.174f, 13.0f, 17.8401f, 13.0f, 17.5f)
                curveTo(13.0f, 16.4179f, 12.7356f, 15.3975f, 12.2678f, 14.5f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 14.5f, 15.0f, 14.1642f, 15.0f, 13.75f)
                curveTo(15.0f, 13.3358f, 14.6642f, 13.0f, 14.25f, 13.0f)
                horizontalLineTo(11.1904f)
                curveTo(10.0075f, 11.7673f, 8.3434f, 11.0f, 6.5f, 11.0f)
                curveTo(5.9837f, 11.0f, 5.4815f, 11.0602f, 5.0f, 11.1739f)
                verticalLineTo(4.25f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineTo(18.25f)
                curveTo(19.2165f, 17.0f, 20.0f, 16.2165f, 20.0f, 15.25f)
                verticalLineTo(13.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(8.75f, 6.0f)
                curveTo(8.3358f, 6.0f, 8.0f, 6.3358f, 8.0f, 6.75f)
                curveTo(8.0f, 7.1642f, 8.3358f, 7.5f, 8.75f, 7.5f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 7.5f, 15.0f, 7.1642f, 15.0f, 6.75f)
                curveTo(15.0f, 6.3358f, 14.6642f, 6.0f, 14.25f, 6.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.75f, 9.5f)
                curveTo(8.3358f, 9.5f, 8.0f, 9.8358f, 8.0f, 10.25f)
                curveTo(8.0f, 10.6642f, 8.3358f, 11.0f, 8.75f, 11.0f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 11.0f, 15.0f, 10.6642f, 15.0f, 10.25f)
                curveTo(15.0f, 9.8358f, 14.6642f, 9.5f, 14.25f, 9.5f)
                horizontalLineTo(8.75f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                curveTo(1.0f, 14.4624f, 3.4624f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(5.0f, 14.9603f)
                verticalLineTo(20.0397f)
                curveTo(5.0f, 20.4442f, 5.4553f, 20.6813f, 5.7867f, 20.4493f)
                lineTo(9.4148f, 17.9096f)
                curveTo(9.6992f, 17.7106f, 9.6992f, 17.2894f, 9.4148f, 17.0904f)
                lineTo(5.7867f, 14.5507f)
                curveTo(5.4553f, 14.3187f, 5.0f, 14.5558f, 5.0f, 14.9603f)
                close()
            }
        }
        .build()
        return _receiptPlay!!
    }

private var _receiptPlay: ImageVector? = null
