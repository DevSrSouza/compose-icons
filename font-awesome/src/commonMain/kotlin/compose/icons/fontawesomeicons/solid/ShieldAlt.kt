package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShieldAlt: ImageVector
    get() {
        if (_shieldAlt != null) {
            return _shieldAlt!!
        }
        _shieldAlt = Builder(name = "ShieldAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(466.5f, 83.7f)
                lineToRelative(-192.0f, -80.0f)
                arcToRelative(48.15f, 48.15f, 0.0f, false, false, -36.9f, 0.0f)
                lineToRelative(-192.0f, 80.0f)
                curveTo(27.7f, 91.1f, 16.0f, 108.6f, 16.0f, 128.0f)
                curveToRelative(0.0f, 198.5f, 114.5f, 335.7f, 221.5f, 380.3f)
                curveToRelative(11.8f, 4.9f, 25.1f, 4.9f, 36.9f, 0.0f)
                curveTo(360.1f, 472.6f, 496.0f, 349.3f, 496.0f, 128.0f)
                curveToRelative(0.0f, -19.4f, -11.7f, -36.9f, -29.5f, -44.3f)
                close()
                moveTo(256.1f, 446.3f)
                lineToRelative(-0.1f, -381.0f)
                lineToRelative(175.9f, 73.3f)
                curveToRelative(-3.3f, 151.4f, -82.1f, 261.1f, -175.8f, 307.7f)
                close()
            }
        }
        .build()
        return _shieldAlt!!
    }

private var _shieldAlt: ImageVector? = null
