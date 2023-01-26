package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.PanoramaWideAngleSelect: ImageVector
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
                curveTo(8.03f, 4.0f, 5.15f, 4.63f, 3.0f, 5.0f)
                curveToRelative(-0.55f, 1.97f, -1.0f, 3.92f, -1.0f, 7.0f)
                curveToRelative(0.0f, 3.03f, 0.45f, 5.05f, 1.0f, 7.0f)
                curveToRelative(2.15f, 0.37f, 4.98f, 1.0f, 9.0f, 1.0f)
                curveToRelative(3.97f, 0.0f, 6.85f, -0.63f, 9.0f, -1.0f)
                curveToRelative(0.57f, -2.02f, 1.0f, -3.99f, 1.0f, -7.0f)
                curveToRelative(0.0f, -3.03f, -0.45f, -5.05f, -1.0f, -7.0f)
                curveTo(18.85f, 4.63f, 16.02f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _panoramaWideAngleSelect!!
    }

private var _panoramaWideAngleSelect: ImageVector? = null
