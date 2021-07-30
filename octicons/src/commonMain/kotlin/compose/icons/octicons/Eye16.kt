package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(1.679f, 7.932f)
                curveToRelative(0.412f, -0.621f, 1.242f, -1.75f, 2.366f, -2.717f)
                curveTo(5.175f, 4.242f, 6.527f, 3.5f, 8.0f, 3.5f)
                curveToRelative(1.473f, 0.0f, 2.824f, 0.742f, 3.955f, 1.715f)
                curveToRelative(1.124f, 0.967f, 1.954f, 2.096f, 2.366f, 2.717f)
                arcToRelative(0.119f, 0.119f, 0.0f, false, true, 0.0f, 0.136f)
                curveToRelative(-0.412f, 0.621f, -1.242f, 1.75f, -2.366f, 2.717f)
                curveTo(10.825f, 11.758f, 9.473f, 12.5f, 8.0f, 12.5f)
                curveToRelative(-1.473f, 0.0f, -2.824f, -0.742f, -3.955f, -1.715f)
                curveTo(2.92f, 9.818f, 2.09f, 8.69f, 1.679f, 8.068f)
                arcToRelative(0.119f, 0.119f, 0.0f, false, true, 0.0f, -0.136f)
                close()
                moveTo(8.0f, 2.0f)
                curveToRelative(-1.981f, 0.0f, -3.67f, 0.992f, -4.933f, 2.078f)
                curveTo(1.797f, 5.169f, 0.88f, 6.423f, 0.43f, 7.1f)
                arcToRelative(1.619f, 1.619f, 0.0f, false, false, 0.0f, 1.798f)
                curveToRelative(0.45f, 0.678f, 1.367f, 1.932f, 2.637f, 3.024f)
                curveTo(4.329f, 13.008f, 6.019f, 14.0f, 8.0f, 14.0f)
                curveToRelative(1.981f, 0.0f, 3.67f, -0.992f, 4.933f, -2.078f)
                curveToRelative(1.27f, -1.091f, 2.187f, -2.345f, 2.637f, -3.023f)
                arcToRelative(1.619f, 1.619f, 0.0f, false, false, 0.0f, -1.798f)
                curveToRelative(-0.45f, -0.678f, -1.367f, -1.932f, -2.637f, -3.023f)
                curveTo(11.671f, 2.992f, 9.981f, 2.0f, 8.0f, 2.0f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _eye16!!
    }

private var _eye16: ImageVector? = null
