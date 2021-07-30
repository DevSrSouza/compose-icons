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

public val BrandsGroup.Fonticons: ImageVector
    get() {
        if (_fonticons != null) {
            return _fonticons!!
        }
        _fonticons = Builder(name = "Fonticons", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                verticalLineToRelative(448.0f)
                horizontalLineToRelative(448.0f)
                lineTo(448.0f, 32.0f)
                close()
                moveTo(187.0f, 172.9f)
                curveToRelative(-18.4f, 0.0f, -19.0f, 9.9f, -19.0f, 27.4f)
                verticalLineToRelative(23.3f)
                curveToRelative(0.0f, 2.4f, -3.5f, 4.4f, -0.6f, 4.4f)
                horizontalLineToRelative(67.4f)
                lineToRelative(-11.1f, 37.3f)
                lineTo(168.0f, 265.3f)
                verticalLineToRelative(112.9f)
                curveToRelative(0.0f, 5.8f, -2.0f, 6.7f, 3.2f, 7.3f)
                lineToRelative(43.5f, 4.1f)
                verticalLineToRelative(25.1f)
                lineTo(84.0f, 414.7f)
                lineTo(84.0f, 389.0f)
                lineToRelative(21.3f, -2.0f)
                curveToRelative(5.2f, -0.6f, 6.7f, -2.3f, 6.7f, -7.9f)
                lineTo(112.0f, 267.7f)
                curveToRelative(0.0f, -2.3f, -2.9f, -2.3f, -5.8f, -2.3f)
                lineTo(84.0f, 265.4f)
                lineTo(84.0f, 228.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(-21.0f)
                curveToRelative(0.0f, -49.6f, 26.5f, -70.0f, 77.3f, -70.0f)
                curveToRelative(34.1f, 0.0f, 64.7f, 8.2f, 64.7f, 52.8f)
                lineToRelative(-50.7f, 6.1f)
                curveToRelative(0.3f, -18.7f, -4.4f, -23.0f, -16.3f, -23.0f)
                close()
                moveTo(261.3f, 414.7f)
                verticalLineToRelative(-25.1f)
                lineToRelative(20.4f, -2.6f)
                curveToRelative(5.2f, -0.6f, 7.6f, -1.7f, 7.6f, -7.3f)
                lineTo(289.3f, 271.8f)
                curveToRelative(0.0f, -4.1f, -2.9f, -6.7f, -6.7f, -7.9f)
                lineToRelative(-24.2f, -6.4f)
                lineToRelative(6.7f, -29.5f)
                horizontalLineToRelative(80.2f)
                verticalLineToRelative(151.7f)
                curveToRelative(0.0f, 5.8f, -2.6f, 6.4f, 2.9f, 7.3f)
                lineToRelative(15.7f, 2.6f)
                verticalLineToRelative(25.1f)
                close()
                moveTo(342.1f, 159.2f)
                lineToRelative(9.0f, 33.2f)
                lineToRelative(-7.3f, 7.3f)
                lineToRelative(-31.2f, -16.6f)
                lineToRelative(-31.2f, 16.6f)
                lineToRelative(-7.3f, -7.3f)
                lineToRelative(9.0f, -33.2f)
                lineToRelative(-21.8f, -24.2f)
                lineToRelative(3.5f, -9.6f)
                horizontalLineToRelative(27.7f)
                lineToRelative(15.5f, -28.0f)
                horizontalLineToRelative(9.3f)
                lineToRelative(15.5f, 28.0f)
                horizontalLineToRelative(27.7f)
                lineToRelative(3.5f, 9.6f)
                close()
            }
        }
        .build()
        return _fonticons!!
    }

private var _fonticons: ImageVector? = null
