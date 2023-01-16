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

public val MaterialDesignIcons.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                lineTo(17.0f, 20.0f)
                verticalLineTo(4.0f)
                lineTo(12.0f, 8.0f)
                moveTo(21.5f, 12.0f)
                curveTo(21.5f, 13.71f, 20.54f, 15.26f, 19.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(20.53f, 8.75f, 21.5f, 10.3f, 21.5f, 12.0f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null
