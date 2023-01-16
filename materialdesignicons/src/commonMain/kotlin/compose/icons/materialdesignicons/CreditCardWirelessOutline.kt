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

public val MaterialDesignIcons.CreditCardWirelessOutline: ImageVector
    get() {
        if (_creditCardWirelessOutline != null) {
            return _creditCardWirelessOutline!!
        }
        _creditCardWirelessOutline = Builder(name = "CreditCardWirelessOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 13.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 23.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 21.0f)
                verticalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 11.0f)
                moveTo(18.0f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                moveTo(18.0f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                moveTo(4.93f, 4.92f)
                lineTo(6.34f, 6.33f)
                curveTo(9.46f, 3.2f, 14.53f, 3.2f, 17.66f, 6.33f)
                lineTo(19.07f, 4.92f)
                curveTo(15.17f, 1.0f, 8.84f, 1.0f, 4.93f, 4.92f)
                moveTo(7.76f, 7.75f)
                lineTo(9.17f, 9.16f)
                curveTo(10.73f, 7.6f, 13.26f, 7.6f, 14.83f, 9.16f)
                lineTo(16.24f, 7.75f)
                curveTo(13.9f, 5.41f, 10.1f, 5.41f, 7.76f, 7.75f)
                close()
            }
        }
        .build()
        return _creditCardWirelessOutline!!
    }

private var _creditCardWirelessOutline: ImageVector? = null
