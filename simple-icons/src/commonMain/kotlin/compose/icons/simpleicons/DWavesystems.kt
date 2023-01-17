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

public val SimpleIcons.Dwavesystems: ImageVector
    get() {
        if (_dwavesystems != null) {
            return _dwavesystems!!
        }
        _dwavesystems = Builder(name = "Dwavesystems", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1062f, 12.0046f)
                curveToRelative(0.0f, 1.5815f, -1.2842f, 2.8636f, -2.8685f, 2.8636f)
                curveToRelative(-1.5842f, 0.0f, -2.8684f, -1.282f, -2.8684f, -2.8636f)
                curveToRelative(0.0f, -1.5815f, 1.2842f, -2.8635f, 2.8684f, -2.8635f)
                curveToRelative(1.5843f, 0.0f, 2.8685f, 1.2821f, 2.8685f, 2.8635f)
                close()
                moveTo(7.2377f, 0.0f)
                curveTo(5.6536f, 0.0f, 4.3693f, 1.2817f, 4.3693f, 2.8628f)
                reflectiveCurveToRelative(1.2842f, 2.8629f, 2.8684f, 2.8629f)
                curveToRelative(1.5842f, 0.0f, 2.8685f, -1.2817f, 2.8685f, -2.8629f)
                curveTo(10.1062f, 1.2817f, 8.822f, 0.0f, 7.2377f, 0.0f)
                close()
                moveTo(16.7623f, 18.2781f)
                curveToRelative(-1.5838f, 0.0f, -2.8677f, 1.2764f, -2.8677f, 2.8636f)
                curveToRelative(0.0f, 1.5763f, 1.2835f, 2.8583f, 2.8677f, 2.8583f)
                curveToRelative(1.5845f, 0.0f, 2.8684f, -1.282f, 2.8684f, -2.8583f)
                curveToRelative(0.0f, -1.5872f, -1.2843f, -2.8636f, -2.8684f, -2.8636f)
                close()
                moveTo(13.8938f, 12.0046f)
                curveToRelative(0.0f, -1.5815f, 1.2842f, -2.8635f, 2.8685f, -2.8635f)
                curveToRelative(1.5842f, 0.0f, 2.8684f, 1.282f, 2.8684f, 2.8635f)
                curveToRelative(0.0f, 1.5815f, -1.2842f, 2.8636f, -2.8684f, 2.8636f)
                curveToRelative(-1.5843f, 0.0f, -2.8685f, -1.282f, -2.8685f, -2.8636f)
                close()
                moveTo(14.3938f, 12.0046f)
                curveToRelative(0.0f, 1.3033f, 1.0625f, 2.3636f, 2.3685f, 2.3636f)
                reflectiveCurveToRelative(2.3684f, -1.0603f, 2.3684f, -2.3636f)
                curveToRelative(0.0f, -1.3032f, -1.0624f, -2.3635f, -2.3684f, -2.3635f)
                reflectiveCurveToRelative(-2.3685f, 1.0603f, -2.3685f, 2.3635f)
                close()
            }
        }
        .build()
        return _dwavesystems!!
    }

private var _dwavesystems: ImageVector? = null
