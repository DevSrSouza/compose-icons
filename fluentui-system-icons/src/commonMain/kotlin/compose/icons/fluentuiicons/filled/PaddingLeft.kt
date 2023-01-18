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

public val FilledGroup.PaddingLeft: ImageVector
    get() {
        if (_paddingLeft != null) {
            return _paddingLeft!!
        }
        _paddingLeft = Builder(name = "PaddingLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveTo(2.4477f, 4.0f, 2.0f, 4.4477f, 2.0f, 5.0f)
                verticalLineTo(6.75f)
                curveTo(2.0f, 7.3023f, 2.4477f, 7.75f, 3.0f, 7.75f)
                curveTo(3.5523f, 7.75f, 4.0f, 7.3023f, 4.0f, 6.75f)
                lineTo(4.0f, 5.0f)
                curveTo(4.0f, 4.4477f, 3.5523f, 4.0f, 3.0f, 4.0f)
                close()
                moveTo(3.0f, 9.25f)
                curveTo(2.4477f, 9.25f, 2.0f, 9.6977f, 2.0f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(2.0f, 14.3023f, 2.4477f, 14.75f, 3.0f, 14.75f)
                curveTo(3.5523f, 14.75f, 4.0f, 14.3023f, 4.0f, 13.75f)
                lineTo(4.0f, 10.25f)
                curveTo(4.0f, 9.6977f, 3.5523f, 9.25f, 3.0f, 9.25f)
                close()
                moveTo(3.0f, 16.25f)
                curveTo(2.4477f, 16.25f, 2.0f, 16.6977f, 2.0f, 17.25f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.5523f, 2.4477f, 20.0f, 3.0f, 20.0f)
                curveTo(3.5523f, 20.0f, 4.0f, 19.5523f, 4.0f, 19.0f)
                lineTo(4.0f, 17.25f)
                curveTo(4.0f, 16.6977f, 3.5523f, 16.25f, 3.0f, 16.25f)
                close()
                moveTo(21.0f, 4.0f)
                curveTo(20.4477f, 4.0f, 20.0f, 4.4477f, 20.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 19.5523f, 20.4477f, 20.0f, 21.0f, 20.0f)
                curveTo(21.5523f, 20.0f, 22.0f, 19.5523f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 4.4477f, 21.5523f, 4.0f, 21.0f, 4.0f)
                close()
                moveTo(5.2929f, 12.7071f)
                curveTo(4.9024f, 12.3166f, 4.9024f, 11.6834f, 5.2929f, 11.2929f)
                lineTo(10.2929f, 6.2929f)
                curveTo(10.6834f, 5.9024f, 11.3166f, 5.9024f, 11.7071f, 6.2929f)
                curveTo(12.0976f, 6.6834f, 12.0976f, 7.3166f, 11.7071f, 7.7071f)
                lineTo(8.4142f, 11.0f)
                lineTo(18.0f, 11.0f)
                curveTo(18.5523f, 11.0f, 19.0f, 11.4477f, 19.0f, 12.0f)
                curveTo(19.0f, 12.5523f, 18.5523f, 13.0f, 18.0f, 13.0f)
                lineTo(8.4142f, 13.0f)
                lineTo(11.7071f, 16.2929f)
                curveTo(12.0976f, 16.6834f, 12.0976f, 17.3166f, 11.7071f, 17.7071f)
                curveTo(11.3166f, 18.0976f, 10.6834f, 18.0976f, 10.2929f, 17.7071f)
                lineTo(5.2929f, 12.7071f)
                close()
            }
        }
        .build()
        return _paddingLeft!!
    }

private var _paddingLeft: ImageVector? = null
