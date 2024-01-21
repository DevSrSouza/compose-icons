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

public val SimpleIcons.Microsoftbing: ImageVector
    get() {
        if (_microsoftbing != null) {
            return _microsoftbing!!
        }
        _microsoftbing = Builder(name = "Microsoftbing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.176f, 15.406f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, -1.736f, 4.414f)
                curveToRelative(1.338f, -1.47f, 0.803f, -3.869f, -1.003f, -4.635f)
                curveToRelative(-0.862f, -0.305f, -2.488f, -0.85f, -3.367f, -1.158f)
                arcToRelative(1.834f, 1.834f, 0.0f, false, true, -0.932f, -0.818f)
                curveToRelative(-0.381f, -0.975f, -1.163f, -2.968f, -1.548f, -3.948f)
                curveToRelative(-0.095f, -0.285f, -0.31f, -0.625f, -0.265f, -0.938f)
                curveToRelative(0.046f, -0.598f, 0.724f, -1.003f, 1.276f, -0.754f)
                lineToRelative(3.682f, 1.888f)
                curveToRelative(0.621f, 0.292f, 1.305f, 0.692f, 1.796f, 1.172f)
                arcToRelative(6.486f, 6.486f, 0.0f, false, true, 2.097f, 4.777f)
                close()
                moveTo(18.736f, 17.294f)
                curveToRelative(-0.264f, -1.194f, -1.135f, -1.744f, -2.216f, -2.028f)
                curveToRelative(-1.527f, 0.902f, -4.853f, 2.878f, -6.952f, 4.13f)
                curveToRelative(-1.103f, 0.68f, -2.13f, 1.35f, -2.919f, 1.242f)
                arcToRelative(2.866f, 2.866f, 0.0f, false, true, -2.77f, -2.325f)
                curveToRelative(-0.012f, -0.048f, -0.008f, -0.03f, -0.001f, 0.01f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 0.947f, 2.653f)
                arcToRelative(6.498f, 6.498f, 0.0f, false, false, 5.486f, 3.022f)
                curveToRelative(1.908f, 0.062f, 3.536f, -1.153f, 5.099f, -2.096f)
                curveToRelative(0.292f, -0.188f, 0.804f, -0.496f, 1.332f, -0.831f)
                lineToRelative(1.423f, -1.51f)
                curveToRelative(0.553f, -0.577f, 0.764f, -1.426f, 0.571f, -2.267f)
                close()
                moveTo(6.696f, 20.264f)
                curveToRelative(0.422f, 0.0f, 0.822f, -0.1f, 1.173f, -0.29f)
                curveToRelative(0.355f, -0.215f, 0.964f, -0.579f, 1.7f, -1.018f)
                lineTo(9.57f, 4.502f)
                curveToRelative(0.0f, -0.99f, -0.497f, -1.864f, -1.257f, -2.382f)
                curveToRelative(-0.08f, -0.059f, -2.91f, -1.901f, -2.99f, -1.956f)
                curveToRelative(-0.605f, -0.432f, -1.523f, 0.045f, -1.5f, 0.797f)
                verticalLineToRelative(14.887f)
                lineToRelative(0.417f, 2.36f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, false, 2.455f, 2.056f)
                close()
            }
        }
        .build()
        return _microsoftbing!!
    }

private var _microsoftbing: ImageVector? = null
