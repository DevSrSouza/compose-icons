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

public val MaterialDesignIcons.VideoSwitchOutline: ImageVector
    get() {
        if (_videoSwitchOutline != null) {
            return _videoSwitchOutline!!
        }
        _videoSwitchOutline = Builder(name = "VideoSwitchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                lineTo(15.0f, 12.0f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                lineTo(5.0f, 12.0f)
                lineTo(8.0f, 15.0f)
                verticalLineTo(13.0f)
                moveTo(18.0f, 9.5f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 5.4f, 17.5f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(2.5f, 5.0f, 2.0f, 5.4f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 18.5f, 2.5f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5f, 19.0f, 18.0f, 18.5f, 18.0f, 18.0f)
                verticalLineTo(14.5f)
                lineTo(22.0f, 18.5f)
                verticalLineTo(5.5f)
                lineTo(18.0f, 9.5f)
                moveTo(16.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _videoSwitchOutline!!
    }

private var _videoSwitchOutline: ImageVector? = null
