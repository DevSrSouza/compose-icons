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

public val FilledGroup.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = Builder(name = "Info", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 1.999f)
                curveTo(17.5238f, 1.999f, 22.0016f, 6.4769f, 22.0016f, 12.0006f)
                curveTo(22.0016f, 17.5243f, 17.5238f, 22.0021f, 12.0001f, 22.0021f)
                curveTo(6.4764f, 22.0021f, 1.9985f, 17.5243f, 1.9985f, 12.0006f)
                curveTo(1.9985f, 6.4769f, 6.4764f, 1.999f, 12.0001f, 1.999f)
                close()
                moveTo(11.9963f, 10.2496f)
                curveTo(11.4834f, 10.2499f, 11.061f, 10.6363f, 11.0036f, 11.1336f)
                lineTo(10.9969f, 11.2503f)
                lineTo(11.0005f, 16.7519f)
                lineTo(11.0073f, 16.8685f)
                curveTo(11.0654f, 17.3658f, 11.4884f, 17.7515f, 12.0012f, 17.7512f)
                curveTo(12.514f, 17.7509f, 12.9364f, 17.3645f, 12.9939f, 16.8672f)
                lineTo(13.0005f, 16.7505f)
                lineTo(12.9969f, 11.249f)
                lineTo(12.9901f, 11.1323f)
                curveTo(12.932f, 10.635f, 12.5091f, 10.2493f, 11.9963f, 10.2496f)
                close()
                moveTo(12.0005f, 6.5001f)
                curveTo(11.3093f, 6.5001f, 10.749f, 7.0604f, 10.749f, 7.7516f)
                curveTo(10.749f, 8.4428f, 11.3093f, 9.0031f, 12.0005f, 9.0031f)
                curveTo(12.6917f, 9.0031f, 13.2521f, 8.4428f, 13.2521f, 7.7516f)
                curveTo(13.2521f, 7.0604f, 12.6917f, 6.5001f, 12.0005f, 6.5001f)
                close()
            }
        }
        .build()
        return _info!!
    }

private var _info: ImageVector? = null
