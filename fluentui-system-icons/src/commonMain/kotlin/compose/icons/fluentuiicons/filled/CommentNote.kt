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

public val FilledGroup.CommentNote: ImageVector
    get() {
        if (_commentNote != null) {
            return _commentNote!!
        }
        _commentNote = Builder(name = "CommentNote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(12.0f, 1.8954f, 12.8954f, 1.0f, 14.0f, 1.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1046f, 1.0f, 23.0f, 1.8954f, 23.0f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(23.0f, 10.1046f, 22.1046f, 11.0f, 21.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 11.0f, 12.0f, 10.1046f, 12.0f, 9.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(14.5f, 4.0f)
                curveTo(14.2239f, 4.0f, 14.0f, 4.2239f, 14.0f, 4.5f)
                curveTo(14.0f, 4.7761f, 14.2239f, 5.0f, 14.5f, 5.0f)
                horizontalLineTo(20.5f)
                curveTo(20.7761f, 5.0f, 21.0f, 4.7761f, 21.0f, 4.5f)
                curveTo(21.0f, 4.2239f, 20.7761f, 4.0f, 20.5f, 4.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(14.5f, 7.0f)
                curveTo(14.2239f, 7.0f, 14.0f, 7.2239f, 14.0f, 7.5f)
                curveTo(14.0f, 7.7761f, 14.2239f, 8.0f, 14.5f, 8.0f)
                horizontalLineTo(20.5f)
                curveTo(20.7761f, 8.0f, 21.0f, 7.7761f, 21.0f, 7.5f)
                curveTo(21.0f, 7.2239f, 20.7761f, 7.0f, 20.5f, 7.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(5.25f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                curveTo(11.0f, 10.6569f, 12.3431f, 12.0f, 14.0f, 12.0f)
                horizontalLineTo(21.0f)
                curveTo(21.3506f, 12.0f, 21.6872f, 11.9398f, 22.0f, 11.8293f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 16.5449f, 20.5449f, 18.0f, 18.75f, 18.0f)
                horizontalLineTo(12.9648f)
                lineTo(7.5781f, 21.8173f)
                curveTo(7.1275f, 22.1366f, 6.5034f, 22.0301f, 6.1841f, 21.5795f)
                curveTo(6.0643f, 21.4105f, 6.0f, 21.2085f, 6.0f, 21.0016f)
                lineTo(5.9992f, 18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 18.0f, 2.0f, 16.5449f, 2.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                close()
            }
        }
        .build()
        return _commentNote!!
    }

private var _commentNote: ImageVector? = null
