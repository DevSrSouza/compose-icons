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

public val SimpleIcons.Pagerduty: ImageVector
    get() {
        if (_pagerduty != null) {
            return _pagerduty!!
        }
        _pagerduty = Builder(name = "Pagerduty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.965f, 1.18f)
                curveTo(15.085f, 0.164f, 13.769f, 0.0f, 10.683f, 0.0f)
                lineTo(3.73f, 0.0f)
                verticalLineToRelative(14.55f)
                horizontalLineToRelative(6.926f)
                curveToRelative(2.743f, 0.0f, 4.8f, -0.164f, 6.61f, -1.37f)
                curveToRelative(1.975f, -1.303f, 3.004f, -3.484f, 3.004f, -6.007f)
                curveToRelative(0.0f, -2.716f, -1.262f, -4.896f, -3.305f, -5.994f)
                close()
                moveTo(11.465f, 11.506f)
                horizontalLineToRelative(-4.21f)
                lineTo(7.255f, 3.113f)
                lineToRelative(3.977f, -0.027f)
                curveToRelative(3.62f, -0.028f, 5.43f, 1.234f, 5.43f, 4.128f)
                curveToRelative(0.0f, 3.113f, -2.248f, 4.292f, -5.197f, 4.292f)
                close()
                moveTo(3.73f, 17.61f)
                horizontalLineToRelative(3.525f)
                lineTo(7.255f, 24.0f)
                lineTo(3.73f, 24.0f)
                close()
            }
        }
        .build()
        return _pagerduty!!
    }

private var _pagerduty: ImageVector? = null
