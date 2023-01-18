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

public val FilledGroup.ColumnTriple: ImageVector
    get() {
        if (_columnTriple != null) {
            return _columnTriple!!
        }
        _columnTriple = Builder(name = "ColumnTriple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2383f, 3.0008f)
                curveTo(7.2048f, 3.0008f, 7.9883f, 3.7843f, 7.9883f, 4.7508f)
                verticalLineTo(19.2508f)
                curveTo(7.9883f, 20.2173f, 7.2048f, 21.0008f, 6.2383f, 21.0008f)
                horizontalLineTo(3.7383f)
                curveTo(2.7718f, 21.0008f, 1.9883f, 20.2173f, 1.9883f, 19.2508f)
                verticalLineTo(4.7508f)
                curveTo(1.9883f, 3.8327f, 2.6954f, 3.0796f, 3.5947f, 3.0066f)
                lineTo(3.7383f, 3.0008f)
                horizontalLineTo(6.2383f)
                close()
                moveTo(20.2643f, 3.0008f)
                curveTo(21.2308f, 3.0008f, 22.0143f, 3.7843f, 22.0143f, 4.7508f)
                verticalLineTo(19.2508f)
                curveTo(22.0143f, 20.2173f, 21.2308f, 21.0008f, 20.2643f, 21.0008f)
                horizontalLineTo(17.7643f)
                curveTo(16.7978f, 21.0008f, 16.0143f, 20.2173f, 16.0143f, 19.2508f)
                verticalLineTo(4.7508f)
                curveTo(16.0143f, 3.7843f, 16.7978f, 3.0008f, 17.7643f, 3.0008f)
                horizontalLineTo(20.2643f)
                close()
                moveTo(13.2383f, 3.0f)
                curveTo(14.2048f, 3.0f, 14.9883f, 3.7835f, 14.9883f, 4.75f)
                verticalLineTo(19.25f)
                curveTo(14.9883f, 20.2165f, 14.2048f, 21.0f, 13.2383f, 21.0f)
                horizontalLineTo(10.7383f)
                curveTo(9.7718f, 21.0f, 8.9883f, 20.2165f, 8.9883f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(8.9883f, 3.7835f, 9.7718f, 3.0f, 10.7383f, 3.0f)
                horizontalLineTo(13.2383f)
                close()
            }
        }
        .build()
        return _columnTriple!!
    }

private var _columnTriple: ImageVector? = null
