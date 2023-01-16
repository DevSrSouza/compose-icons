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

public val MaterialDesignIcons.MenuOpen: ImageVector
    get() {
        if (_menuOpen != null) {
            return _menuOpen!!
        }
        _menuOpen = Builder(name = "MenuOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.61f)
                lineTo(19.59f, 17.0f)
                lineTo(14.58f, 12.0f)
                lineTo(19.59f, 7.0f)
                lineTo(21.0f, 8.39f)
                lineTo(17.44f, 12.0f)
                lineTo(21.0f, 15.61f)
                moveTo(3.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                moveTo(3.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _menuOpen!!
    }

private var _menuOpen: ImageVector? = null
