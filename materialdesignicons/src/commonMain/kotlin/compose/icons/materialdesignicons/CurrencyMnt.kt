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

public val MaterialDesignIcons.CurrencyMnt: ImageVector
    get() {
        if (_currencyMnt != null) {
            return _currencyMnt!!
        }
        _currencyMnt = Builder(name = "CurrencyMnt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                verticalLineTo(8.62f)
                lineTo(17.0f, 7.17f)
                verticalLineTo(9.29f)
                lineTo(13.0f, 10.74f)
                verticalLineTo(12.5f)
                lineTo(17.0f, 11.07f)
                verticalLineTo(13.2f)
                lineTo(13.0f, 14.65f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.38f)
                lineTo(7.0f, 16.84f)
                verticalLineTo(14.71f)
                lineTo(11.0f, 13.24f)
                verticalLineTo(11.47f)
                lineTo(7.0f, 12.92f)
                verticalLineTo(10.8f)
                lineTo(11.0f, 9.35f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _currencyMnt!!
    }

private var _currencyMnt: ImageVector? = null
