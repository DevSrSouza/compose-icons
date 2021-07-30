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

public val BrandsGroup.Mendeley: ImageVector
    get() {
        if (_mendeley != null) {
            return _mendeley!!
        }
        _mendeley = Builder(name = "Mendeley", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.6f, 325.2f)
                curveToRelative(-12.3f, -12.4f, -29.7f, -19.2f, -48.4f, -17.2f)
                curveToRelative(-43.3f, -1.0f, -49.7f, -34.9f, -37.5f, -98.8f)
                curveToRelative(22.8f, -57.5f, -14.9f, -131.5f, -87.4f, -130.8f)
                curveToRelative(-77.4f, 0.7f, -81.7f, 82.0f, -130.9f, 82.0f)
                curveToRelative(-48.1f, 0.0f, -54.0f, -81.3f, -130.9f, -82.0f)
                curveToRelative(-72.9f, -0.8f, -110.1f, 73.3f, -87.4f, 130.8f)
                curveToRelative(12.2f, 63.9f, 5.8f, 97.8f, -37.5f, 98.8f)
                curveToRelative(-21.2f, -2.3f, -37.0f, 6.5f, -53.0f, 22.5f)
                curveToRelative(-19.9f, 19.7f, -19.3f, 94.8f, 42.6f, 102.6f)
                curveToRelative(47.1f, 5.9f, 81.6f, -42.9f, 61.2f, -87.8f)
                curveToRelative(-47.3f, -103.7f, 185.9f, -106.1f, 146.5f, -8.2f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.2f, -0.3f, 0.4f)
                curveToRelative(-26.8f, 42.8f, 6.8f, 97.4f, 58.8f, 95.2f)
                curveToRelative(52.1f, 2.1f, 85.4f, -52.6f, 58.8f, -95.2f)
                curveToRelative(-0.1f, -0.2f, -0.2f, -0.3f, -0.3f, -0.4f)
                curveToRelative(-39.4f, -97.9f, 193.8f, -95.5f, 146.5f, 8.2f)
                curveToRelative(-4.6f, 10.0f, -6.7f, 21.3f, -5.7f, 33.0f)
                curveToRelative(4.9f, 53.4f, 68.7f, 74.1f, 104.9f, 35.2f)
                curveToRelative(17.8f, -14.8f, 23.1f, -65.6f, 0.0f, -88.3f)
                close()
                moveTo(320.7f, 306.1f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-43.4f, 0.0f, -62.8f, -37.5f, -62.8f, -62.8f)
                curveToRelative(0.0f, -34.7f, 28.2f, -62.8f, 62.8f, -62.8f)
                horizontalLineToRelative(0.6f)
                curveToRelative(34.7f, 0.0f, 62.8f, 28.1f, 62.8f, 62.8f)
                curveToRelative(0.0f, 25.0f, -19.2f, 62.8f, -62.8f, 62.8f)
                close()
            }
        }
        .build()
        return _mendeley!!
    }

private var _mendeley: ImageVector? = null
