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

public val Octicons.Eye16: ImageVector
    get() {
        if (_eye16 != null) {
            return _eye16!!
        }
        _eye16 = Builder(name = "Eye16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                curveToRelative(1.981f, 0.0f, 3.671f, 0.992f, 4.933f, 2.078f)
                curveToRelative(1.27f, 1.091f, 2.187f, 2.345f, 2.637f, 3.023f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, true, 0.0f, 1.798f)
                curveToRelative(-0.45f, 0.678f, -1.367f, 1.932f, -2.637f, 3.023f)
                curveTo(11.67f, 13.008f, 9.981f, 14.0f, 8.0f, 14.0f)
                curveToRelative(-1.981f, 0.0f, -3.671f, -0.992f, -4.933f, -2.078f)
                curveTo(1.797f, 10.83f, 0.88f, 9.576f, 0.43f, 8.898f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, true, 0.0f, -1.798f)
                curveToRelative(0.45f, -0.677f, 1.367f, -1.931f, 2.637f, -3.022f)
                curveTo(4.33f, 2.992f, 6.019f, 2.0f, 8.0f, 2.0f)
                close()
                moveTo(1.679f, 7.932f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, false, 0.0f, 0.136f)
                curveToRelative(0.411f, 0.622f, 1.241f, 1.75f, 2.366f, 2.717f)
                curveTo(5.176f, 11.758f, 6.527f, 12.5f, 8.0f, 12.5f)
                curveToRelative(1.473f, 0.0f, 2.825f, -0.742f, 3.955f, -1.715f)
                curveToRelative(1.124f, -0.967f, 1.954f, -2.096f, 2.366f, -2.717f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, false, 0.0f, -0.136f)
                curveToRelative(-0.412f, -0.621f, -1.242f, -1.75f, -2.366f, -2.717f)
                curveTo(10.824f, 4.242f, 9.473f, 3.5f, 8.0f, 3.5f)
                curveToRelative(-1.473f, 0.0f, -2.825f, 0.742f, -3.955f, 1.715f)
                curveToRelative(-1.124f, 0.967f, -1.954f, 2.096f, -2.366f, 2.717f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.001f, -3.999f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 10.0f)
                close()
            }
        }
        .build()
        return _eye16!!
    }

private var _eye16: ImageVector? = null
