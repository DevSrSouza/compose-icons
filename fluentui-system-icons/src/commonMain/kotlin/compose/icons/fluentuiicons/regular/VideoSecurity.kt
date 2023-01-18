package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.VideoSecurity: ImageVector
    get() {
        if (_videoSecurity != null) {
            return _videoSecurity!!
        }
        _videoSecurity = Builder(name = "VideoSecurity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 3.0f)
                curveTo(3.4551f, 3.0f, 2.0f, 4.4551f, 2.0f, 6.25f)
                verticalLineTo(12.75f)
                curveTo(2.0f, 14.5449f, 3.4551f, 16.0f, 5.25f, 16.0f)
                horizontalLineTo(7.4927f)
                curveTo(7.414f, 16.8414f, 6.7058f, 17.5f, 5.8438f, 17.5f)
                horizontalLineTo(3.25f)
                curveTo(2.8358f, 17.5f, 2.5f, 17.8358f, 2.5f, 18.25f)
                verticalLineTo(21.25f)
                curveTo(2.5f, 21.6642f, 2.8358f, 22.0f, 3.25f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(9.4256f, 22.0f, 12.0f, 19.4256f, 12.0f, 16.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.75f)
                curveTo(15.4385f, 16.0f, 16.8262f, 14.7124f, 16.9849f, 13.0656f)
                lineTo(20.8641f, 15.3931f)
                curveTo(21.0958f, 15.5321f, 21.3844f, 15.5358f, 21.6195f, 15.4026f)
                curveTo(21.8547f, 15.2695f, 22.0f, 15.0202f, 22.0f, 14.75f)
                verticalLineTo(4.25f)
                curveTo(22.0f, 3.9798f, 21.8547f, 3.7305f, 21.6195f, 3.5973f)
                curveTo(21.3844f, 3.4642f, 21.0958f, 3.4679f, 20.8641f, 3.6069f)
                lineTo(16.9849f, 5.9344f)
                curveTo(16.8262f, 4.2876f, 15.4385f, 3.0f, 13.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(17.0f, 7.6747f)
                lineTo(20.5f, 5.5746f)
                verticalLineTo(13.4254f)
                lineTo(17.0f, 11.3254f)
                verticalLineTo(7.6747f)
                close()
                moveTo(6.25f, 20.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.8438f)
                curveTo(7.5345f, 19.0f, 8.9148f, 17.6706f, 8.9962f, 16.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(16.25f)
                curveTo(10.5f, 18.5972f, 8.5972f, 20.5f, 6.25f, 20.5f)
                close()
                moveTo(3.5f, 6.25f)
                curveTo(3.5f, 5.2835f, 4.2835f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(13.75f)
                curveTo(14.7165f, 4.5f, 15.5f, 5.2835f, 15.5f, 6.25f)
                verticalLineTo(12.75f)
                curveTo(15.5f, 13.7165f, 14.7165f, 14.5f, 13.75f, 14.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 14.5f, 3.5f, 13.7165f, 3.5f, 12.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _videoSecurity!!
    }

private var _videoSecurity: ImageVector? = null
