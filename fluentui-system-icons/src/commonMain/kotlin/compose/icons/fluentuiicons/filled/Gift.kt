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

public val FilledGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.25f)
                curveTo(5.4551f, 22.0f, 4.0f, 20.5449f, 4.0f, 18.75f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(20.0f, 13.0f)
                verticalLineTo(18.75f)
                curveTo(20.0f, 20.5449f, 18.5449f, 22.0f, 16.75f, 22.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(14.5f, 2.0f)
                curveTo(16.2949f, 2.0f, 17.75f, 3.4551f, 17.75f, 5.25f)
                curveTo(17.75f, 5.895f, 17.5621f, 6.4961f, 17.2381f, 7.0015f)
                lineTo(19.75f, 7.0f)
                curveTo(20.4404f, 7.0f, 21.0f, 7.4664f, 21.0f, 8.0417f)
                verticalLineTo(10.9583f)
                curveTo(21.0f, 11.5336f, 20.4404f, 12.0f, 19.75f, 12.0f)
                lineTo(12.75f, 11.999f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.999f)
                lineTo(4.25f, 12.0f)
                curveTo(3.5596f, 12.0f, 3.0f, 11.5336f, 3.0f, 10.9583f)
                verticalLineTo(8.0417f)
                curveTo(3.0f, 7.4664f, 3.5596f, 7.0f, 4.25f, 7.0f)
                lineTo(6.7619f, 7.0015f)
                curveTo(6.4379f, 6.4961f, 6.25f, 5.895f, 6.25f, 5.25f)
                curveTo(6.25f, 3.4551f, 7.7051f, 2.0f, 9.5f, 2.0f)
                curveTo(10.5055f, 2.0f, 11.4044f, 2.4567f, 12.0006f, 3.1739f)
                curveTo(12.5956f, 2.4567f, 13.4945f, 2.0f, 14.5f, 2.0f)
                close()
                moveTo(9.5f, 3.5f)
                curveTo(8.5335f, 3.5f, 7.75f, 4.2835f, 7.75f, 5.25f)
                curveTo(7.75f, 6.1682f, 8.4571f, 6.9212f, 9.3565f, 6.9942f)
                lineTo(9.5f, 7.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.25f)
                lineTo(11.2442f, 5.1065f)
                curveTo(11.1712f, 4.2071f, 10.4182f, 3.5f, 9.5f, 3.5f)
                close()
                moveTo(14.5f, 3.5f)
                curveTo(13.5335f, 3.5f, 12.75f, 4.2835f, 12.75f, 5.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.5f)
                curveTo(15.4665f, 7.0f, 16.25f, 6.2165f, 16.25f, 5.25f)
                curveTo(16.25f, 4.2835f, 15.4665f, 3.5f, 14.5f, 3.5f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
