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

public val FilledGroup.StackStar: ImageVector
    get() {
        if (_stackStar != null) {
            return _stackStar!!
        }
        _stackStar = Builder(name = "StackStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                curveTo(2.8954f, 4.0f, 2.0f, 4.8954f, 2.0f, 6.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 14.1046f, 2.8954f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1046f, 15.0f, 17.0f, 14.1046f, 17.0f, 13.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.8954f, 16.1046f, 4.0f, 15.0f, 4.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.5f, 6.1f)
                curveTo(9.6894f, 6.1f, 9.8625f, 6.207f, 9.9472f, 6.3764f)
                lineTo(10.8275f, 8.137f)
                lineTo(12.562f, 8.3538f)
                curveTo(12.7596f, 8.3785f, 12.9238f, 8.5182f, 12.9798f, 8.7093f)
                curveTo(13.0358f, 8.9004f, 12.9731f, 9.1066f, 12.8201f, 9.2341f)
                lineTo(11.5542f, 10.289f)
                lineTo(11.9881f, 12.2415f)
                curveTo(12.0318f, 12.4382f, 11.9532f, 12.6419f, 11.7886f, 12.7582f)
                curveTo(11.6241f, 12.8746f, 11.4059f, 12.8808f, 11.235f, 12.774f)
                lineTo(9.5f, 11.6896f)
                lineTo(7.765f, 12.774f)
                curveTo(7.5941f, 12.8808f, 7.3759f, 12.8746f, 7.2113f, 12.7582f)
                curveTo(7.0468f, 12.6419f, 6.9682f, 12.4382f, 7.0119f, 12.2415f)
                lineTo(7.4458f, 10.289f)
                lineTo(6.1799f, 9.2341f)
                curveTo(6.0269f, 9.1066f, 5.9641f, 8.9004f, 6.0202f, 8.7093f)
                curveTo(6.0762f, 8.5182f, 6.2403f, 8.3785f, 6.438f, 8.3538f)
                lineTo(8.1725f, 8.137f)
                lineTo(9.0528f, 6.3764f)
                curveTo(9.1375f, 6.207f, 9.3106f, 6.1f, 9.5f, 6.1f)
                close()
                moveTo(6.5f, 17.5f)
                curveTo(5.5681f, 17.5f, 4.785f, 16.8626f, 4.563f, 16.0f)
                horizontalLineTo(15.5f)
                curveTo(16.8807f, 16.0f, 18.0f, 14.8807f, 18.0f, 13.5f)
                verticalLineTo(6.563f)
                curveTo(18.8626f, 6.785f, 19.5f, 7.5681f, 19.5f, 8.5f)
                verticalLineTo(13.5f)
                curveTo(19.5f, 15.7091f, 17.7091f, 17.5f, 15.5f, 17.5f)
                horizontalLineTo(6.5f)
                close()
                moveTo(9.0f, 20.0f)
                curveTo(8.0681f, 20.0f, 7.285f, 19.3626f, 7.063f, 18.5f)
                horizontalLineTo(16.25f)
                curveTo(18.5972f, 18.5f, 20.5f, 16.5972f, 20.5f, 14.25f)
                verticalLineTo(9.063f)
                curveTo(21.3626f, 9.285f, 22.0f, 10.0681f, 22.0f, 11.0f)
                verticalLineTo(14.25f)
                curveTo(22.0f, 17.4256f, 19.4256f, 20.0f, 16.25f, 20.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _stackStar!!
    }

private var _stackStar: ImageVector? = null
