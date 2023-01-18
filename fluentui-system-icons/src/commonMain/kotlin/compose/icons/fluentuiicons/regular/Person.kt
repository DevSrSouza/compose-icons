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

public val RegularGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7541f, 14.0002f)
                curveTo(18.9961f, 14.0002f, 20.0029f, 15.007f, 20.0029f, 16.2491f)
                verticalLineTo(16.8245f)
                curveTo(20.0029f, 17.7188f, 19.6833f, 18.5836f, 19.1018f, 19.263f)
                curveTo(17.5324f, 21.0965f, 15.1453f, 22.0013f, 11.9999f, 22.0013f)
                curveTo(8.854f, 22.0013f, 6.468f, 21.0962f, 4.9017f, 19.2619f)
                curveTo(4.3219f, 18.583f, 4.0034f, 17.7195f, 4.0034f, 16.8267f)
                verticalLineTo(16.2491f)
                curveTo(4.0034f, 15.007f, 5.0103f, 14.0002f, 6.2523f, 14.0002f)
                horizontalLineTo(17.7541f)
                close()
                moveTo(17.7541f, 15.5002f)
                horizontalLineTo(6.2523f)
                curveTo(5.8387f, 15.5002f, 5.5034f, 15.8355f, 5.5034f, 16.2491f)
                verticalLineTo(16.8267f)
                curveTo(5.5034f, 17.3624f, 5.6945f, 17.8805f, 6.0424f, 18.2878f)
                curveTo(7.2957f, 19.7555f, 9.2616f, 20.5013f, 11.9999f, 20.5013f)
                curveTo(14.7382f, 20.5013f, 16.7058f, 19.7555f, 17.9623f, 18.2876f)
                curveTo(18.3112f, 17.8799f, 18.5029f, 17.361f, 18.5029f, 16.8245f)
                verticalLineTo(16.2491f)
                curveTo(18.5029f, 15.8355f, 18.1676f, 15.5002f, 17.7541f, 15.5002f)
                close()
                moveTo(11.9999f, 2.0049f)
                curveTo(14.7613f, 2.0049f, 16.9999f, 4.2435f, 16.9999f, 7.0049f)
                curveTo(16.9999f, 9.7663f, 14.7613f, 12.0049f, 11.9999f, 12.0049f)
                curveTo(9.2385f, 12.0049f, 6.9999f, 9.7663f, 6.9999f, 7.0049f)
                curveTo(6.9999f, 4.2435f, 9.2385f, 2.0049f, 11.9999f, 2.0049f)
                close()
                moveTo(11.9999f, 3.5049f)
                curveTo(10.0669f, 3.5049f, 8.4999f, 5.0719f, 8.4999f, 7.0049f)
                curveTo(8.4999f, 8.9379f, 10.0669f, 10.5049f, 11.9999f, 10.5049f)
                curveTo(13.9329f, 10.5049f, 15.4999f, 8.9379f, 15.4999f, 7.0049f)
                curveTo(15.4999f, 5.0719f, 13.9329f, 3.5049f, 11.9999f, 3.5049f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
