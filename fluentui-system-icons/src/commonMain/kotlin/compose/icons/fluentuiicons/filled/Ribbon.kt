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

public val FilledGroup.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0016f, 15.2441f)
                lineTo(17.0009f, 21.2451f)
                curveTo(17.0009f, 21.8528f, 16.3161f, 22.2082f, 15.8192f, 21.8584f)
                lineTo(12.0008f, 19.1706f)
                lineTo(8.1844f, 21.8583f)
                curveTo(7.6875f, 22.2082f, 7.0025f, 21.8529f, 7.0025f, 21.2451f)
                lineTo(7.0007f, 15.2459f)
                curveTo(8.3702f, 16.3435f, 10.1084f, 17.0f, 12.0f, 17.0f)
                curveTo(13.8926f, 17.0f, 15.6318f, 16.3428f, 17.0016f, 15.2441f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                curveTo(19.0f, 12.866f, 15.866f, 16.0f, 12.0f, 16.0f)
                curveTo(8.134f, 16.0f, 5.0f, 12.866f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
