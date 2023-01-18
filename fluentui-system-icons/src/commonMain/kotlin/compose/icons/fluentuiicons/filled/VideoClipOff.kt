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

public val FilledGroup.VideoClipOff: ImageVector
    get() {
        if (_videoClipOff != null) {
            return _videoClipOff!!
        }
        _videoClipOff = Builder(name = "VideoClipOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(2.9218f, 3.9824f)
                curveTo(2.3514f, 4.568f, 2.0f, 5.368f, 2.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(2.0f, 19.5449f, 3.4551f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(19.1079f, 21.0f, 19.4523f, 20.9422f, 19.7743f, 20.8353f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(12.9392f, 14.0001f)
                lineTo(10.6097f, 15.2734f)
                curveTo(10.1099f, 15.5466f, 9.5f, 15.1849f, 9.5f, 14.6153f)
                verticalLineTo(10.5608f)
                lineTo(12.9392f, 14.0001f)
                close()
                moveTo(15.3958f, 11.3411f)
                curveTo(15.8181f, 11.5719f, 15.8978f, 12.1075f, 15.6347f, 12.4533f)
                lineTo(21.8641f, 18.6828f)
                curveTo(21.9525f, 18.3874f, 22.0f, 18.0742f, 22.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 4.4551f, 20.5449f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(6.1816f)
                lineTo(13.4703f, 10.2888f)
                lineTo(15.3958f, 11.3411f)
                close()
            }
        }
        .build()
        return _videoClipOff!!
    }

private var _videoClipOff: ImageVector? = null
