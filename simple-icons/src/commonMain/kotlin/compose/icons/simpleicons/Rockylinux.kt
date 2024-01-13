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

public val SimpleIcons.Rockylinux: ImageVector
    get() {
        if (_rockylinux != null) {
            return _rockylinux!!
        }
        _rockylinux = Builder(name = "Rockylinux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.332f, 15.957f)
                curveToRelative(0.433f, -1.239f, 0.668f, -2.57f, 0.668f, -3.957f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                reflectiveCurveTo(0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.28f, 1.315f, 6.251f, 3.447f, 8.417f)
                lineTo(15.62f, 8.245f)
                lineToRelative(3.005f, 3.005f)
                close()
                moveTo(21.14f, 19.776f)
                lineToRelative(-5.52f, -5.52f)
                lineTo(6.975f, 22.9f)
                curveToRelative(1.528f, 0.706f, 3.23f, 1.1f, 5.025f, 1.1f)
                curveToRelative(3.661f, 0.0f, 6.94f, -1.64f, 9.14f, -4.224f)
                close()
            }
        }
        .build()
        return _rockylinux!!
    }

private var _rockylinux: ImageVector? = null
