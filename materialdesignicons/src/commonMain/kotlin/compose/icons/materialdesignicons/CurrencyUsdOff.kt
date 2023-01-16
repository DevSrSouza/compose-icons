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

public val MaterialDesignIcons.CurrencyUsdOff: ImageVector
    get() {
        if (_currencyUsdOff != null) {
            return _currencyUsdOff!!
        }
        _currencyUsdOff = Builder(name = "CurrencyUsdOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.27f)
                lineTo(4.28f, 3.0f)
                lineTo(21.0f, 19.72f)
                lineTo(19.73f, 21.0f)
                lineTo(16.06f, 17.33f)
                curveTo(15.44f, 18.0f, 14.54f, 18.55f, 13.5f, 18.82f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(18.82f)
                curveTo(8.47f, 18.31f, 7.0f, 16.79f, 7.0f, 15.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 16.08f, 10.37f, 17.0f, 12.0f, 17.0f)
                curveTo(13.13f, 17.0f, 14.14f, 16.56f, 14.65f, 15.92f)
                lineTo(11.68f, 12.95f)
                curveTo(9.58f, 12.42f, 7.0f, 11.75f, 7.0f, 9.0f)
                curveTo(7.0f, 8.77f, 7.0f, 8.55f, 7.07f, 8.34f)
                lineTo(3.0f, 4.27f)
                moveTo(10.5f, 5.18f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.18f)
                curveTo(15.53f, 5.69f, 17.0f, 7.21f, 17.0f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 7.92f, 13.63f, 7.0f, 12.0f, 7.0f)
                curveTo(11.63f, 7.0f, 11.28f, 7.05f, 10.95f, 7.13f)
                lineTo(9.4f, 5.58f)
                lineTo(10.5f, 5.18f)
                close()
            }
        }
        .build()
        return _currencyUsdOff!!
    }

private var _currencyUsdOff: ImageVector? = null
