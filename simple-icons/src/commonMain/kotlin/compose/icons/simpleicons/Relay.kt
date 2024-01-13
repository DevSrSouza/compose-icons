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

public val SimpleIcons.Relay: ImageVector
    get() {
        if (_relay != null) {
            return _relay!!
        }
        _relay = Builder(name = "Relay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2643f, 4.9367f)
                curveTo(1.0135f, 4.9367f, 0.0f, 5.9502f, 0.0f, 7.2009f)
                curveToRelative(0.0f, 1.2507f, 1.0136f, 2.2643f, 2.2644f, 2.2643f)
                curveToRelative(1.0537f, 0.0f, 1.9393f, -0.7197f, 2.1919f, -1.6946f)
                horizontalLineToRelative(10.3387f)
                curveToRelative(0.9876f, 0.0f, 1.7913f, 0.8037f, 1.7913f, 1.7915f)
                curveToRelative(0.0f, 0.9878f, -0.8036f, 1.7916f, -1.7913f, 1.7916f)
                horizontalLineToRelative(-5.7309f)
                curveToRelative(-1.6725f, 0.0f, -3.0332f, 1.3607f, -3.0332f, 3.0332f)
                curveToRelative(0.0f, 1.6725f, 1.3606f, 3.033f, 3.0332f, 3.033f)
                horizontalLineToRelative(10.4943f)
                curveToRelative(0.2699f, 0.9487f, 1.142f, 1.6435f, 2.1774f, 1.6435f)
                curveToRelative(1.2507f, 0.0f, 2.2643f, -1.0134f, 2.2643f, -2.2642f)
                curveToRelative(0.0f, -1.2507f, -1.0135f, -2.2643f, -2.2643f, -2.2643f)
                curveToRelative(-1.0353f, 0.0f, -1.9074f, 0.6947f, -2.1774f, 1.6433f)
                horizontalLineTo(9.064f)
                curveToRelative(-0.9878f, 0.0f, -1.7915f, -0.8036f, -1.7915f, -1.7913f)
                curveToRelative(0.0f, -0.988f, 0.8036f, -1.7916f, 1.7915f, -1.7916f)
                horizontalLineToRelative(5.7309f)
                curveToRelative(1.6725f, 0.0f, 3.033f, -1.3606f, 3.033f, -3.0331f)
                curveToRelative(0.0f, -1.6725f, -1.3604f, -3.0332f, -3.033f, -3.0332f)
                horizontalLineTo(4.4272f)
                curveToRelative(-0.2863f, -0.9224f, -1.1464f, -1.5921f, -2.1629f, -1.5921f)
                close()
            }
        }
        .build()
        return _relay!!
    }

private var _relay: ImageVector? = null
