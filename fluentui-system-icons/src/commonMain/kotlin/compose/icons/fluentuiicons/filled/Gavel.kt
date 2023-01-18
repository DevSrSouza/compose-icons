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

public val FilledGroup.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7285f, 2.7118f)
                curveTo(11.7062f, 1.7342f, 13.326f, 1.8613f, 14.1392f, 2.9794f)
                lineTo(14.4596f, 3.4199f)
                lineTo(7.9864f, 9.8931f)
                lineTo(7.6065f, 9.6398f)
                curveTo(6.4251f, 8.8523f, 6.2596f, 7.1807f, 7.2636f, 6.1767f)
                lineTo(10.7285f, 2.7118f)
                close()
                moveTo(9.2592f, 10.7416f)
                lineTo(11.8207f, 12.4493f)
                curveTo(11.9075f, 12.5072f, 11.9813f, 12.5826f, 12.0374f, 12.6706f)
                lineTo(13.2708f, 14.6088f)
                lineTo(19.2825f, 8.597f)
                lineTo(17.1328f, 7.0336f)
                curveTo(17.0694f, 6.9875f, 17.0135f, 6.9317f, 16.9674f, 6.8682f)
                lineTo(15.3528f, 4.6481f)
                lineTo(9.2592f, 10.7416f)
                close()
                moveTo(14.3635f, 16.3259f)
                lineTo(14.0957f, 15.9052f)
                lineTo(20.5106f, 9.4902f)
                lineTo(21.0216f, 9.8618f)
                curveTo(22.1397f, 10.675f, 22.2668f, 12.2948f, 21.2892f, 13.2725f)
                lineTo(17.8527f, 16.709f)
                curveTo(16.8349f, 17.7268f, 15.1363f, 17.5403f, 14.3635f, 16.3259f)
                close()
                moveTo(9.341f, 12.2986f)
                lineTo(3.2682f, 18.257f)
                curveTo(2.5699f, 18.9421f, 2.5646f, 20.0653f, 3.2564f, 20.7569f)
                curveTo(3.9435f, 21.4439f, 5.0573f, 21.4438f, 5.7444f, 20.7568f)
                lineTo(11.8291f, 14.672f)
                lineTo(11.0392f, 13.4308f)
                lineTo(9.341f, 12.2986f)
                close()
                moveTo(14.75f, 19.0009f)
                curveTo(14.3358f, 19.0009f, 14.0f, 19.3366f, 14.0f, 19.7509f)
                curveTo(14.0f, 20.1651f, 14.3358f, 20.5009f, 14.75f, 20.5009f)
                horizontalLineTo(12.75f)
                curveTo(12.3358f, 20.5009f, 12.0f, 20.8366f, 12.0f, 21.2509f)
                curveTo(12.0f, 21.6651f, 12.3358f, 22.0009f, 12.75f, 22.0009f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 22.0009f, 22.0f, 21.6651f, 22.0f, 21.2509f)
                curveTo(22.0f, 20.8366f, 21.6642f, 20.5009f, 21.25f, 20.5009f)
                horizontalLineTo(19.25f)
                curveTo(19.6642f, 20.5009f, 20.0f, 20.1651f, 20.0f, 19.7509f)
                curveTo(20.0f, 19.3366f, 19.6642f, 19.0009f, 19.25f, 19.0009f)
                horizontalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
