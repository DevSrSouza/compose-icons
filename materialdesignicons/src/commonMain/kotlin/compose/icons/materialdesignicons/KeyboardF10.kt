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

public val MaterialDesignIcons.KeyboardF10: ImageVector
    get() {
        if (_keyboardF10 != null) {
            return _keyboardF10!!
        }
        _keyboardF10 = Builder(name = "KeyboardF10", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                moveTo(18.0f, 7.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 16.11f, 21.11f, 17.0f, 20.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(16.9f, 17.0f, 16.0f, 16.11f, 16.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(16.0f, 7.9f, 16.9f, 7.0f, 18.0f, 7.0f)
                moveTo(18.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _keyboardF10!!
    }

private var _keyboardF10: ImageVector? = null
