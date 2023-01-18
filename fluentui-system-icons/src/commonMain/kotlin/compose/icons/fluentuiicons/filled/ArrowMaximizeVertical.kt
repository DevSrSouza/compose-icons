package compose.icons.fluentuiicons.filled

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
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ArrowMaximizeVertical: ImageVector
    get() {
        if (_arrowMaximizeVertical != null) {
            return _arrowMaximizeVertical!!
        }
        _arrowMaximizeVertical = Builder(name = "ArrowMaximizeVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2071f, 6.2071f)
                curveTo(14.8166f, 6.5976f, 14.1834f, 6.5976f, 13.7929f, 6.2071f)
                lineTo(13.0f, 5.4142f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 9.5523f, 12.5523f, 10.0f, 12.0f, 10.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 9.5523f, 11.0f, 9.0f)
                lineTo(11.0f, 5.4142f)
                lineTo(10.2071f, 6.2071f)
                curveTo(9.8166f, 6.5976f, 9.1834f, 6.5976f, 8.7929f, 6.2071f)
                curveTo(8.4024f, 5.8166f, 8.4024f, 5.1834f, 8.7929f, 4.7929f)
                lineTo(11.2929f, 2.2929f)
                curveTo(11.3888f, 2.197f, 11.4993f, 2.1247f, 11.6172f, 2.0759f)
                curveTo(11.7343f, 2.0273f, 11.8625f, 2.0004f, 11.997f, 2.0f)
                lineTo(12.0f, 2.0f)
                lineTo(12.003f, 2.0f)
                curveTo(12.2579f, 2.0008f, 12.5126f, 2.0984f, 12.7071f, 2.2929f)
                lineTo(15.2071f, 4.7929f)
                curveTo(15.5976f, 5.1834f, 15.5976f, 5.8166f, 15.2071f, 6.2071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                curveTo(4.4477f, 11.0f, 4.0f, 11.4477f, 4.0f, 12.0f)
                curveTo(4.0f, 12.5523f, 4.4477f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 13.0f, 20.0f, 12.5523f, 20.0f, 12.0f)
                curveTo(20.0f, 11.4477f, 19.5523f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0092f, 22.0f)
                curveTo(12.1415f, 21.9988f, 12.2676f, 21.9719f, 12.3828f, 21.9241f)
                curveTo(12.5007f, 21.8753f, 12.6112f, 21.803f, 12.7071f, 21.7071f)
                lineTo(15.2071f, 19.2071f)
                curveTo(15.5976f, 18.8166f, 15.5976f, 18.1834f, 15.2071f, 17.7929f)
                curveTo(14.8166f, 17.4024f, 14.1834f, 17.4024f, 13.7929f, 17.7929f)
                lineTo(13.0f, 18.5858f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 14.4477f, 12.5523f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4477f, 14.0f, 11.0f, 14.4477f, 11.0f, 15.0f)
                lineTo(11.0f, 18.5858f)
                lineTo(10.2071f, 17.7929f)
                curveTo(9.8166f, 17.4024f, 9.1834f, 17.4024f, 8.7929f, 17.7929f)
                curveTo(8.4024f, 18.1834f, 8.4024f, 18.8166f, 8.7929f, 19.2071f)
                lineTo(11.2929f, 21.7071f)
                curveTo(11.4858f, 21.9f, 11.7379f, 21.9976f, 11.9908f, 22.0f)
            }
        }
        .build()
        return _arrowMaximizeVertical!!
    }

private var _arrowMaximizeVertical: ImageVector? = null
