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

public val MaterialDesignIcons.CurrencyTwd: ImageVector
    get() {
        if (_currencyTwd != null) {
            return _currencyTwd!!
        }
        _currencyTwd = Builder(name = "CurrencyTwd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.35f)
                lineTo(5.73f, 21.0f)
                lineTo(4.0f, 20.0f)
                lineTo(8.04f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _currencyTwd!!
    }

private var _currencyTwd: ImageVector? = null
