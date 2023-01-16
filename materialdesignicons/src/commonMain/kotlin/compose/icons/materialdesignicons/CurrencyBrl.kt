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

public val MaterialDesignIcons.CurrencyBrl: ImageVector
    get() {
        if (_currencyBrl != null) {
            return _currencyBrl!!
        }
        _currencyBrl = Builder(name = "CurrencyBrl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 16.08f, 15.37f, 17.0f, 17.0f, 17.0f)
                curveTo(18.63f, 17.0f, 20.0f, 16.08f, 20.0f, 15.0f)
                curveTo(20.0f, 13.9f, 18.96f, 13.5f, 16.76f, 12.97f)
                curveTo(14.64f, 12.44f, 12.0f, 11.78f, 12.0f, 9.0f)
                curveTo(12.0f, 7.21f, 13.47f, 5.69f, 15.5f, 5.18f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(5.18f)
                curveTo(20.53f, 5.69f, 22.0f, 7.21f, 22.0f, 9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.92f, 18.63f, 7.0f, 17.0f, 7.0f)
                curveTo(15.37f, 7.0f, 14.0f, 7.92f, 14.0f, 9.0f)
                curveTo(14.0f, 10.1f, 15.04f, 10.5f, 17.24f, 11.03f)
                curveTo(19.36f, 11.56f, 22.0f, 12.22f, 22.0f, 15.0f)
                curveTo(22.0f, 16.79f, 20.53f, 18.31f, 18.5f, 18.82f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(18.82f)
                curveTo(13.47f, 18.31f, 12.0f, 16.79f, 12.0f, 15.0f)
                moveTo(2.0f, 3.0f)
                horizontalLineTo(5.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 11.0f, 8.5f)
                curveTo(11.0f, 10.69f, 9.71f, 12.59f, 7.86f, 13.47f)
                lineTo(11.64f, 21.0f)
                horizontalLineTo(9.4f)
                lineTo(5.88f, 14.0f)
                horizontalLineTo(5.5f)
                lineTo(4.0f, 14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                moveTo(5.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _currencyBrl!!
    }

private var _currencyBrl: ImageVector? = null
