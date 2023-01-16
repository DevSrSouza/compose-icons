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

public val MaterialDesignIcons.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) {
            return _currencyEur!!
        }
        _currencyEur = Builder(name = "CurrencyEur", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.5f)
                curveTo(12.5f, 18.5f, 10.32f, 17.08f, 9.24f, 15.0f)
                horizontalLineTo(15.0f)
                lineTo(16.0f, 13.0f)
                horizontalLineTo(8.58f)
                curveTo(8.53f, 12.67f, 8.5f, 12.34f, 8.5f, 12.0f)
                reflectiveCurveTo(8.53f, 11.33f, 8.58f, 11.0f)
                horizontalLineTo(15.0f)
                lineTo(16.0f, 9.0f)
                horizontalLineTo(9.24f)
                curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f)
                curveTo(16.61f, 5.5f, 18.09f, 6.09f, 19.23f, 7.07f)
                lineTo(21.0f, 5.3f)
                curveTo(19.41f, 3.87f, 17.3f, 3.0f, 15.0f, 3.0f)
                curveTo(11.08f, 3.0f, 7.76f, 5.5f, 6.5f, 9.0f)
                horizontalLineTo(3.0f)
                lineTo(2.0f, 11.0f)
                horizontalLineTo(6.06f)
                curveTo(6.0f, 11.33f, 6.0f, 11.66f, 6.0f, 12.0f)
                reflectiveCurveTo(6.0f, 12.67f, 6.06f, 13.0f)
                horizontalLineTo(3.0f)
                lineTo(2.0f, 15.0f)
                horizontalLineTo(6.5f)
                curveTo(7.76f, 18.5f, 11.08f, 21.0f, 15.0f, 21.0f)
                curveTo(17.31f, 21.0f, 19.41f, 20.13f, 21.0f, 18.7f)
                lineTo(19.22f, 16.93f)
                curveTo(18.09f, 17.91f, 16.62f, 18.5f, 15.0f, 18.5f)
                close()
            }
        }
        .build()
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
