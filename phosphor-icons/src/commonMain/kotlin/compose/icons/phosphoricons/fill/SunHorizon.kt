package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) {
            return _sunHorizon!!
        }
        _sunHorizon = Builder(name = "SunHorizon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.7f, 43.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 4.4f, -10.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 10.4f, 4.4f)
                lineToRelative(7.7f, 18.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.3f, 10.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.1f, 0.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -7.4f, -4.9f)
                close()
                moveTo(213.0f, 116.8f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, -0.6f)
                lineToRelative(18.4f, -7.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.4f, -10.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -10.5f, -4.4f)
                lineToRelative(-18.5f, 7.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.1f, 15.4f)
                close()
                moveTo(160.1f, 66.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, 0.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 7.4f, -4.9f)
                lineToRelative(7.7f, -18.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -4.4f, -10.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -10.4f, 4.4f)
                lineToRelative(-7.7f, 18.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 160.1f, 66.4f)
                close()
                moveTo(21.5f, 108.5f)
                lineToRelative(18.4f, 7.7f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, 0.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.1f, -15.4f)
                lineTo(27.6f, 93.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -10.5f, 4.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 21.5f, 108.5f)
                close()
                moveTo(240.0f, 152.0f)
                lineTo(195.5f, 152.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, false, 0.5f, -8.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, false, 0.5f, 8.0f)
                lineTo(16.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(208.0f, 192.0f)
                lineTo(48.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(208.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
