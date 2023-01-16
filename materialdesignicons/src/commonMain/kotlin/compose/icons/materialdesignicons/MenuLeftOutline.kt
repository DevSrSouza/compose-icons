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

public val MaterialDesignIcons.MenuLeftOutline: ImageVector
    get() {
        if (_menuLeftOutline != null) {
            return _menuLeftOutline!!
        }
        _menuLeftOutline = Builder(name = "MenuLeftOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                horizontalLineTo(13.5f)
                lineTo(7.5f, 12.0f)
                lineTo(13.5f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                moveTo(10.33f, 12.0f)
                lineTo(13.0f, 14.67f)
                verticalLineTo(9.33f)
                lineTo(10.33f, 12.0f)
                close()
            }
        }
        .build()
        return _menuLeftOutline!!
    }

private var _menuLeftOutline: ImageVector? = null
