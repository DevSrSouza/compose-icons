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

public val SimpleIcons.Cloudbees: ImageVector
    get() {
        if (_cloudbees != null) {
            return _cloudbees!!
        }
        _cloudbees = Builder(name = "Cloudbees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.87f, 0.283f)
                curveTo(3.081f, 0.283f, 0.0f, 3.32f, 0.0f, 7.05f)
                curveToRelative(0.0f, 3.732f, 3.082f, 6.767f, 6.87f, 6.767f)
                horizontalLineToRelative(2.429f)
                verticalLineToRelative(-3.495f)
                horizontalLineToRelative(-2.43f)
                curveToRelative(-1.83f, 0.0f, -3.319f, -1.468f, -3.319f, -3.272f)
                curveToRelative(0.0f, -1.804f, 1.488f, -3.27f, 3.32f, -3.27f)
                curveToRelative(0.734f, 0.0f, 1.377f, 0.19f, 1.928f, 0.567f)
                lineToRelative(2.51f, -2.473f)
                curveTo(10.06f, 0.814f, 8.58f, 0.284f, 6.87f, 0.284f)
                close()
                moveTo(12.022f, 2.514f)
                curveToRelative(-0.066f, -0.005f, -0.141f, 0.08f, -0.35f, 0.252f)
                arcToRelative(0.457f, 0.457f, 0.0f, false, false, -0.028f, 0.026f)
                lineTo(9.722f, 4.674f)
                curveToRelative(-0.323f, 0.315f, -0.29f, 0.203f, -0.066f, 0.556f)
                arcToRelative(3.204f, 3.204f, 0.0f, false, true, 0.532f, 1.749f)
                verticalLineToRelative(9.991f)
                curveToRelative(0.0f, 3.73f, 3.096f, 6.747f, 6.908f, 6.747f)
                curveTo(20.907f, 23.717f, 24.0f, 20.7f, 24.0f, 16.97f)
                curveToRelative(0.0f, -3.728f, -3.093f, -6.75f, -6.904f, -6.75f)
                lineTo(13.76f, 10.22f)
                lineTo(13.76f, 6.979f)
                curveToRelative(0.0f, -1.495f, -0.512f, -3.002f, -1.436f, -4.158f)
                curveToRelative(-0.175f, -0.203f, -0.234f, -0.3f, -0.3f, -0.307f)
                close()
                moveTo(17.268f, 13.723f)
                curveToRelative(1.762f, 0.088f, 3.168f, 1.502f, 3.168f, 3.247f)
                curveToRelative(0.0f, 1.802f, -1.5f, 3.264f, -3.342f, 3.264f)
                reflectiveCurveToRelative(-3.335f, -1.477f, -3.335f, -3.28f)
                verticalLineToRelative(-3.219f)
                horizontalLineToRelative(3.509f)
                close()
            }
        }
        .build()
        return _cloudbees!!
    }

private var _cloudbees: ImageVector? = null
