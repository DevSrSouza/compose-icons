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

public val MaterialDesignIcons.GamepadVariant: ImageVector
    get() {
        if (_gamepadVariant != null) {
            return _gamepadVariant!!
        }
        _gamepadVariant = Builder(name = "GamepadVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                horizontalLineTo(17.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 23.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 17.0f, 18.0f)
                curveTo(15.22f, 18.0f, 13.63f, 17.23f, 12.53f, 16.0f)
                horizontalLineTo(11.47f)
                curveTo(10.37f, 17.23f, 8.78f, 18.0f, 7.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 1.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 7.0f, 6.0f)
                moveTo(6.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                moveTo(15.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 12.0f)
                moveTo(18.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 9.0f)
                close()
            }
        }
        .build()
        return _gamepadVariant!!
    }

private var _gamepadVariant: ImageVector? = null
