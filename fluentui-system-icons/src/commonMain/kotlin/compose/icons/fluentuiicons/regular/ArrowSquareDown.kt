package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowSquareDown: ImageVector
    get() {
        if (_arrowSquareDown != null) {
            return _arrowSquareDown!!
        }
        _arrowSquareDown = Builder(name = "ArrowSquareDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5303f, 11.7204f)
                lineTo(16.4462f, 11.6478f)
                curveTo(16.1526f, 11.4299f, 15.7359f, 11.4541f, 15.4697f, 11.7204f)
                lineTo(12.7503f, 14.4397f)
                lineTo(12.75f, 7.75f)
                lineTo(12.7432f, 7.6483f)
                curveTo(12.6935f, 7.2822f, 12.3797f, 7.0f, 12.0f, 7.0f)
                lineTo(11.8982f, 7.0069f)
                curveTo(11.5322f, 7.0565f, 11.25f, 7.3703f, 11.25f, 7.75f)
                lineTo(11.2503f, 14.4417f)
                lineTo(8.5296f, 11.7198f)
                lineTo(8.4455f, 11.6472f)
                curveTo(8.1519f, 11.4293f, 7.7353f, 11.4534f, 7.4689f, 11.7196f)
                curveTo(7.176f, 12.0124f, 7.1759f, 12.4873f, 7.4688f, 12.7803f)
                lineTo(11.4687f, 16.7818f)
                lineTo(11.5529f, 16.8544f)
                curveTo(11.8465f, 17.0724f, 12.2632f, 17.0482f, 12.5295f, 16.7819f)
                lineTo(16.5303f, 12.7811f)
                lineTo(16.6029f, 12.6969f)
                curveTo(16.8208f, 12.4033f, 16.7966f, 11.9867f, 16.5303f, 11.7204f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _arrowSquareDown!!
    }

private var _arrowSquareDown: ImageVector? = null
