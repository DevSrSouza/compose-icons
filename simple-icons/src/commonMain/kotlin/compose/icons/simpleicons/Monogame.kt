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

public val SimpleIcons.Monogame: ImageVector
    get() {
        if (_monogame != null) {
            return _monogame!!
        }
        _monogame = Builder(name = "Monogame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.356f)
                verticalLineTo(7.083f)
                arcToRelative(7.083f, 7.083f, 0.0f, false, false, -12.0f, -5.098f)
                arcTo(7.083f, 7.083f, 0.0f, false, false, 0.0f, 7.083f)
                verticalLineToRelative(9.834f)
                arcTo(7.083f, 7.083f, 0.0f, false, false, 7.083f, 24.0f)
                horizontalLineToRelative(9.834f)
                arcToRelative(7.083f, 7.083f, 0.0f, false, false, 7.07f, -7.51f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-4.332f)
                horizontalLineTo(9.834f)
                verticalLineToRelative(4.332f)
                horizontalLineToRelative(9.834f)
                verticalLineToRelative(0.427f)
                arcToRelative(2.751f, 2.751f, 0.0f, false, true, -2.751f, 2.751f)
                horizontalLineTo(7.083f)
                arcToRelative(2.751f, 2.751f, 0.0f, false, true, -2.751f, -2.751f)
                verticalLineTo(7.083f)
                arcToRelative(2.751f, 2.751f, 0.0f, true, true, 5.502f, 0.0f)
                verticalLineToRelative(3.273f)
                horizontalLineToRelative(4.332f)
                verticalLineTo(7.083f)
                arcToRelative(2.751f, 2.751f, 0.0f, true, true, 5.502f, 0.0f)
                verticalLineToRelative(3.273f)
                close()
            }
        }
        .build()
        return _monogame!!
    }

private var _monogame: ImageVector? = null
