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

public val MaterialDesignIcons.CreditCardWirelessOff: ImageVector
    get() {
        if (_creditCardWirelessOff != null) {
            return _creditCardWirelessOff!!
        }
        _creditCardWirelessOff = Builder(name = "CreditCardWirelessOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.85f, 2.0f, 7.7f, 2.69f, 5.9f, 4.08f)
                lineTo(7.32f, 5.5f)
                curveTo(10.45f, 3.24f, 14.84f, 3.5f, 17.66f, 6.33f)
                lineTo(19.07f, 4.92f)
                curveTo(17.12f, 2.96f, 14.56f, 2.0f, 12.0f, 2.0f)
                moveTo(3.28f, 4.0f)
                lineTo(2.0f, 5.27f)
                lineTo(7.73f, 11.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 11.0f, 4.0f, 11.9f, 4.0f, 13.0f)
                verticalLineTo(21.0f)
                curveTo(4.0f, 22.11f, 4.89f, 23.0f, 6.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5f, 23.0f, 18.92f, 22.82f, 19.27f, 22.54f)
                lineTo(19.73f, 23.0f)
                lineTo(21.0f, 21.72f)
                moveTo(12.0f, 6.0f)
                curveTo(10.87f, 6.0f, 9.75f, 6.31f, 8.77f, 6.94f)
                lineTo(10.24f, 8.41f)
                curveTo(11.73f, 7.68f, 13.58f, 7.92f, 14.83f, 9.16f)
                lineTo(16.24f, 7.75f)
                curveTo(15.07f, 6.58f, 13.54f, 6.0f, 12.0f, 6.0f)
                moveTo(12.82f, 11.0f)
                lineTo(15.82f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.18f)
                lineTo(20.0f, 18.18f)
                verticalLineTo(13.0f)
                curveTo(20.0f, 11.9f, 19.11f, 11.0f, 18.0f, 11.0f)
                moveTo(6.0f, 14.0f)
                horizontalLineTo(10.73f)
                lineTo(13.73f, 17.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _creditCardWirelessOff!!
    }

private var _creditCardWirelessOff: ImageVector? = null
