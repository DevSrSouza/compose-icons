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

public val FilledGroup.ArrowHookDownRight: ImageVector
    get() {
        if (_arrowHookDownRight != null) {
            return _arrowHookDownRight!!
        }
        _arrowHookDownRight = Builder(name = "ArrowHookDownRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 6.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 6.0f, 17.0f, 5.5523f, 17.0f, 5.0f)
                curveTo(17.0f, 4.4477f, 16.5523f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(10.5f)
                curveTo(6.9102f, 4.0f, 4.0f, 6.9102f, 4.0f, 10.5f)
                curveTo(4.0f, 14.0899f, 6.9102f, 17.0f, 10.5f, 17.0f)
                horizontalLineTo(15.6401f)
                lineTo(13.7072f, 18.9329f)
                curveTo(13.3167f, 19.3234f, 13.3167f, 19.9566f, 13.7072f, 20.3471f)
                curveTo(14.0977f, 20.7376f, 14.7309f, 20.7376f, 15.1214f, 20.3471f)
                lineTo(18.6502f, 16.8183f)
                curveTo(18.7418f, 16.7267f, 18.812f, 16.6217f, 18.8606f, 16.5096f)
                curveTo(18.9492f, 16.3604f, 19.0f, 16.1861f, 19.0f, 16.0f)
                curveTo(19.0f, 15.7103f, 18.8768f, 15.4494f, 18.68f, 15.2668f)
                curveTo(18.6711f, 15.2572f, 18.662f, 15.2477f, 18.6526f, 15.2383f)
                lineTo(15.1215f, 11.7072f)
                curveTo(14.731f, 11.3167f, 14.0978f, 11.3167f, 13.7073f, 11.7072f)
                curveTo(13.3168f, 12.0977f, 13.3168f, 12.7309f, 13.7073f, 13.1214f)
                lineTo(15.5859f, 15.0f)
                horizontalLineTo(10.5f)
                curveTo(8.0147f, 15.0f, 6.0f, 12.9853f, 6.0f, 10.5f)
                curveTo(6.0f, 8.0147f, 8.0147f, 6.0f, 10.5f, 6.0f)
                close()
            }
        }
        .build()
        return _arrowHookDownRight!!
    }

private var _arrowHookDownRight: ImageVector? = null
