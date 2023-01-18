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

public val RegularGroup.PointScan: ImageVector
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
                moveTo(9.5f, 14.5f)
                lineTo(5.5591f, 14.5009f)
                curveTo(5.8803f, 16.5231f, 7.4777f, 18.1203f, 9.5001f, 18.4411f)
                lineTo(9.5f, 14.5f)
                close()
                moveTo(14.9415f, 14.5009f)
                lineTo(11.0f, 14.5f)
                lineTo(11.0008f, 18.441f)
                curveTo(13.023f, 18.12f, 14.6202f, 16.523f, 14.9415f, 14.5009f)
                close()
                moveTo(9.5001f, 9.0584f)
                curveTo(7.4772f, 9.3793f, 5.8795f, 10.9772f, 5.5588f, 13.0001f)
                lineTo(9.5f, 13.0f)
                lineTo(9.5001f, 9.0584f)
                close()
                moveTo(11.0008f, 9.0585f)
                lineTo(11.0f, 13.0f)
                lineTo(14.9417f, 13.0001f)
                curveTo(14.6325f, 11.0496f, 13.136f, 9.4942f, 11.2159f, 9.0977f)
                lineTo(11.0008f, 9.0585f)
                close()
            }
        }
        .build()
        return _pointScan!!
    }

private var _pointScan: ImageVector? = null
