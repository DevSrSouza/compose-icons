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

public val MaterialDesignIcons.CurrencyTry: ImageVector
    get() {
        if (_currencyTry != null) {
            return _currencyTry!!
        }
        _currencyTry = Builder(name = "CurrencyTry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.76f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.5f)
                lineTo(15.0f, 5.0f)
                verticalLineTo(7.36f)
                lineTo(11.0f, 9.87f)
                lineTo(11.0f, 12.22f)
                lineTo(15.0f, 9.72f)
                verticalLineTo(12.08f)
                lineTo(11.0f, 14.59f)
                verticalLineTo(19.0f)
                curveTo(13.76f, 19.0f, 16.0f, 16.76f, 16.0f, 14.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 17.87f, 14.87f, 21.0f, 11.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.84f)
                lineTo(6.0f, 17.72f)
                verticalLineTo(15.36f)
                lineTo(9.0f, 13.5f)
                verticalLineTo(11.12f)
                lineTo(6.0f, 13.0f)
                verticalLineTo(10.64f)
                lineTo(9.0f, 8.76f)
                close()
            }
        }
        .build()
        return _currencyTry!!
    }

private var _currencyTry: ImageVector? = null
