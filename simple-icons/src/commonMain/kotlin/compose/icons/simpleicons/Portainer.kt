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

public val SimpleIcons.Portainer: ImageVector
    get() {
        if (_portainer != null) {
            return _portainer!!
        }
        _portainer = Builder(name = "Portainer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.504f, 0.0f)
                verticalLineToRelative(1.023f)
                lineToRelative(-0.01f, -0.015f)
                lineToRelative(-6.106f, 3.526f)
                lineTo(3.417f, 4.534f)
                verticalLineToRelative(0.751f)
                horizontalLineToRelative(5.359f)
                verticalLineToRelative(3.638f)
                horizontalLineToRelative(1.942f)
                lineTo(10.718f, 5.284f)
                horizontalLineToRelative(1.786f)
                verticalLineToRelative(10.416f)
                curveToRelative(0.027f, 0.0f, 0.54f, -0.01f, 0.751f, 0.091f)
                lineTo(13.255f, 5.285f)
                horizontalLineToRelative(0.531f)
                verticalLineToRelative(10.608f)
                curveToRelative(0.293f, 0.147f, 0.55f, 0.312f, 0.751f, 0.54f)
                lineTo(14.537f, 5.286f)
                horizontalLineToRelative(6.046f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1.267f)
                lineToRelative(-6.061f, -3.5f)
                lineTo(13.255f, 0.0f)
                close()
                moveTo(12.504f, 1.87f)
                verticalLineToRelative(2.664f)
                lineTo(7.889f, 4.534f)
                close()
                moveTo(13.255f, 1.901f)
                lineToRelative(4.56f, 2.633f)
                horizontalLineToRelative(-4.56f)
                close()
                moveTo(9.142f, 5.285f)
                horizontalLineToRelative(1.21f)
                verticalLineToRelative(1.686f)
                horizontalLineToRelative(-1.21f)
                close()
                moveTo(4.406f, 8.015f)
                verticalLineToRelative(1.951f)
                horizontalLineToRelative(1.942f)
                verticalLineToRelative(-1.95f)
                close()
                moveTo(6.596f, 8.015f)
                verticalLineToRelative(1.951f)
                horizontalLineToRelative(1.941f)
                verticalLineToRelative(-1.95f)
                close()
                moveTo(4.406f, 10.186f)
                verticalLineToRelative(1.951f)
                horizontalLineToRelative(1.942f)
                verticalLineToRelative(-1.95f)
                close()
                moveTo(6.596f, 10.186f)
                verticalLineToRelative(1.951f)
                horizontalLineToRelative(1.941f)
                verticalLineToRelative(-1.95f)
                close()
                moveTo(8.776f, 10.186f)
                verticalLineToRelative(1.951f)
                horizontalLineToRelative(1.942f)
                verticalLineToRelative(-1.95f)
                close()
                moveTo(4.36f, 12.43f)
                arcToRelative(3.73f, 3.73f, 0.0f, false, false, -0.494f, 1.851f)
                curveToRelative(0.0f, 1.227f, 0.604f, 2.308f, 1.52f, 2.986f)
                curveToRelative(0.239f, -0.064f, 0.477f, -0.1f, 0.724f, -0.11f)
                curveToRelative(0.1f, 0.0f, 0.165f, 0.01f, 0.266f, 0.019f)
                curveToRelative(0.284f, -1.191f, 1.383f, -1.988f, 2.665f, -1.988f)
                curveToRelative(0.724f, 0.0f, 1.438f, 0.201f, 1.924f, 0.668f)
                curveToRelative(0.229f, -0.476f, 0.302f, -1.007f, 0.302f, -1.575f)
                curveToRelative(0.0f, -0.65f, -0.165f, -1.292f, -0.494f, -1.85f)
                close()
                moveTo(9.188f, 15.59f)
                curveToRelative(-1.21f, 0.0f, -2.226f, 0.844f, -2.492f, 1.97f)
                arcToRelative(0.922f, 0.922f, 0.0f, false, false, -0.275f, -0.009f)
                arcToRelative(2.559f, 2.559f, 0.0f, false, false, -2.564f, 2.556f)
                arcToRelative(2.565f, 2.565f, 0.0f, false, false, 3.096f, 2.5f)
                arcTo(2.579f, 2.579f, 0.0f, false, false, 9.233f, 24.0f)
                curveToRelative(0.862f, 0.0f, 1.622f, -0.43f, 2.09f, -1.081f)
                arcToRelative(2.557f, 2.557f, 0.0f, false, false, 4.186f, -1.97f)
                curveToRelative(0.0f, -0.567f, -0.193f, -1.099f, -0.504f, -1.52f)
                arcToRelative(2.557f, 2.557f, 0.0f, false, false, -3.866f, -2.94f)
                arcToRelative(2.574f, 2.574f, 0.0f, false, false, -1.951f, -0.898f)
                close()
            }
        }
        .build()
        return _portainer!!
    }

private var _portainer: ImageVector? = null
