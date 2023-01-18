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

public val RegularGroup.SelectAllOn: ImageVector
    get() {
        if (_selectAllOn != null) {
            return _selectAllOn!!
        }
        _selectAllOn = Builder(name = "SelectAllOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4962f, 5.6267f)
                curveTo(21.3721f, 5.9345f, 22.0f, 6.7689f, 22.0f, 7.75f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 20.0972f, 20.0972f, 22.0f, 17.75f, 22.0f)
                horizontalLineTo(7.75f)
                curveTo(6.7689f, 22.0f, 5.9345f, 21.3721f, 5.6267f, 20.4962f)
                lineTo(7.724f, 20.4996f)
                lineTo(17.75f, 20.5f)
                curveTo(19.2688f, 20.5f, 20.5f, 19.2688f, 20.5f, 17.75f)
                verticalLineTo(7.75f)
                lineTo(20.496f, 7.699f)
                lineTo(20.4962f, 5.6267f)
                close()
                moveTo(17.2468f, 2.0f)
                curveTo(18.4895f, 2.0f, 19.4968f, 3.0074f, 19.4968f, 4.25f)
                verticalLineTo(17.2468f)
                curveTo(19.4968f, 18.4895f, 18.4895f, 19.4968f, 17.2468f, 19.4968f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 19.4968f, 2.0f, 18.4895f, 2.0f, 17.2468f)
                verticalLineTo(4.25f)
                curveTo(2.0f, 3.0074f, 3.0074f, 2.0f, 4.25f, 2.0f)
                horizontalLineTo(17.2468f)
                close()
                moveTo(17.2468f, 3.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 3.5f, 3.5f, 3.8358f, 3.5f, 4.25f)
                verticalLineTo(17.2468f)
                curveTo(3.5f, 17.661f, 3.8358f, 17.9968f, 4.25f, 17.9968f)
                horizontalLineTo(17.2468f)
                curveTo(17.661f, 17.9968f, 17.9968f, 17.661f, 17.9968f, 17.2468f)
                verticalLineTo(4.25f)
                curveTo(17.9968f, 3.8358f, 17.661f, 3.5f, 17.2468f, 3.5f)
                close()
                moveTo(9.5812f, 11.3582f)
                lineTo(13.4697f, 7.4697f)
                curveTo(13.7626f, 7.1768f, 14.2374f, 7.1768f, 14.5303f, 7.4697f)
                curveTo(14.7966f, 7.7359f, 14.8208f, 8.1526f, 14.6029f, 8.4462f)
                lineTo(14.5303f, 8.5303f)
                lineTo(10.0303f, 13.0303f)
                curveTo(9.7345f, 13.3262f, 9.2613f, 13.3189f, 8.9736f, 13.0344f)
                lineTo(8.9f, 12.95f)
                lineTo(7.4f, 10.95f)
                curveTo(7.1515f, 10.6186f, 7.2186f, 10.1485f, 7.55f, 9.9f)
                curveTo(7.8513f, 9.6741f, 8.2671f, 9.709f, 8.527f, 9.9662f)
                lineTo(8.6f, 10.05f)
                lineTo(9.5812f, 11.3582f)
                lineTo(13.4697f, 7.4697f)
                lineTo(9.5812f, 11.3582f)
                close()
            }
        }
        .build()
        return _selectAllOn!!
    }

private var _selectAllOn: ImageVector? = null
