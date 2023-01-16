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

public val MaterialDesignIcons.WalletGiftcard: ImageVector
    get() {
        if (_walletGiftcard != null) {
            return _walletGiftcard!!
        }
        _walletGiftcard = Builder(name = "WalletGiftcard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.08f)
                lineTo(7.0f, 10.83f)
                lineTo(8.62f, 12.0f)
                lineTo(11.0f, 8.76f)
                lineTo(12.0f, 7.4f)
                lineTo(13.0f, 8.76f)
                lineTo(15.38f, 12.0f)
                lineTo(17.0f, 10.83f)
                lineTo(14.92f, 8.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                moveTo(9.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 4.0f)
                moveTo(15.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 4.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(17.82f)
                curveTo(17.93f, 5.69f, 18.0f, 5.35f, 18.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 2.0f)
                curveTo(13.95f, 2.0f, 13.04f, 2.54f, 12.5f, 3.35f)
                lineTo(12.0f, 4.0f)
                lineTo(11.5f, 3.34f)
                curveTo(10.96f, 2.54f, 10.05f, 2.0f, 9.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 5.0f)
                curveTo(6.0f, 5.35f, 6.07f, 5.69f, 6.18f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 6.0f, 2.0f, 6.89f, 2.0f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.11f, 2.89f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 21.0f, 22.0f, 20.11f, 22.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.89f, 21.11f, 6.0f, 20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _walletGiftcard!!
    }

private var _walletGiftcard: ImageVector? = null
