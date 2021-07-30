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

public val BrandsGroup.Codepen: ImageVector
    get() {
        if (_codepen != null) {
            return _codepen!!
        }
        _codepen = Builder(name = "Codepen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.285f, 159.704f)
                lineToRelative(-234.0f, -156.0f)
                curveToRelative(-7.987f, -4.915f, -16.511f, -4.96f, -24.571f, 0.0f)
                lineToRelative(-234.0f, 156.0f)
                curveTo(3.714f, 163.703f, 0.0f, 170.847f, 0.0f, 177.989f)
                verticalLineToRelative(155.999f)
                curveToRelative(0.0f, 7.143f, 3.714f, 14.286f, 9.715f, 18.286f)
                lineToRelative(234.0f, 156.022f)
                curveToRelative(7.987f, 4.915f, 16.511f, 4.96f, 24.571f, 0.0f)
                lineToRelative(234.0f, -156.022f)
                curveToRelative(6.0f, -3.999f, 9.715f, -11.143f, 9.715f, -18.286f)
                lineTo(512.001f, 177.989f)
                curveToRelative(-0.001f, -7.142f, -3.715f, -14.286f, -9.716f, -18.285f)
                close()
                moveTo(278.0f, 63.131f)
                lineToRelative(172.286f, 114.858f)
                lineToRelative(-76.857f, 51.429f)
                lineTo(278.0f, 165.703f)
                lineTo(278.0f, 63.131f)
                close()
                moveTo(234.0f, 63.131f)
                verticalLineToRelative(102.572f)
                lineToRelative(-95.429f, 63.715f)
                lineToRelative(-76.857f, -51.429f)
                lineTo(234.0f, 63.131f)
                close()
                moveTo(44.0f, 219.132f)
                lineToRelative(55.143f, 36.857f)
                lineTo(44.0f, 292.846f)
                verticalLineToRelative(-73.714f)
                close()
                moveTo(234.0f, 448.847f)
                lineTo(61.714f, 333.989f)
                lineToRelative(76.857f, -51.429f)
                lineTo(234.0f, 346.275f)
                verticalLineToRelative(102.572f)
                close()
                moveTo(256.0f, 307.989f)
                lineToRelative(-77.715f, -52.0f)
                lineToRelative(77.715f, -52.0f)
                lineToRelative(77.715f, 52.0f)
                lineToRelative(-77.715f, 52.0f)
                close()
                moveTo(278.0f, 448.847f)
                lineTo(278.0f, 346.275f)
                lineToRelative(95.429f, -63.715f)
                lineToRelative(76.857f, 51.429f)
                lineTo(278.0f, 448.847f)
                close()
                moveTo(468.0f, 292.846f)
                lineToRelative(-55.143f, -36.857f)
                lineTo(468.0f, 219.132f)
                verticalLineToRelative(73.714f)
                close()
            }
        }
        .build()
        return _codepen!!
    }

private var _codepen: ImageVector? = null
