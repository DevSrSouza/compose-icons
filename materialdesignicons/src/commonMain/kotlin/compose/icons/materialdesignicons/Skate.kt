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

public val MaterialDesignIcons.Skate: ImageVector
    get() {
        if (_skate != null) {
            return _skate!!
        }
        _skate = Builder(name = "Skate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.95f, 17.0f)
                curveTo(20.7f, 18.69f, 19.26f, 20.0f, 17.5f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                curveTo(18.93f, 16.72f, 19.26f, 14.04f, 18.53f, 12.95f)
                curveTo(17.56f, 10.9f, 14.83f, 10.56f, 12.93f, 10.05f)
                curveTo(12.0f, 10.0f, 11.0f, 9.0f, 10.84f, 8.0f)
                horizontalLineTo(8.0f)
                curveTo(7.72f, 8.0f, 7.5f, 7.78f, 7.5f, 7.5f)
                curveTo(7.5f, 7.22f, 7.72f, 7.0f, 8.0f, 7.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.72f, 6.0f, 7.5f, 5.78f, 7.5f, 5.5f)
                curveTo(7.5f, 5.22f, 7.72f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.03f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.5f)
                curveTo(20.36f, 22.0f, 22.72f, 19.8f, 23.0f, 17.0f)
                horizontalLineTo(20.95f)
                moveTo(14.0f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _skate!!
    }

private var _skate: ImageVector? = null
