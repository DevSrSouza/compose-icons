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

public val RegularGroup.Class: ImageVector
    get() {
        if (_class != null) {
            return _class!!
        }
        _class = Builder(name = "Class", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2501f, 2.0005f)
                curveTo(18.7689f, 2.0005f, 20.0001f, 3.2317f, 20.0001f, 4.7505f)
                verticalLineTo(19.2488f)
                curveTo(20.0001f, 20.7675f, 18.7689f, 21.9988f, 17.2501f, 21.9988f)
                horizontalLineTo(6.75f)
                curveTo(5.2312f, 21.9988f, 4.0f, 20.7675f, 4.0f, 19.2488f)
                verticalLineTo(4.7505f)
                curveTo(4.0f, 3.4916f, 4.846f, 2.4302f, 6.0004f, 2.1039f)
                lineTo(5.9996f, 3.7507f)
                curveTo(5.6962f, 3.9788f, 5.5f, 4.3417f, 5.5f, 4.7505f)
                verticalLineTo(19.2488f)
                curveTo(5.5f, 19.9391f, 6.0596f, 20.4988f, 6.75f, 20.4988f)
                horizontalLineTo(17.2501f)
                curveTo(17.9405f, 20.4988f, 18.5001f, 19.9391f, 18.5001f, 19.2488f)
                verticalLineTo(4.7505f)
                curveTo(18.5001f, 4.0602f, 17.9405f, 3.5005f, 17.2501f, 3.5005f)
                lineTo(15.0f, 3.5f)
                verticalLineTo(2.0f)
                lineTo(17.2501f, 2.0005f)
                close()
                moveTo(14.0001f, 2.0f)
                verticalLineTo(10.1389f)
                curveTo(14.0001f, 10.886f, 13.2007f, 11.1665f, 12.7109f, 10.9033f)
                lineTo(12.6279f, 10.8512f)
                lineTo(10.5019f, 9.5658f)
                lineTo(8.4238f, 10.8172f)
                curveTo(7.9241f, 11.1779f, 7.0934f, 10.9564f, 7.0074f, 10.2594f)
                lineTo(7.0001f, 10.1389f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0001f)
                close()
                moveTo(12.5001f, 3.5f)
                horizontalLineTo(8.5001f)
                verticalLineTo(9.0233f)
                lineTo(10.0734f, 8.0742f)
                curveTo(10.3377f, 7.936f, 10.6574f, 7.9334f, 10.8906f, 8.0504f)
                lineTo(12.5001f, 9.024f)
                verticalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _class!!
    }

private var _class: ImageVector? = null
