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

public val MaterialDesignIcons.MenuDownOutline: ImageVector
    get() {
        if (_menuDownOutline != null) {
            return _menuDownOutline!!
        }
        _menuDownOutline = Builder(name = "MenuDownOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                verticalLineTo(10.5f)
                lineTo(12.0f, 16.5f)
                lineTo(6.0f, 10.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                moveTo(12.0f, 13.67f)
                lineTo(14.67f, 11.0f)
                horizontalLineTo(9.33f)
                lineTo(12.0f, 13.67f)
                close()
            }
        }
        .build()
        return _menuDownOutline!!
    }

private var _menuDownOutline: ImageVector? = null
