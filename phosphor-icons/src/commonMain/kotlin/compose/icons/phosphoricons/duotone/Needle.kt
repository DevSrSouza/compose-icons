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

public val DuotoneGroup.Needle: ImageVector
    get() {
        if (_needle != null) {
            return _needle!!
        }
        _needle = Builder(name = "Needle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(206.6f, 94.6f)
                lineToRelative(-24.0f, 24.0f)
                curveTo(128.0f, 128.0f, 40.0f, 216.0f, 40.0f, 216.0f)
                reflectiveCurveToRelative(88.0f, -88.0f, 97.4f, -142.6f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 45.2f, 45.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.7f, 66.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(16.0f, -16.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 189.7f, 66.3f)
                close()
                moveTo(224.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -11.7f, 28.3f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.3f, 2.2f)
                curveToRelative(-51.5f, 8.8f, -137.5f, 94.3f, -138.3f, 95.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                horizontalLineToRelative(0.1f)
                curveToRelative(1.6f, -1.6f, 86.3f, -87.0f, 95.1f, -138.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 2.2f, -4.3f)
                lineToRelative(24.0f, -24.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 224.0f, 72.0f)
                close()
                moveTo(208.0f, 72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.0f, -17.0f)
                lineTo(144.8f, 77.3f)
                curveToRelative(-4.4f, 21.1f, -18.9f, 46.2f, -35.5f, 69.4f)
                curveToRelative(23.2f, -16.6f, 48.3f, -31.1f, 69.4f, -35.5f)
                lineTo(201.0f, 89.0f)
                arcTo(24.2f, 24.2f, 0.0f, false, false, 208.0f, 72.0f)
                close()
            }
        }
        .build()
        return _needle!!
    }

private var _needle: ImageVector? = null
