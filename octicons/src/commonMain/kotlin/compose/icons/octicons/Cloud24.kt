package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Cloud24: ImageVector
    get() {
        if (_cloud24 != null) {
            return _cloud24!!
        }
        _cloud24 = Builder(name = "Cloud24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.103f, 10.107f)
                curveToRelative(0.0f, -4.244f, 3.445f, -7.607f, 7.733f, -7.607f)
                curveToRelative(3.19f, 0.0f, 5.912f, 1.858f, 7.099f, 4.563f)
                lineToRelative(0.01f, 0.022f)
                lineToRelative(0.001f, 0.006f)
                curveTo(21.348f, 7.345f, 24.0f, 10.095f, 24.0f, 13.536f)
                curveTo(24.0f, 17.148f, 21.076f, 20.0f, 17.431f, 20.0f)
                horizontalLineTo(5.017f)
                curveTo(2.23f, 20.0f, 0.0f, 17.83f, 0.0f, 15.06f)
                arcToRelative(4.899f, 4.899f, 0.0f, false, true, 3.112f, -4.581f)
                arcToRelative(7.696f, 7.696f, 0.0f, false, true, -0.009f, -0.372f)
                close()
                moveTo(10.836f, 4.0f)
                curveToRelative(-3.485f, 0.0f, -6.233f, 2.717f, -6.233f, 6.107f)
                curveToRelative(0.0f, 0.284f, 0.022f, 0.602f, 0.052f, 0.756f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.552f, 0.869f)
                curveToRelative(-1.52f, 0.385f, -2.603f, 1.712f, -2.603f, 3.328f)
                curveToRelative(0.0f, 1.917f, 1.532f, 3.44f, 3.517f, 3.44f)
                horizontalLineToRelative(12.414f)
                curveToRelative(2.843f, 0.0f, 5.069f, -2.206f, 5.069f, -4.964f)
                curveToRelative(0.0f, -2.759f, -2.226f, -4.965f, -5.069f, -4.965f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.696f, -0.47f)
                lineToRelative(-0.179f, -0.446f)
                curveTo(15.606f, 5.5f, 13.424f, 4.0f, 10.836f, 4.0f)
                close()
            }
        }
        .build()
        return _cloud24!!
    }

private var _cloud24: ImageVector? = null
