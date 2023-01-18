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

public val FilledGroup.ArrowBetweenDown: ImageVector
    get() {
        if (_arrowBetweenDown != null) {
            return _arrowBetweenDown!!
        }
        _arrowBetweenDown = Builder(name = "ArrowBetweenDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 2.25f)
                curveTo(6.5f, 1.6977f, 6.0523f, 1.25f, 5.5f, 1.25f)
                curveTo(4.9477f, 1.25f, 4.5f, 1.6977f, 4.5f, 2.25f)
                verticalLineTo(2.5f)
                curveTo(4.5f, 3.8807f, 5.6193f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(18.3807f, 5.0f, 19.5f, 3.8807f, 19.5f, 2.5f)
                verticalLineTo(2.25f)
                curveTo(19.5f, 1.6977f, 19.0523f, 1.25f, 18.5f, 1.25f)
                curveTo(17.9477f, 1.25f, 17.5f, 1.6977f, 17.5f, 2.25f)
                verticalLineTo(2.5f)
                curveTo(17.5f, 2.7761f, 17.2761f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(6.7239f, 3.0f, 6.5f, 2.7761f, 6.5f, 2.5f)
                verticalLineTo(2.25f)
                close()
                moveTo(12.0f, 6.25f)
                curveTo(12.5523f, 6.25f, 13.0f, 6.6977f, 13.0f, 7.25f)
                verticalLineTo(14.3358f)
                lineTo(15.7929f, 11.5429f)
                curveTo(16.1834f, 11.1524f, 16.8166f, 11.1524f, 17.2071f, 11.5429f)
                curveTo(17.5976f, 11.9334f, 17.5976f, 12.5666f, 17.2071f, 12.9571f)
                lineTo(12.7071f, 17.4571f)
                curveTo(12.3166f, 17.8476f, 11.6834f, 17.8476f, 11.2929f, 17.4571f)
                lineTo(6.7929f, 12.9571f)
                curveTo(6.4024f, 12.5666f, 6.4024f, 11.9334f, 6.7929f, 11.5429f)
                curveTo(7.1834f, 11.1524f, 7.8166f, 11.1524f, 8.2071f, 11.5429f)
                lineTo(11.0f, 14.3358f)
                verticalLineTo(7.25f)
                curveTo(11.0f, 6.6977f, 11.4477f, 6.25f, 12.0f, 6.25f)
                close()
                moveTo(4.5f, 21.5f)
                curveTo(4.5f, 20.1193f, 5.6193f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(18.3807f, 19.0f, 19.5f, 20.1193f, 19.5f, 21.5f)
                verticalLineTo(21.75f)
                curveTo(19.5f, 22.3023f, 19.0523f, 22.75f, 18.5f, 22.75f)
                curveTo(17.9477f, 22.75f, 17.5f, 22.3023f, 17.5f, 21.75f)
                verticalLineTo(21.5f)
                curveTo(17.5f, 21.2239f, 17.2761f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(6.7239f, 21.0f, 6.5f, 21.2239f, 6.5f, 21.5f)
                verticalLineTo(21.75f)
                curveTo(6.5f, 22.3023f, 6.0523f, 22.75f, 5.5f, 22.75f)
                curveTo(4.9477f, 22.75f, 4.5f, 22.3023f, 4.5f, 21.75f)
                verticalLineTo(21.5f)
                close()
            }
        }
        .build()
        return _arrowBetweenDown!!
    }

private var _arrowBetweenDown: ImageVector? = null
