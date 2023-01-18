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

public val FilledGroup.ArrowMinimizeVertical: ImageVector
    get() {
        if (_arrowMinimizeVertical != null) {
            return _arrowMinimizeVertical!!
        }
        _arrowMinimizeVertical = Builder(name = "ArrowMinimizeVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7929f, 18.7071f)
                curveTo(14.1834f, 19.0977f, 14.8166f, 19.0977f, 15.2071f, 18.7071f)
                curveTo(15.5976f, 18.3166f, 15.5976f, 17.6834f, 15.2071f, 17.2929f)
                lineTo(12.7071f, 14.7929f)
                curveTo(12.3166f, 14.4024f, 11.6834f, 14.4024f, 11.2929f, 14.7929f)
                lineTo(8.7929f, 17.2929f)
                curveTo(8.4024f, 17.6834f, 8.4024f, 18.3166f, 8.7929f, 18.7071f)
                curveTo(9.1834f, 19.0977f, 9.8166f, 19.0977f, 10.2071f, 18.7071f)
                lineTo(11.0f, 17.9142f)
                lineTo(11.0f, 21.0f)
                curveTo(11.0f, 21.5523f, 11.4477f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5523f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                verticalLineTo(17.9142f)
                lineTo(13.7929f, 18.7071f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 11.4477f, 4.4477f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 11.0f, 20.0f, 11.4477f, 20.0f, 12.0f)
                curveTo(20.0f, 12.5523f, 19.5523f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 13.0f, 4.0f, 12.5523f, 4.0f, 12.0f)
                close()
                moveTo(13.0f, 3.0f)
                curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
                curveTo(11.4477f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
                lineTo(11.0f, 6.0858f)
                lineTo(10.2071f, 5.2929f)
                curveTo(9.8166f, 4.9024f, 9.1834f, 4.9024f, 8.7929f, 5.2929f)
                curveTo(8.4024f, 5.6834f, 8.4024f, 6.3166f, 8.7929f, 6.7071f)
                lineTo(11.2929f, 9.2071f)
                curveTo(11.6834f, 9.5976f, 12.3166f, 9.5976f, 12.7071f, 9.2071f)
                lineTo(15.2071f, 6.7071f)
                curveTo(15.5976f, 6.3166f, 15.5976f, 5.6834f, 15.2071f, 5.2929f)
                curveTo(14.8166f, 4.9024f, 14.1834f, 4.9024f, 13.7929f, 5.2929f)
                lineTo(13.0f, 6.0858f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _arrowMinimizeVertical!!
    }

private var _arrowMinimizeVertical: ImageVector? = null
