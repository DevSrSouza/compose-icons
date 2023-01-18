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

public val FilledGroup.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = Builder(name = "Tent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2617f, 2.2017f)
                curveTo(11.9663f, 1.926f, 11.5054f, 1.9339f, 11.2197f, 2.2197f)
                lineTo(9.5202f, 3.9192f)
                curveTo(8.3677f, 5.0716f, 7.0783f, 6.0784f, 5.6807f, 6.9169f)
                curveTo(5.2868f, 7.1533f, 5.0203f, 7.5546f, 4.9553f, 8.0094f)
                lineTo(3.5995f, 17.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 17.5f, 2.0f, 17.8358f, 2.0f, 18.25f)
                curveTo(2.0f, 18.6642f, 2.3358f, 19.0f, 2.75f, 19.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 19.0f, 22.0f, 18.6642f, 22.0f, 18.25f)
                curveTo(22.0f, 17.8358f, 21.6642f, 17.5f, 21.25f, 17.5f)
                horizontalLineTo(20.4005f)
                lineTo(19.0498f, 8.0453f)
                curveTo(18.9802f, 7.5584f, 18.685f, 7.1329f, 18.2532f, 6.8974f)
                curveTo(16.7188f, 6.0605f, 15.2959f, 5.0336f, 14.0181f, 3.841f)
                lineTo(12.2617f, 2.2017f)
                close()
                moveTo(14.0962f, 15.1176f)
                curveTo(14.5856f, 15.9879f, 15.2192f, 16.8442f, 15.7451f, 17.5f)
                horizontalLineTo(8.2849f)
                curveTo(8.8202f, 16.842f, 9.4574f, 15.9783f, 9.9157f, 15.0956f)
                curveTo(10.5373f, 13.8982f, 11.2388f, 12.1081f, 11.777f, 10.6458f)
                curveTo(11.8479f, 10.453f, 11.9163f, 10.2652f, 11.9816f, 10.0843f)
                curveTo(12.0409f, 10.2546f, 12.1032f, 10.431f, 12.1681f, 10.6121f)
                curveTo(12.6896f, 12.0679f, 13.3948f, 13.87f, 14.0962f, 15.1176f)
                close()
            }
        }
        .build()
        return _tent!!
    }

private var _tent: ImageVector? = null
