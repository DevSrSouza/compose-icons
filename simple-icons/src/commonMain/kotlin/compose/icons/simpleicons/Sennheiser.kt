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

public val SimpleIcons.Sennheiser: ImageVector
    get() {
        if (_sennheiser != null) {
            return _sennheiser!!
        }
        _sennheiser = Builder(name = "Sennheiser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                close()
                moveTo(13.209f, 4.659f)
                curveToRelative(-1.428f, 0.548f, -2.799f, 1.757f, -3.905f, 4.182f)
                curveToRelative(-0.321f, 0.703f, -0.925f, 2.062f, -1.2f, 2.67f)
                curveToRelative(-2.224f, 4.882f, -3.364f, 5.932f, -6.72f, 5.932f)
                lineTo(1.384f, 4.35f)
                lineTo(13.15f, 4.35f)
                curveToRelative(0.184f, -0.011f, 0.235f, 0.25f, 0.06f, 0.309f)
                close()
                moveTo(22.637f, 6.553f)
                lineTo(22.637f, 19.65f)
                lineTo(10.851f, 19.65f)
                curveToRelative(-0.181f, 0.005f, -0.227f, -0.25f, -0.055f, -0.309f)
                curveToRelative(1.427f, -0.548f, 2.798f, -1.757f, 3.904f, -4.182f)
                curveToRelative(0.321f, -0.703f, 0.926f, -2.062f, 1.2f, -2.67f)
                curveToRelative(2.22f, -4.882f, 3.36f, -5.932f, 6.716f, -5.932f)
                close()
            }
        }
        .build()
        return _sennheiser!!
    }

private var _sennheiser: ImageVector? = null
