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

public val MaterialDesignIcons.MenuRightOutline: ImageVector
    get() {
        if (_menuRightOutline != null) {
            return _menuRightOutline!!
        }
        _menuRightOutline = Builder(name = "MenuRightOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                horizontalLineTo(10.5f)
                lineTo(16.5f, 12.0f)
                lineTo(10.5f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                moveTo(13.67f, 12.0f)
                lineTo(11.0f, 9.33f)
                verticalLineTo(14.67f)
                lineTo(13.67f, 12.0f)
                close()
            }
        }
        .build()
        return _menuRightOutline!!
    }

private var _menuRightOutline: ImageVector? = null
