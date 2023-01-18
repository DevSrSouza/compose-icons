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

public val FilledGroup.NotebookSection: ImageVector
    get() {
        if (_notebookSection != null) {
            return _notebookSection!!
        }
        _notebookSection = Builder(name = "NotebookSection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6482f, 2.0069f)
                lineTo(15.75f, 2.0f)
                curveTo(16.1297f, 2.0f, 16.4435f, 2.2822f, 16.4932f, 2.6482f)
                lineTo(16.5f, 2.75f)
                verticalLineTo(21.2503f)
                curveTo(16.5f, 21.6645f, 16.1642f, 22.0003f, 15.75f, 22.0003f)
                curveTo(15.3703f, 22.0003f, 15.0565f, 21.7181f, 15.0068f, 21.3521f)
                lineTo(15.0f, 21.2503f)
                verticalLineTo(19.996f)
                lineTo(9.25f, 19.9964f)
                curveTo(8.0074f, 19.9964f, 7.0f, 18.989f, 7.0f, 17.7464f)
                verticalLineTo(6.2499f)
                curveTo(7.0f, 5.0072f, 8.0074f, 3.9999f, 9.25f, 3.9999f)
                lineTo(15.0f, 3.999f)
                verticalLineTo(2.75f)
                curveTo(15.0f, 2.3703f, 15.2822f, 2.0565f, 15.6482f, 2.0069f)
                lineTo(15.75f, 2.0f)
                lineTo(15.6482f, 2.0069f)
                close()
            }
        }
        .build()
        return _notebookSection!!
    }

private var _notebookSection: ImageVector? = null
