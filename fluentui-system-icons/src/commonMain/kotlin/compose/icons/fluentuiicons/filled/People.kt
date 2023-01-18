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

public val FilledGroup.People: ImageVector
    get() {
        if (_people != null) {
            return _people!!
        }
        _people = Builder(name = "People", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveTo(10.2091f, 12.0f, 12.0f, 10.2091f, 12.0f, 8.0f)
                curveTo(12.0f, 5.7909f, 10.2091f, 4.0f, 8.0f, 4.0f)
                curveTo(5.7909f, 4.0f, 4.0f, 5.7909f, 4.0f, 8.0f)
                curveTo(4.0f, 10.2091f, 5.7909f, 12.0f, 8.0f, 12.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(18.6569f, 12.0f, 20.0f, 10.6569f, 20.0f, 9.0f)
                curveTo(20.0f, 7.3432f, 18.6569f, 6.0f, 17.0f, 6.0f)
                curveTo(15.3431f, 6.0f, 14.0f, 7.3432f, 14.0f, 9.0f)
                curveTo(14.0f, 10.6569f, 15.3431f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(4.25f, 14.0f)
                curveTo(3.0074f, 14.0f, 2.0f, 15.0074f, 2.0f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 16.5f, 2.0f, 21.0f, 8.0f, 21.0f)
                curveTo(14.0f, 21.0f, 14.0f, 16.5f, 14.0f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(14.0f, 15.0074f, 12.9926f, 14.0f, 11.75f, 14.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(17.0002f, 19.5f)
                curveTo(15.829f, 19.5f, 14.9321f, 19.3189f, 14.2453f, 19.0416f)
                curveTo(14.5873f, 18.4667f, 14.7719f, 17.9142f, 14.8724f, 17.4836f)
                curveTo(14.9328f, 17.2247f, 14.9645f, 17.0027f, 14.9813f, 16.8353f)
                curveTo(14.9897f, 16.7512f, 14.9944f, 16.68f, 14.997f, 16.6237f)
                curveTo(14.9983f, 16.5955f, 14.9991f, 16.5709f, 14.9996f, 16.5503f)
                lineTo(15.0001f, 16.5222f)
                lineTo(15.0002f, 16.5103f)
                lineTo(15.0002f, 16.505f)
                lineTo(15.0002f, 16.5024f)
                curveTo(15.0002f, 16.4992f, 15.0002f, 16.5f, 15.0002f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(15.0002f, 15.3779f, 14.6567f, 14.5861f, 14.0977f, 14.0023f)
                curveTo(14.1316f, 14.0008f, 14.1658f, 14.0f, 14.2002f, 14.0f)
                horizontalLineTo(19.8002f)
                curveTo(21.0152f, 14.0f, 22.0002f, 14.985f, 22.0002f, 16.2f)
                curveTo(22.0002f, 16.2f, 22.0002f, 19.5f, 17.0002f, 19.5f)
                close()
            }
        }
        .build()
        return _people!!
    }

private var _people: ImageVector? = null
