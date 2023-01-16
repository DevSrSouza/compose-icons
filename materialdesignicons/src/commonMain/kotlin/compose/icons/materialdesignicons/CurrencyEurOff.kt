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

public val MaterialDesignIcons.CurrencyEurOff: ImageVector
    get() {
        if (_currencyEurOff != null) {
            return _currencyEurOff!!
        }
        _currencyEurOff = Builder(name = "CurrencyEurOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(6.7f, 8.59f)
                curveTo(6.64f, 8.73f, 6.57f, 8.86f, 6.5f, 9.0f)
                horizontalLineTo(3.0f)
                lineTo(2.0f, 11.0f)
                horizontalLineTo(6.06f)
                curveTo(6.0f, 11.33f, 6.0f, 11.66f, 6.0f, 12.0f)
                reflectiveCurveTo(6.0f, 12.67f, 6.06f, 13.0f)
                horizontalLineTo(3.0f)
                lineTo(2.0f, 15.0f)
                horizontalLineTo(6.5f)
                curveTo(7.76f, 18.5f, 11.08f, 21.0f, 15.0f, 21.0f)
                curveTo(16.21f, 21.0f, 17.36f, 20.74f, 18.41f, 20.3f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8.58f, 13.0f)
                curveTo(8.53f, 12.67f, 8.5f, 12.34f, 8.5f, 12.0f)
                reflectiveCurveTo(8.53f, 11.33f, 8.58f, 11.0f)
                horizontalLineTo(9.11f)
                lineTo(11.11f, 13.0f)
                horizontalLineTo(8.58f)
                moveTo(15.0f, 18.5f)
                curveTo(12.5f, 18.5f, 10.32f, 17.08f, 9.24f, 15.0f)
                horizontalLineTo(13.11f)
                lineTo(16.44f, 18.33f)
                curveTo(15.97f, 18.43f, 15.5f, 18.5f, 15.0f, 18.5f)
                moveTo(12.2f, 9.0f)
                horizontalLineTo(16.0f)
                lineTo(15.0f, 11.0f)
                horizontalLineTo(14.2f)
                lineTo(12.2f, 9.0f)
                moveTo(10.5f, 7.32f)
                lineTo(8.74f, 5.54f)
                curveTo(10.36f, 3.97f, 12.56f, 3.0f, 15.0f, 3.0f)
                curveTo(17.3f, 3.0f, 19.41f, 3.87f, 21.0f, 5.3f)
                lineTo(19.23f, 7.07f)
                curveTo(18.09f, 6.09f, 16.61f, 5.5f, 15.0f, 5.5f)
                curveTo(13.26f, 5.5f, 11.69f, 6.2f, 10.5f, 7.32f)
                close()
            }
        }
        .build()
        return _currencyEurOff!!
    }

private var _currencyEurOff: ImageVector? = null
