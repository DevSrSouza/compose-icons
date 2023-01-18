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

public val FilledGroup.Notebook: ImageVector
    get() {
        if (_notebook != null) {
            return _notebook!!
        }
        _notebook = Builder(name = "Notebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7488f, 2.0f)
                curveTo(17.9915f, 2.0f, 18.9988f, 3.0074f, 18.9988f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.9988f, 20.9926f, 17.9915f, 22.0f, 16.7488f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(16.7488f)
                close()
                moveTo(20.0f, 15.0019f)
                horizontalLineTo(20.75f)
                curveTo(21.1297f, 15.0019f, 21.4435f, 15.2841f, 21.4932f, 15.6502f)
                lineTo(21.5f, 15.7519f)
                verticalLineTo(17.25f)
                curveTo(21.5f, 17.6297f, 21.2178f, 17.9435f, 20.8518f, 17.9932f)
                lineTo(20.75f, 18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0019f)
                horizontalLineTo(20.75f)
                horizontalLineTo(20.0f)
                close()
                moveTo(20.0f, 11.0019f)
                horizontalLineTo(20.75f)
                curveTo(21.1297f, 11.0019f, 21.4435f, 11.2841f, 21.4932f, 11.6502f)
                lineTo(21.5f, 11.7519f)
                verticalLineTo(13.25f)
                curveTo(21.5f, 13.6297f, 21.2178f, 13.9435f, 20.8518f, 13.9932f)
                lineTo(20.75f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0019f)
                horizontalLineTo(20.75f)
                horizontalLineTo(20.0f)
                close()
                moveTo(20.0f, 7.0019f)
                horizontalLineTo(20.75f)
                curveTo(21.1297f, 7.0019f, 21.4435f, 7.2841f, 21.4932f, 7.6502f)
                lineTo(21.5f, 7.7519f)
                verticalLineTo(9.25f)
                curveTo(21.5f, 9.6297f, 21.2178f, 9.9435f, 20.8518f, 9.9931f)
                lineTo(20.75f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0019f)
                horizontalLineTo(20.75f)
                horizontalLineTo(20.0f)
                close()
                moveTo(14.7536f, 5.4974f)
                horizontalLineTo(8.2514f)
                curveTo(7.8717f, 5.4974f, 7.5579f, 5.7795f, 7.5082f, 6.1456f)
                lineTo(7.5014f, 6.2474f)
                verticalLineTo(7.751f)
                curveTo(7.5014f, 8.1307f, 7.7835f, 8.4445f, 8.1496f, 8.4941f)
                lineTo(8.2514f, 8.501f)
                horizontalLineTo(14.7536f)
                curveTo(15.1333f, 8.501f, 15.4471f, 8.2188f, 15.4968f, 7.8527f)
                lineTo(15.5036f, 7.751f)
                verticalLineTo(6.2474f)
                curveTo(15.5036f, 5.8332f, 15.1678f, 5.4974f, 14.7536f, 5.4974f)
                close()
            }
        }
        .build()
        return _notebook!!
    }

private var _notebook: ImageVector? = null
