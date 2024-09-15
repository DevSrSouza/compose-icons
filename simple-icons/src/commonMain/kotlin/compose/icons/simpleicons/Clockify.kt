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

public val SimpleIcons.Clockify: ImageVector
    get() {
        if (_clockify != null) {
            return _clockify!!
        }
        _clockify = Builder(name = "Clockify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.351f, 20.403f)
                curveToRelative(1.111f, 0.0f, 2.169f, -0.222f, 3.139f, -0.616f)
                lineToRelative(2.691f, 2.694f)
                curveTo(17.455f, 23.446f, 15.469f, 24.0f, 13.351f, 24.0f)
                curveTo(6.729f, 24.0f, 1.359f, 18.627f, 1.359f, 12.001f)
                curveTo(1.359f, 5.373f, 6.729f, 0.0f, 13.351f, 0.0f)
                curveToRelative(2.096f, 0.0f, 4.065f, 0.541f, 5.779f, 1.487f)
                lineTo(16.483f, 4.136f)
                curveToRelative(-0.969f, -0.392f, -2.024f, -0.613f, -3.132f, -0.613f)
                curveToRelative(-4.638f, 0.0f, -8.398f, 3.779f, -8.398f, 8.441f)
                curveToRelative(0.0f, 4.661f, 3.76f, 8.44f, 8.398f, 8.44f)
                close()
                moveTo(15.527f, 8.249f)
                lineToRelative(5.51f, -5.514f)
                lineToRelative(1.577f, 1.577f)
                lineToRelative(-5.51f, 5.514f)
                close()
                moveTo(13.294f, 13.884f)
                curveToRelative(-1.078f, 0.0f, -1.952f, -0.877f, -1.952f, -1.961f)
                curveToRelative(0.0f, -1.082f, 0.874f, -1.961f, 1.952f, -1.961f)
                curveToRelative(1.078f, 0.0f, 1.952f, 0.879f, 1.952f, 1.961f)
                curveToRelative(0.0f, 1.084f, -0.874f, 1.961f, -1.952f, 1.961f)
                close()
                moveTo(22.641f, 19.579f)
                lineToRelative(-1.577f, 1.578f)
                lineToRelative(-5.51f, -5.514f)
                lineToRelative(1.577f, -1.578f)
                close()
            }
        }
        .build()
        return _clockify!!
    }

private var _clockify: ImageVector? = null
