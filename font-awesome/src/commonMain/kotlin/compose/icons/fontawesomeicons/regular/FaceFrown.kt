package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FaceFrown: ImageVector
    get() {
        if (_faceFrown != null) {
            return _faceFrown!!
        }
        _faceFrown = Builder(name = "FaceFrown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, false, 48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(174.6f, 384.1f)
                curveToRelative(-4.5f, 12.5f, -18.2f, 18.9f, -30.7f, 14.4f)
                reflectiveCurveToRelative(-18.9f, -18.2f, -14.4f, -30.7f)
                curveTo(146.9f, 319.4f, 198.9f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(109.1f, 31.4f, 126.6f, 79.9f)
                curveToRelative(4.5f, 12.5f, -2.0f, 26.2f, -14.4f, 30.7f)
                reflectiveCurveToRelative(-26.2f, -2.0f, -30.7f, -14.4f)
                curveTo(328.2f, 358.5f, 297.2f, 336.0f, 256.0f, 336.0f)
                reflectiveCurveToRelative(-72.2f, 22.5f, -81.4f, 48.1f)
                close()
                moveTo(144.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(336.4f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceFrown!!
    }

private var _faceFrown: ImageVector? = null
