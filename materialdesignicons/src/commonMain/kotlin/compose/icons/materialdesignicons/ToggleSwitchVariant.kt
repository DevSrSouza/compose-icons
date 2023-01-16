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

public val MaterialDesignIcons.ToggleSwitchVariant: ImageVector
    get() {
        if (_toggleSwitchVariant != null) {
            return _toggleSwitchVariant!!
        }
        _toggleSwitchVariant = Builder(name = "ToggleSwitchVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4f, 1.6f)
                curveTo(18.0f, 1.2f, 17.5f, 1.0f, 17.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveTo(6.5f, 1.0f, 6.0f, 1.2f, 5.6f, 1.6f)
                curveTo(5.2f, 2.0f, 5.0f, 2.5f, 5.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.5f, 5.2f, 22.0f, 5.6f, 22.4f)
                curveTo(6.0f, 22.8f, 6.5f, 23.0f, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5f, 23.0f, 18.0f, 22.8f, 18.4f, 22.4f)
                curveTo(18.8f, 22.0f, 19.0f, 21.5f, 19.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 2.5f, 18.8f, 2.0f, 18.4f, 1.6f)
                moveTo(16.0f, 7.0f)
                curveTo(16.0f, 7.6f, 15.6f, 8.0f, 15.0f, 8.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4f, 8.0f, 8.0f, 7.6f, 8.0f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(8.0f, 4.4f, 8.4f, 4.0f, 9.0f, 4.0f)
                horizontalLineTo(15.0f)
                curveTo(15.6f, 4.0f, 16.0f, 4.4f, 16.0f, 5.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _toggleSwitchVariant!!
    }

private var _toggleSwitchVariant: ImageVector? = null
