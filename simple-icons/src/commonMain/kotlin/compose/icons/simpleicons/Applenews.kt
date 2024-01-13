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

public val SimpleIcons.Applenews: ImageVector
    get() {
        if (_applenews != null) {
            return _applenews!!
        }
        _applenews = Builder(name = "Applenews", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.9401f)
                curveToRelative(2.726f, 4.6726f, 6.3944f, 8.385f, 11.039f, 11.0582f)
                horizontalLineTo(1.4164f)
                curveTo(0.634f, 23.9983f, 0.0f, 23.3639f, 0.0f, 22.5819f)
                verticalLineToRelative(-9.6418f)
                close()
                moveTo(0.0f, 1.4138f)
                curveTo(0.0f, 0.6337f, 0.632f, 0.0018f, 1.4116f, 0.0018f)
                horizontalLineToRelative(4.8082f)
                lineTo(24.0f, 17.7583f)
                verticalLineToRelative(4.773f)
                curveToRelative(0.0f, 0.3891f, -0.1544f, 0.762f, -0.4295f, 1.0373f)
                arcToRelative(1.4674f, 1.4674f, 0.0f, false, true, -1.037f, 0.4296f)
                horizontalLineToRelative(-4.774f)
                lineTo(0.0f, 6.2416f)
                moveTo(12.9634f, 0.0017f)
                horizontalLineToRelative(9.6182f)
                arcTo(1.4187f, 1.4187f, 0.0f, false, true, 24.0f, 1.4205f)
                verticalLineToRelative(9.6256f)
                curveTo(21.2648f, 6.4935f, 17.6157f, 2.7745f, 12.9634f, 0.0017f)
                close()
            }
        }
        .build()
        return _applenews!!
    }

private var _applenews: ImageVector? = null
