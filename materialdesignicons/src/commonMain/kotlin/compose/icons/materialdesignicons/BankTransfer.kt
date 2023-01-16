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

public val MaterialDesignIcons.BankTransfer: ImageVector
    get() {
        if (_bankTransfer != null) {
            return _bankTransfer!!
        }
        _bankTransfer = Builder(name = "BankTransfer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                lineTo(22.0f, 12.5f)
                lineTo(18.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                moveTo(14.0f, 7.7f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.7f)
                lineTo(8.0f, 4.0f)
                lineTo(14.0f, 7.7f)
                moveTo(7.0f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                moveTo(3.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                moveTo(13.0f, 10.0f)
                verticalLineTo(12.5f)
                lineTo(11.0f, 14.3f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                moveTo(9.1f, 16.0f)
                lineTo(8.5f, 16.5f)
                lineTo(10.2f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.1f)
                moveTo(17.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                lineTo(10.0f, 16.5f)
                lineTo(14.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _bankTransfer!!
    }

private var _bankTransfer: ImageVector? = null
