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

public val MaterialDesignIcons.Waterfall: ImageVector
    get() {
        if (_waterfall != null) {
            return _waterfall!!
        }
        _waterfall = Builder(name = "Waterfall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                curveTo(18.61f, 20.0f, 17.22f, 19.53f, 16.0f, 18.67f)
                curveTo(13.56f, 20.38f, 10.44f, 20.38f, 8.0f, 18.67f)
                curveTo(6.78f, 19.53f, 5.39f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(5.37f, 22.0f, 6.74f, 21.65f, 8.0f, 21.0f)
                curveTo(10.5f, 22.3f, 13.5f, 22.3f, 16.0f, 21.0f)
                curveTo(17.26f, 21.65f, 18.62f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 16.0f)
                curveTo(18.61f, 16.0f, 17.22f, 15.53f, 16.0f, 14.67f)
                curveTo(13.56f, 16.38f, 10.44f, 16.38f, 8.0f, 14.67f)
                curveTo(6.78f, 15.53f, 5.39f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                curveTo(5.37f, 18.0f, 6.74f, 17.65f, 8.0f, 17.0f)
                curveTo(10.5f, 18.3f, 13.5f, 18.3f, 16.0f, 17.0f)
                curveTo(17.26f, 17.65f, 18.62f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                moveTo(22.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                moveTo(9.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                moveTo(13.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _waterfall!!
    }

private var _waterfall: ImageVector? = null
