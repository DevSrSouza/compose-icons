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

public val SimpleIcons.Fluxus: ImageVector
    get() {
        if (_fluxus != null) {
            return _fluxus!!
        }
        _fluxus = Builder(name = "Fluxus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.348f, 19.35f)
                arcToRelative(2738.241f, 2738.241f, 0.0f, false, false, -3.926f, -5.741f)
                arcToRelative(595.98f, 595.98f, 0.0f, false, true, -1.5f, -2.194f)
                arcToRelative(433.452f, 433.452f, 0.0f, false, false, -1.646f, -2.396f)
                curveToRelative(-0.493f, -0.712f, -0.88f, -1.343f, -0.86f, -1.404f)
                curveToRelative(0.021f, -0.06f, 0.944f, -0.73f, 2.05f, -1.489f)
                curveToRelative(4.797f, -3.285f, 8.82f, -6.032f, 8.962f, -6.117f)
                curveToRelative(0.124f, -0.075f, 0.152f, 0.287f, 0.147f, 1.963f)
                lineToRelative(-0.005f, 2.055f)
                lineToRelative(-2.993f, 2.02f)
                curveToRelative(-1.647f, 1.111f, -2.975f, 2.072f, -2.953f, 2.136f)
                curveToRelative(0.117f, 0.326f, 2.53f, 3.694f, 2.645f, 3.694f)
                curveToRelative(0.11f, 0.0f, 1.55f, -0.937f, 3.084f, -2.005f)
                curveToRelative(0.224f, -0.156f, 0.227f, -0.125f, 0.226f, 1.905f)
                verticalLineToRelative(2.063f)
                lineToRelative(-0.692f, 0.446f)
                curveToRelative(-0.38f, 0.245f, -0.692f, 0.49f, -0.692f, 0.544f)
                curveToRelative(0.0f, 0.054f, 0.313f, 0.545f, 0.694f, 1.09f)
                lineToRelative(0.695f, 0.993f)
                lineToRelative(-0.03f, 3.543f)
                lineToRelative(-0.03f, 3.544f)
                close()
            }
        }
        .build()
        return _fluxus!!
    }

private var _fluxus: ImageVector? = null
