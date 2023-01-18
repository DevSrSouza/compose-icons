package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) {
            return _sunHorizon!!
        }
        _sunHorizon = Builder(name = "SunHorizon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.6f, 42.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 82.8f, 35.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 7.9f, 3.2f)
                lineToRelative(7.6f, 18.5f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.2f, 7.8f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, true, -2.3f, 0.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.6f, -3.7f)
                close()
                moveTo(22.2f, 106.7f)
                lineToRelative(18.5f, 7.6f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 2.3f, 0.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.3f, -11.5f)
                lineTo(26.8f, 95.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 19.0f, 98.8f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 22.2f, 106.7f)
                close()
                moveTo(213.0f, 114.8f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 2.3f, -0.5f)
                lineToRelative(18.5f, -7.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 3.2f, -7.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.8f, -3.2f)
                lineToRelative(-18.5f, 7.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.3f, 11.5f)
                close()
                moveTo(160.9f, 64.5f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, 2.3f, 0.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.6f, -3.7f)
                lineToRelative(7.6f, -18.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.2f, -7.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -7.9f, 3.2f)
                lineToRelative(-7.6f, 18.5f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 160.9f, 64.5f)
                close()
                moveTo(246.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(62.8f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 130.4f, 0.0f)
                horizontalLineTo(240.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 160.0f)
                close()
                moveTo(74.9f, 154.0f)
                horizontalLineTo(181.1f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, false, 0.9f, -10.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -108.0f, 0.0f)
                arcTo(55.5f, 55.5f, 0.0f, false, false, 74.9f, 154.0f)
                close()
                moveTo(208.0f, 194.0f)
                horizontalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
