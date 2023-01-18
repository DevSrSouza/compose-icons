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

public val RegularGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5911f, 2.513f)
                curveTo(11.4947f, 2.1467f, 12.5053f, 2.1467f, 13.4089f, 2.513f)
                lineTo(20.9075f, 5.553f)
                curveTo(21.5679f, 5.8207f, 22.0f, 6.4622f, 22.0f, 7.1748f)
                verticalLineTo(16.8275f)
                curveTo(22.0f, 17.5401f, 21.5679f, 18.1815f, 20.9075f, 18.4493f)
                lineTo(13.4089f, 21.4892f)
                curveTo(12.5053f, 21.8555f, 11.4947f, 21.8555f, 10.5911f, 21.4892f)
                lineTo(3.0925f, 18.4493f)
                curveTo(2.4321f, 18.1815f, 2.0f, 17.5401f, 2.0f, 16.8275f)
                verticalLineTo(7.1748f)
                curveTo(2.0f, 6.4622f, 2.4321f, 5.8207f, 3.0925f, 5.553f)
                lineTo(10.5911f, 2.513f)
                close()
                moveTo(12.8453f, 3.9031f)
                curveTo(12.3032f, 3.6833f, 11.6968f, 3.6833f, 11.1547f, 3.9031f)
                lineTo(9.241f, 4.6789f)
                lineTo(16.7678f, 7.606f)
                lineTo(19.437f, 6.5754f)
                lineTo(12.8453f, 3.9031f)
                close()
                moveTo(14.6911f, 8.4079f)
                lineTo(7.2147f, 5.5004f)
                lineTo(4.5903f, 6.5644f)
                lineTo(12.0013f, 9.4464f)
                lineTo(14.6911f, 8.4079f)
                close()
                moveTo(3.5f, 16.8275f)
                curveTo(3.5f, 16.9293f, 3.5617f, 17.0209f, 3.6561f, 17.0592f)
                lineTo(11.1547f, 20.0991f)
                curveTo(11.1863f, 20.112f, 11.2183f, 20.1241f, 11.2503f, 20.1354f)
                verticalLineTo(10.7638f)
                lineTo(3.5f, 7.7498f)
                verticalLineTo(16.8275f)
                close()
                moveTo(12.8453f, 20.0991f)
                lineTo(20.3439f, 17.0592f)
                curveTo(20.4383f, 17.0209f, 20.5f, 16.9293f, 20.5f, 16.8275f)
                verticalLineTo(7.7729f)
                lineTo(12.7503f, 10.7651f)
                verticalLineTo(20.1352f)
                curveTo(12.7822f, 20.1239f, 12.8139f, 20.1119f, 12.8453f, 20.0991f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
