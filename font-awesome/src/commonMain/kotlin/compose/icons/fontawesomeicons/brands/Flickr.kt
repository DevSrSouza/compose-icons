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

public val BrandsGroup.Flickr: ImageVector
    get() {
        if (_flickr != null) {
            return _flickr!!
        }
        _flickr = Builder(name = "Flickr", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(144.5f, 319.0f)
                curveToRelative(-35.1f, 0.0f, -63.5f, -28.4f, -63.5f, -63.5f)
                reflectiveCurveToRelative(28.4f, -63.5f, 63.5f, -63.5f)
                reflectiveCurveToRelative(63.5f, 28.4f, 63.5f, 63.5f)
                reflectiveCurveToRelative(-28.4f, 63.5f, -63.5f, 63.5f)
                close()
                moveTo(303.5f, 319.0f)
                curveToRelative(-35.1f, 0.0f, -63.5f, -28.4f, -63.5f, -63.5f)
                reflectiveCurveToRelative(28.4f, -63.5f, 63.5f, -63.5f)
                reflectiveCurveToRelative(63.5f, 28.4f, 63.5f, 63.5f)
                reflectiveCurveToRelative(-28.4f, 63.5f, -63.5f, 63.5f)
                close()
            }
        }
        .build()
        return _flickr!!
    }

private var _flickr: ImageVector? = null
