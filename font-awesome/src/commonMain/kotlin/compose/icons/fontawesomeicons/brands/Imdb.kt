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

public val BrandsGroup.Imdb: ImageVector
    get() {
        if (_imdb != null) {
            return _imdb!!
        }
        _imdb = Builder(name = "Imdb", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(21.3f, 229.2f)
                lineTo(21.0f, 229.2f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.3f, 0.3f, -0.4f)
                close()
                moveTo(97.0f, 319.8f)
                lineTo(64.0f, 319.8f)
                lineTo(64.0f, 192.0f)
                horizontalLineToRelative(33.0f)
                close()
                moveTo(210.2f, 319.8f)
                horizontalLineToRelative(-28.7f)
                verticalLineToRelative(-86.4f)
                lineToRelative(-11.6f, 86.4f)
                horizontalLineToRelative(-20.6f)
                lineToRelative(-12.2f, -84.5f)
                verticalLineToRelative(84.5f)
                horizontalLineToRelative(-29.0f)
                lineTo(108.1f, 192.0f)
                horizontalLineToRelative(42.8f)
                curveToRelative(3.3f, 19.8f, 6.0f, 39.9f, 8.7f, 59.9f)
                lineToRelative(7.6f, -59.9f)
                horizontalLineToRelative(43.0f)
                close()
                moveTo(221.6f, 319.8f)
                lineTo(221.6f, 192.0f)
                horizontalLineToRelative(24.6f)
                curveToRelative(17.6f, 0.0f, 44.7f, -1.6f, 49.0f, 20.9f)
                curveToRelative(1.7f, 7.6f, 1.4f, 16.3f, 1.4f, 24.4f)
                curveToRelative(0.0f, 88.5f, 11.1f, 82.6f, -75.0f, 82.5f)
                close()
                moveTo(382.5f, 290.6f)
                curveToRelative(0.0f, 15.7f, -2.4f, 30.9f, -22.2f, 30.9f)
                curveToRelative(-9.0f, 0.0f, -15.2f, -3.0f, -20.9f, -9.8f)
                lineToRelative(-1.9f, 8.1f)
                horizontalLineToRelative(-29.8f)
                lineTo(307.7f, 192.0f)
                horizontalLineToRelative(31.7f)
                verticalLineToRelative(41.7f)
                curveToRelative(6.0f, -6.5f, 12.0f, -9.2f, 20.9f, -9.2f)
                curveToRelative(21.4f, 0.0f, 22.2f, 12.8f, 22.2f, 30.1f)
                close()
                moveTo(265.0f, 229.9f)
                curveToRelative(0.0f, -9.7f, 1.6f, -16.0f, -10.3f, -16.0f)
                verticalLineToRelative(83.7f)
                curveToRelative(12.2f, 0.3f, 10.3f, -8.7f, 10.3f, -18.4f)
                close()
                moveTo(350.5f, 256.0f)
                curveToRelative(0.0f, -5.4f, 1.1f, -12.7f, -6.2f, -12.7f)
                curveToRelative(-6.0f, 0.0f, -4.9f, 8.9f, -4.9f, 12.7f)
                curveToRelative(0.0f, 0.6f, -1.1f, 39.6f, 1.1f, 44.7f)
                curveToRelative(0.8f, 1.6f, 2.2f, 2.4f, 3.8f, 2.4f)
                curveToRelative(7.8f, 0.0f, 6.2f, -9.0f, 6.2f, -14.4f)
                close()
            }
        }
        .build()
        return _imdb!!
    }

private var _imdb: ImageVector? = null
