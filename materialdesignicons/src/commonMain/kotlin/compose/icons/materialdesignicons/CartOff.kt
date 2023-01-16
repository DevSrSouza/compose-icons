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

public val MaterialDesignIcons.CartOff: ImageVector
    get() {
        if (_cartOff != null) {
            return _cartOff!!
        }
        _cartOff = Builder(name = "CartOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.73f, 22.73f)
                lineTo(1.27f, 1.27f)
                lineTo(0.0f, 2.54f)
                lineTo(4.39f, 6.93f)
                lineTo(6.6f, 11.59f)
                lineTo(5.25f, 14.04f)
                curveTo(5.09f, 14.32f, 5.0f, 14.65f, 5.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(14.46f)
                lineTo(15.84f, 18.38f)
                curveTo(15.34f, 18.74f, 15.0f, 19.33f, 15.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 22.0f)
                curveTo(17.67f, 22.0f, 18.26f, 21.67f, 18.62f, 21.16f)
                lineTo(21.46f, 24.0f)
                lineTo(22.73f, 22.73f)
                moveTo(7.42f, 15.0f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 7.17f, 14.75f)
                lineTo(7.2f, 14.63f)
                lineTo(8.1f, 13.0f)
                horizontalLineTo(10.46f)
                lineTo(12.46f, 15.0f)
                horizontalLineTo(7.42f)
                moveTo(15.55f, 13.0f)
                curveTo(16.3f, 13.0f, 16.96f, 12.59f, 17.3f, 11.97f)
                lineTo(20.88f, 5.5f)
                curveTo(20.96f, 5.34f, 21.0f, 5.17f, 21.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 4.0f)
                horizontalLineTo(6.54f)
                lineTo(15.55f, 13.0f)
                moveTo(7.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cartOff!!
    }

private var _cartOff: ImageVector? = null
