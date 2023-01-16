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

public val MaterialDesignIcons.CurrencyPhp: ImageVector
    get() {
        if (_currencyPhp != null) {
            return _currencyPhp!!
        }
        _currencyPhp = Builder(name = "CurrencyPhp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                curveTo(15.7f, 16.0f, 18.16f, 14.44f, 19.32f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.92f)
                curveTo(20.03f, 9.34f, 20.03f, 8.66f, 19.92f, 8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.32f)
                curveTo(18.16f, 3.56f, 15.7f, 2.0f, 13.0f, 2.0f)
                moveTo(7.0f, 4.0f)
                horizontalLineTo(13.0f)
                curveTo(14.57f, 4.0f, 16.06f, 4.74f, 17.0f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                moveTo(13.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                curveTo(16.06f, 13.26f, 14.57f, 14.0f, 13.0f, 14.0f)
                moveTo(18.0f, 9.0f)
                curveTo(18.0f, 9.34f, 17.96f, 9.67f, 17.9f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.9f)
                curveTo(17.96f, 8.33f, 18.0f, 8.66f, 18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _currencyPhp!!
    }

private var _currencyPhp: ImageVector? = null
