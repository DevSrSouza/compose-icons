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

public val RegularGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 17.0f)
                curveTo(21.6642f, 17.0f, 22.0f, 17.3358f, 22.0f, 17.75f)
                curveTo(22.0f, 18.1297f, 21.7178f, 18.4435f, 21.3518f, 18.4932f)
                lineTo(21.25f, 18.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(21.25f)
                curveTo(18.5f, 21.6642f, 18.1642f, 22.0f, 17.75f, 22.0f)
                curveTo(17.3703f, 22.0f, 17.0565f, 21.7178f, 17.0068f, 21.3518f)
                lineTo(17.0f, 21.25f)
                verticalLineTo(18.5f)
                horizontalLineTo(8.75f)
                curveTo(7.017f, 18.5f, 5.6007f, 17.1435f, 5.5051f, 15.4344f)
                lineTo(5.5f, 15.25f)
                lineTo(5.499f, 7.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 7.0f, 2.0f, 6.6642f, 2.0f, 6.25f)
                curveTo(2.0f, 5.8703f, 2.2822f, 5.5565f, 2.6482f, 5.5068f)
                lineTo(2.75f, 5.5f)
                horizontalLineTo(5.499f)
                lineTo(5.5f, 2.75f)
                curveTo(5.5f, 2.3358f, 5.8358f, 2.0f, 6.25f, 2.0f)
                curveTo(6.6297f, 2.0f, 6.9435f, 2.2822f, 6.9932f, 2.6482f)
                lineTo(7.0f, 2.75f)
                lineTo(6.999f, 5.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.999f)
                lineTo(7.0f, 15.25f)
                curveTo(7.0f, 16.1682f, 7.7071f, 16.9212f, 8.6065f, 16.9942f)
                lineTo(8.75f, 17.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(8.0f, 5.5f)
                horizontalLineTo(15.25f)
                curveTo(16.983f, 5.5f, 18.3992f, 6.8565f, 18.4949f, 8.5656f)
                lineTo(18.5f, 8.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.75f)
                curveTo(17.0f, 7.8318f, 16.2929f, 7.0788f, 15.3935f, 7.0058f)
                lineTo(15.25f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
