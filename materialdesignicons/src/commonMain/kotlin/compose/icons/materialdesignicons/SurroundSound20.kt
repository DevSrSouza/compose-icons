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

public val MaterialDesignIcons.SurroundSound20: ImageVector
    get() {
        if (_surroundSound20 != null) {
            return _surroundSound20!!
        }
        _surroundSound20 = Builder(name = "SurroundSound20", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 11.0f, 3.0f, 11.9f, 3.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                curveTo(8.1f, 13.0f, 9.0f, 12.1f, 9.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 7.9f, 8.1f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(3.0f)
                moveTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                moveTo(17.0f, 7.0f)
                curveTo(15.9f, 7.0f, 15.0f, 7.9f, 15.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 16.1f, 15.9f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 17.0f, 21.0f, 16.1f, 21.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 7.9f, 20.1f, 7.0f, 19.0f, 7.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _surroundSound20!!
    }

private var _surroundSound20: ImageVector? = null
