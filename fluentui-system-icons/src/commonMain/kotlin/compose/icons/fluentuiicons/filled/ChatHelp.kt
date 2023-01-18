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

public val FilledGroup.ChatHelp: ImageVector
    get() {
        if (_chatHelp != null) {
            return _chatHelp!!
        }
        _chatHelp = Builder(name = "ChatHelp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(10.3596f, 22.0f, 8.7752f, 21.6039f, 7.3558f, 20.8583f)
                lineTo(3.0654f, 21.9753f)
                curveTo(2.6111f, 22.0937f, 2.1469f, 21.8213f, 2.0286f, 21.367f)
                curveTo(1.992f, 21.2266f, 1.992f, 21.0791f, 2.0285f, 20.9386f)
                lineTo(3.1449f, 16.6502f)
                curveTo(2.3972f, 15.2294f, 2.0f, 13.6428f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.5f)
                curveTo(11.4477f, 15.5f, 11.0f, 15.9477f, 11.0f, 16.5f)
                curveTo(11.0f, 17.0523f, 11.4477f, 17.5f, 12.0f, 17.5f)
                curveTo(12.5523f, 17.5f, 13.0f, 17.0523f, 13.0f, 16.5f)
                curveTo(13.0f, 15.9477f, 12.5523f, 15.5f, 12.0f, 15.5f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(10.4812f, 6.75f, 9.25f, 7.9812f, 9.25f, 9.5f)
                curveTo(9.25f, 9.9142f, 9.5858f, 10.25f, 10.0f, 10.25f)
                curveTo(10.3797f, 10.25f, 10.6935f, 9.9678f, 10.7432f, 9.6018f)
                lineTo(10.7565f, 9.3722f)
                curveTo(10.8205f, 8.7419f, 11.3528f, 8.25f, 12.0f, 8.25f)
                curveTo(12.6904f, 8.25f, 13.25f, 8.8096f, 13.25f, 9.5f)
                curveTo(13.25f, 10.0388f, 13.115f, 10.3053f, 12.6051f, 10.8322f)
                lineTo(12.3011f, 11.1414f)
                curveTo(11.5475f, 11.926f, 11.25f, 12.4892f, 11.25f, 13.5f)
                curveTo(11.25f, 13.9142f, 11.5858f, 14.25f, 12.0f, 14.25f)
                curveTo(12.4142f, 14.25f, 12.75f, 13.9142f, 12.75f, 13.5f)
                curveTo(12.75f, 12.9612f, 12.885f, 12.6947f, 13.3949f, 12.1678f)
                lineTo(13.6989f, 11.8586f)
                curveTo(14.4525f, 11.074f, 14.75f, 10.5108f, 14.75f, 9.5f)
                curveTo(14.75f, 7.9812f, 13.5188f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _chatHelp!!
    }

private var _chatHelp: ImageVector? = null
