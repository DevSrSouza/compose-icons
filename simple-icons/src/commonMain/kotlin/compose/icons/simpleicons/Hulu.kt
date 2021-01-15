package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hulu: ImageVector
    get() {
        if (_hulu != null) {
            return _hulu!!
        }
        _hulu = Builder(name = "Hulu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.394f, 7.367f)
                horizontalLineToRelative(-3.598f)
                arcToRelative(5.895f, 5.895f, 0.0f, false, false, -2.058f, 0.404f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.963f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(5.785f)
                verticalLineToRelative(-9.486f)
                arcToRelative(1.606f, 1.606f, 0.0f, false, true, 1.556f, -1.696f)
                horizontalLineToRelative(3.382f)
                arcToRelative(1.586f, 1.586f, 0.0f, false, true, 1.586f, 1.556f)
                verticalLineToRelative(9.566f)
                horizontalLineToRelative(5.765f)
                verticalLineTo(13.536f)
                curveToRelative(0.0f, -4.399f, -2.244f, -6.147f, -5.885f, -6.147f)
            }
        }
        .build()
        return _hulu!!
    }

private var _hulu: ImageVector? = null
