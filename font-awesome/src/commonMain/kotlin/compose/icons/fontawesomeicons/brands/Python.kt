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

public val BrandsGroup.Python: ImageVector
    get() {
        if (_python != null) {
            return _python!!
        }
        _python = Builder(name = "Python", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.8f, 200.5f)
                curveToRelative(-7.7f, -30.9f, -22.3f, -54.2f, -53.4f, -54.2f)
                horizontalLineToRelative(-40.1f)
                verticalLineToRelative(47.4f)
                curveToRelative(0.0f, 36.8f, -31.2f, 67.8f, -66.8f, 67.8f)
                lineTo(172.7f, 261.5f)
                curveToRelative(-29.2f, 0.0f, -53.4f, 25.0f, -53.4f, 54.3f)
                verticalLineToRelative(101.8f)
                curveToRelative(0.0f, 29.0f, 25.2f, 46.0f, 53.4f, 54.3f)
                curveToRelative(33.8f, 9.9f, 66.3f, 11.7f, 106.8f, 0.0f)
                curveToRelative(26.9f, -7.8f, 53.4f, -23.5f, 53.4f, -54.3f)
                verticalLineToRelative(-40.7f)
                lineTo(226.2f, 376.9f)
                verticalLineToRelative(-13.6f)
                horizontalLineToRelative(160.2f)
                curveToRelative(31.1f, 0.0f, 42.6f, -21.7f, 53.4f, -54.2f)
                curveToRelative(11.2f, -33.5f, 10.7f, -65.7f, 0.0f, -108.6f)
                close()
                moveTo(286.2f, 404.0f)
                curveToRelative(11.1f, 0.0f, 20.1f, 9.1f, 20.1f, 20.3f)
                curveToRelative(0.0f, 11.3f, -9.0f, 20.4f, -20.1f, 20.4f)
                curveToRelative(-11.0f, 0.0f, -20.1f, -9.2f, -20.1f, -20.4f)
                curveToRelative(0.1f, -11.3f, 9.1f, -20.3f, 20.1f, -20.3f)
                close()
                moveTo(167.8f, 248.1f)
                horizontalLineToRelative(106.8f)
                curveToRelative(29.7f, 0.0f, 53.4f, -24.5f, 53.4f, -54.3f)
                lineTo(328.0f, 91.9f)
                curveToRelative(0.0f, -29.0f, -24.4f, -50.7f, -53.4f, -55.6f)
                curveToRelative(-35.8f, -5.9f, -74.7f, -5.6f, -106.8f, 0.1f)
                curveToRelative(-45.2f, 8.0f, -53.4f, 24.7f, -53.4f, 55.6f)
                verticalLineToRelative(40.7f)
                horizontalLineToRelative(106.9f)
                verticalLineToRelative(13.6f)
                horizontalLineToRelative(-147.0f)
                curveToRelative(-31.1f, 0.0f, -58.3f, 18.7f, -66.8f, 54.2f)
                curveToRelative(-9.8f, 40.7f, -10.2f, 66.1f, 0.0f, 108.6f)
                curveToRelative(7.6f, 31.6f, 25.7f, 54.2f, 56.8f, 54.2f)
                lineTo(101.0f, 363.3f)
                verticalLineToRelative(-48.8f)
                curveToRelative(0.0f, -35.3f, 30.5f, -66.4f, 66.8f, -66.4f)
                close()
                moveTo(161.1f, 105.5f)
                curveToRelative(-11.1f, 0.0f, -20.1f, -9.1f, -20.1f, -20.3f)
                curveToRelative(0.1f, -11.3f, 9.0f, -20.4f, 20.1f, -20.4f)
                curveToRelative(11.0f, 0.0f, 20.1f, 9.2f, 20.1f, 20.4f)
                reflectiveCurveToRelative(-9.0f, 20.3f, -20.1f, 20.3f)
                close()
            }
        }
        .build()
        return _python!!
    }

private var _python: ImageVector? = null
