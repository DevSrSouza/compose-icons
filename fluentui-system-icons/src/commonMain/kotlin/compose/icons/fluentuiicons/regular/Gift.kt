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

public val RegularGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.0f)
                curveTo(16.2949f, 2.0f, 17.75f, 3.4551f, 17.75f, 5.25f)
                curveTo(17.75f, 5.8945f, 17.5624f, 6.4953f, 17.2387f, 7.0005f)
                lineTo(19.75f, 7.0f)
                curveTo(20.4404f, 7.0f, 21.0f, 7.5596f, 21.0f, 8.25f)
                verticalLineTo(11.75f)
                curveTo(21.0f, 12.3544f, 20.571f, 12.8586f, 20.0009f, 12.9748f)
                lineTo(20.0f, 18.75f)
                curveTo(20.0f, 20.483f, 18.6435f, 21.8992f, 16.9344f, 21.9949f)
                lineTo(16.75f, 22.0f)
                horizontalLineTo(7.25f)
                curveTo(5.517f, 22.0f, 4.1007f, 20.6435f, 4.0051f, 18.9344f)
                lineTo(4.0f, 18.75f)
                lineTo(4.0001f, 12.975f)
                curveTo(3.4295f, 12.8592f, 3.0f, 12.3548f, 3.0f, 11.75f)
                verticalLineTo(8.25f)
                curveTo(3.0f, 7.5596f, 3.5596f, 7.0f, 4.25f, 7.0f)
                lineTo(6.7613f, 7.0005f)
                curveTo(6.4376f, 6.4953f, 6.25f, 5.8945f, 6.25f, 5.25f)
                curveTo(6.25f, 3.4551f, 7.7051f, 2.0f, 9.5f, 2.0f)
                curveTo(10.5055f, 2.0f, 11.4044f, 2.4567f, 12.0006f, 3.1739f)
                curveTo(12.5956f, 2.4567f, 13.4945f, 2.0f, 14.5f, 2.0f)
                close()
                moveTo(11.25f, 12.999f)
                horizontalLineTo(5.5f)
                verticalLineTo(18.75f)
                curveTo(5.5f, 19.6682f, 6.2071f, 20.4212f, 7.1065f, 20.4942f)
                lineTo(7.25f, 20.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.999f)
                close()
                moveTo(18.5f, 12.999f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(16.75f)
                curveTo(17.6682f, 20.5f, 18.4212f, 19.7929f, 18.4942f, 18.8935f)
                lineTo(18.5f, 18.75f)
                verticalLineTo(12.999f)
                close()
                moveTo(11.25f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(11.5f)
                lineTo(11.25f, 11.499f)
                verticalLineTo(8.5f)
                close()
                moveTo(19.5f, 11.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.499f)
                lineTo(19.5f, 11.5f)
                close()
                moveTo(14.5f, 3.5f)
                curveTo(13.5335f, 3.5f, 12.75f, 4.2835f, 12.75f, 5.25f)
                verticalLineTo(6.999f)
                horizontalLineTo(14.524f)
                lineTo(14.6435f, 6.9942f)
                curveTo(15.5429f, 6.9212f, 16.25f, 6.1682f, 16.25f, 5.25f)
                curveTo(16.25f, 4.2835f, 15.4665f, 3.5f, 14.5f, 3.5f)
                close()
                moveTo(9.5f, 3.5f)
                curveTo(8.5335f, 3.5f, 7.75f, 4.2835f, 7.75f, 5.25f)
                curveTo(7.75f, 6.1682f, 8.4571f, 6.9212f, 9.3565f, 6.9942f)
                lineTo(9.476f, 6.999f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.25f)
                lineTo(11.2442f, 5.1065f)
                curveTo(11.1712f, 4.2071f, 10.4182f, 3.5f, 9.5f, 3.5f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
