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

public val MaterialDesignIcons.CurrencySign: ImageVector
    get() {
        if (_currencySign != null) {
            return _currencySign!!
        }
        _currencySign = Builder(name = "CurrencySign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.41f, 3.0f)
                lineTo(3.0f, 4.41f)
                lineTo(5.69f, 7.1f)
                curveTo(4.63f, 8.46f, 4.0f, 10.15f, 4.0f, 12.0f)
                curveTo(4.0f, 13.85f, 4.63f, 15.55f, 5.69f, 16.9f)
                lineTo(3.0f, 19.59f)
                lineTo(4.41f, 21.0f)
                lineTo(7.1f, 18.31f)
                curveTo(8.46f, 19.37f, 10.15f, 20.0f, 12.0f, 20.0f)
                curveTo(13.85f, 20.0f, 15.55f, 19.37f, 16.9f, 18.31f)
                lineTo(19.59f, 21.0f)
                lineTo(21.0f, 19.59f)
                lineTo(18.31f, 16.9f)
                curveTo(19.37f, 15.54f, 20.0f, 13.85f, 20.0f, 12.0f)
                curveTo(20.0f, 10.15f, 19.37f, 8.45f, 18.31f, 7.1f)
                lineTo(21.0f, 4.41f)
                lineTo(19.59f, 3.0f)
                lineTo(16.9f, 5.69f)
                curveTo(15.54f, 4.63f, 13.85f, 4.0f, 12.0f, 4.0f)
                curveTo(10.15f, 4.0f, 8.45f, 4.63f, 7.1f, 5.69f)
                lineTo(4.41f, 3.0f)
                moveTo(12.0f, 6.0f)
                curveTo(15.31f, 6.0f, 18.0f, 8.69f, 18.0f, 12.0f)
                curveTo(18.0f, 15.31f, 15.31f, 18.0f, 12.0f, 18.0f)
                curveTo(8.69f, 18.0f, 6.0f, 15.31f, 6.0f, 12.0f)
                curveTo(6.0f, 8.69f, 8.69f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _currencySign!!
    }

private var _currencySign: ImageVector? = null
