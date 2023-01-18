package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) {
            return _sunHorizon!!
        }
        _sunHorizon = Builder(name = "SunHorizon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.1f, 45.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.1f, -9.2f)
                lineToRelative(7.7f, 18.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -6.5f, 15.7f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -4.6f, 0.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.1f, -7.4f)
                close()
                moveTo(19.9f, 112.2f)
                lineToRelative(18.5f, 7.7f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 4.6f, 0.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.6f, -23.1f)
                lineTo(29.1f, 90.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.2f, 22.1f)
                close()
                moveTo(213.0f, 120.8f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 4.6f, -0.9f)
                lineToRelative(18.5f, -7.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.2f, -22.1f)
                lineToRelative(-18.5f, 7.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.6f, 23.1f)
                close()
                moveTo(158.6f, 70.1f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 4.6f, 0.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.1f, -7.4f)
                lineToRelative(7.6f, -18.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -22.1f, -9.2f)
                lineToRelative(-7.7f, 18.5f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 158.6f, 70.1f)
                close()
                moveTo(252.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(16.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(64.0f, 148.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                horizontalLineToRelative(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 160.0f)
                close()
                moveTo(88.0f, 148.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                close()
                moveTo(208.0f, 188.0f)
                lineTo(48.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
