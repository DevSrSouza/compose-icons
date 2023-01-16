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

public val MaterialDesignIcons.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                curveTo(18.62f, 14.0f, 17.26f, 13.65f, 16.0f, 13.0f)
                curveTo(13.5f, 14.3f, 10.5f, 14.3f, 8.0f, 13.0f)
                curveTo(6.74f, 13.65f, 5.37f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                curveTo(5.39f, 12.0f, 6.78f, 11.53f, 8.0f, 10.67f)
                curveTo(10.44f, 12.38f, 13.56f, 12.38f, 16.0f, 10.67f)
                curveTo(17.22f, 11.53f, 18.61f, 12.0f, 20.0f, 12.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                curveTo(18.62f, 8.0f, 17.26f, 7.65f, 16.0f, 7.0f)
                curveTo(13.5f, 8.3f, 10.5f, 8.3f, 8.0f, 7.0f)
                curveTo(6.74f, 7.65f, 5.37f, 8.0f, 4.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                curveTo(5.39f, 6.0f, 6.78f, 5.53f, 8.0f, 4.67f)
                curveTo(10.44f, 6.38f, 13.56f, 6.38f, 16.0f, 4.67f)
                curveTo(17.22f, 5.53f, 18.61f, 6.0f, 20.0f, 6.0f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                curveTo(18.62f, 20.0f, 17.26f, 19.65f, 16.0f, 19.0f)
                curveTo(13.5f, 20.3f, 10.5f, 20.3f, 8.0f, 19.0f)
                curveTo(6.74f, 19.65f, 5.37f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                curveTo(5.39f, 18.0f, 6.78f, 17.53f, 8.0f, 16.67f)
                curveTo(10.44f, 18.38f, 13.56f, 18.38f, 16.0f, 16.67f)
                curveTo(17.22f, 17.53f, 18.61f, 18.0f, 20.0f, 18.0f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
