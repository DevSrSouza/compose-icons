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

public val MaterialDesignIcons.CurrencyRial: ImageVector
    get() {
        if (_currencyRial != null) {
            return _currencyRial!!
        }
        _currencyRial = Builder(name = "CurrencyRial", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                moveTo(14.0f, 17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                moveTo(9.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 19.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(8.11f, 17.0f, 9.0f, 16.11f, 9.0f, 15.0f)
                verticalLineTo(4.0f)
                moveTo(12.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 14.11f, 18.11f, 15.0f, 17.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(12.89f, 15.0f, 12.0f, 14.11f, 12.0f, 13.0f)
                verticalLineTo(4.0f)
                moveTo(20.0f, 10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 17.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _currencyRial!!
    }

private var _currencyRial: ImageVector? = null
