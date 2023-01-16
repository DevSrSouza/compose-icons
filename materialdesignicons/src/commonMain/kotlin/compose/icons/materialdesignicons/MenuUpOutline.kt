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

public val MaterialDesignIcons.MenuUpOutline: ImageVector
    get() {
        if (_menuUpOutline != null) {
            return _menuUpOutline!!
        }
        _menuUpOutline = Builder(name = "MenuUpOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                verticalLineTo(14.5f)
                lineTo(12.0f, 8.5f)
                lineTo(6.0f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                moveTo(12.0f, 11.33f)
                lineTo(14.67f, 14.0f)
                horizontalLineTo(9.33f)
                lineTo(12.0f, 11.33f)
                close()
            }
        }
        .build()
        return _menuUpOutline!!
    }

private var _menuUpOutline: ImageVector? = null
