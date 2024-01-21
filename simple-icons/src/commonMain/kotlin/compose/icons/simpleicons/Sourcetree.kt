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

public val SimpleIcons.Sourcetree: ImageVector
    get() {
        if (_sourcetree != null) {
            return _sourcetree!!
        }
        _sourcetree = Builder(name = "Sourcetree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                curveTo(6.756f, 0.0f, 2.474f, 4.245f, 2.474f, 9.525f)
                curveToRelative(0.0f, 4.21f, 2.769f, 7.792f, 6.572f, 9.047f)
                verticalLineToRelative(4.764f)
                curveToRelative(0.0f, 0.37f, 0.295f, 0.664f, 0.664f, 0.664f)
                horizontalLineToRelative(4.506f)
                arcToRelative(0.661f, 0.661f, 0.0f, false, false, 0.664f, -0.664f)
                verticalLineToRelative(-4.764f)
                curveToRelative(0.025f, -0.008f, 0.049f, -0.019f, 0.074f, -0.027f)
                verticalLineToRelative(0.064f)
                curveToRelative(3.694f, -1.22f, 6.412f, -4.634f, 6.565f, -8.687f)
                curveToRelative(0.005f, -0.124f, 0.007f, -0.25f, 0.007f, -0.375f)
                verticalLineToRelative(-0.022f)
                curveToRelative(0.0f, -0.152f, -0.006f, -0.304f, -0.013f, -0.455f)
                curveTo(21.275f, 4.037f, 17.125f, 0.0f, 11.999f, 0.0f)
                close()
                moveTo(11.999f, 6.352f)
                arcToRelative(3.214f, 3.214f, 0.0f, false, true, 2.664f, 5.005f)
                verticalLineToRelative(0.002f)
                arcTo(3.218f, 3.218f, 0.0f, false, true, 12.0f, 12.775f)
                arcToRelative(3.212f, 3.212f, 0.0f, false, true, 0.0f, -6.424f)
                close()
            }
        }
        .build()
        return _sourcetree!!
    }

private var _sourcetree: ImageVector? = null
