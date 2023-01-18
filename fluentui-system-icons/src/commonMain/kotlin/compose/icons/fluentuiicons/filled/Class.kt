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

public val FilledGroup.Class: ImageVector
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
                curveTo(4.0f, 3.2317f, 5.2312f, 2.0005f, 6.75f, 2.0005f)
                lineTo(7.0414f, 2.0f)
                verticalLineTo(10.1671f)
                curveTo(7.0414f, 10.9152f, 7.8318f, 11.1812f, 8.36f, 10.9065f)
                lineTo(8.4503f, 10.8524f)
                lineTo(10.5433f, 9.6551f)
                lineTo(12.6837f, 10.8845f)
                curveTo(13.1291f, 11.1927f, 13.9442f, 10.9854f, 14.0334f, 10.2941f)
                lineTo(14.0414f, 10.1671f)
                verticalLineTo(2.0f)
                lineTo(17.2501f, 2.0005f)
                close()
                moveTo(12.5414f, 2.0f)
                verticalLineTo(9.0757f)
                lineTo(10.9198f, 8.1438f)
                curveTo(10.6931f, 8.0353f, 10.3847f, 8.0377f, 10.127f, 8.1663f)
                lineTo(10.0201f, 8.2292f)
                lineTo(8.5414f, 9.075f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.5414f)
                close()
            }
        }
        .build()
        return _class!!
    }

private var _class: ImageVector? = null
