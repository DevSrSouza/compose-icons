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

public val RegularGroup.ContactCard: ImageVector
    get() {
        if (_contactCard != null) {
            return _contactCard!!
        }
        _contactCard = Builder(name = "ContactCard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 4.0f)
                curveTo(20.9926f, 4.0f, 22.0f, 5.0074f, 22.0f, 6.25f)
                verticalLineTo(17.7546f)
                curveTo(22.0f, 18.9972f, 20.9926f, 20.0046f, 19.75f, 20.0046f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 20.0046f, 2.0f, 18.9972f, 2.0f, 17.7546f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(19.75f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 5.5f, 3.5f, 5.8358f, 3.5f, 6.25f)
                verticalLineTo(17.7546f)
                curveTo(3.5f, 18.1688f, 3.8358f, 18.5046f, 4.25f, 18.5046f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 18.5046f, 20.5f, 18.1688f, 20.5f, 17.7546f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.8358f, 20.1642f, 5.5f, 19.75f, 5.5f)
                close()
                moveTo(9.75f, 12.5f)
                curveTo(10.1642f, 12.5f, 10.5f, 12.8358f, 10.5f, 13.25f)
                verticalLineTo(13.7427f)
                lineTo(10.4921f, 13.8513f)
                curveTo(10.3293f, 14.9642f, 9.3977f, 15.5009f, 7.9999f, 15.5009f)
                curveTo(6.6021f, 15.5009f, 5.6705f, 14.9637f, 5.5079f, 13.8501f)
                lineTo(5.5f, 13.7418f)
                verticalLineTo(13.25f)
                curveTo(5.5f, 12.8358f, 5.8358f, 12.5f, 6.25f, 12.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(13.2523f, 12.9961f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 12.9961f, 18.5f, 13.3319f, 18.5f, 13.7461f)
                curveTo(18.5f, 14.1258f, 18.2178f, 14.4396f, 17.8518f, 14.4893f)
                lineTo(17.75f, 14.4961f)
                horizontalLineTo(13.2523f)
                curveTo(12.8381f, 14.4961f, 12.5023f, 14.1604f, 12.5023f, 13.7461f)
                curveTo(12.5023f, 13.3664f, 12.7844f, 13.0526f, 13.1505f, 13.003f)
                lineTo(13.2523f, 12.9961f)
                horizontalLineTo(17.75f)
                horizontalLineTo(13.2523f)
                close()
                moveTo(8.0f, 8.5022f)
                curveTo(8.8284f, 8.5022f, 9.5f, 9.1737f, 9.5f, 10.0022f)
                curveTo(9.5f, 10.8306f, 8.8284f, 11.5021f, 8.0f, 11.5021f)
                curveTo(7.1716f, 11.5021f, 6.5f, 10.8306f, 6.5f, 10.0022f)
                curveTo(6.5f, 9.1737f, 7.1716f, 8.5022f, 8.0f, 8.5022f)
                close()
                moveTo(13.2523f, 9.5f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 9.5f, 18.5f, 9.8358f, 18.5f, 10.25f)
                curveTo(18.5f, 10.6297f, 18.2178f, 10.9435f, 17.8518f, 10.9932f)
                lineTo(17.75f, 11.0f)
                horizontalLineTo(13.2523f)
                curveTo(12.8381f, 11.0f, 12.5023f, 10.6642f, 12.5023f, 10.25f)
                curveTo(12.5023f, 9.8703f, 12.7844f, 9.5565f, 13.1505f, 9.5069f)
                lineTo(13.2523f, 9.5f)
                horizontalLineTo(17.75f)
                horizontalLineTo(13.2523f)
                close()
            }
        }
        .build()
        return _contactCard!!
    }

private var _contactCard: ImageVector? = null
