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

public val BrandsGroup.Docker: ImageVector
    get() {
        if (_docker != null) {
            return _docker!!
        }
        _docker = Builder(name = "Docker", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.9f, 236.3f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(-59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(59.4f)
                close()
                moveTo(349.9f, 32.0f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(60.7f)
                horizontalLineToRelative(66.1f)
                lineTo(349.9f, 32.0f)
                close()
                moveTo(428.1f, 176.8f)
                lineTo(362.0f, 176.8f)
                verticalLineToRelative(59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-59.4f)
                close()
                moveTo(271.8f, 104.7f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(60.1f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-60.1f)
                close()
                moveTo(349.9f, 104.7f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(60.1f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-60.1f)
                close()
                moveTo(626.7f, 204.7f)
                curveToRelative(-14.4f, -9.7f, -47.6f, -13.2f, -73.1f, -8.4f)
                curveToRelative(-3.3f, -24.0f, -16.7f, -44.9f, -41.1f, -63.7f)
                lineToRelative(-14.0f, -9.3f)
                lineToRelative(-9.3f, 14.0f)
                curveToRelative(-18.4f, 27.8f, -23.4f, 73.6f, -3.7f, 103.8f)
                curveToRelative(-8.7f, 4.7f, -25.8f, 11.1f, -48.4f, 10.7f)
                lineTo(2.4f, 251.8f)
                curveToRelative(-8.7f, 50.8f, 5.8f, 116.8f, 44.0f, 162.1f)
                curveToRelative(37.1f, 43.9f, 92.7f, 66.2f, 165.4f, 66.2f)
                curveToRelative(157.4f, 0.0f, 273.9f, -72.5f, 328.4f, -204.2f)
                curveToRelative(21.4f, 0.4f, 67.6f, 0.1f, 91.3f, -45.2f)
                curveToRelative(1.5f, -2.5f, 6.6f, -13.2f, 8.5f, -17.1f)
                lineToRelative(-13.3f, -8.9f)
                close()
                moveTo(115.6f, 176.8f)
                horizontalLineToRelative(-66.0f)
                verticalLineToRelative(59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-59.4f)
                close()
                moveTo(193.7f, 176.8f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-59.4f)
                close()
                moveTo(271.8f, 176.8f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-59.4f)
                close()
                moveTo(193.7f, 104.7f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(60.1f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-60.1f)
                close()
            }
        }
        .build()
        return _docker!!
    }

private var _docker: ImageVector? = null
