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

public val FilledGroup.SubtractSquare: ImageVector
    get() {
        if (_subtractSquare != null) {
            return _subtractSquare!!
        }
        _subtractSquare = Builder(name = "SubtractSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(16.25f, 11.25f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 11.25f, 7.0f, 11.586f, 7.0f, 12.0f)
                curveTo(7.0f, 12.414f, 7.336f, 12.75f, 7.75f, 12.75f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.75f, 17.0f, 12.414f, 17.0f, 12.0f)
                curveTo(17.0f, 11.586f, 16.664f, 11.25f, 16.25f, 11.25f)
                close()
            }
        }
        .build()
        return _subtractSquare!!
    }

private var _subtractSquare: ImageVector? = null
