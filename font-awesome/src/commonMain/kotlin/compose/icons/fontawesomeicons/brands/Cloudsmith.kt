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

public val BrandsGroup.Cloudsmith: ImageVector
    get() {
        if (_cloudsmith != null) {
            return _cloudsmith!!
        }
        _cloudsmith = Builder(name = "Cloudsmith", defaultWidth = 332.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 332.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(332.5f, 419.9f)
                curveToRelative(0.0f, 46.4f, -37.6f, 84.1f, -84.0f, 84.1f)
                reflectiveCurveToRelative(-84.0f, -37.7f, -84.0f, -84.1f)
                reflectiveCurveToRelative(37.6f, -84.0f, 84.0f, -84.0f)
                reflectiveCurveToRelative(84.0f, 37.6f, 84.0f, 84.0f)
                close()
                moveTo(248.5f, 176.0f)
                curveToRelative(46.4f, 0.0f, 80.0f, -37.6f, 80.0f, -84.0f)
                reflectiveCurveToRelative(-33.6f, -84.0f, -80.0f, -84.0f)
                reflectiveCurveToRelative(-88.0f, 37.6f, -88.0f, 84.0f)
                reflectiveCurveToRelative(-29.6f, 76.0f, -76.0f, 76.0f)
                reflectiveCurveToRelative(-84.0f, 41.6f, -84.0f, 88.0f)
                reflectiveCurveToRelative(37.6f, 80.0f, 84.0f, 80.0f)
                reflectiveCurveToRelative(84.0f, -33.6f, 84.0f, -80.0f)
                reflectiveCurveToRelative(33.6f, -80.0f, 80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _cloudsmith!!
    }

private var _cloudsmith: ImageVector? = null
