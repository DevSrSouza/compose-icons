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

public val MaterialDesignIcons.GamepadOutline: ImageVector
    get() {
        if (_gamepadOutline != null) {
            return _gamepadOutline!!
        }
        _gamepadOutline = Builder(name = "GamepadOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.5f)
                lineTo(10.5f, 12.0f)
                lineTo(7.5f, 9.0f)
                moveTo(6.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                moveTo(15.0f, 7.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.5f)
                lineTo(12.0f, 10.5f)
                lineTo(15.0f, 7.5f)
                moveTo(11.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                moveTo(9.0f, 16.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.5f)
                lineTo(12.0f, 13.5f)
                lineTo(9.0f, 16.5f)
                moveTo(13.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                moveTo(16.5f, 9.0f)
                lineTo(13.5f, 12.0f)
                lineTo(16.5f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.5f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _gamepadOutline!!
    }

private var _gamepadOutline: ImageVector? = null
