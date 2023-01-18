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

public val ThinGroup.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) {
            return _shieldStar!!
        }
        _shieldStar = Builder(name = "ShieldStar", defaultWidth = 256.0.dp, defaultHeight =
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
                moveTo(169.8f, 122.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.5f, 5.0f)
                lineToRelative(-32.8f, 10.7f)
                lineTo(154.7f, 166.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.8f, 5.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.4f, 0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -1.7f)
                lineTo(128.0f, 142.8f)
                lineToRelative(-20.3f, 27.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, 1.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.4f, -0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.8f, -5.6f)
                lineToRelative(20.2f, -27.9f)
                lineTo(88.7f, 127.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.5f, -5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -2.6f)
                lineTo(124.0f, 130.5f)
                lineTo(124.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(34.5f)
                lineToRelative(32.8f, -10.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 169.8f, 122.4f)
                close()
            }
        }
        .build()
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
