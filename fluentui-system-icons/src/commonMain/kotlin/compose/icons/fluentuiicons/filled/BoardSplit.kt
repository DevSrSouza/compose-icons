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

public val FilledGroup.BoardSplit: ImageVector
    get() {
        if (_boardSplit != null) {
            return _boardSplit!!
        }
        _boardSplit = Builder(name = "BoardSplit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(11.0f)
                lineTo(14.0f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(3.0f, 17.75f)
                verticalLineTo(12.5f)
                lineTo(14.0f, 12.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                close()
                moveTo(15.5f, 16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.5f)
                close()
                moveTo(21.0f, 14.5f)
                verticalLineTo(9.5f)
                lineTo(15.5f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 8.0f)
                lineTo(15.5f, 8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _boardSplit!!
    }

private var _boardSplit: ImageVector? = null
