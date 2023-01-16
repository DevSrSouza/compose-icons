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

public val MaterialDesignIcons.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                curveTo(10.89f, 6.0f, 10.0f, 6.9f, 10.0f, 8.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 18.0f)
                moveTo(12.0f, 16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                moveTo(16.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 13.5f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
