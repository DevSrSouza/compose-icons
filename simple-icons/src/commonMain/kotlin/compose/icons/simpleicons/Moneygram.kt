package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Moneygram: ImageVector
    get() {
        if (_moneygram != null) {
            return _moneygram!!
        }
        _moneygram = Builder(name = "Moneygram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.6274f, -5.3726f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.6274f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.8257f, 0.4071f, -3.5554f, 1.1374f, -5.1051f)
                curveTo(0.6514f, 8.1257f, 0.433f, 9.3446f, 0.433f, 10.4863f)
                curveToRelative(0.0f, 5.4334f, 4.3868f, 6.2203f, 6.2537f, 6.2023f)
                curveToRelative(2.8371f, -0.0257f, 6.1543f, -1.416f, 8.9485f, -3.9909f)
                lineToRelative(-0.4714f, 2.6494f)
                curveToRelative(-0.1054f, 0.606f, 0.2906f, 1.1392f, 0.8957f, 1.1426f)
                horizontalLineToRelative(0.2503f)
                curveToRelative(0.6274f, 0.0f, 1.0732f, -0.5108f, 1.1863f, -1.1426f)
                lineToRelative(1.0063f, -5.6622f)
                curveToRelative(0.12f, -0.6283f, -0.2932f, -1.14f, -0.9214f, -1.14f)
                horizontalLineToRelative(-5.6726f)
                curveToRelative(-0.6309f, 0.0f, -1.2077f, 0.3342f, -1.32f, 0.9677f)
                lineToRelative(-0.0446f, 0.2554f)
                curveToRelative(-0.09f, 0.6026f, 0.33f, 1.0569f, 0.9317f, 1.0569f)
                horizontalLineToRelative(2.9589f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, false, -0.1414f, 0.1388f)
                curveToRelative(-2.04f, 1.9312f, -4.5558f, 2.988f, -6.6403f, 2.988f)
                curveToRelative(-2.0803f, 0.0f, -4.41f, -1.3123f, -4.41f, -4.2686f)
                curveTo(3.2426f, 3.5546f, 8.9906f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.6137f, 0.0f, 12.0f, 5.3726f, 12.0f, 12.0f)
            }
        }
        .build()
        return _moneygram!!
    }

private var _moneygram: ImageVector? = null
