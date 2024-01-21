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

public val SimpleIcons.Googleadmob: ImageVector
    get() {
        if (_googleadmob != null) {
            return _googleadmob!!
        }
        _googleadmob = Builder(name = "Googleadmob", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.46f, 0.033f)
                horizontalLineToRelative(-0.052f)
                arcTo(11.993f, 11.993f, 0.0f, false, false, 0.0f, 11.922f)
                verticalLineToRelative(0.052f)
                curveToRelative(0.0f, 7.475f, 6.563f, 11.928f, 11.447f, 11.928f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3.086f, 3.086f, 0.0f, false, false, 3.125f, -3.047f)
                curveToRelative(0.0f, -1.693f, -1.433f, -2.917f, -3.152f, -2.917f)
                horizontalLineToRelative(-0.039f)
                arcToRelative(6.016f, 6.016f, 0.0f, false, true, -5.508f, -6.368f)
                verticalLineToRelative(-0.052f)
                arcToRelative(6.016f, 6.016f, 0.0f, false, true, 5.573f, -5.509f)
                curveToRelative(1.719f, 0.0f, 3.125f, -1.237f, 3.125f, -2.917f)
                arcTo(3.086f, 3.086f, 0.0f, false, false, 11.604f, 0.02f)
                horizontalLineToRelative(-0.143f)
                close()
                moveTo(13.491f, 0.059f)
                arcToRelative(3.516f, 3.516f, 0.0f, false, true, 1.746f, 3.021f)
                arcToRelative(3.386f, 3.386f, 0.0f, false, true, -1.928f, 3.047f)
                curveToRelative(2.865f, 0.6f, 4.532f, 3.126f, 4.688f, 5.378f)
                verticalLineToRelative(7.684f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, 6.003f, 0.026f)
                verticalLineToRelative(-7.736f)
                arcTo(12.046f, 12.046f, 0.0f, false, false, 13.491f, 0.045f)
                close()
                moveTo(20.966f, 17.991f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, false, 0.04f, 0.0f)
                close()
            }
        }
        .build()
        return _googleadmob!!
    }

private var _googleadmob: ImageVector? = null
