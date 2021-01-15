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

public val SimpleIcons.GooglePlay: ImageVector
    get() {
        if (_googlePlay != null) {
            return _googlePlay!!
        }
        _googlePlay = Builder(name = "GooglePlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.22f, 0.0f)
                curveToRelative(-0.03f, 0.093f, -0.06f, 0.185f, -0.06f, 0.308f)
                verticalLineToRelative(23.229f)
                curveToRelative(0.0f, 0.217f, 0.061f, 0.34f, 0.184f, 0.463f)
                lineToRelative(11.415f, -12.093f)
                lineTo(1.22f, 0.0f)
                close()
                moveTo(13.529f, 12.708f)
                lineToRelative(2.951f, 3.045f)
                lineToRelative(-4.213f, 2.4f)
                reflectiveCurveToRelative(-5.355f, 3.044f, -8.308f, 4.739f)
                lineToRelative(9.57f, -10.184f)
                close()
                moveTo(14.33f, 11.877f)
                lineToRelative(3.166f, 3.292f)
                curveToRelative(0.496f, -0.276f, 4.371f, -2.492f, 4.924f, -2.8f)
                curveToRelative(0.584f, -0.338f, 0.525f, -0.8f, 0.029f, -1.046f)
                curveToRelative(-0.459f, -0.255f, -4.334f, -2.475f, -4.92f, -2.835f)
                lineToRelative(-3.203f, 3.392f)
                lineToRelative(0.004f, -0.003f)
                close()
                moveTo(13.527f, 11.077f)
                lineToRelative(2.984f, -3.169f)
                lineToRelative(-4.259f, -2.431f)
                reflectiveCurveTo(5.309f, 1.505f, 2.999f, 0.179f)
                lineToRelative(10.53f, 10.898f)
                horizontalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _googlePlay!!
    }

private var _googlePlay: ImageVector? = null
