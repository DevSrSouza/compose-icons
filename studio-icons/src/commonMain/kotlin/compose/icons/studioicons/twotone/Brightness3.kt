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

public val TwotoneGroup.Brightness3: ImageVector
    get() {
        if (_brightness3 != null) {
            return _brightness3!!
        }
        _brightness3 = Builder(name = "Brightness3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.7f, 4.91f)
                curveToRelative(1.46f, 2.0f, 2.3f, 4.46f, 2.3f, 7.09f)
                reflectiveCurveToRelative(-0.84f, 5.09f, -2.3f, 7.09f)
                curveTo(15.25f, 17.76f, 17.0f, 15.08f, 17.0f, 12.0f)
                reflectiveCurveToRelative(-1.75f, -5.76f, -4.3f, -7.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveToRelative(-1.05f, 0.0f, -2.05f, 0.16f, -3.0f, 0.46f)
                curveToRelative(4.06f, 1.27f, 7.0f, 5.06f, 7.0f, 9.54f)
                curveToRelative(0.0f, 4.48f, -2.94f, 8.27f, -7.0f, 9.54f)
                curveToRelative(0.95f, 0.3f, 1.95f, 0.46f, 3.0f, 0.46f)
                curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(14.52f, 2.0f, 9.0f, 2.0f)
                close()
                moveTo(12.7f, 19.09f)
                curveToRelative(1.46f, -2.0f, 2.3f, -4.46f, 2.3f, -7.09f)
                reflectiveCurveToRelative(-0.84f, -5.09f, -2.3f, -7.09f)
                curveTo(15.25f, 6.24f, 17.0f, 8.92f, 17.0f, 12.0f)
                reflectiveCurveToRelative(-1.75f, 5.76f, -4.3f, 7.09f)
                close()
            }
        }
        .build()
        return _brightness3!!
    }

private var _brightness3: ImageVector? = null
