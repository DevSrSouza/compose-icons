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

public val BrandsGroup.Superpowers: ImageVector
    get() {
        if (_superpowers != null) {
            return _superpowers!!
        }
        _superpowers = Builder(name = "Superpowers", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 32.0f)
                curveToRelative(-83.3f, 11.0f, -166.8f, 22.0f, -250.0f, 33.0f)
                curveToRelative(-92.0f, 12.5f, -163.3f, 86.7f, -169.0f, 180.0f)
                curveToRelative(-3.3f, 55.5f, 18.0f, 109.5f, 57.8f, 148.2f)
                lineTo(0.0f, 480.0f)
                curveToRelative(83.3f, -11.0f, 166.5f, -22.0f, 249.8f, -33.0f)
                curveToRelative(91.8f, -12.5f, 163.3f, -86.8f, 168.7f, -179.8f)
                curveToRelative(3.5f, -55.5f, -18.0f, -109.5f, -57.7f, -148.2f)
                lineTo(448.0f, 32.0f)
                close()
                moveTo(368.3f, 264.3f)
                curveToRelative(-4.2f, 79.5f, -74.0f, 139.2f, -152.8f, 134.5f)
                curveToRelative(-79.5f, -4.7f, -140.7f, -71.0f, -136.3f, -151.0f)
                curveToRelative(4.5f, -79.2f, 74.3f, -139.3f, 153.0f, -134.5f)
                curveToRelative(79.3f, 4.7f, 140.5f, 71.0f, 136.1f, 151.0f)
                close()
            }
        }
        .build()
        return _superpowers!!
    }

private var _superpowers: ImageVector? = null
