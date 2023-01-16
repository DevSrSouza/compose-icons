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

public val MaterialDesignIcons.VideoHighDefinition: ImageVector
    get() {
        if (_videoHighDefinition != null) {
            return _videoHighDefinition!!
        }
        _videoHighDefinition = Builder(name = "VideoHighDefinition", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 14.3f, 13.8f, 14.5f, 13.5f, 14.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(13.5f)
                curveTo(13.8f, 9.5f, 14.0f, 9.7f, 14.0f, 10.0f)
                moveTo(17.0f, 10.5f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 6.4f, 16.6f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4f, 6.0f, 3.0f, 6.4f, 3.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 17.6f, 3.4f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.6f, 18.0f, 17.0f, 17.6f, 17.0f, 17.0f)
                verticalLineTo(13.5f)
                lineTo(21.0f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17.0f, 10.5f)
                moveTo(9.5f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.8f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.2f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(16.0f)
                moveTo(15.5f, 14.5f)
                curveTo(15.5f, 15.3f, 14.8f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                curveTo(14.8f, 8.0f, 15.5f, 8.7f, 15.5f, 9.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _videoHighDefinition!!
    }

private var _videoHighDefinition: ImageVector? = null
