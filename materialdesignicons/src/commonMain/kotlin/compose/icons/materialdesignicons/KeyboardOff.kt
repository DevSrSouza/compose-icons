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

public val MaterialDesignIcons.KeyboardOff: ImageVector
    get() {
        if (_keyboardOff != null) {
            return _keyboardOff!!
        }
        _keyboardOff = Builder(name = "KeyboardOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(15.73f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 19.0f, 2.0f, 18.1f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 6.5f, 2.18f, 6.07f, 2.46f, 5.73f)
                lineTo(1.0f, 4.27f)
                moveTo(19.0f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                moveTo(16.0f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                moveTo(16.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.18f)
                lineTo(11.82f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.18f)
                lineTo(9.82f, 8.0f)
                lineTo(6.82f, 5.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 17.86f, 21.46f, 18.59f, 20.7f, 18.87f)
                lineTo(14.82f, 13.0f)
                horizontalLineTo(16.0f)
                moveTo(8.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.73f)
                lineTo(11.73f, 15.0f)
                horizontalLineTo(8.0f)
                moveTo(5.0f, 10.0f)
                horizontalLineTo(6.73f)
                lineTo(5.0f, 8.27f)
                verticalLineTo(10.0f)
                moveTo(7.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                moveTo(8.0f, 13.0f)
                horizontalLineTo(9.73f)
                lineTo(8.0f, 11.27f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _keyboardOff!!
    }

private var _keyboardOff: ImageVector? = null
