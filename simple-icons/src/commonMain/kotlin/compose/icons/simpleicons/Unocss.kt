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

public val SimpleIcons.Unocss: ImageVector
    get() {
        if (_unocss != null) {
            return _unocss!!
        }
        _unocss = Builder(name = "Unocss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8602f, 18.3991f)
                curveToRelative(0.0f, -3.0761f, 2.4938f, -5.5699f, 5.5699f, -5.5699f)
                reflectiveCurveTo(24.0f, 15.323f, 24.0f, 18.3991f)
                curveToRelative(0.0f, 3.0762f, -2.4938f, 5.5699f, -5.5699f, 5.5699f)
                reflectiveCurveToRelative(-5.5699f, -2.4937f, -5.5699f, -5.5699f)
                close()
                moveTo(12.8602f, 5.6009f)
                curveToRelative(0.0f, -3.0762f, 2.4938f, -5.57f, 5.5699f, -5.57f)
                reflectiveCurveTo(24.0f, 2.5248f, 24.0f, 5.601f)
                verticalLineToRelative(5.0129f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, -0.557f, 0.5569f)
                horizontalLineTo(13.4172f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, -0.557f, -0.5569f)
                verticalLineToRelative(-5.013f)
                close()
                moveTo(11.1398f, 18.3991f)
                curveToRelative(0.0f, 3.0762f, -2.4937f, 5.5699f, -5.5699f, 5.5699f)
                curveTo(2.4937f, 23.969f, 0.0f, 21.4753f, 0.0f, 18.3991f)
                verticalLineToRelative(-5.0129f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.557f, -0.557f)
                horizontalLineToRelative(10.0258f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.557f, 0.557f)
                verticalLineToRelative(5.0129f)
                close()
            }
        }
        .build()
        return _unocss!!
    }

private var _unocss: ImageVector? = null
