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

public val SimpleIcons.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = Builder(name = "Transmission", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6956f, 9.46f)
                verticalLineTo(22.254f)
                curveToRelative(0.0f, 0.945f, 0.8847f, 1.709f, 1.7157f, 1.709f)
                horizontalLineToRelative(17.1573f)
                curveToRelative(0.878f, 0.0f, 1.7157f, -0.6098f, 1.7157f, -1.709f)
                verticalLineTo(9.4666f)
                curveToRelative(-2.3323f, 0.3753f, -4.6177f, 0.6233f, -6.863f, 0.7708f)
                verticalLineToRelative(5.1471f)
                horizontalLineToRelative(3.4315f)
                lineToRelative(-6.8629f, 6.863f)
                lineToRelative(-6.8628f, -6.863f)
                horizontalLineToRelative(3.4314f)
                verticalLineToRelative(-5.0868f)
                curveToRelative(-2.339f, -0.1207f, -4.6244f, -0.3887f, -6.8428f, -0.831f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(-0.0068f)
                close()
                moveTo(15.4214f, 0.0368f)
                verticalLineToRelative(8.4177f)
                curveToRelative(2.2452f, -0.1474f, 4.5306f, -0.1675f, 6.8629f, -0.5428f)
                curveTo(23.2226f, 7.7643f, 24.0f, 7.1008f, 24.0f, 6.0888f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.0f, -1.012f, -0.7841f, -1.6622f, -1.7157f, -1.8297f)
                curveToRelative(-2.339f, -0.429f, -4.6177f, -0.2949f, -6.863f, -0.4222f)
                close()
                moveTo(8.5585f, 0.0503f)
                curveTo(6.2396f, 0.191f, 3.9609f, 0.077f, 1.7157f, 0.459f)
                curveTo(0.7774f, 0.6199f, 0.0f, 1.2767f, 0.0f, 2.2887f)
                verticalLineToRelative(3.8001f)
                curveToRelative(0.0f, 1.012f, 0.7841f, 1.642f, 1.7157f, 1.823f)
                curveToRelative(2.2184f, 0.4423f, 4.5038f, 0.4758f, 6.8428f, 0.6031f)
                verticalLineTo(0.0503f)
                close()
            }
        }
        .build()
        return _transmission!!
    }

private var _transmission: ImageVector? = null
