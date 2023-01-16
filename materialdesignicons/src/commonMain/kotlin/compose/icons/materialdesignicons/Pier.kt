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

public val MaterialDesignIcons.Pier: ImageVector
    get() {
        if (_pier != null) {
            return _pier!!
        }
        _pier = Builder(name = "Pier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                curveTo(18.6f, 18.0f, 17.2f, 17.5f, 16.0f, 16.7f)
                curveTo(13.6f, 18.4f, 10.4f, 18.4f, 8.0f, 16.7f)
                curveTo(6.8f, 17.5f, 5.4f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                curveTo(5.4f, 20.0f, 6.7f, 19.6f, 8.0f, 19.0f)
                curveTo(10.5f, 20.3f, 13.5f, 20.3f, 16.0f, 19.0f)
                curveTo(17.3f, 19.6f, 18.6f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.9f)
                curveTo(18.3f, 16.8f, 17.6f, 16.6f, 17.0f, 16.2f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                curveTo(11.3f, 17.0f, 10.7f, 16.9f, 10.0f, 16.7f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.9f)
                curveTo(4.7f, 17.0f, 4.3f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _pier!!
    }

private var _pier: ImageVector? = null
