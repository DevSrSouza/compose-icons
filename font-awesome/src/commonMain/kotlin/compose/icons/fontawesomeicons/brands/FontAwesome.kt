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

public val BrandsGroup.FontAwesome: ImageVector
    get() {
        if (_fontAwesome != null) {
            return _fontAwesome!!
        }
        _fontAwesome = Builder(name = "FontAwesome", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(397.8f, 32.0f)
                lineTo(50.2f, 32.0f)
                curveTo(22.7f, 32.0f, 0.0f, 54.7f, 0.0f, 82.2f)
                verticalLineToRelative(347.6f)
                curveTo(0.0f, 457.3f, 22.7f, 480.0f, 50.2f, 480.0f)
                horizontalLineToRelative(347.6f)
                curveToRelative(27.5f, 0.0f, 50.2f, -22.7f, 50.2f, -50.2f)
                lineTo(448.0f, 82.2f)
                curveToRelative(0.0f, -27.5f, -22.7f, -50.2f, -50.2f, -50.2f)
                close()
                moveTo(352.4f, 316.3f)
                curveToRelative(0.0f, 4.2f, -3.6f, 6.0f, -7.8f, 7.8f)
                curveToRelative(-16.7f, 7.2f, -34.6f, 13.7f, -53.8f, 13.7f)
                curveToRelative(-26.9f, 0.0f, -39.4f, -16.7f, -71.7f, -16.7f)
                curveToRelative(-23.3f, 0.0f, -47.8f, 8.4f, -67.5f, 17.3f)
                curveToRelative(-1.2f, 0.6f, -2.4f, 0.6f, -3.6f, 1.2f)
                lineTo(148.0f, 385.0f)
                curveToRelative(0.0f, 1.8f, 0.0f, 3.6f, -0.6f, 4.8f)
                verticalLineToRelative(1.2f)
                curveToRelative(-2.4f, 8.4f, -10.2f, 14.3f, -19.1f, 14.3f)
                curveToRelative(-11.3f, 0.0f, -20.3f, -9.0f, -20.3f, -20.3f)
                lineTo(108.0f, 166.4f)
                curveToRelative(-7.8f, -6.0f, -13.1f, -15.5f, -13.1f, -26.3f)
                curveToRelative(0.0f, -18.5f, 14.9f, -33.5f, 33.5f, -33.5f)
                curveToRelative(18.5f, 0.0f, 33.5f, 14.9f, 33.5f, 33.5f)
                curveToRelative(0.0f, 10.8f, -4.8f, 20.3f, -13.1f, 26.3f)
                verticalLineToRelative(18.5f)
                curveToRelative(1.8f, -0.6f, 3.6f, -1.2f, 5.4f, -2.4f)
                curveToRelative(18.5f, -7.8f, 40.6f, -14.3f, 61.5f, -14.3f)
                curveToRelative(22.7f, 0.0f, 40.6f, 6.0f, 60.9f, 13.7f)
                curveToRelative(4.2f, 1.8f, 8.4f, 2.4f, 13.1f, 2.4f)
                curveToRelative(22.7f, 0.0f, 47.8f, -16.1f, 53.8f, -16.1f)
                curveToRelative(4.8f, 0.0f, 9.0f, 3.6f, 9.0f, 7.8f)
                verticalLineToRelative(140.3f)
                close()
            }
        }
        .build()
        return _fontAwesome!!
    }

private var _fontAwesome: ImageVector? = null
