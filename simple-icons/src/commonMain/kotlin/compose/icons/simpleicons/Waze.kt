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

public val SimpleIcons.Waze: ImageVector
    get() {
        if (_waze != null) {
            return _waze!!
        }
        _waze = Builder(name = "Waze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.218f, 0.0f)
                curveTo(9.915f, 0.0f, 6.835f, 1.49f, 4.723f, 4.148f)
                curveToRelative(-1.515f, 1.913f, -2.31f, 4.272f, -2.31f, 6.706f)
                verticalLineToRelative(1.739f)
                curveToRelative(0.0f, 0.894f, -0.62f, 1.738f, -1.862f, 1.813f)
                curveToRelative(-0.298f, 0.025f, -0.547f, 0.224f, -0.547f, 0.522f)
                curveToRelative(-0.05f, 0.82f, 0.82f, 2.31f, 2.012f, 3.502f)
                curveToRelative(0.82f, 0.844f, 1.788f, 1.515f, 2.832f, 2.036f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.955f, 3.528f)
                arcToRelative(2.966f, 2.966f, 0.0f, false, false, 2.931f, -2.385f)
                horizontalLineToRelative(2.509f)
                curveToRelative(0.323f, 1.689f, 2.086f, 2.856f, 3.974f, 2.21f)
                curveToRelative(1.64f, -0.546f, 2.36f, -2.409f, 1.763f, -3.924f)
                arcToRelative(12.84f, 12.84f, 0.0f, false, false, 1.838f, -1.465f)
                arcToRelative(10.73f, 10.73f, 0.0f, false, false, 3.18f, -7.65f)
                curveToRelative(0.0f, -2.882f, -1.118f, -5.589f, -3.155f, -7.625f)
                arcTo(10.899f, 10.899f, 0.0f, false, false, 13.218f, 0.0f)
                close()
                moveTo(13.218f, 1.217f)
                curveToRelative(2.558f, 0.0f, 4.967f, 0.994f, 6.78f, 2.807f)
                arcToRelative(9.525f, 9.525f, 0.0f, false, true, 2.807f, 6.78f)
                arcTo(9.526f, 9.526f, 0.0f, false, true, 20.0f, 17.585f)
                arcToRelative(9.647f, 9.647f, 0.0f, false, true, -6.78f, 2.807f)
                horizontalLineToRelative(-2.46f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, -2.93f, -2.41f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, false, -2.534f, 1.367f)
                verticalLineToRelative(0.024f)
                arcToRelative(8.945f, 8.945f, 0.0f, false, true, -2.41f, -1.788f)
                curveToRelative(-0.844f, -0.844f, -1.316f, -1.614f, -1.515f, -2.11f)
                arcToRelative(2.858f, 2.858f, 0.0f, false, false, 1.441f, -0.846f)
                arcToRelative(2.959f, 2.959f, 0.0f, false, false, 0.795f, -2.036f)
                verticalLineToRelative(-1.789f)
                curveToRelative(0.0f, -2.11f, 0.696f, -4.197f, 2.012f, -5.861f)
                curveToRelative(1.863f, -2.385f, 4.62f, -3.726f, 7.6f, -3.726f)
                close()
                moveTo(10.808f, 7.203f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, -1.191f, 1.192f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, 1.192f, 1.193f)
                arcTo(1.192f, 1.192f, 0.0f, false, false, 12.0f, 8.395f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, -1.192f, -1.192f)
                close()
                moveTo(18.012f, 7.203f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, -1.192f, 1.192f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, 1.192f, 1.193f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, 1.192f, -1.193f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, -1.192f, -1.192f)
                close()
                moveTo(10.635f, 11.972f)
                arcToRelative(0.596f, 0.596f, 0.0f, false, false, -0.546f, 0.845f)
                arcToRelative(4.813f, 4.813f, 0.0f, false, false, 4.346f, 2.757f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, false, 4.347f, -2.757f)
                arcToRelative(0.596f, 0.596f, 0.0f, false, false, -0.547f, -0.845f)
                horizontalLineToRelative(-0.025f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, false, -0.521f, 0.348f)
                arcToRelative(3.59f, 3.59f, 0.0f, false, true, -3.254f, 2.061f)
                arcToRelative(3.591f, 3.591f, 0.0f, false, true, -3.254f, -2.061f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.546f, -0.348f)
                close()
            }
        }
        .build()
        return _waze!!
    }

private var _waze: ImageVector? = null
