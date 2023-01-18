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

public val FilledGroup.PuzzleCube: ImageVector
    get() {
        if (_puzzleCube != null) {
            return _puzzleCube!!
        }
        _puzzleCube = Builder(name = "PuzzleCube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 21.0f)
                close()
                moveTo(16.0f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(21.0f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 14.5f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(14.5f, 3.0f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 8.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(3.0f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 16.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(14.5f, 9.5f)
                lineTo(14.5f, 14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _puzzleCube!!
    }

private var _puzzleCube: ImageVector? = null
