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

public val BrandsGroup.GgCircle: ImageVector
    get() {
        if (_ggCircle != null) {
            return _ggCircle!!
        }
        _ggCircle = Builder(name = "GgCircle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.0f, 8.0f)
                curveTo(120.0f, 8.0f, 9.0f, 119.0f, 9.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(394.0f, 8.0f, 257.0f, 8.0f)
                close()
                moveTo(207.5f, 382.8f)
                lineTo(81.8f, 257.1f)
                lineToRelative(125.7f, -125.7f)
                lineToRelative(35.2f, 35.4f)
                lineToRelative(-24.2f, 24.2f)
                lineToRelative(-11.1f, -11.1f)
                lineToRelative(-77.2f, 77.2f)
                lineToRelative(77.2f, 77.2f)
                lineToRelative(26.6f, -26.6f)
                lineToRelative(-53.1f, -52.9f)
                lineToRelative(24.4f, -24.4f)
                lineToRelative(77.2f, 77.2f)
                lineToRelative(-75.0f, 75.2f)
                close()
                moveTo(306.5f, 380.6f)
                lineToRelative(-35.2f, -35.2f)
                lineToRelative(24.1f, -24.4f)
                lineToRelative(11.1f, 11.1f)
                lineToRelative(77.2f, -77.2f)
                lineToRelative(-77.2f, -77.2f)
                lineToRelative(-26.5f, 26.5f)
                lineToRelative(53.1f, 52.9f)
                lineToRelative(-24.4f, 24.4f)
                lineToRelative(-77.2f, -77.2f)
                lineToRelative(75.0f, -75.0f)
                lineTo(432.2f, 255.0f)
                lineTo(306.5f, 380.6f)
                close()
            }
        }
        .build()
        return _ggCircle!!
    }

private var _ggCircle: ImageVector? = null
