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

public val FilledGroup.Emoji: ImageVector
    get() {
        if (_emoji != null) {
            return _emoji!!
        }
        _emoji = Builder(name = "Emoji", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.998f)
                curveTo(17.5237f, 1.998f, 22.0016f, 6.4759f, 22.0016f, 11.9996f)
                curveTo(22.0016f, 17.5233f, 17.5237f, 22.0011f, 12.0f, 22.0011f)
                curveTo(6.4763f, 22.0011f, 1.9985f, 17.5233f, 1.9985f, 11.9996f)
                curveTo(1.9985f, 6.4759f, 6.4763f, 1.998f, 12.0f, 1.998f)
                close()
                moveTo(8.4618f, 14.7829f)
                curveTo(8.2054f, 14.4576f, 7.7339f, 14.4016f, 7.4085f, 14.658f)
                curveTo(7.0831f, 14.9143f, 7.0272f, 15.3859f, 7.2835f, 15.7112f)
                curveTo(8.4141f, 17.1462f, 10.1374f, 18.0012f, 12.0f, 18.0012f)
                curveTo(13.8602f, 18.0012f, 15.5813f, 17.1485f, 16.7121f, 15.7168f)
                curveTo(16.9688f, 15.3917f, 16.9134f, 14.9201f, 16.5884f, 14.6634f)
                curveTo(16.2633f, 14.4066f, 15.7917f, 14.462f, 15.535f, 14.7871f)
                curveTo(14.6857f, 15.8624f, 13.3962f, 16.5012f, 12.0f, 16.5012f)
                curveTo(10.6019f, 16.5012f, 9.3109f, 15.8606f, 8.4618f, 14.7829f)
                close()
                moveTo(9.0005f, 8.7502f)
                curveTo(8.3105f, 8.7502f, 7.7512f, 9.3096f, 7.7512f, 9.9995f)
                curveTo(7.7512f, 10.6895f, 8.3105f, 11.2488f, 9.0005f, 11.2488f)
                curveTo(9.6904f, 11.2488f, 10.2498f, 10.6895f, 10.2498f, 9.9995f)
                curveTo(10.2498f, 9.3096f, 9.6904f, 8.7502f, 9.0005f, 8.7502f)
                close()
                moveTo(15.0005f, 8.7502f)
                curveTo(14.3105f, 8.7502f, 13.7512f, 9.3096f, 13.7512f, 9.9995f)
                curveTo(13.7512f, 10.6895f, 14.3105f, 11.2488f, 15.0005f, 11.2488f)
                curveTo(15.6904f, 11.2488f, 16.2498f, 10.6895f, 16.2498f, 9.9995f)
                curveTo(16.2498f, 9.3096f, 15.6904f, 8.7502f, 15.0005f, 8.7502f)
                close()
            }
        }
        .build()
        return _emoji!!
    }

private var _emoji: ImageVector? = null
