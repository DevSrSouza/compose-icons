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

public val MaterialDesignIcons.KeyboardF3: ImageVector
    get() {
        if (_keyboardF3 != null) {
            return _keyboardF3!!
        }
        _keyboardF3 = Builder(name = "KeyboardF3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                moveTo(19.0f, 15.0f)
                curveTo(19.0f, 16.11f, 18.11f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 7.0f, 19.0f, 7.89f, 19.0f, 9.0f)
                verticalLineTo(10.5f)
                curveTo(19.0f, 11.33f, 18.33f, 12.0f, 17.5f, 12.0f)
                curveTo(18.33f, 12.0f, 19.0f, 12.67f, 19.0f, 13.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _keyboardF3!!
    }

private var _keyboardF3: ImageVector? = null
