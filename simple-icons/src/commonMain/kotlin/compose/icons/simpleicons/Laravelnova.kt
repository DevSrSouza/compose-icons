package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Laravelnova: ImageVector
    get() {
        if (_laravelnova != null) {
            return _laravelnova!!
        }
        _laravelnova = Builder(name = "Laravelnova", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.333f, 4.319f)
                curveTo(16.56f, 0.386f, 9.453f, 0.632f, 4.973f, 5.057f)
                arcToRelative(7.571f, 7.571f, 0.0f, false, false, 0.0f, 10.8f)
                curveToRelative(3.018f, 2.982f, 7.912f, 2.982f, 10.931f, 0.0f)
                arcToRelative(3.245f, 3.245f, 0.0f, false, false, 0.0f, -4.628f)
                arcToRelative(3.342f, 3.342f, 0.0f, false, false, -4.685f, 0.0f)
                arcToRelative(1.114f, 1.114f, 0.0f, false, true, -1.561f, 0.0f)
                arcToRelative(1.082f, 1.082f, 0.0f, false, true, 0.0f, -1.543f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, 7.808f, 0.0f)
                arcToRelative(5.408f, 5.408f, 0.0f, false, true, 0.0f, 7.714f)
                curveToRelative(-3.881f, 3.834f, -10.174f, 3.834f, -14.055f, 0.0f)
                arcToRelative(9.734f, 9.734f, 0.0f, false, true, -0.015f, -13.87f)
                curveTo(5.596f, 1.35f, 8.638f, 0.0f, 12.0f, 0.0f)
                curveToRelative(3.75f, 0.0f, 7.105f, 1.68f, 9.333f, 4.319f)
                close()
                moveTo(20.619f, 20.455f)
                arcTo(12.184f, 12.184f, 0.0f, false, true, 12.0f, 24.0f)
                arcToRelative(12.18f, 12.18f, 0.0f, false, true, -9.333f, -4.319f)
                curveToRelative(4.772f, 3.933f, 11.88f, 3.687f, 16.36f, -0.738f)
                arcToRelative(7.571f, 7.571f, 0.0f, false, false, 0.0f, -10.8f)
                curveToRelative(-3.018f, -2.982f, -7.912f, -2.982f, -10.931f, 0.0f)
                arcToRelative(3.245f, 3.245f, 0.0f, false, false, 0.0f, 4.628f)
                arcToRelative(3.342f, 3.342f, 0.0f, false, false, 4.685f, 0.0f)
                arcToRelative(1.114f, 1.114f, 0.0f, false, true, 1.561f, 0.0f)
                arcToRelative(1.082f, 1.082f, 0.0f, false, true, 0.0f, 1.543f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, -7.808f, 0.0f)
                arcToRelative(5.408f, 5.408f, 0.0f, false, true, 0.0f, -7.714f)
                curveToRelative(3.881f, -3.834f, 10.174f, -3.834f, 14.055f, 0.0f)
                arcToRelative(9.734f, 9.734f, 0.0f, false, true, 0.03f, 13.855f)
                close()
            }
        }
        .build()
        return _laravelnova!!
    }

private var _laravelnova: ImageVector? = null
