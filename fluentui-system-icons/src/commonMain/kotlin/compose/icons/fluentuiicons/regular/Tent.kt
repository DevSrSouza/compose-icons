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

public val RegularGroup.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = Builder(name = "Tent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2197f, 2.2197f)
                curveTo(11.5054f, 1.9339f, 11.9663f, 1.926f, 12.2617f, 2.2017f)
                lineTo(14.0181f, 3.841f)
                curveTo(15.2959f, 5.0336f, 16.7188f, 6.0605f, 18.2532f, 6.8974f)
                curveTo(18.685f, 7.1329f, 18.9802f, 7.5584f, 19.0498f, 8.0453f)
                lineTo(20.4005f, 17.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 17.5f, 22.0f, 17.8358f, 22.0f, 18.25f)
                curveTo(22.0f, 18.6642f, 21.6642f, 19.0f, 21.25f, 19.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 19.0f, 2.0f, 18.6642f, 2.0f, 18.25f)
                curveTo(2.0f, 17.8358f, 2.3358f, 17.5f, 2.75f, 17.5f)
                horizontalLineTo(3.5995f)
                lineTo(4.9553f, 8.0094f)
                curveTo(5.0203f, 7.5546f, 5.2868f, 7.1533f, 5.6807f, 6.9169f)
                curveTo(7.0783f, 6.0784f, 8.3677f, 5.0716f, 9.5202f, 3.9192f)
                lineTo(11.2197f, 2.2197f)
                close()
                moveTo(5.1148f, 17.5f)
                horizontalLineTo(7.2463f)
                curveTo(8.8178f, 15.3333f, 10.005f, 12.9113f, 10.755f, 10.34f)
                lineTo(11.28f, 8.54f)
                curveTo(11.3733f, 8.22f, 11.6667f, 8.0f, 12.0f, 8.0f)
                curveTo(12.3333f, 8.0f, 12.6267f, 8.22f, 12.72f, 8.54f)
                lineTo(13.245f, 10.34f)
                curveTo(13.995f, 12.9113f, 15.1822f, 15.3333f, 16.7537f, 17.5f)
                horizontalLineTo(18.8852f)
                lineTo(17.5649f, 8.2575f)
                curveTo(17.5623f, 8.2391f, 17.5511f, 8.2231f, 17.5349f, 8.2143f)
                curveTo(15.8899f, 7.317f, 14.3645f, 6.2161f, 12.9947f, 4.9376f)
                lineTo(11.768f, 3.7927f)
                lineTo(10.5808f, 4.9798f)
                curveTo(9.3417f, 6.219f, 7.9552f, 7.3015f, 6.4524f, 8.2032f)
                curveTo(6.4458f, 8.2072f, 6.4413f, 8.2139f, 6.4402f, 8.2215f)
                lineTo(5.1148f, 17.5f)
                close()
                moveTo(14.9293f, 17.5f)
                curveTo(13.6793f, 15.61f, 12.6934f, 13.5566f, 12.0f, 11.3967f)
                curveTo(11.3066f, 13.5566f, 10.3207f, 15.61f, 9.0707f, 17.5f)
                horizontalLineTo(14.9293f)
                close()
            }
        }
        .build()
        return _tent!!
    }

private var _tent: ImageVector? = null
