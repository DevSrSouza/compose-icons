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

public val MaterialDesignIcons.KeyboardEsc: ImageVector
    get() {
        if (_keyboardEsc != null) {
            return _keyboardEsc!!
        }
        _keyboardEsc = Builder(name = "KeyboardEsc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(7.0f)
                moveTo(11.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                curveTo(14.11f, 11.0f, 15.0f, 11.9f, 15.0f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 16.11f, 14.11f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                curveTo(9.9f, 13.0f, 9.0f, 12.11f, 9.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 7.9f, 9.9f, 7.0f, 11.0f, 7.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 7.0f, 23.0f, 7.9f, 23.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 16.11f, 22.11f, 17.0f, 21.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(17.9f, 17.0f, 17.0f, 16.11f, 17.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(17.0f, 7.9f, 17.9f, 7.0f, 19.0f, 7.0f)
                close()
            }
        }
        .build()
        return _keyboardEsc!!
    }

private var _keyboardEsc: ImageVector? = null
