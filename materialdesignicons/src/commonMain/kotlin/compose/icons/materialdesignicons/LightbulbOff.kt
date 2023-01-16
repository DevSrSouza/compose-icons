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

public val MaterialDesignIcons.LightbulbOff: ImageVector
    get() {
        if (_lightbulbOff != null) {
            return _lightbulbOff!!
        }
        _lightbulbOff = Builder(name = "LightbulbOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.76f, 2.0f, 7.78f, 3.05f, 6.5f, 4.68f)
                lineTo(16.31f, 14.5f)
                curveTo(17.94f, 13.21f, 19.0f, 11.24f, 19.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(3.28f, 4.0f)
                lineTo(2.0f, 5.27f)
                lineTo(5.04f, 8.3f)
                curveTo(5.0f, 8.53f, 5.0f, 8.76f, 5.0f, 9.0f)
                curveTo(5.0f, 11.38f, 6.19f, 13.47f, 8.0f, 14.74f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 18.0f)
                horizontalLineTo(14.73f)
                lineTo(18.73f, 22.0f)
                lineTo(20.0f, 20.72f)
                lineTo(3.28f, 4.0f)
                moveTo(9.0f, 20.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _lightbulbOff!!
    }

private var _lightbulbOff: ImageVector? = null
