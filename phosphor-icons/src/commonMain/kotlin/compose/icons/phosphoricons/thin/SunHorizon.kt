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

public val ThinGroup.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) {
            return _sunHorizon!!
        }
        _sunHorizon = Builder(name = "SunHorizon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(81.4f, 42.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.2f, -5.3f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 88.8f, 39.0f)
                lineToRelative(7.7f, 18.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.8f, 63.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.7f, -2.5f)
                close()
                moveTo(23.0f, 104.8f)
                lineToRelative(18.5f, 7.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.5f, 0.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.7f, -2.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.2f, -5.2f)
                lineTo(26.1f, 97.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -5.3f, 2.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 23.0f, 104.8f)
                close()
                moveTo(213.0f, 112.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.5f, -0.3f)
                lineToRelative(18.5f, -7.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.2f, -5.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -5.3f, -2.2f)
                lineToRelative(-18.4f, 7.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.2f, 5.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 213.0f, 112.8f)
                close()
                moveTo(161.7f, 62.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.5f, 0.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.7f, -2.5f)
                lineToRelative(7.7f, -18.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -2.2f, -5.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -5.2f, 2.2f)
                lineToRelative(-7.7f, 18.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 161.7f, 62.7f)
                close()
                moveTo(244.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(16.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(65.1f, 156.0f)
                arcTo(68.7f, 68.7f, 0.0f, false, true, 64.0f, 144.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                arcToRelative(68.7f, 68.7f, 0.0f, false, true, -1.1f, 12.0f)
                lineTo(240.0f, 156.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 160.0f)
                close()
                moveTo(73.3f, 156.0f)
                lineTo(182.7f, 156.0f)
                arcToRelative(53.2f, 53.2f, 0.0f, false, false, 1.3f, -12.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -112.0f, 0.0f)
                arcTo(53.2f, 53.2f, 0.0f, false, false, 73.3f, 156.0f)
                close()
                moveTo(208.0f, 196.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(208.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
