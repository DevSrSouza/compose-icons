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

public val ThinGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 31.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                curveToRelative(-34.3f, 0.0f, -70.5f, 33.1f, -94.9f, 60.9f)
                lineToRelative(-0.3f, 0.3f)
                curveToRelative(-7.5f, 8.6f, -13.9f, 16.7f, -18.8f, 23.1f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 36.0f, 164.0f)
                curveToRelative(0.0f, 33.4f, -17.7f, 48.3f, -18.5f, 48.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 220.0f)
                lineTo(92.0f, 220.0f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, false, 52.7f, -75.0f)
                curveToRelative(6.4f, -4.9f, 14.5f, -11.3f, 23.1f, -18.8f)
                lineToRelative(0.3f, -0.3f)
                curveTo(195.9f, 101.5f, 229.0f, 65.3f, 229.0f, 31.0f)
                close()
                moveTo(92.0f, 212.0f)
                lineTo(29.1f, 212.0f)
                curveToRelative(6.4f, -8.2f, 14.9f, -23.9f, 14.9f, -48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f)
                close()
                moveTo(118.5f, 114.7f)
                curveToRelative(4.3f, -5.7f, 9.5f, -12.2f, 15.3f, -18.9f)
                arcToRelative(79.3f, 79.3f, 0.0f, false, true, 26.4f, 26.4f)
                curveToRelative(-6.7f, 5.8f, -13.2f, 11.0f, -18.9f, 15.3f)
                arcTo(55.6f, 55.6f, 0.0f, false, false, 118.5f, 114.7f)
                close()
                moveTo(166.3f, 116.9f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, false, -27.2f, -27.2f)
                arcToRelative(288.5f, 288.5f, 0.0f, false, true, 22.8f, -22.8f)
                curveToRelative(21.8f, -19.6f, 41.6f, -30.2f, 58.9f, -31.7f)
                curveToRelative(-1.5f, 17.3f, -12.1f, 37.1f, -31.7f, 58.9f)
                arcTo(288.5f, 288.5f, 0.0f, false, true, 166.3f, 116.9f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
