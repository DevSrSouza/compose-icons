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

public val MaterialDesignIcons.CurrencyUah: ImageVector
    get() {
        if (_currencyUah != null) {
            return _currencyUah!!
        }
        _currencyUah = Builder(name = "CurrencyUah", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.59f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.32f)
                curveTo(16.74f, 8.34f, 17.0f, 7.68f, 17.0f, 7.0f)
                curveTo(17.0f, 4.37f, 14.5f, 3.0f, 12.0f, 3.0f)
                curveTo(9.65f, 3.0f, 7.53f, 5.06f, 7.29f, 5.29f)
                lineTo(8.71f, 6.71f)
                curveTo(9.19f, 6.23f, 10.71f, 5.0f, 12.0f, 5.0f)
                curveTo(13.04f, 5.0f, 15.0f, 5.42f, 15.0f, 7.0f)
                curveTo(15.0f, 7.5f, 14.5f, 8.24f, 13.76f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.63f)
                curveTo(11.21f, 11.36f, 9.75f, 12.67f, 9.41f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.68f)
                curveTo(7.26f, 15.66f, 7.0f, 16.32f, 7.0f, 17.0f)
                curveTo(7.0f, 19.63f, 9.5f, 21.0f, 12.0f, 21.0f)
                curveTo(14.35f, 21.0f, 16.47f, 18.94f, 16.71f, 18.71f)
                lineTo(15.29f, 17.29f)
                curveTo(14.82f, 17.77f, 13.29f, 19.0f, 12.0f, 19.0f)
                curveTo(10.96f, 19.0f, 9.0f, 18.58f, 9.0f, 17.0f)
                curveTo(9.0f, 16.5f, 9.5f, 15.76f, 10.24f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.38f)
                lineTo(14.59f, 11.0f)
                close()
            }
        }
        .build()
        return _currencyUah!!
    }

private var _currencyUah: ImageVector? = null
