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

public val MaterialDesignIcons.MenuSwapOutline: ImageVector
    get() {
        if (_menuSwapOutline != null) {
            return _menuSwapOutline!!
        }
        _menuSwapOutline = Builder(name = "MenuSwapOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.5f)
                lineTo(6.0f, 9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.5f)
                lineTo(12.0f, 3.5f)
                moveTo(12.0f, 6.33f)
                lineTo(14.67f, 9.0f)
                horizontalLineTo(9.33f)
                lineTo(12.0f, 6.33f)
                moveTo(6.0f, 13.0f)
                verticalLineTo(14.5f)
                lineTo(12.0f, 20.5f)
                lineTo(18.0f, 14.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                moveTo(9.33f, 15.0f)
                horizontalLineTo(14.67f)
                lineTo(12.0f, 17.67f)
                lineTo(9.33f, 15.0f)
                close()
            }
        }
        .build()
        return _menuSwapOutline!!
    }

private var _menuSwapOutline: ImageVector? = null
