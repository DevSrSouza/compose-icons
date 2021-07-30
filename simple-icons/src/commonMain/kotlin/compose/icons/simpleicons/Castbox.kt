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

public val SimpleIcons.Castbox: ImageVector
    get() {
        if (_castbox != null) {
            return _castbox!!
        }
        _castbox = Builder(name = "Castbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.29f, 0.0f, -0.58f, 0.068f, -0.812f, 0.206f)
                lineTo(2.417f, 5.392f)
                curveToRelative(-0.46f, 0.272f, -0.804f, 0.875f, -0.804f, 1.408f)
                verticalLineToRelative(10.4f)
                curveToRelative(0.0f, 0.533f, 0.344f, 1.135f, 0.804f, 1.407f)
                lineToRelative(8.77f, 5.187f)
                curveToRelative(0.465f, 0.275f, 1.162f, 0.275f, 1.626f, 0.0f)
                lineToRelative(8.77f, -5.187f)
                curveToRelative(0.46f, -0.272f, 0.804f, -0.874f, 0.804f, -1.407f)
                lineTo(22.387f, 6.8f)
                curveToRelative(0.0f, -0.533f, -0.344f, -1.136f, -0.804f, -1.408f)
                lineTo(12.813f, 0.206f)
                arcTo(1.618f, 1.618f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.15f, 8.304f)
                curveToRelative(0.394f, 0.0f, 0.714f, 0.303f, 0.714f, 0.676f)
                verticalLineToRelative(2.224f)
                curveToRelative(0.0f, 0.207f, 0.191f, 0.375f, 0.427f, 0.375f)
                reflectiveCurveToRelative(0.428f, -0.168f, 0.428f, -0.375f)
                lineTo(12.719f, 9.57f)
                curveToRelative(0.0f, -0.373f, 0.32f, -0.675f, 0.713f, -0.675f)
                curveToRelative(0.394f, 0.0f, 0.712f, 0.302f, 0.712f, 0.675f)
                verticalLineToRelative(4.713f)
                curveToRelative(0.0f, 0.374f, -0.318f, 0.676f, -0.712f, 0.676f)
                curveToRelative(-0.394f, 0.0f, -0.713f, -0.302f, -0.713f, -0.676f)
                verticalLineToRelative(-1.31f)
                curveToRelative(0.0f, -0.206f, -0.192f, -0.374f, -0.428f, -0.374f)
                reflectiveCurveToRelative(-0.427f, 0.168f, -0.427f, 0.374f)
                verticalLineToRelative(1.226f)
                curveToRelative(0.0f, 0.374f, -0.32f, 0.676f, -0.713f, 0.676f)
                curveToRelative(-0.394f, 0.0f, -0.713f, -0.302f, -0.713f, -0.676f)
                verticalLineToRelative(-1.667f)
                curveToRelative(0.0f, -0.207f, -0.192f, -0.375f, -0.428f, -0.375f)
                curveToRelative(-0.235f, 0.0f, -0.427f, 0.168f, -0.427f, 0.375f)
                verticalLineToRelative(3.31f)
                curveToRelative(0.0f, 0.373f, -0.319f, 0.676f, -0.712f, 0.676f)
                curveToRelative(-0.394f, 0.0f, -0.713f, -0.303f, -0.713f, -0.676f)
                verticalLineToRelative(-2.427f)
                curveToRelative(0.0f, -0.206f, -0.191f, -0.374f, -0.428f, -0.374f)
                curveToRelative(-0.235f, 0.0f, -0.427f, 0.168f, -0.427f, 0.374f)
                verticalLineToRelative(0.178f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, -0.712f, 0.708f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, -0.713f, -0.708f)
                verticalLineToRelative(-2.123f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, 0.713f, -0.708f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, 0.712f, 0.708f)
                verticalLineToRelative(0.178f)
                curveToRelative(0.0f, 0.206f, 0.192f, 0.373f, 0.427f, 0.373f)
                curveToRelative(0.237f, 0.0f, 0.428f, -0.167f, 0.428f, -0.373f)
                verticalLineToRelative(-1.53f)
                curveToRelative(0.0f, -0.374f, 0.32f, -0.676f, 0.713f, -0.676f)
                curveToRelative(0.393f, 0.0f, 0.712f, 0.303f, 0.712f, 0.676f)
                verticalLineToRelative(0.646f)
                curveToRelative(0.0f, 0.206f, 0.192f, 0.374f, 0.427f, 0.374f)
                curveToRelative(0.236f, 0.0f, 0.428f, -0.168f, 0.428f, -0.374f)
                lineTo(10.438f, 8.98f)
                curveToRelative(0.0f, -0.373f, 0.319f, -0.676f, 0.713f, -0.676f)
                close()
                moveTo(15.712f, 10.72f)
                curveToRelative(0.393f, 0.0f, 0.713f, 0.302f, 0.713f, 0.676f)
                verticalLineToRelative(2.691f)
                curveToRelative(0.0f, 0.374f, -0.32f, 0.676f, -0.713f, 0.676f)
                curveToRelative(-0.394f, 0.0f, -0.712f, -0.303f, -0.712f, -0.676f)
                verticalLineToRelative(-2.691f)
                curveToRelative(0.0f, -0.374f, 0.319f, -0.676f, 0.712f, -0.676f)
                close()
                moveTo(17.992f, 12.088f)
                curveToRelative(0.395f, 0.0f, 0.713f, 0.303f, 0.713f, 0.676f)
                verticalLineToRelative(0.67f)
                curveToRelative(0.0f, 0.374f, -0.318f, 0.676f, -0.712f, 0.676f)
                curveToRelative(-0.394f, 0.0f, -0.713f, -0.302f, -0.713f, -0.675f)
                verticalLineToRelative(-0.67f)
                curveToRelative(0.0f, -0.374f, 0.32f, -0.677f, 0.713f, -0.677f)
                close()
            }
        }
        .build()
        return _castbox!!
    }

private var _castbox: ImageVector? = null
