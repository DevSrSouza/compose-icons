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

public val MaterialDesignIcons.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) {
            return _horseshoe!!
        }
        _horseshoe = Builder(name = "Horseshoe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 4.0f, 18.0f, 8.0f, 18.0f, 12.0f)
                curveTo(18.0f, 16.0f, 16.0f, 19.0f, 12.0f, 19.0f)
                curveTo(8.0f, 19.0f, 6.0f, 16.0f, 6.0f, 12.0f)
                curveTo(6.0f, 8.0f, 8.0f, 4.0f, 8.0f, 4.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 4.0f, 2.0f, 8.0f, 2.0f, 14.0f)
                curveTo(2.0f, 19.0f, 7.0f, 23.0f, 12.0f, 23.0f)
                curveTo(17.0f, 23.0f, 22.0f, 19.0f, 22.0f, 14.0f)
                curveTo(22.0f, 8.0f, 19.0f, 4.0f, 19.0f, 4.0f)
                moveTo(4.0f, 13.0f)
                curveTo(3.4f, 13.0f, 3.0f, 12.6f, 3.0f, 12.0f)
                curveTo(3.0f, 11.4f, 3.4f, 11.0f, 4.0f, 11.0f)
                curveTo(4.6f, 11.0f, 5.0f, 11.4f, 5.0f, 12.0f)
                curveTo(5.0f, 12.6f, 4.6f, 13.0f, 4.0f, 13.0f)
                moveTo(6.0f, 19.0f)
                curveTo(5.4f, 19.0f, 5.0f, 18.6f, 5.0f, 18.0f)
                curveTo(5.0f, 17.4f, 5.4f, 17.0f, 6.0f, 17.0f)
                curveTo(6.6f, 17.0f, 7.0f, 17.4f, 7.0f, 18.0f)
                curveTo(7.0f, 18.6f, 6.6f, 19.0f, 6.0f, 19.0f)
                moveTo(12.0f, 22.0f)
                curveTo(11.4f, 22.0f, 11.0f, 21.6f, 11.0f, 21.0f)
                curveTo(11.0f, 20.4f, 11.4f, 20.0f, 12.0f, 20.0f)
                curveTo(12.6f, 20.0f, 13.0f, 20.4f, 13.0f, 21.0f)
                curveTo(13.0f, 21.6f, 12.6f, 22.0f, 12.0f, 22.0f)
                moveTo(18.0f, 19.0f)
                curveTo(17.4f, 19.0f, 17.0f, 18.6f, 17.0f, 18.0f)
                curveTo(17.0f, 17.4f, 17.4f, 17.0f, 18.0f, 17.0f)
                curveTo(18.6f, 17.0f, 19.0f, 17.4f, 19.0f, 18.0f)
                curveTo(19.0f, 18.6f, 18.6f, 19.0f, 18.0f, 19.0f)
                moveTo(20.0f, 13.0f)
                curveTo(19.4f, 13.0f, 19.0f, 12.6f, 19.0f, 12.0f)
                curveTo(19.0f, 11.4f, 19.4f, 11.0f, 20.0f, 11.0f)
                curveTo(20.6f, 11.0f, 21.0f, 11.4f, 21.0f, 12.0f)
                curveTo(21.0f, 12.6f, 20.6f, 13.0f, 20.0f, 13.0f)
                close()
            }
        }
        .build()
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
