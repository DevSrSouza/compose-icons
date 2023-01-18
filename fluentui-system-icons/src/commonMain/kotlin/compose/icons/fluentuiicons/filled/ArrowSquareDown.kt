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

public val FilledGroup.ArrowSquareDown: ImageVector
    get() {
        if (_arrowSquareDown != null) {
            return _arrowSquareDown!!
        }
        _arrowSquareDown = Builder(name = "ArrowSquareDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 3.0f)
                curveTo(4.1193f, 3.0f, 3.0f, 4.1193f, 3.0f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(3.0f, 19.8807f, 4.1193f, 21.0f, 5.5f, 21.0f)
                horizontalLineTo(18.5f)
                curveTo(19.8807f, 21.0f, 21.0f, 19.8807f, 21.0f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(21.0f, 4.1193f, 19.8807f, 3.0f, 18.5f, 3.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(16.5303f, 11.7204f)
                curveTo(16.7966f, 11.9866f, 16.8208f, 12.4033f, 16.6029f, 12.6969f)
                lineTo(16.5303f, 12.781f)
                lineTo(12.5295f, 16.7819f)
                curveTo(12.2632f, 17.0482f, 11.8465f, 17.0723f, 11.5529f, 16.8544f)
                lineTo(11.4687f, 16.7818f)
                lineTo(7.4688f, 12.7802f)
                curveTo(7.1759f, 12.4873f, 7.176f, 12.0124f, 7.4689f, 11.7196f)
                curveTo(7.7353f, 11.4534f, 8.1519f, 11.4292f, 8.4455f, 11.6471f)
                lineTo(8.5296f, 11.7198f)
                lineTo(11.2503f, 14.4417f)
                lineTo(11.25f, 7.75f)
                curveTo(11.25f, 7.3703f, 11.5322f, 7.0565f, 11.8982f, 7.0068f)
                lineTo(12.0f, 7.0f)
                curveTo(12.3797f, 7.0f, 12.6935f, 7.2821f, 12.7432f, 7.6482f)
                lineTo(12.75f, 7.75f)
                lineTo(12.7503f, 14.4397f)
                lineTo(15.4697f, 11.7204f)
                curveTo(15.7359f, 11.4541f, 16.1526f, 11.4299f, 16.4462f, 11.6478f)
                lineTo(16.5303f, 11.7204f)
                close()
            }
        }
        .build()
        return _arrowSquareDown!!
    }

private var _arrowSquareDown: ImageVector? = null
