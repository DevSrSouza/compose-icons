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

public val MaterialDesignIcons.ToggleSwitchVariantOff: ImageVector
    get() {
        if (_toggleSwitchVariantOff != null) {
            return _toggleSwitchVariantOff!!
        }
        _toggleSwitchVariantOff = Builder(name = "ToggleSwitchVariantOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6f, 1.6f)
                curveTo(6.0f, 1.2f, 6.5f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5f, 1.0f, 18.0f, 1.2f, 18.4f, 1.6f)
                curveTo(18.8f, 2.0f, 19.0f, 2.5f, 19.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.5f, 18.8f, 22.0f, 18.4f, 22.4f)
                curveTo(18.0f, 22.8f, 17.5f, 23.0f, 17.0f, 23.0f)
                horizontalLineTo(7.0f)
                curveTo(6.5f, 23.0f, 6.0f, 22.8f, 5.6f, 22.4f)
                curveTo(5.2f, 22.0f, 5.0f, 21.5f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.5f, 5.2f, 2.0f, 5.6f, 1.6f)
                moveTo(8.0f, 3.0f)
                curveTo(7.4f, 3.0f, 7.0f, 3.4f, 7.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(7.0f, 20.6f, 7.4f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(16.0f)
                curveTo(16.6f, 21.0f, 17.0f, 20.6f, 17.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(17.0f, 3.4f, 16.6f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 17.0f)
                curveTo(8.0f, 16.4f, 8.4f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(15.0f)
                curveTo(15.6f, 16.0f, 16.0f, 16.4f, 16.0f, 17.0f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 19.6f, 15.6f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4f, 20.0f, 8.0f, 19.6f, 8.0f, 19.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _toggleSwitchVariantOff!!
    }

private var _toggleSwitchVariantOff: ImageVector? = null
