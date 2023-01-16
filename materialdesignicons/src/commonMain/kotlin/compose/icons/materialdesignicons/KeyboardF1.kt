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

public val MaterialDesignIcons.KeyboardF1: ImageVector
    get() {
        if (_keyboardF1 != null) {
            return _keyboardF1!!
        }
        _keyboardF1 = Builder(name = "KeyboardF1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                moveTo(14.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _keyboardF1!!
    }

private var _keyboardF1: ImageVector? = null
