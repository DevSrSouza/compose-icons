package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandRedhat: ImageVector
    get() {
        if (_brandRedhat != null) {
            return _brandRedhat!!
        }
        _brandRedhat = Builder(name = "BrandRedhat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.5f)
                lineToRelative(1.436f, -4.0f)
                curveToRelative(0.318f, -0.876f, 0.728f, -1.302f, 1.359f, -1.302f)
                curveToRelative(0.219f, 0.0f, 1.054f, 0.365f, 1.88f, 0.583f)
                curveToRelative(0.825f, 0.219f, 0.733f, -0.329f, 0.908f, -0.487f)
                curveToRelative(0.176f, -0.158f, 0.355f, -0.294f, 0.61f, -0.294f)
                curveToRelative(0.242f, 0.0f, 0.553f, 0.048f, 1.692f, 0.448f)
                curveToRelative(0.759f, 0.267f, 1.493f, 0.574f, 2.204f, 0.922f)
                curveToRelative(1.175f, 0.582f, 1.426f, 0.913f, 1.595f, 1.507f)
                lineToRelative(0.816f, 4.623f)
                curveToRelative(2.086f, 0.898f, 3.5f, 2.357f, 3.5f, 3.682f)
                curveToRelative(0.0f, 1.685f, -1.2f, 3.818f, -5.957f, 3.818f)
                curveToRelative(-6.206f, 0.0f, -14.043f, -4.042f, -14.043f, -7.32f)
                curveToRelative(0.0f, -1.044f, 1.333f, -1.77f, 4.0f, -2.18f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.5f)
                curveToRelative(0.0f, 0.969f, 4.39f, 3.5f, 9.5f, 3.5f)
                curveToRelative(1.314f, 0.0f, 3.0f, 0.063f, 3.0f, -1.5f)
            }
        }
        .build()
        return _brandRedhat!!
    }

private var _brandRedhat: ImageVector? = null
