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

public val MaterialDesignIcons.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 1.07f)
                curveTo(7.05f, 1.56f, 4.0f, 4.92f, 4.0f, 9.0f)
                horizontalLineTo(11.0f)
                moveTo(4.0f, 15.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 23.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                moveTo(13.0f, 1.07f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 4.92f, 16.94f, 1.56f, 13.0f, 1.07f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
