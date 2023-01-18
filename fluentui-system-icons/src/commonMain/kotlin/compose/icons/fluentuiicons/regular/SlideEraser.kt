package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.SlideEraser: ImageVector
    get() {
        if (_slideEraser != null) {
            return _slideEraser!!
        }
        _slideEraser = Builder(name = "SlideEraser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(12.5356f)
                lineTo(21.1991f, 11.7347f)
                curveTo(20.9899f, 11.5255f, 20.7529f, 11.3612f, 20.5f, 11.2416f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.0596f, 19.9404f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(4.75f)
                curveTo(4.0596f, 5.5f, 3.5f, 6.0596f, 3.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(3.5f, 17.9404f, 4.0596f, 18.5f, 4.75f, 18.5f)
                horizontalLineTo(12.0149f)
                curveTo(12.0319f, 19.0338f, 12.2189f, 19.5632f, 12.576f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4919f, 12.4418f)
                curveTo(19.9062f, 11.856f, 18.9564f, 11.856f, 18.3706f, 12.4417f)
                lineTo(15.26f, 15.5524f)
                lineTo(19.4671f, 19.7595f)
                lineTo(22.5777f, 16.6489f)
                curveTo(23.1635f, 16.0631f, 23.1635f, 15.1133f, 22.5777f, 14.5275f)
                lineTo(20.4919f, 12.4418f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.453f, 17.3593f)
                lineTo(14.5529f, 16.2595f)
                lineTo(18.76f, 20.4666f)
                lineTo(17.6601f, 21.5665f)
                curveTo(17.0743f, 22.1522f, 16.1246f, 22.1522f, 15.5388f, 21.5665f)
                lineTo(13.453f, 19.4807f)
                curveTo(12.8672f, 18.8949f, 12.8672f, 17.9451f, 13.453f, 17.3593f)
                close()
            }
        }
        .build()
        return _slideEraser!!
    }

private var _slideEraser: ImageVector? = null
