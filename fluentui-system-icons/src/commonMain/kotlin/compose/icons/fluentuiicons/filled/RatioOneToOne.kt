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

public val FilledGroup.RatioOneToOne: ImageVector
    get() {
        if (_ratioOneToOne != null) {
            return _ratioOneToOne!!
        }
        _ratioOneToOne = Builder(name = "RatioOneToOne", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 4.0f)
                curveTo(3.4551f, 4.0f, 2.0f, 5.4551f, 2.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 18.5449f, 3.4551f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 20.0f, 22.0f, 18.5449f, 22.0f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(22.0f, 5.4551f, 20.5449f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(8.5001f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(8.5001f, 15.6642f, 8.1643f, 16.0f, 7.7501f, 16.0f)
                curveTo(7.3359f, 16.0f, 7.0001f, 15.6642f, 7.0001f, 15.25f)
                verticalLineTo(10.1514f)
                lineTo(6.6661f, 10.374f)
                curveTo(6.3215f, 10.6038f, 5.8558f, 10.5107f, 5.626f, 10.166f)
                curveTo(5.3963f, 9.8214f, 5.4894f, 9.3557f, 5.8341f, 9.126f)
                lineTo(7.3341f, 8.126f)
                curveTo(7.5642f, 7.9725f, 7.8601f, 7.9582f, 8.104f, 8.0887f)
                curveTo(8.3478f, 8.2193f, 8.5001f, 8.4734f, 8.5001f, 8.75f)
                close()
                moveTo(17.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(17.5f, 15.6643f, 17.1642f, 16.0f, 16.75f, 16.0f)
                curveTo(16.3358f, 16.0f, 16.0f, 15.6643f, 16.0f, 15.25f)
                verticalLineTo(10.1514f)
                lineTo(15.666f, 10.3741f)
                curveTo(15.3214f, 10.6039f, 14.8557f, 10.5107f, 14.626f, 10.1661f)
                curveTo(14.3962f, 9.8214f, 14.4893f, 9.3558f, 14.834f, 9.126f)
                lineTo(16.334f, 8.126f)
                curveTo(16.5641f, 7.9726f, 16.86f, 7.9583f, 17.1039f, 8.0888f)
                curveTo(17.3478f, 8.2193f, 17.5f, 8.4734f, 17.5f, 8.75f)
                close()
                moveTo(13.0001f, 14.0f)
                curveTo(13.0001f, 14.5523f, 12.5524f, 15.0f, 12.0001f, 15.0f)
                curveTo(11.4478f, 15.0f, 11.0001f, 14.5523f, 11.0001f, 14.0f)
                curveTo(11.0001f, 13.4477f, 11.4478f, 13.0f, 12.0001f, 13.0f)
                curveTo(12.5524f, 13.0f, 13.0001f, 13.4477f, 13.0001f, 14.0f)
                close()
                moveTo(12.0001f, 11.0f)
                curveTo(11.4478f, 11.0f, 11.0001f, 10.5523f, 11.0001f, 10.0f)
                curveTo(11.0001f, 9.4477f, 11.4478f, 9.0f, 12.0001f, 9.0f)
                curveTo(12.5524f, 9.0f, 13.0001f, 9.4477f, 13.0001f, 10.0f)
                curveTo(13.0001f, 10.5523f, 12.5524f, 11.0f, 12.0001f, 11.0f)
                close()
            }
        }
        .build()
        return _ratioOneToOne!!
    }

private var _ratioOneToOne: ImageVector? = null
