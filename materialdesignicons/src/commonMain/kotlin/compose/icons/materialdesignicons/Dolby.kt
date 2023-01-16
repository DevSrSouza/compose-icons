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

public val MaterialDesignIcons.Dolby: ImageVector
    get() {
        if (_dolby != null) {
            return _dolby!!
        }
        _dolby = Builder(name = "Dolby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                moveTo(6.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                curveTo(8.86f, 7.09f, 11.1f, 9.33f, 11.0f, 12.0f)
                curveTo(11.1f, 14.67f, 8.86f, 16.91f, 6.0f, 17.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(15.14f, 16.91f, 12.9f, 14.67f, 13.0f, 12.0f)
                curveTo(12.9f, 9.33f, 15.14f, 7.09f, 18.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _dolby!!
    }

private var _dolby: ImageVector? = null
