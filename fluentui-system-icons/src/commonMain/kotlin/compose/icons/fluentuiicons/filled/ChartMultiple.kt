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

public val FilledGroup.ChartMultiple: ImageVector
    get() {
        if (_chartMultiple != null) {
            return _chartMultiple!!
        }
        _chartMultiple = Builder(name = "ChartMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.5007f)
                curveTo(19.0f, 12.8193f, 19.2726f, 12.2016f, 19.7146f, 11.7507f)
                horizontalLineTo(13.0f)
                curveTo(12.0335f, 11.7507f, 11.25f, 10.9672f, 11.25f, 10.0007f)
                verticalLineTo(2.0039f)
                curveTo(6.1189f, 2.1365f, 2.0f, 6.3376f, 2.0f, 11.5007f)
                curveTo(2.0f, 16.5797f, 5.9857f, 20.7277f, 11.0f, 20.9877f)
                verticalLineTo(19.5007f)
                curveTo(11.0f, 18.12f, 12.1193f, 17.0007f, 13.5f, 17.0007f)
                curveTo(14.0628f, 17.0007f, 14.5822f, 17.1867f, 15.0f, 17.5005f)
                verticalLineTo(16.5007f)
                curveTo(15.0f, 15.12f, 16.1193f, 14.0007f, 17.5f, 14.0007f)
                curveTo(18.0628f, 14.0007f, 18.5822f, 14.1867f, 19.0f, 14.5005f)
                verticalLineTo(13.5007f)
                close()
                moveTo(12.75f, 2.0822f)
                verticalLineTo(10.0007f)
                curveTo(12.75f, 10.1388f, 12.8619f, 10.2507f, 13.0f, 10.2507f)
                horizontalLineTo(20.9185f)
                curveTo(20.3603f, 6.0038f, 16.9969f, 2.6404f, 12.75f, 2.0822f)
                close()
                moveTo(21.5f, 12.001f)
                curveTo(20.6716f, 12.001f, 20.0f, 12.6725f, 20.0f, 13.501f)
                verticalLineTo(21.501f)
                curveTo(20.0f, 22.3294f, 20.6716f, 23.001f, 21.5f, 23.001f)
                curveTo(22.3284f, 23.001f, 23.0f, 22.3294f, 23.0f, 21.501f)
                verticalLineTo(13.501f)
                curveTo(23.0f, 12.6725f, 22.3284f, 12.001f, 21.5f, 12.001f)
                close()
                moveTo(13.5f, 18.001f)
                curveTo(12.6716f, 18.001f, 12.0f, 18.6726f, 12.0f, 19.501f)
                verticalLineTo(21.501f)
                curveTo(12.0f, 22.3294f, 12.6716f, 23.001f, 13.5f, 23.001f)
                curveTo(14.3284f, 23.001f, 15.0f, 22.3294f, 15.0f, 21.501f)
                verticalLineTo(19.501f)
                curveTo(15.0f, 18.6726f, 14.3284f, 18.001f, 13.5f, 18.001f)
                close()
                moveTo(16.0f, 16.501f)
                curveTo(16.0f, 15.6725f, 16.6716f, 15.001f, 17.5f, 15.001f)
                curveTo(18.3284f, 15.001f, 19.0f, 15.6725f, 19.0f, 16.501f)
                verticalLineTo(21.501f)
                curveTo(19.0f, 22.3294f, 18.3284f, 23.001f, 17.5f, 23.001f)
                curveTo(16.6716f, 23.001f, 16.0f, 22.3294f, 16.0f, 21.501f)
                verticalLineTo(16.501f)
                close()
            }
        }
        .build()
        return _chartMultiple!!
    }

private var _chartMultiple: ImageVector? = null
