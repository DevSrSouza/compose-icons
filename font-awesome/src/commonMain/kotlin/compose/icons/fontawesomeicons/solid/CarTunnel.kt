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

public val SolidGroup.CarTunnel: ImageVector
    get() {
        if (_carTunnel != null) {
            return _carTunnel!!
        }
        _carTunnel = Builder(name = "CarTunnel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(42.8f)
                curveToRelative(-6.6f, -5.9f, -10.8f, -14.4f, -10.8f, -24.0f)
                lineTo(96.0f, 376.0f)
                curveToRelative(0.0f, -20.8f, 11.3f, -38.9f, 28.1f, -48.6f)
                lineToRelative(21.0f, -64.7f)
                curveToRelative(7.5f, -23.1f, 29.0f, -38.7f, 53.3f, -38.7f)
                lineTo(313.6f, 224.0f)
                curveToRelative(24.3f, 0.0f, 45.8f, 15.6f, 53.3f, 38.7f)
                lineToRelative(21.0f, 64.7f)
                curveToRelative(16.8f, 9.7f, 28.2f, 27.8f, 28.2f, 48.6f)
                lineTo(416.1f, 488.0f)
                curveToRelative(0.0f, 9.6f, -4.2f, 18.1f, -10.8f, 24.0f)
                lineTo(448.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(512.0f, 256.0f)
                curveTo(512.0f, 114.6f, 397.4f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(362.8f, 512.0f)
                curveToRelative(-6.6f, -5.9f, -10.8f, -14.4f, -10.8f, -24.0f)
                lineTo(352.0f, 448.0f)
                lineTo(160.0f, 448.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 9.6f, -4.2f, 18.1f, -10.8f, 24.0f)
                lineTo(362.8f, 512.0f)
                close()
                moveTo(190.8f, 277.5f)
                lineTo(177.0f, 320.0f)
                lineTo(335.0f, 320.0f)
                lineToRelative(-13.8f, -42.5f)
                curveToRelative(-1.1f, -3.3f, -4.1f, -5.5f, -7.6f, -5.5f)
                lineTo(198.4f, 272.0f)
                curveToRelative(-3.5f, 0.0f, -6.5f, 2.2f, -7.6f, 5.5f)
                close()
                moveTo(168.0f, 408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(368.0f, 384.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _carTunnel!!
    }

private var _carTunnel: ImageVector? = null
