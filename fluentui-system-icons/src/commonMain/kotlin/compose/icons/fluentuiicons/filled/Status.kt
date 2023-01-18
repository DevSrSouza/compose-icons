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

public val FilledGroup.Status: ImageVector
    get() {
        if (_status != null) {
            return _status!!
        }
        _status = Builder(name = "Status", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.9997f)
                curveTo(13.2477f, 2.9997f, 14.4361f, 3.2536f, 15.5163f, 3.7125f)
                lineTo(14.3609f, 4.8788f)
                curveTo(13.6186f, 4.6328f, 12.8249f, 4.4997f, 12.0f, 4.4997f)
                curveTo(7.8579f, 4.4997f, 4.5f, 7.8575f, 4.5f, 11.9997f)
                curveTo(4.5f, 13.4245f, 4.8973f, 14.7889f, 5.6358f, 15.97f)
                curveTo(5.9376f, 16.4527f, 6.2937f, 16.8999f, 6.6964f, 17.3026f)
                curveTo(7.0985f, 17.7048f, 7.5449f, 18.0604f, 8.0267f, 18.362f)
                curveTo(9.2084f, 19.1017f, 10.5739f, 19.4997f, 12.0f, 19.4997f)
                curveTo(16.1421f, 19.4997f, 19.5f, 16.1418f, 19.5f, 11.9997f)
                curveTo(19.5f, 11.1992f, 19.3746f, 10.4281f, 19.1424f, 9.7048f)
                lineTo(20.3069f, 8.5302f)
                curveTo(20.7534f, 9.5979f, 21.0f, 10.77f, 21.0f, 11.9997f)
                curveTo(21.0f, 16.9702f, 16.9706f, 20.9997f, 12.0f, 20.9997f)
                curveTo(10.2904f, 20.9997f, 8.6495f, 20.5215f, 7.2308f, 19.6334f)
                curveTo(6.6529f, 19.2717f, 6.1177f, 18.8453f, 5.6357f, 18.3632f)
                curveTo(5.1529f, 17.8804f, 4.726f, 17.3442f, 4.364f, 16.7653f)
                curveTo(3.4774f, 15.3475f, 3.0f, 13.7078f, 3.0f, 11.9997f)
                curveTo(3.0f, 7.0291f, 7.0294f, 2.9997f, 12.0f, 2.9997f)
                close()
                moveTo(21.1626f, 2.5727f)
                lineTo(21.3013f, 2.7009f)
                curveTo(22.2387f, 3.6383f, 22.2421f, 5.1569f, 21.3089f, 6.0985f)
                lineTo(14.554f, 12.9141f)
                curveTo(14.4397f, 13.0294f, 14.2991f, 13.1152f, 14.1443f, 13.1639f)
                lineTo(9.7963f, 14.5342f)
                curveTo(9.691f, 14.5674f, 9.5786f, 14.5089f, 9.5454f, 14.4036f)
                curveTo(9.5331f, 14.3645f, 9.5331f, 14.3225f, 9.5454f, 14.2833f)
                lineTo(10.9171f, 9.9309f)
                curveTo(10.965f, 9.7789f, 11.0485f, 9.6406f, 11.1606f, 9.5275f)
                lineTo(17.9189f, 2.7085f)
                curveTo(18.8045f, 1.8149f, 20.2215f, 1.7681f, 21.1626f, 2.5727f)
                close()
            }
        }
        .build()
        return _status!!
    }

private var _status: ImageVector? = null
