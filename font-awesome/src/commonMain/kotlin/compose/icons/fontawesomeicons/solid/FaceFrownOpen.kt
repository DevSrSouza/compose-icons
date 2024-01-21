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

public val SolidGroup.FaceFrownOpen: ImageVector
    get() {
        if (_faceFrownOpen != null) {
            return _faceFrownOpen!!
        }
        _faceFrownOpen = Builder(name = "FaceFrownOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(176.4f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(304.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(182.4f, 382.5f)
                curveToRelative(-12.4f, 5.2f, -26.5f, -4.1f, -21.1f, -16.4f)
                curveToRelative(16.0f, -36.6f, 52.4f, -62.1f, 94.8f, -62.1f)
                reflectiveCurveToRelative(78.8f, 25.6f, 94.8f, 62.1f)
                curveToRelative(5.4f, 12.3f, -8.7f, 21.6f, -21.1f, 16.4f)
                curveToRelative(-22.4f, -9.5f, -47.4f, -14.8f, -73.7f, -14.8f)
                reflectiveCurveToRelative(-51.3f, 5.3f, -73.7f, 14.8f)
                close()
            }
        }
        .build()
        return _faceFrownOpen!!
    }

private var _faceFrownOpen: ImageVector? = null
