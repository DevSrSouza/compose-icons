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

public val BrandsGroup.Drupal: ImageVector
    get() {
        if (_drupal != null) {
            return _drupal!!
        }
        _drupal = Builder(name = "Drupal", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(319.5f, 114.7f)
                curveToRelative(-22.2f, -14.0f, -43.5f, -19.5f, -64.7f, -33.5f)
                curveToRelative(-13.0f, -8.8f, -31.3f, -30.0f, -46.5f, -48.3f)
                curveToRelative(-2.7f, 29.3f, -11.5f, 41.2f, -22.0f, 49.5f)
                curveToRelative(-21.3f, 17.0f, -34.8f, 22.2f, -53.5f, 32.3f)
                curveTo(117.0f, 123.0f, 32.0f, 181.5f, 32.0f, 290.5f)
                curveTo(32.0f, 399.7f, 123.8f, 480.0f, 225.8f, 480.0f)
                curveTo(327.5f, 480.0f, 416.0f, 406.0f, 416.0f, 294.0f)
                curveToRelative(0.0f, -112.3f, -83.0f, -171.0f, -96.5f, -179.3f)
                close()
                moveTo(322.0f, 440.3f)
                curveToRelative(-20.1f, 20.1f, -90.1f, 28.7f, -116.7f, 4.2f)
                curveToRelative(-4.8f, -4.8f, 0.3f, -12.0f, 6.5f, -12.0f)
                curveToRelative(0.0f, 0.0f, 17.0f, 13.3f, 51.5f, 13.3f)
                curveToRelative(27.0f, 0.0f, 46.0f, -7.7f, 54.5f, -14.0f)
                curveToRelative(6.1f, -4.6f, 8.4f, 4.3f, 4.2f, 8.5f)
                close()
                moveTo(267.5f, 387.7f)
                curveToRelative(8.7f, -3.6f, 29.0f, -3.8f, 36.8f, 1.3f)
                curveToRelative(4.1f, 2.8f, 16.1f, 18.8f, 6.2f, 23.7f)
                curveToRelative(-8.4f, 4.2f, -1.2f, -15.7f, -26.5f, -15.7f)
                curveToRelative(-14.7f, 0.0f, -19.5f, 5.2f, -26.7f, 11.0f)
                curveToRelative(-7.0f, 6.0f, -9.8f, 8.0f, -12.2f, 4.7f)
                curveToRelative(-6.0f, -8.2f, 15.9f, -22.3f, 22.4f, -25.0f)
                close()
                moveTo(360.0f, 405.0f)
                curveToRelative(-15.2f, -1.0f, -45.5f, -48.8f, -65.0f, -49.5f)
                curveToRelative(-30.9f, -0.9f, -104.1f, 80.7f, -161.3f, 42.0f)
                curveToRelative(-38.8f, -26.6f, -14.6f, -104.8f, 51.8f, -105.2f)
                curveToRelative(49.5f, -0.5f, 83.8f, 49.0f, 108.5f, 48.5f)
                curveToRelative(21.3f, -0.3f, 61.8f, -41.8f, 81.8f, -41.8f)
                curveToRelative(48.7f, 0.0f, 23.3f, 109.3f, -15.8f, 106.0f)
                close()
            }
        }
        .build()
        return _drupal!!
    }

private var _drupal: ImageVector? = null
