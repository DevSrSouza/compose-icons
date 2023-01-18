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

public val FilledGroup.CubeQuick: ImageVector
    get() {
        if (_cubeQuick != null) {
            return _cubeQuick!!
        }
        _cubeQuick = Builder(name = "CubeQuick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5978f, 6.2151f)
                curveTo(16.1651f, 5.9283f, 16.8349f, 5.9283f, 17.4022f, 6.2151f)
                lineTo(20.9022f, 7.9842f)
                curveTo(21.5755f, 8.3245f, 22.0f, 9.0147f, 22.0f, 9.7691f)
                verticalLineTo(14.2341f)
                curveTo(22.0f, 14.9885f, 21.5755f, 15.6787f, 20.9022f, 16.019f)
                lineTo(17.4022f, 17.7881f)
                curveTo(16.8349f, 18.0749f, 16.1651f, 18.0749f, 15.5978f, 17.7881f)
                lineTo(12.0978f, 16.019f)
                curveTo(11.4245f, 15.6787f, 11.0f, 14.9885f, 11.0f, 14.2341f)
                verticalLineTo(9.7691f)
                curveTo(11.0f, 9.0147f, 11.4245f, 8.3245f, 12.0978f, 7.9842f)
                lineTo(15.5978f, 6.2151f)
                close()
                moveTo(13.5817f, 10.4051f)
                curveTo(13.3939f, 10.7743f, 13.5408f, 11.2258f, 13.91f, 11.4137f)
                lineTo(15.7502f, 12.3502f)
                verticalLineTo(14.2527f)
                curveTo(15.7502f, 14.6669f, 16.0859f, 15.0027f, 16.5002f, 15.0027f)
                curveTo(16.9144f, 15.0027f, 17.2502f, 14.6669f, 17.2502f, 14.2527f)
                verticalLineTo(12.3502f)
                lineTo(19.0903f, 11.4137f)
                curveTo(19.4595f, 11.2258f, 19.6064f, 10.7743f, 19.4186f, 10.4051f)
                curveTo(19.2307f, 10.036f, 18.7792f, 9.889f, 18.41f, 10.0769f)
                lineTo(16.5002f, 11.0488f)
                lineTo(14.5903f, 10.0769f)
                curveTo(14.2212f, 9.889f, 13.7696f, 10.036f, 13.5817f, 10.4051f)
                close()
                moveTo(4.75f, 6.9951f)
                curveTo(4.3358f, 6.9951f, 4.0f, 7.3309f, 4.0f, 7.7451f)
                curveTo(4.0f, 8.1593f, 4.3358f, 8.4951f, 4.75f, 8.4951f)
                horizontalLineTo(9.25f)
                curveTo(9.6642f, 8.4951f, 10.0f, 8.1593f, 10.0f, 7.7451f)
                curveTo(10.0f, 7.3309f, 9.6642f, 6.9951f, 9.25f, 6.9951f)
                horizontalLineTo(4.75f)
                close()
                moveTo(2.75f, 10.9951f)
                curveTo(2.3358f, 10.9951f, 2.0f, 11.3309f, 2.0f, 11.7451f)
                curveTo(2.0f, 12.1593f, 2.3358f, 12.4951f, 2.75f, 12.4951f)
                horizontalLineTo(7.25f)
                curveTo(7.6642f, 12.4951f, 8.0f, 12.1593f, 8.0f, 11.7451f)
                curveTo(8.0f, 11.3309f, 7.6642f, 10.9951f, 7.25f, 10.9951f)
                horizontalLineTo(2.75f)
                close()
                moveTo(4.0f, 15.7451f)
                curveTo(4.0f, 15.3309f, 4.3358f, 14.9951f, 4.75f, 14.9951f)
                horizontalLineTo(9.25f)
                curveTo(9.6642f, 14.9951f, 10.0f, 15.3309f, 10.0f, 15.7451f)
                curveTo(10.0f, 16.1593f, 9.6642f, 16.4951f, 9.25f, 16.4951f)
                horizontalLineTo(4.75f)
                curveTo(4.3358f, 16.4951f, 4.0f, 16.1593f, 4.0f, 15.7451f)
                close()
            }
        }
        .build()
        return _cubeQuick!!
    }

private var _cubeQuick: ImageVector? = null
