package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) {
            return _fireSimple!!
        }
        _fireSimple = Builder(name = "FireSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(212.0f, 140.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -168.0f, 0.0f)
                curveToRelative(0.0f, -24.8f, 12.6f, -51.4f, 28.0f, -74.6f)
                horizontalLineToRelative(0.0f)
                lineTo(112.0f, 92.0f)
                lineToRelative(34.8f, -73.1f)
                horizontalLineToRelative(0.0f)
                curveTo(176.0f, 48.0f, 212.0f, 88.0f, 212.0f, 140.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.1f, 66.6f)
                curveToRelative(-13.0f, -20.8f, -29.9f, -38.7f, -44.6f, -53.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.0f, -2.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -5.9f, 4.4f)
                lineTo(108.7f, 80.2f)
                lineTo(76.5f, 58.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -6.0f, -1.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.1f, 3.4f)
                curveTo(45.9f, 90.3f, 36.0f, 116.9f, 36.0f, 140.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 115.1f, 212.5f, 91.1f, 197.1f, 66.6f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -18.2f, 7.5f, -39.5f, 22.4f, -63.5f)
                lineToRelative(33.2f, 22.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 6.5f, 1.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.1f, -4.3f)
                lineToRelative(29.9f, -62.8f)
                curveTo(178.6f, 63.2f, 204.0f, 97.4f, 204.0f, 140.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
