package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.NotebookSectionArrowRight: ImageVector
    get() {
        if (_notebookSectionArrowRight != null) {
            return _notebookSectionArrowRight!!
        }
        _notebookSectionArrowRight = Builder(name = "NotebookSectionArrowRight", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6482f, 2.0069f)
                lineTo(15.75f, 2.0f)
                curveTo(16.1297f, 2.0f, 16.4435f, 2.2822f, 16.4932f, 2.6482f)
                lineTo(16.5f, 2.75f)
                verticalLineTo(11.0768f)
                curveTo(13.3849f, 11.5578f, 11.0f, 14.2505f, 11.0f, 17.5003f)
                curveTo(11.0f, 18.3846f, 11.1766f, 19.2277f, 11.4965f, 19.9962f)
                lineTo(9.25f, 19.9964f)
                curveTo(8.0074f, 19.9964f, 7.0f, 18.989f, 7.0f, 17.7464f)
                verticalLineTo(6.2499f)
                curveTo(7.0f, 5.0072f, 8.0074f, 3.9999f, 9.25f, 3.9999f)
                lineTo(15.0f, 3.999f)
                verticalLineTo(2.75f)
                curveTo(15.0f, 2.3703f, 15.2822f, 2.0565f, 15.6482f, 2.0069f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 17.5003f)
                curveTo(23.0f, 20.5379f, 20.5376f, 23.0003f, 17.5f, 23.0003f)
                curveTo(14.4624f, 23.0003f, 12.0f, 20.5379f, 12.0f, 17.5003f)
                curveTo(12.0f, 14.4627f, 14.4624f, 12.0003f, 17.5f, 12.0003f)
                curveTo(20.5376f, 12.0003f, 23.0f, 14.4627f, 23.0f, 17.5003f)
                close()
                moveTo(14.5f, 17.0003f)
                curveTo(14.2239f, 17.0003f, 14.0f, 17.2242f, 14.0f, 17.5003f)
                curveTo(14.0f, 17.7764f, 14.2239f, 18.0003f, 14.5f, 18.0003f)
                horizontalLineTo(19.2929f)
                lineTo(17.6464f, 19.6468f)
                curveTo(17.4512f, 19.842f, 17.4512f, 20.1586f, 17.6464f, 20.3539f)
                curveTo(17.8417f, 20.5491f, 18.1583f, 20.5491f, 18.3536f, 20.3539f)
                lineTo(20.8536f, 17.8539f)
                curveTo(21.0488f, 17.6586f, 21.0488f, 17.342f, 20.8536f, 17.1468f)
                lineTo(18.3536f, 14.6468f)
                curveTo(18.1583f, 14.4515f, 17.8417f, 14.4515f, 17.6464f, 14.6468f)
                curveTo(17.4512f, 14.842f, 17.4512f, 15.1586f, 17.6464f, 15.3539f)
                lineTo(19.2929f, 17.0003f)
                lineTo(14.5f, 17.0003f)
                close()
            }
        }
        .build()
        return _notebookSectionArrowRight!!
    }

private var _notebookSectionArrowRight: ImageVector? = null
