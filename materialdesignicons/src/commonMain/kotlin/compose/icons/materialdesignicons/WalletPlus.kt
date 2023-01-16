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

public val MaterialDesignIcons.WalletPlus: ImageVector
    get() {
        if (_walletPlus != null) {
            return _walletPlus!!
        }
        _walletPlus = Builder(name = "WalletPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(3.0f)
                moveTo(9.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                curveTo(10.9f, 18.0f, 10.0f, 17.11f, 10.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(10.0f, 6.9f, 10.89f, 6.0f, 12.0f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(9.0f)
                moveTo(12.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                moveTo(16.0f, 10.5f)
                curveTo(16.83f, 10.5f, 17.5f, 11.17f, 17.5f, 12.0f)
                curveTo(17.5f, 12.83f, 16.83f, 13.5f, 16.0f, 13.5f)
                curveTo(15.17f, 13.5f, 14.5f, 12.83f, 14.5f, 12.0f)
                curveTo(14.5f, 11.17f, 15.17f, 10.5f, 16.0f, 10.5f)
                close()
            }
        }
        .build()
        return _walletPlus!!
    }

private var _walletPlus: ImageVector? = null
