package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PanoramaWideAngleSelect: ImageVector
    get() {
        if (_panoramaWideAngleSelect != null) {
            return _panoramaWideAngleSelect!!
        }
        _panoramaWideAngleSelect = Builder(name = "PanoramaWideAngleSelect", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-2.73f, 0.0f, -5.22f, 0.24f, -7.95f, 0.72f)
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
                lineToRelative(-0.25f, -0.89f)
                lineToRelative(-0.93f, -0.16f)
                curveTo(17.22f, 4.24f, 14.73f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _panoramaWideAngleSelect!!
    }

private var _panoramaWideAngleSelect: ImageVector? = null
