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

public val MaterialDesignIcons.LightSwitch: ImageVector
    get() {
        if (_lightSwitch != null) {
            return _lightSwitch!!
        }
        _lightSwitch = Builder(name = "LightSwitch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                moveTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                moveTo(19.4f, 1.6f)
                curveTo(19.0f, 1.2f, 18.5f, 1.0f, 18.0f, 1.0f)
                horizontalLineTo(6.0f)
                curveTo(5.5f, 1.0f, 5.0f, 1.2f, 4.6f, 1.6f)
                curveTo(4.2f, 2.0f, 4.0f, 2.5f, 4.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(4.0f, 21.5f, 4.2f, 22.0f, 4.6f, 22.4f)
                curveTo(5.0f, 22.8f, 5.5f, 23.0f, 6.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5f, 23.0f, 19.0f, 22.8f, 19.4f, 22.4f)
                curveTo(19.8f, 22.0f, 20.0f, 21.5f, 20.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(20.0f, 2.5f, 19.8f, 2.0f, 19.4f, 1.6f)
                moveTo(18.0f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _lightSwitch!!
    }

private var _lightSwitch: ImageVector? = null
