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

public val MaterialDesignIcons.MenuSwap: ImageVector
    get() {
        if (_menuSwap != null) {
            return _menuSwap!!
        }
        _menuSwap = Builder(name = "MenuSwap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineTo(7.0f, 11.0f)
                horizontalLineTo(17.0f)
                lineTo(12.0f, 6.0f)
                moveTo(7.0f, 13.0f)
                lineTo(12.0f, 18.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _menuSwap!!
    }

private var _menuSwap: ImageVector? = null
