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

public val TwotoneGroup.PanoramaWideAngle: ImageVector
    get() {
        if (_panoramaWideAngle != null) {
            return _panoramaWideAngle!!
        }
        _panoramaWideAngle = Builder(name = "PanoramaWideAngle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-2.45f, 0.0f, -4.71f, 0.2f, -7.29f, 0.64f)
                curveTo(4.24f, 8.42f, 4.0f, 10.22f, 4.0f, 12.0f)
                curveToRelative(0.0f, 1.78f, 0.24f, 3.58f, 0.71f, 5.36f)
                curveToRelative(2.58f, 0.44f, 4.84f, 0.64f, 7.29f, 0.64f)
                reflectiveCurveToRelative(4.71f, -0.2f, 7.29f, -0.64f)
                curveToRelative(0.47f, -1.78f, 0.71f, -3.58f, 0.71f, -5.36f)
                curveToRelative(0.0f, -1.78f, -0.24f, -3.58f, -0.71f, -5.36f)
                curveTo(16.71f, 6.2f, 14.45f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.13f, 5.78f)
                lineToRelative(-0.25f, -0.89f)
                lineToRelative(-0.93f, -0.16f)
                curveTo(17.22f, 4.24f, 14.73f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-5.22f, 0.24f, -7.95f, 0.72f)
                lineToRelative(-0.93f, 0.16f)
                lineToRelative(-0.25f, 0.9f)
                curveTo(2.29f, 7.85f, 2.0f, 9.93f, 2.0f, 12.0f)
                reflectiveCurveToRelative(0.29f, 4.15f, 0.87f, 6.22f)
                lineToRelative(0.25f, 0.89f)
                lineToRelative(0.93f, 0.16f)
                curveToRelative(2.73f, 0.49f, 5.22f, 0.73f, 7.95f, 0.73f)
                reflectiveCurveToRelative(5.22f, -0.24f, 7.95f, -0.72f)
                lineToRelative(0.93f, -0.16f)
                lineToRelative(0.25f, -0.89f)
                curveToRelative(0.58f, -2.08f, 0.87f, -4.16f, 0.87f, -6.23f)
                reflectiveCurveToRelative(-0.29f, -4.15f, -0.87f, -6.22f)
                close()
                moveTo(19.29f, 17.36f)
                curveToRelative(-2.58f, 0.44f, -4.84f, 0.64f, -7.29f, 0.64f)
                reflectiveCurveToRelative(-4.71f, -0.2f, -7.29f, -0.64f)
                curveTo(4.24f, 15.58f, 4.0f, 13.78f, 4.0f, 12.0f)
                curveToRelative(0.0f, -1.78f, 0.24f, -3.58f, 0.71f, -5.36f)
                curveTo(7.29f, 6.2f, 9.55f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(4.71f, 0.2f, 7.29f, 0.64f)
                curveToRelative(0.47f, 1.78f, 0.71f, 3.58f, 0.71f, 5.36f)
                curveToRelative(0.0f, 1.78f, -0.24f, 3.58f, -0.71f, 5.36f)
                close()
            }
        }
        .build()
        return _panoramaWideAngle!!
    }

private var _panoramaWideAngle: ImageVector? = null
