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

public val MaterialDesignIcons.VideoInputScart: ImageVector
    get() {
        if (_videoInputScart != null) {
            return _videoInputScart!!
        }
        _videoInputScart = Builder(name = "VideoInputScart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6f, 2.2f)
                lineTo(17.3f, 2.4f)
                lineTo(13.8f, 4.4f)
                lineTo(13.3f, 3.5f)
                lineTo(2.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1f, 21.0f, 17.0f, 20.1f, 17.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                lineTo(16.8f, 9.6f)
                lineTo(20.3f, 7.6f)
                lineTo(22.1f, 4.8f)
                lineTo(20.6f, 2.2f)
                moveTo(15.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _videoInputScart!!
    }

private var _videoInputScart: ImageVector? = null
