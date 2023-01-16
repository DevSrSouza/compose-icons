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

public val MaterialDesignIcons.CurrencyUsd: ImageVector
    get() {
        if (_currencyUsd != null) {
            return _currencyUsd!!
        }
        _currencyUsd = Builder(name = "CurrencyUsd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 16.08f, 10.37f, 17.0f, 12.0f, 17.0f)
                curveTo(13.63f, 17.0f, 15.0f, 16.08f, 15.0f, 15.0f)
                curveTo(15.0f, 13.9f, 13.96f, 13.5f, 11.76f, 12.97f)
                curveTo(9.64f, 12.44f, 7.0f, 11.78f, 7.0f, 9.0f)
                curveTo(7.0f, 7.21f, 8.47f, 5.69f, 10.5f, 5.18f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.18f)
                curveTo(15.53f, 5.69f, 17.0f, 7.21f, 17.0f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 7.92f, 13.63f, 7.0f, 12.0f, 7.0f)
                curveTo(10.37f, 7.0f, 9.0f, 7.92f, 9.0f, 9.0f)
                curveTo(9.0f, 10.1f, 10.04f, 10.5f, 12.24f, 11.03f)
                curveTo(14.36f, 11.56f, 17.0f, 12.22f, 17.0f, 15.0f)
                curveTo(17.0f, 16.79f, 15.53f, 18.31f, 13.5f, 18.82f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(18.82f)
                curveTo(8.47f, 18.31f, 7.0f, 16.79f, 7.0f, 15.0f)
                close()
            }
        }
        .build()
        return _currencyUsd!!
    }

private var _currencyUsd: ImageVector? = null
