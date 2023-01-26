package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Vignette: ImageVector
    get() {
        if (_vignette != null) {
            return _vignette!!
        }
        _vignette = Builder(name = "Vignette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 2.69f, 8.0f, 6.0f)
                reflectiveCurveToRelative(-3.58f, 6.0f, -8.0f, 6.0f)
                reflectiveCurveToRelative(-8.0f, -2.69f, -8.0f, -6.0f)
                reflectiveCurveToRelative(3.58f, -6.0f, 8.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -2.69f, 8.0f, -6.0f)
                reflectiveCurveToRelative(-3.58f, -6.0f, -8.0f, -6.0f)
                reflectiveCurveToRelative(-8.0f, 2.69f, -8.0f, 6.0f)
                reflectiveCurveToRelative(3.58f, 6.0f, 8.0f, 6.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(3.25f, 0.0f, 6.0f, 1.83f, 6.0f, 4.0f)
                reflectiveCurveToRelative(-2.75f, 4.0f, -6.0f, 4.0f)
                reflectiveCurveToRelative(-6.0f, -1.83f, -6.0f, -4.0f)
                reflectiveCurveToRelative(2.75f, -4.0f, 6.0f, -4.0f)
                close()
            }
        }
        .build()
        return _vignette!!
    }

private var _vignette: ImageVector? = null
