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

public val MaterialDesignIcons.VideoInputSvideo: ImageVector
    get() {
        if (_videoInputSvideo != null) {
            return _videoInputSvideo!!
        }
        _videoInputSvideo = Builder(name = "VideoInputSvideo", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 11.5f)
                moveTo(15.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 5.0f)
                horizontalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 8.0f)
                horizontalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 6.5f)
                moveTo(8.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 15.0f)
                moveTo(12.0f, 1.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 1.0f, 12.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 12.0f, 23.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 23.0f, 12.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 12.0f, 1.0f)
                moveTo(12.0f, 21.0f)
                curveTo(7.04f, 21.0f, 3.0f, 16.96f, 3.0f, 12.0f)
                curveTo(3.0f, 7.04f, 7.04f, 3.0f, 12.0f, 3.0f)
                curveTo(16.96f, 3.0f, 21.0f, 7.04f, 21.0f, 12.0f)
                curveTo(21.0f, 16.96f, 16.96f, 21.0f, 12.0f, 21.0f)
                moveTo(17.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 10.0f)
                moveTo(15.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 15.0f)
                close()
            }
        }
        .build()
        return _videoInputSvideo!!
    }

private var _videoInputSvideo: ImageVector? = null
