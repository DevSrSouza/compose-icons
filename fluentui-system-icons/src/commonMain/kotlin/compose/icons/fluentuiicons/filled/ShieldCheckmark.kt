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

public val FilledGroup.ShieldCheckmark: ImageVector
    get() {
        if (_shieldCheckmark != null) {
            return _shieldCheckmark!!
        }
        _shieldCheckmark = Builder(name = "ShieldCheckmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 5.3358f, 3.3358f, 5.0f, 3.75f, 5.0f)
                curveTo(6.4134f, 5.0f, 9.008f, 4.0565f, 11.55f, 2.15f)
                curveTo(11.8167f, 1.95f, 12.1833f, 1.95f, 12.45f, 2.15f)
                curveTo(14.992f, 4.0565f, 17.5866f, 5.0f, 20.25f, 5.0f)
                curveTo(20.6642f, 5.0f, 21.0f, 5.3358f, 21.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 11.3381f, 20.9865f, 11.6701f, 20.9595f, 11.9961f)
                curveTo(19.9577f, 11.3651f, 18.7715f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 19.151f, 11.6156f, 20.6583f, 12.6297f, 21.8048f)
                curveTo(12.5126f, 21.8531f, 12.3944f, 21.9007f, 12.2749f, 21.9478f)
                curveTo(12.0982f, 22.0174f, 11.9018f, 22.0174f, 11.7251f, 21.9478f)
                curveTo(5.9576f, 19.6757f, 3.0f, 16.0012f, 3.0f, 11.0f)
                verticalLineTo(5.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(20.8536f, 15.1464f)
                curveTo(21.0488f, 15.3417f, 21.0488f, 15.6583f, 20.8536f, 15.8536f)
                lineTo(16.8536f, 19.8536f)
                curveTo(16.6583f, 20.0488f, 16.3417f, 20.0488f, 16.1464f, 19.8536f)
                lineTo(14.1464f, 17.8536f)
                curveTo(13.9512f, 17.6583f, 13.9512f, 17.3417f, 14.1464f, 17.1464f)
                curveTo(14.3417f, 16.9512f, 14.6583f, 16.9512f, 14.8536f, 17.1464f)
                lineTo(16.5f, 18.7929f)
                lineTo(20.1464f, 15.1464f)
                curveTo(20.3417f, 14.9512f, 20.6583f, 14.9512f, 20.8536f, 15.1464f)
                close()
            }
        }
        .build()
        return _shieldCheckmark!!
    }

private var _shieldCheckmark: ImageVector? = null
