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

public val MaterialDesignIcons.BankTransferIn: ImageVector
    get() {
        if (_bankTransferIn != null) {
            return _bankTransferIn!!
        }
        _bankTransferIn = Builder(name = "BankTransferIn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                lineTo(9.0f, 13.5f)
                lineTo(5.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                moveTo(22.0f, 8.7f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.7f)
                lineTo(16.0f, 5.0f)
                lineTo(22.0f, 8.7f)
                moveTo(10.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                moveTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                moveTo(19.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _bankTransferIn!!
    }

private var _bankTransferIn: ImageVector? = null
