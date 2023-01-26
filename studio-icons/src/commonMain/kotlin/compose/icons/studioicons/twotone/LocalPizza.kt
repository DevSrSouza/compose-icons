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

public val TwotoneGroup.LocalPizza: ImageVector
    get() {
        if (_localPizza != null) {
            return _localPizza!!
        }
        _localPizza = Builder(name = "LocalPizza", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.51f, 6.36f)
                lineTo(12.0f, 17.92f)
                lineToRelative(6.49f, -11.55f)
                curveTo(16.68f, 4.85f, 14.38f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-4.68f, 0.85f, -6.49f, 2.36f)
                close()
                moveTo(9.0f, 8.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(8.17f, 5.5f, 9.0f, 5.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.82f, 8.5f, 9.0f, 8.5f)
                close()
                moveTo(13.5f, 13.0f)
                curveToRelative(0.0f, 0.83f, -0.68f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.43f, 2.0f, 5.23f, 3.54f, 3.01f, 6.0f)
                lineTo(12.0f, 22.0f)
                lineToRelative(8.99f, -16.0f)
                curveTo(18.78f, 3.55f, 15.57f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 17.92f)
                lineTo(5.51f, 6.36f)
                curveTo(7.32f, 4.85f, 9.62f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(4.68f, 0.85f, 6.49f, 2.36f)
                lineTo(12.0f, 17.92f)
                close()
                moveTo(9.0f, 5.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveTo(8.17f, 8.5f, 9.0f, 8.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(9.82f, 5.5f, 9.0f, 5.5f)
                close()
                moveTo(10.5f, 13.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.68f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _localPizza!!
    }

private var _localPizza: ImageVector? = null
