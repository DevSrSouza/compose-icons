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

public val RegularGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1f, 260.2f)
                curveToRelative(-22.6f, 12.9f, -20.5f, 47.3f, 3.6f, 57.3f)
                lineTo(160.0f, 376.0f)
                lineTo(160.0f, 479.3f)
                curveToRelative(0.0f, 18.1f, 14.6f, 32.7f, 32.7f, 32.7f)
                curveToRelative(9.7f, 0.0f, 18.9f, -4.3f, 25.1f, -11.8f)
                lineToRelative(62.0f, -74.3f)
                lineToRelative(123.9f, 51.6f)
                curveToRelative(18.9f, 7.9f, 40.8f, -4.5f, 43.9f, -24.7f)
                lineToRelative(64.0f, -416.0f)
                curveToRelative(1.9f, -12.1f, -3.4f, -24.3f, -13.5f, -31.2f)
                reflectiveCurveToRelative(-23.3f, -7.5f, -34.0f, -1.4f)
                lineToRelative(-448.0f, 256.0f)
                close()
                moveTo(68.2f, 285.7f)
                lineTo(409.7f, 90.6f)
                lineTo(190.1f, 336.0f)
                lineToRelative(1.2f, 1.0f)
                lineTo(68.2f, 285.7f)
                close()
                moveTo(403.3f, 425.4f)
                lineTo(236.7f, 355.9f)
                lineTo(450.8f, 116.6f)
                lineTo(403.3f, 425.4f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
