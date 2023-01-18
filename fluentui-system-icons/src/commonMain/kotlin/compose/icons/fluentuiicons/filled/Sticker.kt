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

public val FilledGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(12.999f)
                lineTo(16.2512f, 13.0f)
                lineTo(16.038f, 13.0069f)
                curveTo(14.8404f, 13.0848f, 13.8195f, 13.8111f, 13.3236f, 14.8393f)
                curveTo(12.9039f, 14.9527f, 12.4636f, 15.0095f, 12.0009f, 15.0095f)
                curveTo(10.9561f, 15.0095f, 10.0214f, 14.7199f, 9.1765f, 14.1356f)
                curveTo(8.8359f, 13.9f, 8.3687f, 13.9851f, 8.1331f, 14.3258f)
                curveTo(7.8974f, 14.6665f, 7.9826f, 15.1336f, 8.3233f, 15.3693f)
                curveTo(9.4198f, 16.1277f, 10.6524f, 16.5095f, 12.0009f, 16.5095f)
                curveTo(12.2279f, 16.5095f, 12.4518f, 16.4987f, 12.6724f, 16.477f)
                lineTo(13.0009f, 16.4364f)
                lineTo(13.0f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(20.341f, 14.7197f)
                lineTo(14.7197f, 20.341f)
                curveTo(14.6508f, 20.4098f, 14.578f, 20.4737f, 14.5017f, 20.5325f)
                lineTo(14.5008f, 16.2501f)
                lineTo(14.5066f, 16.1066f)
                curveTo(14.5759f, 15.2573f, 15.2516f, 14.5794f, 16.0999f, 14.5065f)
                lineTo(16.2514f, 14.5f)
                lineTo(20.5332f, 14.5007f)
                curveTo(20.4743f, 14.5774f, 20.4101f, 14.6505f, 20.341f, 14.7197f)
                close()
                moveTo(9.0005f, 7.7512f)
                curveTo(8.3105f, 7.7512f, 7.7512f, 8.3105f, 7.7512f, 9.0005f)
                curveTo(7.7512f, 9.6904f, 8.3105f, 10.2497f, 9.0005f, 10.2497f)
                curveTo(9.6904f, 10.2497f, 10.2497f, 9.6904f, 10.2497f, 9.0005f)
                curveTo(10.2497f, 8.3105f, 9.6904f, 7.7512f, 9.0005f, 7.7512f)
                close()
                moveTo(15.0004f, 7.7512f)
                curveTo(14.3105f, 7.7512f, 13.7512f, 8.3105f, 13.7512f, 9.0005f)
                curveTo(13.7512f, 9.6904f, 14.3105f, 10.2497f, 15.0004f, 10.2497f)
                curveTo(15.6904f, 10.2497f, 16.2497f, 9.6904f, 16.2497f, 9.0005f)
                curveTo(16.2497f, 8.3105f, 15.6904f, 7.7512f, 15.0004f, 7.7512f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
