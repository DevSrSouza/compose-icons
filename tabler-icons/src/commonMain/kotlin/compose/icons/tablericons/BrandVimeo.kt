package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandVimeo: ImageVector
    get() {
        if (_brandVimeo != null) {
            return _brandVimeo!!
        }
        _brandVimeo = Builder(name = "BrandVimeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.5f)
                lineToRelative(1.0f, 1.0f)
                reflectiveCurveToRelative(1.5f, -1.102f, 2.0f, -0.5f)
                curveToRelative(0.509f, 0.609f, 1.863f, 7.65f, 2.5f, 9.0f)
                curveToRelative(0.556f, 1.184f, 1.978f, 2.89f, 4.0f, 1.5f)
                curveToRelative(2.0f, -1.5f, 7.5f, -5.5f, 8.5f, -11.5f)
                curveToRelative(0.444f, -2.661f, -1.0f, -4.0f, -2.5f, -4.0f)
                curveToRelative(-2.0f, 0.0f, -4.047f, 1.202f, -4.5f, 4.0f)
                curveToRelative(2.05f, -1.254f, 2.551f, 1.0f, 1.5f, 3.0f)
                curveToRelative(-1.052f, 2.0f, -2.0f, 3.0f, -2.5f, 3.0f)
                curveToRelative(-0.49f, 0.0f, -0.924f, -1.165f, -1.5f, -3.5f)
                curveToRelative(-0.59f, -2.42f, -0.5f, -6.5f, -3.0f, -6.5f)
                reflectiveCurveToRelative(-5.5f, 4.5f, -5.5f, 4.5f)
                close()
            }
        }
        .build()
        return _brandVimeo!!
    }

private var _brandVimeo: ImageVector? = null
