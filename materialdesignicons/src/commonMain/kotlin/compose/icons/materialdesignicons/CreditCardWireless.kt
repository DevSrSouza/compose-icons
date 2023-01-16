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

public val MaterialDesignIcons.CreditCardWireless: ImageVector
    get() {
        if (_creditCardWireless != null) {
            return _creditCardWireless!!
        }
        _creditCardWireless = Builder(name = "CreditCardWireless", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(18.0f, 11.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 11.0f, 4.0f, 11.9f, 4.0f, 13.0f)
                verticalLineTo(21.0f)
                curveTo(4.0f, 22.11f, 4.89f, 23.0f, 6.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 23.0f, 20.0f, 22.11f, 20.0f, 21.0f)
                verticalLineTo(13.0f)
                curveTo(20.0f, 11.9f, 19.11f, 11.0f, 18.0f, 11.0f)
                moveTo(18.0f, 17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _creditCardWireless!!
    }

private var _creditCardWireless: ImageVector? = null
