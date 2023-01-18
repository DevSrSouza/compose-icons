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

public val ThinGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.8f, 225.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 228.0f)
                lineToRelative(-1.2f, -0.2f)
                lineTo(128.0f, 200.2f)
                lineTo(41.2f, 227.8f)
                lineTo(40.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.2f, -7.8f)
                lineToRelative(76.0f, -24.2f)
                lineToRelative(-76.0f, -24.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.4f, -7.6f)
                lineTo(128.0f, 191.8f)
                lineToRelative(86.8f, -27.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.4f, 7.6f)
                lineToRelative(-76.0f, 24.2f)
                lineToRelative(76.0f, 24.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.8f, 225.2f)
                close()
                moveTo(72.0f, 108.0f)
                curveToRelative(0.0f, -19.0f, 9.4f, -38.9f, 27.1f, -57.3f)
                arcToRelative(150.8f, 150.8f, 0.0f, false, true, 26.8f, -22.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, 0.0f)
                arcToRelative(150.8f, 150.8f, 0.0f, false, true, 26.8f, 22.1f)
                curveTo(174.6f, 69.1f, 184.0f, 89.0f, 184.0f, 108.0f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, -54.6f, 56.0f)
                horizontalLineToRelative(-2.8f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 72.0f, 108.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                curveToRelative(0.0f, -17.4f, -14.4f, -30.5f, -20.0f, -35.0f)
                curveToRelative(-5.6f, 4.5f, -20.0f, 17.6f, -20.0f, 35.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(80.0f, 108.0f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, 23.3f, 41.1f)
                arcTo(27.7f, 27.7f, 0.0f, false, true, 100.0f, 136.0f)
                curveToRelative(0.0f, -25.8f, 24.7f, -42.6f, 25.8f, -43.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.4f, 0.0f)
                curveToRelative(1.1f, 0.7f, 25.8f, 17.5f, 25.8f, 43.3f)
                arcToRelative(27.7f, 27.7f, 0.0f, false, true, -3.3f, 13.1f)
                arcTo(47.9f, 47.9f, 0.0f, false, false, 176.0f, 108.0f)
                curveToRelative(0.0f, -36.4f, -38.5f, -64.8f, -48.0f, -71.2f)
                curveTo(118.5f, 43.2f, 80.0f, 71.7f, 80.0f, 108.0f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
