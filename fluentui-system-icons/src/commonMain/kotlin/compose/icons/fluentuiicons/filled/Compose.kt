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

public val FilledGroup.Compose: ImageVector
    get() {
        if (_compose != null) {
            return _compose!!
        }
        _compose = Builder(name = "Compose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9571f, 13.4571f)
                lineTo(21.7071f, 3.7071f)
                curveTo(22.0976f, 3.3166f, 22.0976f, 2.6834f, 21.7071f, 2.2929f)
                curveTo(21.3166f, 1.9024f, 20.6834f, 1.9024f, 20.2929f, 2.2929f)
                lineTo(10.5429f, 12.0429f)
                lineTo(10.25f, 13.75f)
                lineTo(11.9571f, 13.4571f)
                close()
                moveTo(6.5f, 3.0f)
                curveTo(4.567f, 3.0f, 3.0f, 4.567f, 3.0f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(3.0f, 19.433f, 4.567f, 21.0f, 6.5f, 21.0f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 21.0f, 21.0f, 19.433f, 21.0f, 17.5f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 9.4477f, 20.5523f, 9.0f, 20.0f, 9.0f)
                curveTo(19.4477f, 9.0f, 19.0f, 9.4477f, 19.0f, 10.0f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.3284f, 18.3284f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 19.0f, 5.0f, 18.3284f, 5.0f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(5.0f, 5.6716f, 5.6716f, 5.0f, 6.5f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 5.0f, 15.0f, 4.5523f, 15.0f, 4.0f)
                curveTo(15.0f, 3.4477f, 14.5523f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _compose!!
    }

private var _compose: ImageVector? = null
