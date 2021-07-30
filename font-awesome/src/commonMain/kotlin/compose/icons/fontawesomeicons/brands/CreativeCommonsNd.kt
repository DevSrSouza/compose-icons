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

public val BrandsGroup.CreativeCommonsNd: ImageVector
    get() {
        if (_creativeCommonsNd != null) {
            return _creativeCommonsNd!!
        }
        _creativeCommonsNd = Builder(name = "CreativeCommonsNd", defaultWidth = 496.0.dp,
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
                moveTo(342.4f, 197.0f)
                verticalLineToRelative(42.5f)
                lineTo(162.1f, 239.5f)
                lineTo(162.1f, 197.0f)
                horizontalLineToRelative(180.3f)
                close()
                moveTo(342.4f, 276.8f)
                verticalLineToRelative(42.5f)
                lineTo(162.1f, 319.3f)
                verticalLineToRelative(-42.5f)
                horizontalLineToRelative(180.3f)
                close()
            }
        }
        .build()
        return _creativeCommonsNd!!
    }

private var _creativeCommonsNd: ImageVector? = null
