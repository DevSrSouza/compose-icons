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

public val SimpleIcons.Livechat: ImageVector
    get() {
        if (_livechat != null) {
            return _livechat!!
        }
        _livechat = Builder(name = "Livechat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.849f, 14.91f)
                curveToRelative(-0.24f, 2.94f, -2.73f, 5.22f, -5.7f, 5.19f)
                horizontalLineToRelative(-3.15f)
                lineToRelative(-6.0f, 3.9f)
                verticalLineToRelative(-3.9f)
                lineToRelative(6.0f, -3.9f)
                horizontalLineToRelative(3.15f)
                curveToRelative(0.93f, 0.03f, 1.71f, -0.66f, 1.83f, -1.59f)
                curveToRelative(0.18f, -3.0f, 0.18f, -6.0f, -0.06f, -9.0f)
                curveToRelative(-0.06f, -0.84f, -0.75f, -1.47f, -1.56f, -1.53f)
                curveToRelative(-2.04f, -0.09f, -4.2f, -0.18f, -6.36f, -0.18f)
                reflectiveCurveToRelative(-4.32f, 0.06f, -6.36f, 0.21f)
                curveToRelative(-0.84f, 0.06f, -1.5f, 0.69f, -1.56f, 1.53f)
                curveToRelative(-0.21f, 3.0f, -0.24f, 6.0f, -0.06f, 9.0f)
                curveToRelative(0.09f, 0.93f, 0.9f, 1.59f, 1.83f, 1.56f)
                horizontalLineToRelative(3.15f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(-3.15f)
                arcToRelative(5.644f, 5.644f, 0.0f, false, true, -5.7f, -5.19f)
                curveToRelative(-0.21f, -3.21f, -0.18f, -6.39f, 0.06f, -9.6f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, 5.19f, -5.1f)
                curveToRelative(2.1f, -0.15f, 4.35f, -0.21f, 6.6f, -0.21f)
                reflectiveCurveToRelative(4.5f, 0.06f, 6.63f, 0.24f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, 5.19f, 5.1f)
                curveToRelative(0.21f, 3.18f, 0.24f, 6.39f, 0.03f, 9.57f)
                close()
            }
        }
        .build()
        return _livechat!!
    }

private var _livechat: ImageVector? = null
