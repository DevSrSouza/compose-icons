package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(369.8f, 177.9f)
                lineToRelative(-40.7f, 191.8f)
                curveToRelative(-3.0f, 13.6f, -11.1f, 16.9f, -22.4f, 10.5f)
                lineToRelative(-62.0f, -45.7f)
                lineToRelative(-29.9f, 28.8f)
                curveToRelative(-3.3f, 3.3f, -6.1f, 6.1f, -12.5f, 6.1f)
                lineToRelative(4.4f, -63.1f)
                lineToRelative(114.9f, -103.8f)
                curveToRelative(5.0f, -4.4f, -1.1f, -6.9f, -7.7f, -2.5f)
                lineToRelative(-142.0f, 89.4f)
                lineToRelative(-61.2f, -19.1f)
                curveToRelative(-13.3f, -4.2f, -13.6f, -13.3f, 2.8f, -19.7f)
                lineToRelative(239.1f, -92.2f)
                curveToRelative(11.1f, -4.0f, 20.8f, 2.7f, 17.2f, 19.5f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
