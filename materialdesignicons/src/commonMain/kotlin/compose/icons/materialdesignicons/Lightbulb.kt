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

public val MaterialDesignIcons.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 9.0f)
                curveTo(5.0f, 11.38f, 6.19f, 13.47f, 8.0f, 14.74f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 18.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 17.0f)
                verticalLineTo(14.74f)
                curveTo(17.81f, 13.47f, 19.0f, 11.38f, 19.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(9.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
