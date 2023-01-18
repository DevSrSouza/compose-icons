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

public val FilledGroup.PaddingTop: ImageVector
    get() {
        if (_paddingTop != null) {
            return _paddingTop!!
        }
        _paddingTop = Builder(name = "PaddingTop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                curveTo(4.0f, 2.4477f, 4.4477f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(6.75f)
                curveTo(7.3023f, 2.0f, 7.75f, 2.4477f, 7.75f, 3.0f)
                curveTo(7.75f, 3.5523f, 7.3023f, 4.0f, 6.75f, 4.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 4.0f, 4.0f, 3.5523f, 4.0f, 3.0f)
                close()
                moveTo(9.25f, 3.0f)
                curveTo(9.25f, 2.4477f, 9.6977f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                curveTo(14.3023f, 2.0f, 14.75f, 2.4477f, 14.75f, 3.0f)
                curveTo(14.75f, 3.5523f, 14.3023f, 4.0f, 13.75f, 4.0f)
                horizontalLineTo(10.25f)
                curveTo(9.6977f, 4.0f, 9.25f, 3.5523f, 9.25f, 3.0f)
                close()
                moveTo(16.25f, 3.0f)
                curveTo(16.25f, 2.4477f, 16.6977f, 2.0f, 17.25f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 2.0f, 20.0f, 2.4477f, 20.0f, 3.0f)
                curveTo(20.0f, 3.5523f, 19.5523f, 4.0f, 19.0f, 4.0f)
                horizontalLineTo(17.25f)
                curveTo(16.6977f, 4.0f, 16.25f, 3.5523f, 16.25f, 3.0f)
                close()
                moveTo(4.0f, 21.0f)
                curveTo(4.0f, 20.4477f, 4.4477f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 20.0f, 20.0f, 20.4477f, 20.0f, 21.0f)
                curveTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f)
                close()
                moveTo(12.7071f, 5.2929f)
                curveTo(12.3166f, 4.9024f, 11.6834f, 4.9024f, 11.2929f, 5.2929f)
                lineTo(6.2929f, 10.2929f)
                curveTo(5.9024f, 10.6834f, 5.9024f, 11.3166f, 6.2929f, 11.7071f)
                curveTo(6.6834f, 12.0976f, 7.3166f, 12.0976f, 7.7071f, 11.7071f)
                lineTo(11.0f, 8.4142f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 18.5523f, 11.4477f, 19.0f, 12.0f, 19.0f)
                curveTo(12.5523f, 19.0f, 13.0f, 18.5523f, 13.0f, 18.0f)
                verticalLineTo(8.4142f)
                lineTo(16.2929f, 11.7071f)
                curveTo(16.6834f, 12.0976f, 17.3166f, 12.0976f, 17.7071f, 11.7071f)
                curveTo(18.0976f, 11.3166f, 18.0976f, 10.6834f, 17.7071f, 10.2929f)
                lineTo(12.7071f, 5.2929f)
                close()
            }
        }
        .build()
        return _paddingTop!!
    }

private var _paddingTop: ImageVector? = null
