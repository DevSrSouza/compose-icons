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

public val FilledGroup.BorderTopBottomThick: ImageVector
    get() {
        if (_borderTopBottomThick != null) {
            return _borderTopBottomThick!!
        }
        _borderTopBottomThick = Builder(name = "BorderTopBottomThick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 6.5523f, 3.4477f, 7.0f, 4.0f, 7.0f)
                curveTo(4.5523f, 7.0f, 5.0f, 6.5523f, 5.0f, 6.0f)
                curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                curveTo(19.0f, 6.5523f, 19.4477f, 7.0f, 20.0f, 7.0f)
                curveTo(20.5523f, 7.0f, 21.0f, 6.5523f, 21.0f, 6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 3.0f, 3.0f, 4.3432f, 3.0f, 6.0f)
                close()
                moveTo(5.0f, 11.0f)
                curveTo(5.0f, 10.4477f, 4.5523f, 10.0f, 4.0f, 10.0f)
                curveTo(3.4477f, 10.0f, 3.0f, 10.4477f, 3.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 13.5523f, 3.4477f, 14.0f, 4.0f, 14.0f)
                curveTo(4.5523f, 14.0f, 5.0f, 13.5523f, 5.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(5.5f, 17.25f)
                verticalLineTo(17.75f)
                curveTo(5.5f, 18.1642f, 5.8358f, 18.5f, 6.25f, 18.5f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 18.5f, 18.5f, 18.1642f, 18.5f, 17.75f)
                verticalLineTo(17.25f)
                curveTo(18.5f, 16.5596f, 19.0596f, 16.0f, 19.75f, 16.0f)
                curveTo(20.4404f, 16.0f, 21.0f, 16.5596f, 21.0f, 17.25f)
                verticalLineTo(18.0f)
                lineTo(20.9905f, 18.0006f)
                curveTo(20.8626f, 19.6784f, 19.4606f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.5394f, 21.0f, 3.1374f, 19.6784f, 3.0095f, 18.0006f)
                lineTo(3.0f, 18.0f)
                verticalLineTo(17.25f)
                curveTo(3.0f, 16.5596f, 3.5596f, 16.0f, 4.25f, 16.0f)
                curveTo(4.9404f, 16.0f, 5.5f, 16.5596f, 5.5f, 17.25f)
                close()
                moveTo(20.0f, 10.0f)
                curveTo(19.4477f, 10.0f, 19.0f, 10.4477f, 19.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 13.5523f, 19.4477f, 14.0f, 20.0f, 14.0f)
                curveTo(20.5523f, 14.0f, 21.0f, 13.5523f, 21.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 10.4477f, 20.5523f, 10.0f, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _borderTopBottomThick!!
    }

private var _borderTopBottomThick: ImageVector? = null
