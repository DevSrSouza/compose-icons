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

public val FilledGroup.ArrowBounce: ImageVector
    get() {
        if (_arrowBounce != null) {
            return _arrowBounce!!
        }
        _arrowBounce = Builder(name = "ArrowBounce", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                curveTo(11.0f, 6.4477f, 10.5523f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 6.0f, 2.0f, 6.4477f, 2.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 14.5523f, 2.4477f, 15.0f, 3.0f, 15.0f)
                curveTo(3.5523f, 15.0f, 4.0f, 14.5523f, 4.0f, 14.0f)
                verticalLineTo(9.4142f)
                lineTo(12.0431f, 17.4571f)
                curveTo(12.2306f, 17.6446f, 12.485f, 17.75f, 12.7502f, 17.75f)
                curveTo(13.0154f, 17.75f, 13.2698f, 17.6446f, 13.4573f, 17.4571f)
                lineTo(21.7071f, 9.2071f)
                curveTo(22.0976f, 8.8166f, 22.0976f, 8.1834f, 21.7071f, 7.7929f)
                curveTo(21.3166f, 7.4024f, 20.6834f, 7.4024f, 20.2929f, 7.7929f)
                lineTo(12.7502f, 15.3358f)
                lineTo(5.4142f, 8.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 8.0f, 11.0f, 7.5523f, 11.0f, 7.0f)
                close()
            }
        }
        .build()
        return _arrowBounce!!
    }

private var _arrowBounce: ImageVector? = null
