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

public val SimpleIcons.Bigbluebutton: ImageVector
    get() {
        if (_bigbluebutton != null) {
            return _bigbluebutton!!
        }
        _bigbluebutton = Builder(name = "Bigbluebutton", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.838f, 4.516f)
                curveToRelative(0.743f, 0.0f, 1.378f, 0.364f, 1.904f, 1.091f)
                curveToRelative(0.526f, 0.728f, 0.787f, 1.602f, 0.787f, 2.625f)
                verticalLineToRelative(6.76f)
                curveToRelative(0.0f, 0.539f, 0.27f, 0.809f, 0.809f, 0.809f)
                horizontalLineToRelative(4.174f)
                curveToRelative(0.538f, 0.0f, 0.808f, -0.27f, 0.808f, -0.809f)
                verticalLineToRelative(-3.205f)
                curveToRelative(0.0f, -0.52f, -0.27f, -0.788f, -0.808f, -0.807f)
                horizontalLineToRelative(-0.807f)
                curveToRelative(-1.041f, -0.036f, -1.923f, -0.308f, -2.64f, -0.816f)
                curveToRelative(-0.719f, -0.507f, -1.077f, -1.133f, -1.077f, -1.877f)
                horizontalLineToRelative(4.524f)
                curveToRelative(0.97f, 0.0f, 1.796f, 0.342f, 2.478f, 1.024f)
                arcToRelative(3.374f, 3.374f, 0.0f, false, true, 1.024f, 2.476f)
                verticalLineToRelative(3.205f)
                curveToRelative(0.0f, 0.97f, -0.342f, 1.797f, -1.024f, 2.479f)
                curveToRelative(-0.682f, 0.682f, -1.509f, 1.021f, -2.478f, 1.021f)
                horizontalLineToRelative(-4.174f)
                curveToRelative(-0.97f, 0.0f, -1.795f, -0.339f, -2.477f, -1.021f)
                arcToRelative(3.376f, 3.376f, 0.0f, false, true, -1.023f, -2.479f)
                verticalLineTo(4.516f)
                close()
            }
        }
        .build()
        return _bigbluebutton!!
    }

private var _bigbluebutton: ImageVector? = null
