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

public val FilledGroup.BinFull: ImageVector
    get() {
        if (_binFull != null) {
            return _binFull!!
        }
        _binFull = Builder(name = "BinFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1556f, 3.381f)
                curveTo(17.504f, 3.157f, 17.6049f, 2.693f, 17.3809f, 2.3445f)
                curveTo(17.1569f, 1.9961f, 16.6929f, 1.8952f, 16.3444f, 2.1192f)
                lineTo(2.3444f, 11.1192f)
                curveTo(2.1298f, 11.2572f, 2.0f, 11.4949f, 2.0f, 11.7501f)
                verticalLineTo(18.7501f)
                curveTo(2.0f, 20.545f, 3.4551f, 22.0001f, 5.25f, 22.0001f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 22.0001f, 22.0f, 20.545f, 22.0f, 18.7501f)
                verticalLineTo(11.7501f)
                curveTo(22.0f, 11.3359f, 21.6642f, 11.0001f, 21.25f, 11.0001f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.7501f)
                curveTo(21.0f, 6.7836f, 20.2165f, 6.0001f, 19.25f, 6.0001f)
                horizontalLineTo(16.25f)
                curveTo(15.2835f, 6.0001f, 14.5f, 6.7836f, 14.5f, 7.7501f)
                verticalLineTo(8.5001f)
                horizontalLineTo(11.25f)
                curveTo(10.2835f, 8.5001f, 9.5f, 9.2836f, 9.5f, 10.2501f)
                verticalLineTo(11.0001f)
                horizontalLineTo(5.3036f)
                lineTo(17.1556f, 3.381f)
                close()
                moveTo(14.5f, 10.0001f)
                verticalLineTo(11.0001f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.2501f)
                curveTo(11.0f, 10.112f, 11.1119f, 10.0001f, 11.25f, 10.0001f)
                horizontalLineTo(14.5f)
                close()
                moveTo(19.5f, 11.0001f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.7501f)
                curveTo(16.0f, 7.612f, 16.1119f, 7.5001f, 16.25f, 7.5001f)
                horizontalLineTo(19.25f)
                curveTo(19.3881f, 7.5001f, 19.5f, 7.612f, 19.5f, 7.7501f)
                verticalLineTo(11.0001f)
                close()
            }
        }
        .build()
        return _binFull!!
    }

private var _binFull: ImageVector? = null
