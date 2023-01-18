package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.VideoSecurity: ImageVector
    get() {
        if (_videoSecurity != null) {
            return _videoSecurity!!
        }
        _videoSecurity = Builder(name = "VideoSecurity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(13.75f)
                curveTo(15.5449f, 3.0f, 17.0f, 4.4551f, 17.0f, 6.25f)
                verticalLineTo(12.75f)
                curveTo(17.0f, 14.5449f, 15.5449f, 16.0f, 13.75f, 16.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 16.0f, 2.0f, 14.5449f, 2.0f, 12.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(21.6195f, 3.5973f)
                curveTo(21.8547f, 3.7305f, 22.0f, 3.9798f, 22.0f, 4.25f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 15.0202f, 21.8547f, 15.2695f, 21.6195f, 15.4026f)
                curveTo(21.3844f, 15.5358f, 21.0958f, 15.5321f, 20.8641f, 15.3931f)
                lineTo(18.0f, 13.6746f)
                verticalLineTo(5.3254f)
                lineTo(20.8641f, 3.6069f)
                curveTo(21.0958f, 3.4679f, 21.3844f, 3.4642f, 21.6195f, 3.5973f)
                close()
                moveTo(8.1355f, 17.0f)
                curveTo(7.817f, 18.0143f, 6.8694f, 18.75f, 5.75f, 18.75f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 18.75f, 3.0f, 19.0858f, 3.0f, 19.5f)
                verticalLineTo(21.1f)
                curveTo(3.0f, 21.5971f, 3.4029f, 22.0f, 3.9f, 22.0f)
                horizontalLineTo(5.8438f)
                curveTo(8.8485f, 22.0f, 11.3505f, 19.8473f, 11.8916f, 17.0f)
                horizontalLineTo(8.1355f)
                close()
            }
        }
        .build()
        return _videoSecurity!!
    }

private var _videoSecurity: ImageVector? = null
