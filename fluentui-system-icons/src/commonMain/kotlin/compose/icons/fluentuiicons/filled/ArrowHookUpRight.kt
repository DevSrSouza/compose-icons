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

public val FilledGroup.ArrowHookUpRight: ImageVector
    get() {
        if (_arrowHookUpRight != null) {
            return _arrowHookUpRight!!
        }
        _arrowHookUpRight = Builder(name = "ArrowHookUpRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 18.0f, 17.0f, 18.4477f, 17.0f, 19.0f)
                curveTo(17.0f, 19.5523f, 16.5523f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(10.5f)
                curveTo(6.9102f, 20.0f, 4.0f, 17.0899f, 4.0f, 13.5f)
                curveTo(4.0f, 9.9101f, 6.9102f, 7.0f, 10.5f, 7.0f)
                horizontalLineTo(15.6401f)
                lineTo(13.7072f, 5.0671f)
                curveTo(13.3167f, 4.6766f, 13.3167f, 4.0434f, 13.7072f, 3.6529f)
                curveTo(14.0977f, 3.2624f, 14.7309f, 3.2624f, 15.1214f, 3.6529f)
                lineTo(18.6502f, 7.1817f)
                curveTo(18.7418f, 7.2733f, 18.812f, 7.3783f, 18.8606f, 7.4904f)
                curveTo(18.9492f, 7.6396f, 19.0f, 7.8139f, 19.0f, 8.0f)
                curveTo(19.0f, 8.2897f, 18.8768f, 8.5506f, 18.68f, 8.7332f)
                curveTo(18.6711f, 8.7428f, 18.662f, 8.7523f, 18.6526f, 8.7617f)
                lineTo(15.1215f, 12.2928f)
                curveTo(14.731f, 12.6833f, 14.0978f, 12.6833f, 13.7073f, 12.2928f)
                curveTo(13.3168f, 11.9023f, 13.3168f, 11.2691f, 13.7073f, 10.8786f)
                lineTo(15.5859f, 9.0f)
                horizontalLineTo(10.5f)
                curveTo(8.0147f, 9.0f, 6.0f, 11.0147f, 6.0f, 13.5f)
                curveTo(6.0f, 15.9853f, 8.0147f, 18.0f, 10.5f, 18.0f)
                close()
            }
        }
        .build()
        return _arrowHookUpRight!!
    }

private var _arrowHookUpRight: ImageVector? = null
