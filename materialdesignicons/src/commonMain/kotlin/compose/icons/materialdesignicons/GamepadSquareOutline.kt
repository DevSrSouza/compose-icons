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

public val MaterialDesignIcons.GamepadSquareOutline: ImageVector
    get() {
        if (_gamepadSquareOutline != null) {
            return _gamepadSquareOutline!!
        }
        _gamepadSquareOutline = Builder(name = "GamepadSquareOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(21.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                moveTo(14.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 12.0f)
                moveTo(18.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 9.0f)
                close()
            }
        }
        .build()
        return _gamepadSquareOutline!!
    }

private var _gamepadSquareOutline: ImageVector? = null
