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

public val BrandsGroup.CreativeCommonsZero: ImageVector
    get() {
        if (_creativeCommonsZero != null) {
            return _creativeCommonsZero!!
        }
        _creativeCommonsZero = Builder(name = "CreativeCommonsZero", defaultWidth = 496.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.6f, 8.0f)
                curveTo(389.4f, 8.0f, 496.0f, 118.1f, 496.0f, 256.0f)
                curveToRelative(0.0f, 147.1f, -118.5f, 248.0f, -248.4f, 248.0f)
                curveTo(113.6f, 504.0f, 0.0f, 394.5f, 0.0f, 256.0f)
                curveTo(0.0f, 123.1f, 104.7f, 8.0f, 247.6f, 8.0f)
                close()
                moveTo(248.4f, 52.7f)
                curveTo(130.2f, 52.7f, 44.7f, 150.6f, 44.7f, 256.0f)
                curveToRelative(0.0f, 109.8f, 91.2f, 202.8f, 203.7f, 202.8f)
                curveToRelative(103.2f, 0.0f, 202.8f, -81.1f, 202.8f, -202.8f)
                curveToRelative(0.1f, -113.8f, -90.2f, -203.3f, -202.8f, -203.3f)
                close()
                moveTo(248.0f, 113.2f)
                curveToRelative(-81.9f, 0.0f, -102.5f, 77.3f, -102.5f, 142.8f)
                curveToRelative(0.0f, 65.5f, 20.6f, 142.8f, 102.5f, 142.8f)
                reflectiveCurveTo(350.5f, 321.5f, 350.5f, 256.0f)
                curveToRelative(0.0f, -65.5f, -20.6f, -142.8f, -102.5f, -142.8f)
                close()
                moveTo(248.0f, 167.1f)
                curveToRelative(3.3f, 0.0f, 6.4f, 0.5f, 9.2f, 1.2f)
                curveToRelative(5.9f, 5.1f, 8.8f, 12.1f, 3.1f, 21.9f)
                lineToRelative(-54.5f, 100.2f)
                curveToRelative(-1.7f, -12.7f, -1.9f, -25.1f, -1.9f, -34.4f)
                curveToRelative(0.0f, -28.8f, 2.0f, -88.9f, 44.1f, -88.9f)
                close()
                moveTo(288.8f, 213.3f)
                curveToRelative(2.9f, 15.4f, 3.3f, 31.4f, 3.3f, 42.7f)
                curveToRelative(0.0f, 28.9f, -2.0f, 88.9f, -44.1f, 88.9f)
                curveToRelative(-13.5f, 0.0f, -32.6f, -7.7f, -20.1f, -26.4f)
                lineToRelative(60.9f, -105.2f)
                close()
            }
        }
        .build()
        return _creativeCommonsZero!!
    }

private var _creativeCommonsZero: ImageVector? = null
