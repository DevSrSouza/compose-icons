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

public val SolidGroup.PhoneAlt: ImageVector
    get() {
        if (_phoneAlt != null) {
            return _phoneAlt!!
        }
        _phoneAlt = Builder(name = "PhoneAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.39f, 361.8f)
                lineToRelative(-112.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -28.0f, 6.9f)
                lineToRelative(-49.6f, 60.6f)
                arcTo(370.66f, 370.66f, 0.0f, false, true, 130.6f, 204.11f)
                lineToRelative(60.6f, -49.6f)
                arcToRelative(23.94f, 23.94f, 0.0f, false, false, 6.9f, -28.0f)
                lineToRelative(-48.0f, -112.0f)
                arcTo(24.16f, 24.16f, 0.0f, false, false, 122.6f, 0.61f)
                lineToRelative(-104.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f)
                curveToRelative(0.0f, 256.5f, 207.9f, 464.0f, 464.0f, 464.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 23.4f, -18.6f)
                lineToRelative(24.0f, -104.0f)
                arcToRelative(24.29f, 24.29f, 0.0f, false, false, -14.01f, -27.6f)
                close()
            }
        }
        .build()
        return _phoneAlt!!
    }

private var _phoneAlt: ImageVector? = null
