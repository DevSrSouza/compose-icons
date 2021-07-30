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

public val BrandsGroup.Rockrms: ImageVector
    get() {
        if (_rockrms != null) {
            return _rockrms!!
        }
        _rockrms = Builder(name = "Rockrms", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(405.4f, 427.5f)
                horizontalLineToRelative(-90.0f)
                lineToRelative(-112.0f, -131.3f)
                curveToRelative(-17.9f, -20.4f, -3.9f, -56.1f, 26.6f, -56.1f)
                horizontalLineToRelative(75.3f)
                lineToRelative(-84.6f, -99.3f)
                lineToRelative(-84.3f, 98.9f)
                horizontalLineToRelative(-90.0f)
                lineTo(193.5f, 67.2f)
                curveToRelative(14.4f, -18.4f, 41.3f, -17.3f, 54.5f, 0.0f)
                lineToRelative(157.7f, 185.1f)
                curveToRelative(19.0f, 22.8f, 2.0f, 57.2f, -27.6f, 56.1f)
                curveToRelative(-0.6f, 0.0f, -74.2f, 0.2f, -74.2f, 0.2f)
                lineToRelative(101.5f, 118.9f)
                close()
            }
        }
        .build()
        return _rockrms!!
    }

private var _rockrms: ImageVector? = null
