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

public val FilledGroup.Board: ImageVector
    get() {
        if (_board != null) {
            return _board!!
        }
        _board = Builder(name = "Board", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.499f, 9.4991f)
                lineTo(11.5f, 21.001f)
                lineTo(6.2501f, 21.0017f)
                curveTo(4.517f, 21.0017f, 3.1008f, 19.6454f, 3.0051f, 17.9362f)
                lineTo(3.0f, 17.7518f)
                verticalLineTo(9.4991f)
                horizontalLineTo(11.499f)
                close()
                moveTo(12.999f, 15.499f)
                horizontalLineTo(21.5f)
                lineTo(21.5008f, 17.7518f)
                curveTo(21.5006f, 19.5466f, 20.0456f, 21.0017f, 18.2507f, 21.0017f)
                lineTo(13.0f, 21.001f)
                lineTo(12.999f, 15.499f)
                close()
                moveTo(18.2514f, 2.498f)
                curveTo(19.9844f, 2.498f, 21.4007f, 3.8544f, 21.4963f, 5.5635f)
                lineTo(21.5014f, 5.748f)
                lineTo(21.5f, 13.999f)
                horizontalLineTo(12.999f)
                lineTo(13.0f, 2.498f)
                horizontalLineTo(18.2514f)
                close()
                moveTo(11.5f, 2.498f)
                lineTo(11.499f, 7.9991f)
                horizontalLineTo(3.0f)
                lineTo(3.0006f, 5.748f)
                curveTo(3.0008f, 3.9532f, 4.4558f, 2.498f, 6.2506f, 2.498f)
                horizontalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _board!!
    }

private var _board: ImageVector? = null
