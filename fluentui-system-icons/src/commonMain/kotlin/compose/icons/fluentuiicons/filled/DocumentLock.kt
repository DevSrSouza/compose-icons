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

public val FilledGroup.DocumentLock: ImageVector
    get() {
        if (_documentLock != null) {
            return _documentLock!!
        }
        _documentLock = Builder(name = "DocumentLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(11.95f)
                curveTo(11.9828f, 21.8384f, 12.0f, 21.6712f, 12.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(12.0f, 15.2905f, 11.1411f, 14.2816f, 10.0f, 14.05f)
                verticalLineTo(14.0f)
                curveTo(10.0f, 12.067f, 8.433f, 10.5f, 6.5f, 10.5f)
                curveTo(5.5207f, 10.5f, 4.6353f, 10.9022f, 4.0f, 11.5505f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.8954f, 4.8954f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8.0f)
                curveTo(13.5f, 8.2761f, 13.7239f, 8.5f, 14.0f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineTo(3.5f)
                curveTo(2.6716f, 15.0f, 2.0f, 15.6716f, 2.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(2.0f, 22.3284f, 2.6716f, 23.0f, 3.5f, 23.0f)
                horizontalLineTo(9.5f)
                curveTo(10.3284f, 23.0f, 11.0f, 22.3284f, 11.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(11.0f, 15.6716f, 10.3284f, 15.0f, 9.5f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                curveTo(9.0f, 12.6193f, 7.8807f, 11.5f, 6.5f, 11.5f)
                curveTo(5.1193f, 11.5f, 4.0f, 12.6193f, 4.0f, 14.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(5.5f, 14.0f)
                curveTo(5.5f, 13.4477f, 5.9477f, 13.0f, 6.5f, 13.0f)
                curveTo(7.0523f, 13.0f, 7.5f, 13.4477f, 7.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(7.5f, 19.0f)
                curveTo(7.5f, 19.5523f, 7.0523f, 20.0f, 6.5f, 20.0f)
                curveTo(5.9477f, 20.0f, 5.5f, 19.5523f, 5.5f, 19.0f)
                curveTo(5.5f, 18.4477f, 5.9477f, 18.0f, 6.5f, 18.0f)
                curveTo(7.0523f, 18.0f, 7.5f, 18.4477f, 7.5f, 19.0f)
                close()
            }
        }
        .build()
        return _documentLock!!
    }

private var _documentLock: ImageVector? = null
