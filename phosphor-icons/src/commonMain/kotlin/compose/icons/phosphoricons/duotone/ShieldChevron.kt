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

public val DuotoneGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(202.4f, 172.1f)
                curveToRelative(-21.4f, 40.2f, -61.6f, 55.7f, -71.9f, 59.1f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, -5.0f, 0.0f)
                curveToRelative(-10.3f, -3.4f, -50.5f, -18.9f, -71.9f, -59.1f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 120.0f)
                lineToRelative(74.4f, 52.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 89.4f, 75.8f, 119.1f, 91.0f, 124.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(15.2f, -5.0f, 91.0f, -34.7f, 91.0f, -124.1f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(48.0f, 56.0f)
                lineTo(208.0f, 56.0f)
                verticalLineToRelative(58.7f)
                arcToRelative(115.1f, 115.1f, 0.0f, false, true, -8.8f, 45.4f)
                lineToRelative(-66.6f, -46.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -9.2f, 0.0f)
                lineTo(56.8f, 160.1f)
                arcTo(115.1f, 115.1f, 0.0f, false, true, 48.0f, 114.7f)
                close()
                moveTo(128.0f, 223.6f)
                curveToRelative(-9.2f, -3.1f, -43.2f, -16.2f, -63.8f, -49.2f)
                lineTo(128.0f, 129.8f)
                lineToRelative(63.8f, 44.6f)
                curveTo(171.2f, 207.3f, 137.3f, 220.5f, 128.0f, 223.6f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
