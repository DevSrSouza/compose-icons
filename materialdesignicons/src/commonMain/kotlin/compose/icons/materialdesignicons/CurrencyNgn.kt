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

public val MaterialDesignIcons.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) {
            return _currencyNgn!!
        }
        _currencyNgn = Builder(name = "CurrencyNgn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                lineTo(11.42f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                lineTo(12.57f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                moveTo(8.0f, 9.0f)
                horizontalLineTo(9.13f)
                lineTo(8.0f, 7.03f)
                verticalLineTo(9.0f)
                moveTo(8.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.42f)
                lineTo(10.28f, 11.0f)
                horizontalLineTo(8.0f)
                moveTo(16.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.85f)
                lineTo(16.0f, 17.0f)
                moveTo(12.56f, 11.0f)
                lineTo(13.71f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.56f)
                close()
            }
        }
        .build()
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
