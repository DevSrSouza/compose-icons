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

public val BrandsGroup.Gratipay: ImageVector
    get() {
        if (_gratipay != null) {
            return _gratipay!!
        }
        _gratipay = Builder(name = "Gratipay", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.1f, 8.0f, 0.0f, 119.1f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.1f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.1f, 248.0f, -248.0f)
                reflectiveCurveTo(384.9f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(362.6f, 234.4f)
                lineToRelative(-113.0f, 152.7f)
                lineToRelative(-112.7f, -152.7f)
                curveToRelative(-8.7f, -11.9f, -19.1f, -50.4f, 13.6f, -72.0f)
                curveToRelative(28.1f, -18.1f, 54.6f, -4.2f, 68.5f, 11.9f)
                curveToRelative(15.9f, 17.9f, 46.6f, 16.9f, 61.7f, 0.0f)
                curveToRelative(13.9f, -16.1f, 40.4f, -30.0f, 68.1f, -11.9f)
                curveToRelative(32.9f, 21.6f, 22.6f, 60.0f, 13.8f, 72.0f)
                close()
            }
        }
        .build()
        return _gratipay!!
    }

private var _gratipay: ImageVector? = null
