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

public val MaterialDesignIcons.KeyboardOffOutline: ImageVector
    get() {
        if (_keyboardOffOutline != null) {
            return _keyboardOffOutline!!
        }
        _keyboardOffOutline = Builder(name = "KeyboardOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.47f, 5.74f)
                curveTo(2.18f, 6.08f, 2.0f, 6.5f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 19.0f)
                horizontalLineTo(15.73f)
                lineTo(18.73f, 22.0f)
                lineTo(20.0f, 20.72f)
                lineTo(2.28f, 3.0f)
                lineTo(1.0f, 4.27f)
                moveTo(4.0f, 17.0f)
                verticalLineTo(7.27f)
                lineTo(5.0f, 8.27f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.73f)
                lineTo(8.0f, 11.27f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.73f)
                lineTo(10.73f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.73f)
                lineTo(13.73f, 17.0f)
                horizontalLineTo(4.0f)
                moveTo(5.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                moveTo(17.0f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                moveTo(19.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                moveTo(14.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.83f)
                lineTo(14.0f, 12.17f)
                verticalLineTo(11.0f)
                moveTo(13.0f, 10.0f)
                horizontalLineTo(11.83f)
                lineTo(11.0f, 9.17f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                moveTo(22.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 17.86f, 21.45f, 18.58f, 20.7f, 18.87f)
                lineTo(18.83f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.83f)
                lineTo(6.83f, 5.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 7.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _keyboardOffOutline!!
    }

private var _keyboardOffOutline: ImageVector? = null
