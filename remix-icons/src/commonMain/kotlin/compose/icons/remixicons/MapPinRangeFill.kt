package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MapPinRangeFill: ImageVector
    get() {
        if (_mapPinRangeFill != null) {
            return _mapPinRangeFill!!
        }
        _mapPinRangeFill = Builder(name = "MapPinRangeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.938f)
                arcTo(8.001f, 8.001f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.0f, 15.938f)
                verticalLineToRelative(2.074f)
                curveToRelative(3.946f, 0.092f, 7.0f, 0.723f, 7.0f, 1.488f)
                curveToRelative(0.0f, 0.828f, -3.582f, 1.5f, -8.0f, 1.5f)
                reflectiveCurveToRelative(-8.0f, -0.672f, -8.0f, -1.5f)
                curveToRelative(0.0f, -0.765f, 3.054f, -1.396f, 7.0f, -1.488f)
                verticalLineToRelative(-2.074f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _mapPinRangeFill!!
    }

private var _mapPinRangeFill: ImageVector? = null
