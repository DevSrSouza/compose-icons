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

public val TablerIcons.BrandWebflow: ImageVector
    get() {
        if (_brandWebflow != null) {
            return _brandWebflow!!
        }
        _brandWebflow = Builder(name = "BrandWebflow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                reflectiveCurveToRelative(-1.376f, 3.606f, -1.5f, 4.0f)
                curveToRelative(-0.046f, -0.4f, -1.5f, -8.0f, -1.5f, -8.0f)
                curveToRelative(-2.627f, 0.0f, -3.766f, 1.562f, -4.5f, 3.5f)
                curveToRelative(0.0f, 0.0f, -1.843f, 4.593f, -2.0f, 5.0f)
                curveToRelative(-0.013f, -0.368f, -0.5f, -4.5f, -0.5f, -4.5f)
                curveToRelative(-0.15f, -2.371f, -2.211f, -3.98f, -4.0f, -3.98f)
                lineToRelative(2.0f, 12.98f)
                curveToRelative(2.745f, -0.013f, 4.72f, -1.562f, 5.5f, -3.5f)
                curveToRelative(0.0f, 0.0f, 1.44f, -4.3f, 1.5f, -4.5f)
                curveToRelative(0.013f, 0.18f, 1.0f, 8.0f, 1.0f, 8.0f)
                curveToRelative(2.758f, 0.0f, 4.694f, -1.626f, 5.5f, -3.5f)
                lineToRelative(3.5f, -9.5f)
                curveToRelative(-2.732f, 0.0f, -4.253f, 2.055f, -5.0f, 4.0f)
                close()
            }
        }
        .build()
        return _brandWebflow!!
    }

private var _brandWebflow: ImageVector? = null
