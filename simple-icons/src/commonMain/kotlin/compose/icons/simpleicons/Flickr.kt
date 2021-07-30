package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Flickr: ImageVector
    get() {
        if (_flickr != null) {
            return _flickr!!
        }
        _flickr = Builder(name = "Flickr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveToRelative(0.0f, 3.074f, 2.494f, 5.564f, 5.565f, 5.564f)
                curveToRelative(3.075f, 0.0f, 5.569f, -2.49f, 5.569f, -5.564f)
                reflectiveCurveTo(8.641f, 6.436f, 5.565f, 6.436f)
                curveTo(2.495f, 6.436f, 0.0f, 8.926f, 0.0f, 12.0f)
                close()
                moveTo(12.866f, 12.0f)
                curveToRelative(0.0f, 3.074f, 2.493f, 5.564f, 5.567f, 5.564f)
                curveTo(21.496f, 17.564f, 24.0f, 15.074f, 24.0f, 12.0f)
                reflectiveCurveToRelative(-2.492f, -5.564f, -5.564f, -5.564f)
                curveToRelative(-3.075f, 0.0f, -5.57f, 2.49f, -5.57f, 5.564f)
                close()
            }
        }
        .build()
        return _flickr!!
    }

private var _flickr: ImageVector? = null
