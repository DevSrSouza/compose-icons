package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.WalletCreditCard: ImageVector
    get() {
        if (_walletCreditCard != null) {
            return _walletCreditCard!!
        }
        _walletCreditCard = Builder(name = "WalletCreditCard", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3557f, 2.5953f)
                curveTo(14.4445f, 2.4826f, 14.6098f, 2.4676f, 14.7175f, 2.5625f)
                lineTo(15.6385f, 3.3747f)
                lineTo(12.7383f, 7.0f)
                horizontalLineTo(14.6592f)
                lineTo(16.7648f, 4.368f)
                lineTo(18.417f, 5.8249f)
                curveTo(18.5186f, 5.9145f, 18.5304f, 6.0687f, 18.4435f, 6.1727f)
                lineTo(17.7523f, 7.0f)
                horizontalLineTo(19.6965f)
                curveTo(20.1905f, 6.2789f, 20.0778f, 5.2895f, 19.4091f, 4.6998f)
                lineTo(15.7096f, 1.4375f)
                curveTo(14.9561f, 0.7731f, 13.7991f, 0.878f, 13.1775f, 1.6671f)
                lineTo(8.9762f, 7.0f)
                horizontalLineTo(10.8858f)
                lineTo(14.3557f, 2.5953f)
                close()
                moveTo(16.25f, 14.0f)
                curveTo(15.8358f, 14.0f, 15.5f, 14.3358f, 15.5f, 14.75f)
                curveTo(15.5f, 15.1642f, 15.8358f, 15.5f, 16.25f, 15.5f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 15.5f, 19.0f, 15.1642f, 19.0f, 14.75f)
                curveTo(19.0f, 14.3358f, 18.6642f, 14.0f, 18.25f, 14.0f)
                horizontalLineTo(16.25f)
                close()
                moveTo(4.5f, 7.25f)
                curveTo(4.5f, 6.8358f, 4.8358f, 6.5f, 5.25f, 6.5f)
                horizontalLineTo(8.3784f)
                lineTo(9.57f, 5.0f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 5.0f, 3.0f, 6.0074f, 3.0f, 7.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(20.0449f, 21.0f, 21.5f, 19.5449f, 21.5f, 17.75f)
                verticalLineTo(11.25f)
                curveTo(21.5f, 9.4551f, 20.0449f, 8.0f, 18.25f, 8.0f)
                lineTo(5.25f, 8.0f)
                curveTo(4.8358f, 8.0f, 4.5f, 7.6642f, 4.5f, 7.25f)
                close()
                moveTo(4.5f, 17.75f)
                verticalLineTo(9.372f)
                curveTo(4.7346f, 9.4549f, 4.987f, 9.5f, 5.25f, 9.5f)
                horizontalLineTo(18.25f)
                curveTo(19.2165f, 9.5f, 20.0f, 10.2835f, 20.0f, 11.25f)
                verticalLineTo(17.75f)
                curveTo(20.0f, 18.7165f, 19.2165f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                close()
            }
        }
        .build()
        return _walletCreditCard!!
    }

private var _walletCreditCard: ImageVector? = null
