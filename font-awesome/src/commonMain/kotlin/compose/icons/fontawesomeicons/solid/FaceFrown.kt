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

public val SolidGroup.FaceFrown: ImageVector
    get() {
        if (_faceFrown != null) {
            return _faceFrown!!
        }
        _faceFrown = Builder(name = "FaceFrown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(159.3f, 388.7f)
                curveToRelative(-2.6f, 8.4f, -11.6f, 13.2f, -20.0f, 10.5f)
                reflectiveCurveToRelative(-13.2f, -11.6f, -10.5f, -20.0f)
                curveTo(145.2f, 326.1f, 196.3f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(110.8f, 38.1f, 127.3f, 91.3f)
                curveToRelative(2.6f, 8.4f, -2.1f, 17.4f, -10.5f, 20.0f)
                reflectiveCurveToRelative(-17.4f, -2.1f, -20.0f, -10.5f)
                curveTo(340.5f, 349.4f, 302.1f, 320.0f, 256.0f, 320.0f)
                reflectiveCurveToRelative(-84.5f, 29.4f, -96.7f, 68.7f)
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
