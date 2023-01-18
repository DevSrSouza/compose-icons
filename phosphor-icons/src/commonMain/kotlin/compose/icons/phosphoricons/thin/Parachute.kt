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

public val ThinGroup.Parachute: ImageVector
    get() {
        if (_parachute != null) {
            return _parachute!!
        }
        _parachute = Builder(name = "Parachute", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 120.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -200.0f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.6f, 3.2f)
                horizontalLineToRelative(0.0f)
                lineTo(124.0f, 194.0f)
                verticalLineToRelative(26.0f)
                lineTo(112.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 220.0f)
                lineTo(132.0f, 194.0f)
                lineToRelative(94.4f, -70.8f)
                horizontalLineToRelative(0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 228.0f, 120.0f)
                close()
                moveTo(219.9f, 116.0f)
                lineTo(172.0f, 116.0f)
                curveToRelative(-1.0f, -48.6f, -19.9f, -75.1f, -32.0f, -87.2f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 219.9f, 116.0f)
                close()
                moveTo(128.0f, 28.9f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, true, 16.9f, 18.7f)
                curveToRelative(8.4f, 12.7f, 18.3f, 34.8f, 19.1f, 68.4f)
                lineTo(92.0f, 116.0f)
                curveToRelative(0.8f, -33.6f, 10.7f, -55.7f, 19.1f, -68.4f)
                arcTo(74.3f, 74.3f, 0.0f, false, true, 128.0f, 28.9f)
                close()
                moveTo(161.2f, 124.0f)
                lineTo(128.0f, 183.8f)
                lineTo(94.8f, 124.0f)
                close()
                moveTo(85.6f, 124.0f)
                lineTo(115.4f, 177.5f)
                lineTo(44.0f, 124.0f)
                close()
                moveTo(170.4f, 124.0f)
                lineTo(212.0f, 124.0f)
                lineToRelative(-71.4f, 53.5f)
                close()
                moveTo(116.0f, 28.8f)
                curveTo(103.9f, 40.9f, 85.0f, 67.4f, 84.0f, 116.0f)
                lineTo(36.1f, 116.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 116.0f, 28.8f)
                close()
            }
        }
        .build()
        return _parachute!!
    }

private var _parachute: ImageVector? = null
