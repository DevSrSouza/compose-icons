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

public val MaterialDesignIcons.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) {
            return _currencyInr!!
        }
        _currencyInr = Builder(name = "CurrencyInr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                horizontalLineTo(18.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(13.74f)
                curveTo(14.22f, 5.58f, 14.58f, 6.26f, 14.79f, 7.0f)
                horizontalLineTo(18.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(14.75f, 11.57f, 12.74f, 13.63f, 10.2f, 13.96f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                lineTo(15.5f, 21.0f)
                horizontalLineTo(13.0f)
                lineTo(7.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.0f)
                curveTo(11.26f, 12.0f, 12.72f, 10.7f, 12.96f, 9.0f)
                horizontalLineTo(7.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineTo(12.66f)
                curveTo(12.1f, 5.82f, 10.9f, 5.0f, 9.5f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(8.0f, 3.0f)
                close()
            }
        }
        .build()
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
