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

public val MaterialDesignIcons.Shore: ImageVector
    get() {
        if (_shore != null) {
            return _shore!!
        }
        _shore = Builder(name = "Shore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                curveTo(18.6f, 14.0f, 17.3f, 13.6f, 16.0f, 13.0f)
                curveTo(13.5f, 14.3f, 10.5f, 14.3f, 8.0f, 13.0f)
                curveTo(6.7f, 13.6f, 5.4f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                curveTo(5.4f, 12.0f, 6.8f, 11.5f, 8.0f, 10.7f)
                curveTo(10.4f, 12.4f, 13.6f, 12.4f, 16.0f, 10.7f)
                curveTo(17.2f, 11.5f, 18.6f, 12.0f, 20.0f, 12.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                curveTo(18.6f, 8.0f, 17.3f, 7.7f, 16.0f, 7.0f)
                curveTo(13.5f, 8.3f, 10.5f, 8.3f, 8.0f, 7.0f)
                curveTo(6.7f, 7.7f, 5.4f, 8.0f, 4.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                curveTo(5.4f, 6.0f, 6.8f, 5.5f, 8.0f, 4.7f)
                curveTo(10.4f, 6.4f, 13.6f, 6.4f, 16.0f, 4.7f)
                curveTo(17.2f, 5.5f, 18.6f, 6.0f, 20.0f, 6.0f)
                moveTo(22.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return _shore!!
    }

private var _shore: ImageVector? = null
