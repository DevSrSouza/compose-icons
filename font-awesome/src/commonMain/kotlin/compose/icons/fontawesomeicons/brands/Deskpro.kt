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

public val BrandsGroup.Deskpro: ImageVector
    get() {
        if (_deskpro != null) {
            return _deskpro!!
        }
        _deskpro = Builder(name = "Deskpro", defaultWidth = 480.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.9f, 512.0f)
                lineToRelative(31.1f, -38.4f)
                curveToRelative(12.3f, -0.2f, 25.6f, -1.4f, 36.5f, -6.6f)
                curveToRelative(38.9f, -18.6f, 38.4f, -61.9f, 38.3f, -63.8f)
                curveToRelative(-0.1f, -5.0f, -0.8f, -4.4f, -28.9f, -37.4f)
                lineTo(362.0f, 365.8f)
                curveToRelative(-0.2f, 50.1f, -7.3f, 68.5f, -10.2f, 75.7f)
                curveToRelative(-9.4f, 23.7f, -43.9f, 62.8f, -95.2f, 69.4f)
                curveToRelative(-8.7f, 1.1f, -32.8f, 1.2f, -50.7f, 1.1f)
                close()
                moveTo(406.3f, 344.3f)
                curveToRelative(38.6f, 0.0f, 58.5f, -13.6f, 73.7f, -30.9f)
                lineToRelative(-175.5f, -0.3f)
                lineToRelative(-17.4f, 31.3f)
                lineToRelative(119.2f, -0.1f)
                close()
                moveTo(362.7f, 120.4f)
                verticalLineToRelative(168.3f)
                horizontalLineToRelative(-73.5f)
                lineToRelative(-32.7f, 55.5f)
                lineTo(250.0f, 344.2f)
                curveToRelative(-52.3f, 0.0f, -58.1f, -56.5f, -58.3f, -58.9f)
                curveToRelative(-1.2f, -13.2f, -21.3f, -11.6f, -20.1f, 1.8f)
                curveToRelative(1.4f, 15.8f, 8.8f, 40.0f, 26.4f, 57.1f)
                horizontalLineToRelative(-91.0f)
                curveToRelative(-25.5f, 0.0f, -110.8f, -26.8f, -107.0f, -114.0f)
                lineTo(-0.0f, 16.9f)
                curveTo(0.0f, 0.9f, 9.7f, 0.3f, 15.0f, 0.1f)
                horizontalLineToRelative(82.0f)
                curveToRelative(0.2f, 0.0f, 0.3f, 0.1f, 0.5f, 0.1f)
                curveToRelative(4.3f, -0.4f, 50.1f, -2.1f, 50.1f, 43.7f)
                curveToRelative(0.0f, 13.3f, 20.2f, 13.4f, 20.2f, 0.0f)
                curveToRelative(0.0f, -18.2f, -5.5f, -32.8f, -15.8f, -43.7f)
                horizontalLineToRelative(84.2f)
                curveToRelative(108.7f, -0.4f, 126.5f, 79.4f, 126.5f, 120.2f)
                close()
                moveTo(230.2f, 176.4f)
                lineToRelative(64.0f, 29.3f)
                curveToRelative(13.3f, -45.5f, -42.2f, -71.7f, -64.0f, -29.3f)
                close()
            }
        }
        .build()
        return _deskpro!!
    }

private var _deskpro: ImageVector? = null
