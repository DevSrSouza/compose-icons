package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.FontAwesome: ImageVector
    get() {
        if (_fontAwesome != null) {
            return _fontAwesome!!
        }
        _fontAwesome = Builder(name = "FontAwesome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.571f, 0.0f)
                arcTo(2.572f, 2.572f, 0.0f, false, false, 0.0f, 2.571f)
                lineTo(0.0f, 21.43f)
                arcTo(2.572f, 2.572f, 0.0f, false, false, 2.571f, 24.0f)
                lineTo(21.43f, 24.0f)
                arcTo(2.572f, 2.572f, 0.0f, false, false, 24.0f, 21.429f)
                lineTo(24.0f, 2.57f)
                arcTo(2.572f, 2.572f, 0.0f, false, false, 21.429f, 0.0f)
                close()
                moveTo(6.895f, 4.0f)
                curveToRelative(0.993f, 0.0f, 1.793f, 0.8f, 1.793f, 1.791f)
                arcTo(1.7f, 1.7f, 0.0f, false, true, 7.984f, 7.2f)
                verticalLineToRelative(0.993f)
                curveToRelative(0.128f, -0.043f, 1.836f, -0.897f, 3.584f, -0.897f)
                curveToRelative(2.04f, 0.0f, 3.053f, 0.865f, 3.968f, 0.865f)
                curveToRelative(1.217f, 0.0f, 2.56f, -0.865f, 2.88f, -0.865f)
                curveToRelative(0.257f, 0.0f, 0.48f, 0.192f, 0.48f, 0.416f)
                verticalLineToRelative(7.521f)
                curveToRelative(0.0f, 0.224f, -0.191f, 0.32f, -0.415f, 0.416f)
                curveToRelative(-0.896f, 0.384f, -1.857f, 0.736f, -2.88f, 0.736f)
                curveToRelative(-1.44f, 0.0f, -2.113f, -0.896f, -3.841f, -0.896f)
                curveToRelative(-1.248f, 0.0f, -2.56f, 0.448f, -3.616f, 0.929f)
                curveToRelative(-0.064f, 0.032f, -0.129f, 0.032f, -0.193f, 0.064f)
                verticalLineToRelative(2.432f)
                curveToRelative(0.0f, 0.669f, -0.503f, 1.088f, -1.056f, 1.088f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, -1.088f, -1.088f)
                lineTo(5.807f, 7.199f)
                arcToRelative(1.789f, 1.789f, 0.0f, false, true, -0.704f, -1.408f)
                curveTo(5.103f, 4.8f, 5.903f, 4.0f, 6.895f, 4.0f)
                close()
            }
        }
        .build()
        return _fontAwesome!!
    }

private var _fontAwesome: ImageVector? = null
