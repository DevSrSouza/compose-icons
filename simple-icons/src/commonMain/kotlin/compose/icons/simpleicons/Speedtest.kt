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

public val SimpleIcons.Speedtest: ImageVector
    get() {
        if (_speedtest != null) {
            return _speedtest!!
        }
        _speedtest = Builder(name = "Speedtest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.628f, 16.186f)
                lineToRelative(-2.047f, -2.14f)
                lineToRelative(6.791f, -5.953f)
                lineToRelative(1.21f, 1.302f)
                close()
                moveTo(20.465f, 22.233f)
                curveToRelative(2.14f, -2.14f, 3.535f, -5.117f, 3.535f, -8.466f)
                curveToRelative(0.0f, -6.604f, -5.395f, -12.0f, -12.0f, -12.0f)
                reflectiveCurveToRelative(-12.0f, 5.396f, -12.0f, 12.0f)
                curveToRelative(0.0f, 3.35f, 1.302f, 6.326f, 3.535f, 8.466f)
                lineToRelative(1.674f, -1.675f)
                curveToRelative(-1.767f, -1.767f, -2.79f, -4.093f, -2.79f, -6.79f)
                arcTo(9.568f, 9.568f, 0.0f, false, true, 12.0f, 4.185f)
                arcToRelative(9.568f, 9.568f, 0.0f, false, true, 9.581f, 9.581f)
                curveToRelative(0.0f, 2.605f, -1.116f, 5.024f, -2.79f, 6.791f)
                close()
            }
        }
        .build()
        return _speedtest!!
    }

private var _speedtest: ImageVector? = null
