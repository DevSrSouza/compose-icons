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

public val FilledGroup.ArrowSplit: ImageVector
    get() {
        if (_arrowSplit != null) {
            return _arrowSplit!!
        }
        _arrowSplit = Builder(name = "ArrowSplit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 3.0f)
                curveTo(12.5524f, 3.0f, 13.0001f, 3.4477f, 13.0001f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.25f)
                curveTo(16.7688f, 9.0f, 18.0f, 10.2312f, 18.0f, 11.75f)
                verticalLineTo(17.5858f)
                lineTo(19.2929f, 16.2929f)
                curveTo(19.6834f, 15.9024f, 20.3166f, 15.9024f, 20.7071f, 16.2929f)
                curveTo(21.0976f, 16.6834f, 21.0976f, 17.3166f, 20.7071f, 17.7071f)
                lineTo(17.7071f, 20.7071f)
                curveTo(17.3166f, 21.0976f, 16.6834f, 21.0976f, 16.2929f, 20.7071f)
                lineTo(13.2929f, 17.7071f)
                curveTo(12.9024f, 17.3166f, 12.9024f, 16.6834f, 13.2929f, 16.2929f)
                curveTo(13.6834f, 15.9024f, 14.3166f, 15.9024f, 14.7071f, 16.2929f)
                lineTo(16.0f, 17.5858f)
                verticalLineTo(11.75f)
                curveTo(16.0f, 11.3358f, 15.6642f, 11.0f, 15.25f, 11.0f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 11.0f, 8.0f, 11.3358f, 8.0f, 11.75f)
                verticalLineTo(17.5858f)
                lineTo(9.2929f, 16.2929f)
                curveTo(9.6834f, 15.9024f, 10.3166f, 15.9024f, 10.7071f, 16.2929f)
                curveTo(11.0976f, 16.6834f, 11.0976f, 17.3166f, 10.7071f, 17.7071f)
                lineTo(7.7071f, 20.7071f)
                curveTo(7.3166f, 21.0976f, 6.6834f, 21.0976f, 6.2929f, 20.7071f)
                lineTo(3.2929f, 17.7071f)
                curveTo(2.9024f, 17.3166f, 2.9024f, 16.6834f, 3.2929f, 16.2929f)
                curveTo(3.6834f, 15.9024f, 4.3166f, 15.9024f, 4.7071f, 16.2929f)
                lineTo(6.0f, 17.5858f)
                verticalLineTo(11.75f)
                curveTo(6.0f, 10.2312f, 7.2312f, 9.0f, 8.75f, 9.0f)
                horizontalLineTo(11.0001f)
                verticalLineTo(4.0f)
                curveTo(11.0001f, 3.4477f, 11.4478f, 3.0f, 12.0001f, 3.0f)
                close()
            }
        }
        .build()
        return _arrowSplit!!
    }

private var _arrowSplit: ImageVector? = null
