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

public val SimpleIcons.Mattermost: ImageVector
    get() {
        if (_mattermost != null) {
            return _mattermost!!
        }
        _mattermost = Builder(name = "Mattermost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.081f, 0.0f)
                curveTo(7.048f, -0.034f, 2.339f, 3.125f, 0.637f, 8.153f)
                curveToRelative(-2.125f, 6.276f, 1.24f, 13.086f, 7.516f, 15.21f)
                curveToRelative(6.276f, 2.125f, 13.086f, -1.24f, 15.21f, -7.516f)
                curveToRelative(1.727f, -5.1f, -0.172f, -10.552f, -4.311f, -13.557f)
                lineToRelative(0.126f, 2.547f)
                curveToRelative(2.065f, 2.282f, 2.88f, 5.512f, 1.852f, 8.549f)
                curveToRelative(-1.534f, 4.532f, -6.594f, 6.915f, -11.3f, 5.321f)
                curveToRelative(-4.708f, -1.593f, -7.28f, -6.559f, -5.745f, -11.092f)
                curveToRelative(1.031f, -3.046f, 3.655f, -5.121f, 6.694f, -5.67f)
                lineToRelative(1.642f, -1.94f)
                arcTo(4.87f, 4.87f, 0.0f, false, false, 12.08f, 0.0f)
                close()
                moveTo(15.609f, 1.094f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, false, -0.123f, 0.024f)
                lineToRelative(-0.004f, 0.001f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.109f, 0.071f)
                curveToRelative(-0.145f, 0.142f, -0.657f, 0.828f, -0.657f, 0.828f)
                lineTo(13.6f, 3.4f)
                lineToRelative(-1.3f, 1.585f)
                lineToRelative(-2.232f, 2.776f)
                reflectiveCurveToRelative(-1.024f, 1.278f, -0.798f, 2.851f)
                curveToRelative(0.226f, 1.574f, 1.396f, 2.34f, 2.304f, 2.648f)
                curveToRelative(0.907f, 0.307f, 2.302f, 0.408f, 3.438f, -0.704f)
                curveToRelative(1.135f, -1.112f, 1.098f, -2.75f, 1.098f, -2.75f)
                lineToRelative(-0.087f, -3.56f)
                lineToRelative(-0.07f, -2.05f)
                lineToRelative(-0.047f, -1.775f)
                reflectiveCurveToRelative(0.01f, -0.856f, -0.02f, -1.057f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.035f, -0.107f)
                lineToRelative(-0.006f, -0.012f)
                lineToRelative(-0.007f, -0.011f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, false, -0.229f, -0.14f)
                close()
            }
        }
        .build()
        return _mattermost!!
    }

private var _mattermost: ImageVector? = null
