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

public val MaterialDesignIcons.GamepadLeft: ImageVector
    get() {
        if (_gamepadLeft != null) {
            return _gamepadLeft!!
        }
        _gamepadLeft = Builder(name = "GamepadLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                verticalLineTo(7.5f)
                lineTo(12.0f, 10.5f)
                lineTo(15.0f, 7.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                moveTo(2.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.5f)
                lineTo(10.5f, 12.0f)
                lineTo(7.5f, 9.0f)
                horizontalLineTo(2.0f)
                moveTo(16.5f, 9.0f)
                lineTo(13.5f, 12.0f)
                lineTo(16.5f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.5f)
                moveTo(4.0f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 13.5f)
                lineTo(9.0f, 16.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.5f)
                lineTo(12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _gamepadLeft!!
    }

private var _gamepadLeft: ImageVector? = null
