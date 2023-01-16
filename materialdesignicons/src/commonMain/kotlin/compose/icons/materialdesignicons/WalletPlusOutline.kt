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

public val MaterialDesignIcons.WalletPlusOutline: ImageVector
    get() {
        if (_walletPlusOutline != null) {
            return _walletPlusOutline!!
        }
        _walletPlusOutline = Builder(name = "WalletPlusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                curveTo(11.9f, 7.0f, 11.0f, 7.9f, 11.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 16.1f, 11.9f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(16.72f)
                curveTo(21.59f, 16.37f, 22.0f, 15.74f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 8.26f, 21.59f, 7.63f, 21.0f, 7.28f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(10.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(16.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 10.5f)
                close()
            }
        }
        .build()
        return _walletPlusOutline!!
    }

private var _walletPlusOutline: ImageVector? = null
