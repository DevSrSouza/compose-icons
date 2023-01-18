package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 86.7f, 73.5f, 115.4f, 88.3f, 120.3f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 7.4f, 0.0f)
                curveToRelative(14.8f, -4.9f, 88.3f, -33.6f, 88.3f, -120.3f)
                lineTo(220.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(212.0f, 114.7f)
                curveToRelative(0.0f, 81.2f, -69.0f, 108.2f, -82.8f, 112.7f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, -2.4f, 0.0f)
                curveTo(113.0f, 222.9f, 44.0f, 195.9f, 44.0f, 114.7f)
                lineTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(174.9f, 101.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.1f, 5.7f)
                lineToRelative(-58.7f, 56.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.8f, 1.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.7f, -1.1f)
                lineToRelative(-29.4f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, -5.8f)
                lineToRelative(26.5f, 25.4f)
                lineToRelative(55.9f, -53.4f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 174.9f, 101.2f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
