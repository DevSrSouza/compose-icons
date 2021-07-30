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

public val BrandsGroup.Audible: ImageVector
    get() {
        if (_audible != null) {
            return _audible!!
        }
        _audible = Builder(name = "Audible", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 199.9f)
                verticalLineToRelative(54.0f)
                lineToRelative(-320.0f, 200.0f)
                lineTo(0.0f, 254.0f)
                verticalLineToRelative(-54.0f)
                lineToRelative(320.0f, 200.0f)
                lineToRelative(320.0f, -200.1f)
                close()
                moveTo(445.5f, 271.9f)
                lineToRelative(47.1f, -29.4f)
                curveToRelative(-37.2f, -55.8f, -100.7f, -92.6f, -172.7f, -92.6f)
                curveToRelative(-72.0f, 0.0f, -135.5f, 36.7f, -172.6f, 92.4f)
                horizontalLineToRelative(0.3f)
                curveToRelative(2.5f, -2.3f, 5.1f, -4.5f, 7.7f, -6.7f)
                curveToRelative(89.7f, -74.4f, 219.4f, -58.1f, 290.2f, 36.3f)
                close()
                moveTo(225.4f, 290.7f)
                curveToRelative(16.9f, -11.9f, 36.5f, -18.7f, 57.4f, -18.7f)
                curveToRelative(34.4f, 0.0f, 65.2f, 18.4f, 86.4f, 47.6f)
                lineToRelative(45.4f, -28.4f)
                curveToRelative(-20.9f, -29.9f, -55.6f, -49.5f, -94.8f, -49.5f)
                curveToRelative(-38.9f, 0.0f, -73.4f, 19.4f, -94.4f, 49.0f)
                close()
                moveTo(103.6f, 161.1f)
                curveToRelative(131.8f, -104.3f, 318.2f, -76.4f, 417.5f, 62.1f)
                lineToRelative(0.7f, 1.0f)
                lineToRelative(48.8f, -30.4f)
                curveTo(517.1f, 112.1f, 424.8f, 58.1f, 319.9f, 58.1f)
                curveToRelative(-103.5f, 0.0f, -196.6f, 53.5f, -250.5f, 135.6f)
                curveToRelative(9.9f, -10.5f, 22.7f, -23.5f, 34.2f, -32.6f)
                close()
                moveTo(570.6f, 193.8f)
                close()
            }
        }
        .build()
        return _audible!!
    }

private var _audible: ImageVector? = null
