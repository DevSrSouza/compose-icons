package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Cuttlefish: ImageVector
    get() {
        if (_cuttlefish != null) {
            return _cuttlefish!!
        }
        _cuttlefish = Builder(name = "Cuttlefish", defaultWidth = 440.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 440.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.0f, 305.5f)
                curveToRelative(-17.5f, 31.6f, -57.4f, 54.5f, -96.0f, 54.5f)
                curveToRelative(-56.6f, 0.0f, -104.0f, -47.4f, -104.0f, -104.0f)
                reflectiveCurveToRelative(47.4f, -104.0f, 104.0f, -104.0f)
                curveToRelative(38.6f, 0.0f, 78.5f, 22.9f, 96.0f, 54.5f)
                curveToRelative(13.7f, -50.9f, 41.7f, -93.3f, 87.0f, -117.8f)
                curveTo(385.7f, 39.1f, 320.5f, 8.0f, 248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                curveToRelative(72.5f, 0.0f, 137.7f, -31.1f, 183.0f, -80.7f)
                curveToRelative(-45.3f, -24.5f, -73.3f, -66.9f, -87.0f, -117.8f)
                close()
            }
        }
        .build()
        return _cuttlefish!!
    }

private var _cuttlefish: ImageVector? = null
