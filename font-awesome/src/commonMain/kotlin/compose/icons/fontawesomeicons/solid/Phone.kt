package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(493.4f, 24.6f)
                lineToRelative(-104.0f, -24.0f)
                curveToRelative(-11.3f, -2.6f, -22.9f, 3.3f, -27.5f, 13.9f)
                lineToRelative(-48.0f, 112.0f)
                curveToRelative(-4.2f, 9.8f, -1.4f, 21.3f, 6.9f, 28.0f)
                lineToRelative(60.6f, 49.6f)
                curveToRelative(-36.0f, 76.7f, -98.9f, 140.5f, -177.2f, 177.2f)
                lineToRelative(-49.6f, -60.6f)
                curveToRelative(-6.8f, -8.3f, -18.2f, -11.1f, -28.0f, -6.9f)
                lineToRelative(-112.0f, 48.0f)
                curveTo(3.9f, 366.5f, -2.0f, 378.1f, 0.6f, 389.4f)
                lineToRelative(24.0f, 104.0f)
                curveTo(27.1f, 504.2f, 36.7f, 512.0f, 48.0f, 512.0f)
                curveToRelative(256.1f, 0.0f, 464.0f, -207.5f, 464.0f, -464.0f)
                curveToRelative(0.0f, -11.2f, -7.7f, -20.9f, -18.6f, -23.4f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
