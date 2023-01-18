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

public val FilledGroup.ContactCard: ImageVector
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
                moveTo(9.75f, 12.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8703f, 12.5f, 5.5565f, 12.7822f, 5.5068f, 13.1482f)
                lineTo(5.5f, 13.25f)
                verticalLineTo(13.7418f)
                lineTo(5.5079f, 13.8501f)
                curveTo(5.6705f, 14.9637f, 6.6021f, 15.5009f, 7.9999f, 15.5009f)
                curveTo(9.3311f, 15.5009f, 10.2395f, 15.0141f, 10.4637f, 14.0064f)
                lineTo(10.4921f, 13.8513f)
                lineTo(10.5f, 13.7427f)
                verticalLineTo(13.25f)
                curveTo(10.5f, 12.8703f, 10.2178f, 12.5565f, 9.8518f, 12.5068f)
                lineTo(9.75f, 12.5f)
                close()
                moveTo(17.75f, 12.9961f)
                horizontalLineTo(13.2523f)
                lineTo(13.1505f, 13.003f)
                curveTo(12.7844f, 13.0526f, 12.5023f, 13.3664f, 12.5023f, 13.7461f)
                curveTo(12.5023f, 14.1258f, 12.7844f, 14.4396f, 13.1505f, 14.4893f)
                lineTo(13.2523f, 14.4961f)
                horizontalLineTo(17.75f)
                lineTo(17.8518f, 14.4893f)
                curveTo(18.2178f, 14.4396f, 18.5f, 14.1258f, 18.5f, 13.7461f)
                curveTo(18.5f, 13.3664f, 18.2178f, 13.0526f, 17.8518f, 13.003f)
                lineTo(17.75f, 12.9961f)
                close()
                moveTo(8.0f, 8.5022f)
                curveTo(7.1716f, 8.5022f, 6.5f, 9.1737f, 6.5f, 10.0022f)
                curveTo(6.5f, 10.8306f, 7.1716f, 11.5021f, 8.0f, 11.5021f)
                curveTo(8.8284f, 11.5021f, 9.5f, 10.8306f, 9.5f, 10.0022f)
                curveTo(9.5f, 9.1737f, 8.8284f, 8.5022f, 8.0f, 8.5022f)
                close()
                moveTo(17.75f, 9.5f)
                horizontalLineTo(13.2523f)
                lineTo(13.1505f, 9.5069f)
                curveTo(12.7844f, 9.5565f, 12.5023f, 9.8703f, 12.5023f, 10.25f)
                curveTo(12.5023f, 10.6297f, 12.7844f, 10.9435f, 13.1505f, 10.9932f)
                lineTo(13.2523f, 11.0f)
                horizontalLineTo(17.75f)
                lineTo(17.8518f, 10.9932f)
                curveTo(18.2178f, 10.9435f, 18.5f, 10.6297f, 18.5f, 10.25f)
                curveTo(18.5f, 9.8703f, 18.2178f, 9.5565f, 17.8518f, 9.5069f)
                lineTo(17.75f, 9.5f)
                close()
            }
        }
        .build()
        return _contactCard!!
    }

private var _contactCard: ImageVector? = null
