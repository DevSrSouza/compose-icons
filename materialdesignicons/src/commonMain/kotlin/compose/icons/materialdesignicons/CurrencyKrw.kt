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

public val MaterialDesignIcons.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(4.0f)
                lineTo(5.33f, 9.0f)
                horizontalLineTo(9.33f)
                lineTo(10.67f, 3.0f)
                horizontalLineTo(13.33f)
                lineTo(14.67f, 9.0f)
                horizontalLineTo(18.67f)
                lineTo(20.0f, 3.0f)
                horizontalLineTo(22.0f)
                lineTo(20.67f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.22f)
                lineTo(19.78f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.33f)
                lineTo(18.0f, 21.0f)
                horizontalLineTo(15.33f)
                lineTo(14.0f, 15.0f)
                horizontalLineTo(10.0f)
                lineTo(8.67f, 21.0f)
                horizontalLineTo(6.0f)
                lineTo(4.67f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.22f)
                lineTo(3.78f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.33f)
                lineTo(2.0f, 3.0f)
                moveTo(13.11f, 11.0f)
                horizontalLineTo(10.89f)
                lineTo(10.44f, 13.0f)
                horizontalLineTo(13.56f)
                lineTo(13.11f, 11.0f)
                moveTo(7.33f, 18.0f)
                lineTo(8.0f, 15.0f)
                horizontalLineTo(6.67f)
                lineTo(7.33f, 18.0f)
                moveTo(8.89f, 11.0f)
                horizontalLineTo(5.78f)
                lineTo(6.22f, 13.0f)
                horizontalLineTo(8.44f)
                lineTo(8.89f, 11.0f)
                moveTo(16.67f, 18.0f)
                lineTo(17.33f, 15.0f)
                horizontalLineTo(16.0f)
                lineTo(16.67f, 18.0f)
                moveTo(18.22f, 11.0f)
                horizontalLineTo(15.11f)
                lineTo(15.56f, 13.0f)
                horizontalLineTo(17.78f)
                lineTo(18.22f, 11.0f)
                moveTo(12.0f, 6.0f)
                lineTo(11.33f, 9.0f)
                horizontalLineTo(12.67f)
                lineTo(12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
