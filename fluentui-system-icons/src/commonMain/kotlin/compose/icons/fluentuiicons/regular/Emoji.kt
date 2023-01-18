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

public val RegularGroup.Emoji: ImageVector
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
                moveTo(12.0f, 3.498f)
                curveTo(7.3047f, 3.498f, 3.4985f, 7.3043f, 3.4985f, 11.9996f)
                curveTo(3.4985f, 16.6949f, 7.3047f, 20.5011f, 12.0f, 20.5011f)
                curveTo(16.6953f, 20.5011f, 20.5016f, 16.6949f, 20.5016f, 11.9996f)
                curveTo(20.5016f, 7.3043f, 16.6953f, 3.498f, 12.0f, 3.498f)
                close()
                moveTo(8.4618f, 14.7829f)
                curveTo(9.3109f, 15.8606f, 10.6019f, 16.5012f, 12.0f, 16.5012f)
                curveTo(13.3962f, 16.5012f, 14.6857f, 15.8624f, 15.535f, 14.7871f)
                curveTo(15.7917f, 14.462f, 16.2633f, 14.4066f, 16.5884f, 14.6634f)
                curveTo(16.9134f, 14.9201f, 16.9688f, 15.3917f, 16.7121f, 15.7168f)
                curveTo(15.5813f, 17.1485f, 13.8602f, 18.0012f, 12.0f, 18.0012f)
                curveTo(10.1374f, 18.0012f, 8.4141f, 17.1462f, 7.2835f, 15.7112f)
                curveTo(7.0272f, 15.3859f, 7.0831f, 14.9143f, 7.4085f, 14.658f)
                curveTo(7.7339f, 14.4016f, 8.2054f, 14.4576f, 8.4618f, 14.7829f)
                close()
                moveTo(9.0005f, 8.7502f)
                curveTo(9.6904f, 8.7502f, 10.2498f, 9.3096f, 10.2498f, 9.9995f)
                curveTo(10.2498f, 10.6895f, 9.6904f, 11.2488f, 9.0005f, 11.2488f)
                curveTo(8.3105f, 11.2488f, 7.7512f, 10.6895f, 7.7512f, 9.9995f)
                curveTo(7.7512f, 9.3096f, 8.3105f, 8.7502f, 9.0005f, 8.7502f)
                close()
                moveTo(15.0005f, 8.7502f)
                curveTo(15.6904f, 8.7502f, 16.2498f, 9.3096f, 16.2498f, 9.9995f)
                curveTo(16.2498f, 10.6895f, 15.6904f, 11.2488f, 15.0005f, 11.2488f)
                curveTo(14.3105f, 11.2488f, 13.7512f, 10.6895f, 13.7512f, 9.9995f)
                curveTo(13.7512f, 9.3096f, 14.3105f, 8.7502f, 15.0005f, 8.7502f)
                close()
            }
        }
        .build()
        return _emoji!!
    }

private var _emoji: ImageVector? = null
