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

public val MaterialDesignIcons.CurrencyRupee: ImageVector
    get() {
        if (_currencyRupee != null) {
            return _currencyRupee!!
        }
        _currencyRupee = Builder(name = "CurrencyRupee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.66f, 7.0f)
                curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.74f)
                curveTo(15.22f, 5.58f, 15.58f, 6.26f, 15.79f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                curveTo(15.73f, 11.8f, 13.37f, 14.0f, 10.5f, 14.0f)
                horizontalLineTo(9.77f)
                lineTo(16.5f, 21.0f)
                horizontalLineTo(13.73f)
                lineTo(7.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.5f)
                curveTo(12.26f, 12.0f, 13.72f, 10.7f, 13.96f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.66f)
                close()
            }
        }
        .build()
        return _currencyRupee!!
    }

private var _currencyRupee: ImageVector? = null
