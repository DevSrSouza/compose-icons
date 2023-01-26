package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Nightlight: ImageVector
    get() {
        if (_nightlight != null) {
            return _nightlight!!
        }
        _nightlight = Builder(name = "Nightlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                curveToRelative(1.82f, 0.0f, 3.53f, 0.5f, 5.0f, 1.35f)
                curveTo(16.01f, 5.08f, 14.0f, 8.3f, 14.0f, 12.0f)
                reflectiveCurveToRelative(2.01f, 6.92f, 5.0f, 8.65f)
                curveTo(17.53f, 21.5f, 15.82f, 22.0f, 14.0f, 22.0f)
                curveTo(8.48f, 22.0f, 4.0f, 17.52f, 4.0f, 12.0f)
                reflectiveCurveTo(8.48f, 2.0f, 14.0f, 2.0f)
                close()
            }
        }
        .build()
        return _nightlight!!
    }

private var _nightlight: ImageVector? = null
