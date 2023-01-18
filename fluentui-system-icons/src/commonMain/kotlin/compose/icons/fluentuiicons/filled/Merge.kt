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

public val FilledGroup.Merge: ImageVector
    get() {
        if (_merge != null) {
            return _merge!!
        }
        _merge = Builder(name = "Merge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 6.4477f, 3.4477f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(6.7574f)
                curveTo(7.8182f, 6.0f, 8.8356f, 6.4214f, 9.5858f, 7.1716f)
                lineTo(12.5355f, 10.1213f)
                curveTo(13.0981f, 10.6839f, 13.8612f, 11.0f, 14.6569f, 11.0f)
                horizontalLineTo(18.5843f)
                lineTo(15.2931f, 7.7113f)
                curveTo(14.9025f, 7.3209f, 14.9023f, 6.6877f, 15.2926f, 6.2971f)
                curveTo(15.683f, 5.9064f, 16.3162f, 5.9062f, 16.7068f, 6.2965f)
                lineTo(21.7068f, 11.2929f)
                curveTo(21.8945f, 11.4804f, 22.0f, 11.7348f, 22.0f, 12.0001f)
                curveTo(22.0f, 12.2654f, 21.8947f, 12.5198f, 21.7071f, 12.7074f)
                lineTo(16.7071f, 17.7074f)
                curveTo(16.3166f, 18.0979f, 15.6834f, 18.0979f, 15.2929f, 17.7074f)
                curveTo(14.9024f, 17.3168f, 14.9024f, 16.6837f, 15.2929f, 16.2932f)
                lineTo(18.5858f, 13.0003f)
                horizontalLineTo(14.6174f)
                curveTo(13.836f, 13.0105f, 13.0888f, 13.3254f, 12.5355f, 13.8787f)
                lineTo(9.5858f, 16.8284f)
                curveTo(8.8356f, 17.5786f, 7.8182f, 18.0f, 6.7574f, 18.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 18.0f, 3.0f, 17.5523f, 3.0f, 17.0f)
                curveTo(3.0f, 16.4477f, 3.4477f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(6.7574f)
                curveTo(7.2878f, 16.0f, 7.7965f, 15.7893f, 8.1716f, 15.4142f)
                lineTo(11.1213f, 12.4645f)
                curveTo(11.2896f, 12.2962f, 11.4686f, 12.1411f, 11.6568f, 12.0f)
                curveTo(11.4686f, 11.8589f, 11.2896f, 11.7038f, 11.1213f, 11.5355f)
                lineTo(8.1716f, 8.5858f)
                curveTo(7.7965f, 8.2107f, 7.2878f, 8.0f, 6.7574f, 8.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 8.0f, 3.0f, 7.5523f, 3.0f, 7.0f)
                close()
            }
        }
        .build()
        return _merge!!
    }

private var _merge: ImageVector? = null
