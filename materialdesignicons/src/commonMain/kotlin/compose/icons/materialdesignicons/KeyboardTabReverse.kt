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

public val MaterialDesignIcons.KeyboardTabReverse: ImageVector
    get() {
        if (_keyboardTabReverse != null) {
            return _keyboardTabReverse!!
        }
        _keyboardTabReverse = Builder(name = "KeyboardTabReverse", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                moveTo(11.0f, 6.0f)
                lineTo(5.0f, 12.0f)
                lineTo(11.0f, 18.0f)
                lineTo(12.41f, 16.58f)
                lineTo(8.83f, 13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.83f)
                lineTo(12.41f, 7.41f)
                lineTo(11.0f, 6.0f)
                close()
            }
        }
        .build()
        return _keyboardTabReverse!!
    }

private var _keyboardTabReverse: ImageVector? = null
