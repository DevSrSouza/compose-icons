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

public val MaterialDesignIcons.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) {
            return _currencyGbp!!
        }
        _currencyGbp = Builder(name = "CurrencyGbp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                curveTo(15.93f, 21.0f, 17.62f, 19.83f, 18.0f, 18.0f)
                lineTo(16.25f, 17.12f)
                curveTo(16.0f, 18.21f, 15.33f, 19.0f, 14.0f, 19.0f)
                horizontalLineTo(9.1f)
                curveTo(9.93f, 18.0f, 10.6f, 16.66f, 10.6f, 15.0f)
                curveTo(10.6f, 14.65f, 10.57f, 14.31f, 10.5f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.82f)
                curveTo(9.0f, 10.42f, 8.0f, 9.6f, 8.0f, 8.0f)
                curveTo(8.0f, 6.07f, 9.57f, 4.5f, 11.5f, 4.5f)
                curveTo(13.0f, 4.5f, 14.29f, 5.45f, 14.78f, 6.78f)
                lineTo(16.63f, 6.0f)
                curveTo(15.83f, 3.95f, 13.84f, 2.5f, 11.5f, 2.5f)
                curveTo(8.46f, 2.5f, 6.0f, 4.96f, 6.0f, 8.0f)
                curveTo(6.0f, 9.78f, 6.79f, 10.9f, 7.5f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.47f)
                curveTo(8.55f, 14.31f, 8.6f, 14.64f, 8.6f, 15.0f)
                curveTo(8.6f, 17.7f, 6.0f, 19.0f, 6.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
