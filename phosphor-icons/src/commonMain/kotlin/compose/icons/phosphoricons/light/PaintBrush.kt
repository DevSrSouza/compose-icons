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

public val LightGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.0f, 25.0f)
                curveToRelative(-20.8f, 0.0f, -44.3f, 11.6f, -69.8f, 34.4f)
                curveTo(136.8f, 75.9f, 121.0f, 94.9f, 110.3f, 109.0f)
                arcTo(57.9f, 57.9f, 0.0f, false, false, 34.0f, 164.0f)
                curveToRelative(0.0f, 32.3f, -17.0f, 46.7f, -17.8f, 47.3f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -1.9f, 6.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.7f, 4.0f)
                lineTo(92.0f, 222.0f)
                arcToRelative(57.9f, 57.9f, 0.0f, false, false, 55.0f, -76.3f)
                curveToRelative(14.1f, -10.7f, 33.1f, -26.5f, 49.6f, -44.9f)
                curveTo(219.4f, 75.3f, 231.0f, 51.8f, 231.0f, 31.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 225.0f, 25.0f)
                close()
                moveTo(92.0f, 210.0f)
                lineTo(33.0f, 210.0f)
                curveToRelative(6.1f, -9.1f, 13.0f, -24.2f, 13.0f, -46.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 46.0f, 46.0f)
                close()
                moveTo(121.5f, 114.1f)
                curveToRelative(3.7f, -4.8f, 8.0f, -10.2f, 12.7f, -15.7f)
                arcToRelative(76.8f, 76.8f, 0.0f, false, true, 23.4f, 23.4f)
                curveToRelative(-5.5f, 4.7f, -10.9f, 9.0f, -15.7f, 12.7f)
                arcTo(58.6f, 58.6f, 0.0f, false, false, 121.5f, 114.1f)
                close()
                moveTo(187.6f, 92.8f)
                arcToRelative(276.3f, 276.3f, 0.0f, false, true, -20.9f, 21.0f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, false, -24.5f, -24.5f)
                arcToRelative(276.3f, 276.3f, 0.0f, false, true, 21.0f, -20.9f)
                curveToRelative(20.5f, -18.4f, 39.0f, -28.7f, 55.3f, -30.9f)
                curveTo(216.3f, 53.8f, 206.0f, 72.3f, 187.6f, 92.8f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
