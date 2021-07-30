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

public val BrandsGroup.CreativeCommonsBy: ImageVector
    get() {
        if (_creativeCommonsBy != null) {
            return _creativeCommonsBy!!
        }
        _creativeCommonsBy = Builder(name = "CreativeCommonsBy", defaultWidth = 496.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(314.9f, 194.4f)
                verticalLineToRelative(101.4f)
                horizontalLineToRelative(-28.3f)
                verticalLineToRelative(120.5f)
                horizontalLineToRelative(-77.1f)
                lineTo(209.5f, 295.9f)
                horizontalLineToRelative(-28.3f)
                lineTo(181.2f, 194.4f)
                curveToRelative(0.0f, -4.4f, 1.6f, -8.2f, 4.6f, -11.3f)
                curveToRelative(3.1f, -3.1f, 6.9f, -4.7f, 11.3f, -4.7f)
                lineTo(299.0f, 178.4f)
                curveToRelative(4.1f, 0.0f, 7.8f, 1.6f, 11.1f, 4.7f)
                curveToRelative(3.1f, 3.2f, 4.8f, 6.9f, 4.8f, 11.3f)
                close()
                moveTo(213.4f, 130.7f)
                curveToRelative(0.0f, -23.3f, 11.5f, -35.0f, 34.5f, -35.0f)
                reflectiveCurveToRelative(34.5f, 11.7f, 34.5f, 35.0f)
                curveToRelative(0.0f, 23.0f, -11.5f, 34.5f, -34.5f, 34.5f)
                reflectiveCurveToRelative(-34.5f, -11.5f, -34.5f, -34.5f)
                close()
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
            }
        }
        .build()
        return _creativeCommonsBy!!
    }

private var _creativeCommonsBy: ImageVector? = null
