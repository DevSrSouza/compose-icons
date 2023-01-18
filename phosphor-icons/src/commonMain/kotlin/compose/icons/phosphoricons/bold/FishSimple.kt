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

public val BoldGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 140.0f, 76.0f)
                close()
                moveTo(201.0f, 170.8f)
                curveToRelative(-26.5f, 26.5f, -67.8f, 38.0f, -123.2f, 34.4f)
                curveToRelative(1.5f, 10.3f, 3.5f, 21.0f, 5.9f, 32.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.1f, 14.3f)
                lineTo(72.0f, 252.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.7f, -9.4f)
                curveToRelative(-3.1f, -13.9f, -5.4f, -27.2f, -7.1f, -39.8f)
                curveToRelative(-12.6f, -1.7f, -25.9f, -4.1f, -39.8f, -7.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.2f, -23.5f)
                curveToRelative(11.1f, 2.5f, 21.9f, 4.5f, 32.2f, 6.0f)
                curveTo(47.2f, 122.8f, 58.7f, 81.5f, 85.2f, 55.0f)
                curveToRelative(42.4f, -42.5f, 109.0f, -32.1f, 128.4f, -27.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 15.3f, 15.3f)
                curveTo(233.1f, 61.8f, 243.5f, 128.4f, 201.0f, 170.8f)
                close()
                moveTo(116.2f, 60.9f)
                arcTo(83.8f, 83.8f, 0.0f, false, false, 195.0f, 139.8f)
                curveToRelative(7.6f, -12.3f, 12.2f, -27.3f, 13.7f, -44.8f)
                arcTo(168.4f, 168.4f, 0.0f, false, false, 206.0f, 50.0f)
                curveTo(189.5f, 46.8f, 148.0f, 41.4f, 116.2f, 60.9f)
                close()
                moveTo(128.4f, 179.5f)
                curveToRelative(18.9f, -3.1f, 34.7f, -9.2f, 47.0f, -18.3f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 94.8f, 80.6f)
                curveToRelative(-9.1f, 12.3f, -15.3f, 28.1f, -18.3f, 47.0f)
                curveToRelative(-2.6f, 15.6f, -3.1f, 33.5f, -1.5f, 53.4f)
                curveTo(94.9f, 182.5f, 112.7f, 182.1f, 128.4f, 179.5f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
