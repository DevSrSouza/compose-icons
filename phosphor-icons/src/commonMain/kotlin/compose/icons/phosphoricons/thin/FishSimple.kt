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

public val ThinGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 76.0f)
                close()
                moveTo(195.3f, 165.1f)
                curveToRelative(-26.3f, 26.4f, -68.9f, 36.8f, -126.8f, 31.4f)
                curveToRelative(1.7f, 13.4f, 4.1f, 27.6f, 7.4f, 42.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 4.8f)
                lineTo(72.0f, 243.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, -3.1f)
                arcToRelative(447.6f, 447.6f, 0.0f, false, true, -7.7f, -45.3f)
                curveToRelative(-14.2f, -1.7f, -29.3f, -4.2f, -45.3f, -7.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.8f, -7.8f)
                curveToRelative(15.0f, 3.2f, 29.2f, 5.7f, 42.6f, 7.4f)
                curveTo(54.1f, 129.6f, 64.5f, 87.0f, 90.8f, 60.7f)
                arcToRelative(92.8f, 92.8f, 0.0f, false, true, 10.9f, -9.3f)
                horizontalLineToRelative(0.1f)
                curveToRelative(39.4f, -28.6f, 93.3f, -20.0f, 110.1f, -16.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.2f, 9.2f)
                curveTo(225.1f, 62.5f, 235.0f, 125.6f, 195.3f, 165.1f)
                close()
                moveTo(189.7f, 159.5f)
                lineTo(193.2f, 155.8f)
                arcToRelative(99.0f, 99.0f, 0.0f, false, true, -63.9f, -29.1f)
                arcToRelative(99.0f, 99.0f, 0.0f, false, true, -29.1f, -63.9f)
                lineToRelative(-3.7f, 3.5f)
                curveTo(71.7f, 91.2f, 62.0f, 132.1f, 67.6f, 188.4f)
                curveTo(123.9f, 194.0f, 164.8f, 184.3f, 189.7f, 159.5f)
                close()
                moveTo(213.3f, 45.8f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -3.1f, -3.1f)
                curveToRelative(-15.7f, -3.4f, -65.6f, -11.4f, -102.2f, 14.0f)
                arcTo(91.8f, 91.8f, 0.0f, false, false, 199.3f, 148.0f)
                curveTo(224.7f, 111.4f, 216.7f, 61.5f, 213.3f, 45.8f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
