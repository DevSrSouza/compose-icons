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

public val FilledGroup.TagMultiple: ImageVector
    get() {
        if (_tagMultiple != null) {
            return _tagMultiple!!
        }
        _tagMultiple = Builder(name = "TagMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7507f, 2.0f)
                curveTo(11.9154f, 2.0f, 11.1121f, 2.3216f, 10.5076f, 2.8982f)
                lineTo(3.6961f, 9.3947f)
                curveTo(2.7803f, 10.2682f, 2.7648f, 11.7249f, 3.6618f, 12.6177f)
                lineTo(9.9185f, 18.8445f)
                curveTo(10.7927f, 19.7146f, 12.2045f, 19.7186f, 13.0837f, 18.8535f)
                lineTo(20.0291f, 12.0192f)
                curveTo(20.65f, 11.4083f, 20.9996f, 10.5737f, 20.9996f, 9.7026f)
                verticalLineTo(4.75f)
                curveTo(20.9996f, 3.2312f, 19.7684f, 2.0f, 18.2496f, 2.0f)
                horizontalLineTo(12.7507f)
                close()
                moveTo(16.25f, 7.75f)
                curveTo(15.5596f, 7.75f, 15.0f, 7.1904f, 15.0f, 6.5f)
                curveTo(15.0f, 5.8096f, 15.5596f, 5.25f, 16.25f, 5.25f)
                curveTo(16.9404f, 5.25f, 17.5f, 5.8096f, 17.5f, 6.5f)
                curveTo(17.5f, 7.1904f, 16.9404f, 7.75f, 16.25f, 7.75f)
                close()
                moveTo(19.2558f, 14.1834f)
                lineTo(20.7309f, 12.732f)
                curveTo(20.776f, 12.6876f, 20.82f, 12.6423f, 20.8628f, 12.5962f)
                curveTo(21.1728f, 13.5543f, 20.9449f, 14.6514f, 20.1717f, 15.4093f)
                lineTo(14.8384f, 20.6377f)
                curveTo(12.9851f, 22.4544f, 10.0168f, 22.4475f, 8.1721f, 20.6221f)
                lineTo(3.8157f, 16.3113f)
                curveTo(3.0509f, 15.5545f, 2.8237f, 14.4607f, 3.1349f, 13.5037f)
                lineTo(4.7637f, 15.1248f)
                curveTo(4.7964f, 15.1666f, 4.8321f, 15.2068f, 4.8708f, 15.2451f)
                lineTo(7.282f, 17.6311f)
                lineTo(9.2134f, 19.5532f)
                curveTo(10.2687f, 20.6035f, 11.8661f, 20.7802f, 13.1037f, 20.0807f)
                curveTo(13.3482f, 19.9434f, 13.5787f, 19.772f, 13.7883f, 19.5665f)
                lineTo(19.1217f, 14.3381f)
                curveTo(19.1713f, 14.2894f, 19.216f, 14.2377f, 19.2558f, 14.1834f)
                close()
            }
        }
        .build()
        return _tagMultiple!!
    }

private var _tagMultiple: ImageVector? = null
