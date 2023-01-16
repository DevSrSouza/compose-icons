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

public val MaterialDesignIcons.CurrencyBdt: ImageVector
    get() {
        if (_currencyBdt != null) {
            return _currencyBdt!!
        }
        _currencyBdt = Builder(name = "CurrencyBdt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.09f, 10.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.59f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.09f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.59f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.09f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.09f)
                verticalLineTo(10.5f)
                horizontalLineTo(8.09f)
                verticalLineTo(16.7f)
                curveTo(8.09f, 19.06f, 10.0f, 20.97f, 12.34f, 21.0f)
                curveTo(14.68f, 20.96f, 16.54f, 19.04f, 16.5f, 16.7f)
                curveTo(16.5f, 15.11f, 15.75f, 13.61f, 14.5f, 12.62f)
                curveTo(14.28f, 12.44f, 14.05f, 12.28f, 13.8f, 12.15f)
                curveTo(13.58f, 12.05f, 13.34f, 12.0f, 13.1f, 12.0f)
                curveTo(12.39f, 12.0f, 11.74f, 12.39f, 11.39f, 13.0f)
                curveTo(11.2f, 13.3f, 11.1f, 13.65f, 11.1f, 14.0f)
                curveTo(11.11f, 15.1f, 12.0f, 16.0f, 13.11f, 16.0f)
                curveTo(13.73f, 16.0f, 14.31f, 15.69f, 14.69f, 15.2f)
                curveTo(14.9f, 15.67f, 15.0f, 16.18f, 15.0f, 16.7f)
                curveTo(15.04f, 18.2f, 13.86f, 19.45f, 12.34f, 19.5f)
                curveTo(10.81f, 19.5f, 9.58f, 18.23f, 9.59f, 16.7f)
                verticalLineTo(10.5f)
                horizontalLineTo(18.09f)
                close()
            }
        }
        .build()
        return _currencyBdt!!
    }

private var _currencyBdt: ImageVector? = null
