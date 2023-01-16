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

public val MaterialDesignIcons.VideoMarker: ImageVector
    get() {
        if (_videoMarker != null) {
            return _videoMarker!!
        }
        _videoMarker = Builder(name = "VideoMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 16.8f)
                curveTo(4.8f, 16.8f, 4.3f, 16.2f, 4.3f, 15.6f)
                curveTo(4.3f, 14.9f, 4.9f, 14.4f, 5.5f, 14.4f)
                reflectiveCurveTo(6.7f, 15.0f, 6.7f, 15.6f)
                curveTo(6.8f, 16.2f, 6.2f, 16.8f, 5.5f, 16.8f)
                moveTo(5.5f, 12.0f)
                curveTo(3.6f, 12.0f, 2.0f, 13.6f, 2.0f, 15.5f)
                curveTo(2.0f, 18.1f, 5.5f, 22.0f, 5.5f, 22.0f)
                reflectiveCurveTo(9.0f, 18.1f, 9.0f, 15.5f)
                curveTo(9.0f, 13.6f, 7.4f, 12.0f, 5.5f, 12.0f)
                moveTo(4.0f, 6.0f)
                curveTo(3.4f, 6.0f, 3.0f, 6.4f, 3.0f, 7.0f)
                verticalLineTo(10.6f)
                curveTo(3.8f, 10.2f, 4.6f, 10.0f, 5.5f, 10.0f)
                curveTo(8.5f, 10.0f, 11.0f, 12.5f, 11.0f, 15.5f)
                curveTo(11.0f, 16.4f, 10.8f, 17.2f, 10.5f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.6f, 18.0f, 17.0f, 17.6f, 17.0f, 17.0f)
                verticalLineTo(13.5f)
                lineTo(21.0f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17.0f, 10.5f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 6.4f, 16.6f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _videoMarker!!
    }

private var _videoMarker: ImageVector? = null
