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

public val SimpleIcons.Disqus: ImageVector
    get() {
        if (_disqus != null) {
            return _disqus!!
        }
        _disqus = Builder(name = "Disqus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.438f, 23.654f)
                curveToRelative(-2.853f, 0.0f, -5.46f, -1.04f, -7.476f, -2.766f)
                lineTo(0.0f, 21.568f)
                lineToRelative(1.917f, -4.733f)
                curveTo(1.25f, 15.36f, 0.875f, 13.725f, 0.875f, 12.0f)
                curveTo(0.875f, 5.564f, 6.05f, 0.346f, 12.44f, 0.346f)
                curveTo(18.82f, 0.346f, 24.0f, 5.564f, 24.0f, 12.0f)
                curveToRelative(0.0f, 6.438f, -5.176f, 11.654f, -11.562f, 11.654f)
                close()
                moveTo(18.753f, 11.967f)
                verticalLineToRelative(-0.033f)
                curveToRelative(0.0f, -3.363f, -2.373f, -5.76f, -6.462f, -5.76f)
                lineTo(7.877f, 6.174f)
                lineTo(7.877f, 17.83f)
                horizontalLineToRelative(4.35f)
                curveToRelative(4.12f, 0.0f, 6.525f, -2.5f, 6.525f, -5.863f)
                horizontalLineToRelative(0.004f)
                close()
                moveTo(12.338f, 14.965f)
                horizontalLineToRelative(-1.29f)
                lineTo(11.048f, 9.04f)
                horizontalLineToRelative(1.29f)
                curveToRelative(1.897f, 0.0f, 3.157f, 1.08f, 3.157f, 2.945f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.0f, 1.884f, -1.26f, 2.95f, -3.157f, 2.95f)
                close()
            }
        }
        .build()
        return _disqus!!
    }

private var _disqus: ImageVector? = null
