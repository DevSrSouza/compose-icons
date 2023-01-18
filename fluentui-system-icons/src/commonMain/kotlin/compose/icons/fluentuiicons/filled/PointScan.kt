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

public val FilledGroup.PointScan: ImageVector
    get() {
        if (_pointScan != null) {
            return _pointScan!!
        }
        _pointScan = Builder(name = "PointScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2502f, 2.0f)
                curveTo(10.6299f, 2.0f, 10.9437f, 2.2822f, 10.9934f, 2.6482f)
                lineTo(11.0002f, 2.75f)
                lineTo(11.0007f, 7.5441f)
                curveTo(13.8531f, 7.8854f, 16.1152f, 10.1478f, 16.456f, 13.0003f)
                lineTo(21.25f, 13.0001f)
                curveTo(21.6642f, 13.0001f, 22.0f, 13.3358f, 22.0f, 13.7501f)
                curveTo(22.0f, 14.1297f, 21.7178f, 14.4435f, 21.3518f, 14.4932f)
                lineTo(21.25f, 14.5001f)
                lineTo(16.4558f, 14.5009f)
                curveTo(16.1143f, 17.3526f, 13.8525f, 19.6142f, 11.0007f, 19.9554f)
                lineTo(11.0002f, 21.25f)
                curveTo(11.0002f, 21.6642f, 10.6645f, 22.0f, 10.2502f, 22.0f)
                curveTo(9.8706f, 22.0f, 9.5568f, 21.7178f, 9.5071f, 21.3518f)
                lineTo(9.5002f, 21.25f)
                lineTo(9.5001f, 19.9554f)
                curveTo(6.6481f, 19.6143f, 4.3862f, 17.3527f, 4.0447f, 14.5009f)
                lineTo(2.75f, 14.5001f)
                curveTo(2.3358f, 14.5001f, 2.0f, 14.1643f, 2.0f, 13.7501f)
                curveTo(2.0f, 13.3704f, 2.2822f, 13.0566f, 2.6482f, 13.0069f)
                lineTo(2.75f, 13.0001f)
                lineTo(4.0445f, 13.0003f)
                curveTo(4.3853f, 10.1477f, 6.6476f, 7.8852f, 9.5001f, 7.5441f)
                lineTo(9.5002f, 2.75f)
                curveTo(9.5002f, 2.3358f, 9.836f, 2.0f, 10.2502f, 2.0f)
                close()
                moveTo(10.2502f, 7.4995f)
                curveTo(9.9964f, 7.4995f, 9.7461f, 7.5146f, 9.5001f, 7.5441f)
                lineTo(9.5f, 13.0f)
                lineTo(4.0445f, 13.0003f)
                curveTo(4.0151f, 13.246f, 4.0f, 13.4961f, 4.0f, 13.7498f)
                curveTo(4.0f, 14.004f, 4.0152f, 14.2546f, 4.0447f, 14.5009f)
                lineTo(9.5f, 14.5f)
                lineTo(9.5001f, 19.9554f)
                curveTo(9.7461f, 19.9849f, 9.9964f, 20.0f, 10.2502f, 20.0f)
                curveTo(10.5042f, 20.0f, 10.7547f, 19.9849f, 11.0007f, 19.9554f)
                lineTo(11.0f, 14.5f)
                lineTo(16.4558f, 14.5009f)
                curveTo(16.4853f, 14.2546f, 16.5005f, 14.004f, 16.5005f, 13.7498f)
                curveTo(16.5005f, 13.4961f, 16.4854f, 13.246f, 16.456f, 13.0003f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0007f, 7.5441f)
                curveTo(10.7547f, 7.5146f, 10.5042f, 7.4995f, 10.2502f, 7.4995f)
                close()
            }
        }
        .build()
        return _pointScan!!
    }

private var _pointScan: ImageVector? = null
