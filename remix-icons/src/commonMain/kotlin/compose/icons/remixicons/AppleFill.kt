package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AppleFill: ImageVector
    get() {
        if (_appleFill != null) {
            return _appleFill!!
        }
        _appleFill = Builder(name = "AppleFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.624f, 7.222f)
                curveToRelative(-0.876f, 0.0f, -2.232f, -0.996f, -3.66f, -0.96f)
                curveToRelative(-1.884f, 0.024f, -3.612f, 1.092f, -4.584f, 2.784f)
                curveToRelative(-1.956f, 3.396f, -0.504f, 8.412f, 1.404f, 11.172f)
                curveToRelative(0.936f, 1.344f, 2.04f, 2.856f, 3.504f, 2.808f)
                curveToRelative(1.404f, -0.06f, 1.932f, -0.912f, 3.636f, -0.912f)
                curveToRelative(1.692f, 0.0f, 2.172f, 0.912f, 3.66f, 0.876f)
                curveToRelative(1.512f, -0.024f, 2.472f, -1.368f, 3.396f, -2.724f)
                curveToRelative(1.068f, -1.56f, 1.512f, -3.072f, 1.536f, -3.156f)
                curveToRelative(-0.036f, -0.012f, -2.94f, -1.128f, -2.976f, -4.488f)
                curveToRelative(-0.024f, -2.808f, 2.292f, -4.152f, 2.4f, -4.212f)
                curveToRelative(-1.32f, -1.932f, -3.348f, -2.148f, -4.056f, -2.196f)
                curveToRelative(-1.848f, -0.144f, -3.396f, 1.008f, -4.26f, 1.008f)
                close()
                moveTo(14.744f, 4.39f)
                curveToRelative(0.78f, -0.936f, 1.296f, -2.244f, 1.152f, -3.54f)
                curveToRelative(-1.116f, 0.048f, -2.46f, 0.744f, -3.264f, 1.68f)
                curveToRelative(-0.72f, 0.828f, -1.344f, 2.16f, -1.176f, 3.432f)
                curveToRelative(1.236f, 0.096f, 2.508f, -0.636f, 3.288f, -1.572f)
                close()
            }
        }
        .build()
        return _appleFill!!
    }

private var _appleFill: ImageVector? = null
