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

public val SimpleIcons.Circle: ImageVector
    get() {
        if (_circle != null) {
            return _circle!!
        }
        _circle = Builder(name = "Circle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.788f, 3.832f)
                curveToRelative(-0.101f, -0.105f, -0.197f, -0.213f, -0.301f, -0.317f)
                curveToRelative(-0.103f, -0.103f, -0.211f, -0.202f, -0.32f, -0.302f)
                arcTo(11.903f, 11.903f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(11.926f, 11.926f, 0.0f, false, false, -8.486f, 3.514f)
                curveTo(-1.062f, 8.09f, -1.16f, 15.47f, 3.213f, 20.168f)
                curveToRelative(0.099f, 0.108f, 0.197f, 0.214f, 0.3f, 0.32f)
                curveToRelative(0.104f, 0.103f, 0.21f, 0.2f, 0.317f, 0.3f)
                arcTo(11.92f, 11.92f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(3.206f, 0.0f, 6.22f, -1.247f, 8.487f, -3.512f)
                curveToRelative(4.576f, -4.576f, 4.673f, -11.956f, 0.301f, -16.656f)
                close()
                moveTo(4.133f, 4.133f)
                arcTo(11.057f, 11.057f, 0.0f, false, true, 12.0f, 0.874f)
                curveToRelative(2.825f, 0.0f, 5.49f, 1.048f, 7.55f, 2.958f)
                lineToRelative(-1.001f, 1.002f)
                arcTo(9.646f, 9.646f, 0.0f, false, false, 12.0f, 2.292f)
                arcToRelative(9.644f, 9.644f, 0.0f, false, false, -6.865f, 2.844f)
                arcTo(9.644f, 9.644f, 0.0f, false, false, 2.292f, 12.0f)
                curveToRelative(0.0f, 2.448f, 0.9f, 4.753f, 2.542f, 6.549f)
                lineTo(3.831f, 19.55f)
                curveTo(-0.201f, 15.191f, -0.101f, 8.367f, 4.133f, 4.133f)
                close()
                moveTo(17.931f, 5.451f)
                verticalLineToRelative(0.002f)
                lineToRelative(-1.015f, 1.014f)
                arcTo(7.346f, 7.346f, 0.0f, false, false, 12.0f, 4.589f)
                arcTo(7.357f, 7.357f, 0.0f, false, false, 6.761f, 6.76f)
                arcTo(7.362f, 7.362f, 0.0f, false, false, 4.589f, 12.0f)
                arcToRelative(7.34f, 7.34f, 0.0f, false, false, 1.877f, 4.913f)
                lineToRelative(-1.014f, 1.016f)
                arcTo(8.77f, 8.77f, 0.0f, false, true, 3.167f, 12.0f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, 2.588f, -6.245f)
                arcTo(8.771f, 8.771f, 0.0f, false, true, 12.0f, 3.167f)
                curveToRelative(2.213f, 0.0f, 4.301f, 0.809f, 5.931f, 2.284f)
                close()
                moveTo(18.537f, 12.0f)
                curveToRelative(0.0f, 1.745f, -0.681f, 3.387f, -1.916f, 4.622f)
                reflectiveCurveTo(13.746f, 18.538f, 12.0f, 18.538f)
                arcToRelative(6.491f, 6.491f, 0.0f, false, true, -4.296f, -1.621f)
                lineToRelative(-0.001f, -0.004f)
                curveToRelative(-0.11f, -0.094f, -0.22f, -0.188f, -0.324f, -0.291f)
                arcToRelative(6.027f, 6.027f, 0.0f, false, true, -0.293f, -0.326f)
                arcTo(6.47f, 6.47f, 0.0f, false, true, 5.466f, 12.0f)
                curveToRelative(0.0f, -1.746f, 0.679f, -3.387f, 1.914f, -4.621f)
                arcTo(6.488f, 6.488f, 0.0f, false, true, 12.0f, 5.465f)
                curveToRelative(1.599f, 0.0f, 3.105f, 0.576f, 4.295f, 1.62f)
                curveToRelative(0.111f, 0.096f, 0.224f, 0.19f, 0.326f, 0.295f)
                curveToRelative(0.104f, 0.104f, 0.2f, 0.214f, 0.295f, 0.324f)
                arcTo(6.482f, 6.482f, 0.0f, false, true, 18.537f, 12.0f)
                close()
                moveTo(7.084f, 17.534f)
                horizontalLineToRelative(0.001f)
                arcTo(7.349f, 7.349f, 0.0f, false, false, 12.0f, 19.413f)
                arcToRelative(7.35f, 7.35f, 0.0f, false, false, 5.239f, -2.174f)
                arcTo(7.354f, 7.354f, 0.0f, false, false, 19.412f, 12.0f)
                arcToRelative(7.364f, 7.364f, 0.0f, false, false, -1.876f, -4.916f)
                lineToRelative(1.013f, -1.012f)
                arcTo(8.777f, 8.777f, 0.0f, false, true, 20.834f, 12.0f)
                arcToRelative(8.765f, 8.765f, 0.0f, false, true, -2.589f, 6.246f)
                arcTo(8.764f, 8.764f, 0.0f, false, true, 12.0f, 20.834f)
                arcToRelative(8.782f, 8.782f, 0.0f, false, true, -5.93f, -2.285f)
                lineToRelative(1.014f, -1.015f)
                close()
                moveTo(19.867f, 19.867f)
                arcTo(11.046f, 11.046f, 0.0f, false, true, 12.0f, 23.125f)
                arcToRelative(11.042f, 11.042f, 0.0f, false, true, -7.551f, -2.957f)
                lineToRelative(1.004f, -1.001f)
                arcToRelative(9.64f, 9.64f, 0.0f, false, false, 6.549f, 2.542f)
                arcToRelative(9.639f, 9.639f, 0.0f, false, false, 6.865f, -2.846f)
                arcTo(9.642f, 9.642f, 0.0f, false, false, 21.71f, 12.0f)
                arcToRelative(9.64f, 9.64f, 0.0f, false, false, -2.543f, -6.548f)
                lineToRelative(1.001f, -1.002f)
                curveToRelative(4.031f, 4.359f, 3.935f, 11.182f, -0.301f, 15.417f)
                close()
            }
        }
        .build()
        return _circle!!
    }

private var _circle: ImageVector? = null
