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

public val MaterialDesignIcons.GamepadSquare: ImageVector
    get() {
        if (_gamepadSquare != null) {
            return _gamepadSquare!!
        }
        _gamepadSquare = Builder(name = "GamepadSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 8.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 18.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 16.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 6.0f)
                moveTo(11.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                moveTo(15.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 15.0f)
                moveTo(19.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 12.0f)
                close()
            }
        }
        .build()
        return _gamepadSquare!!
    }

private var _gamepadSquare: ImageVector? = null
