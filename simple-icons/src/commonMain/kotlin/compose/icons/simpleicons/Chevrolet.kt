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

public val SimpleIcons.Chevrolet: ImageVector
    get() {
        if (_chevrolet != null) {
            return _chevrolet!!
        }
        _chevrolet = Builder(name = "Chevrolet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.905f, 9.784f)
                horizontalLineTo(15.92f)
                verticalLineTo(8.246f)
                arcToRelative(0.157f, 0.157f, 0.0f, false, false, -0.157f, -0.158f)
                horizontalLineTo(8.238f)
                arcToRelative(0.157f, 0.157f, 0.0f, false, false, -0.157f, 0.158f)
                verticalLineToRelative(1.538f)
                horizontalLineTo(2.358f)
                curveToRelative(-0.087f, 0.0f, -0.193f, 0.07f, -0.237f, 0.158f)
                lineTo(0.02f, 14.058f)
                curveToRelative(-0.045f, 0.088f, -0.011f, 0.157f, 0.077f, 0.157f)
                horizontalLineTo(8.08f)
                verticalLineToRelative(1.54f)
                curveToRelative(0.0f, 0.086f, 0.07f, 0.157f, 0.157f, 0.157f)
                horizontalLineToRelative(7.525f)
                curveToRelative(0.087f, 0.0f, 0.157f, -0.07f, 0.157f, -0.157f)
                verticalLineToRelative(-1.54f)
                horizontalLineToRelative(5.723f)
                curveToRelative(0.087f, 0.0f, 0.193f, -0.07f, 0.238f, -0.157f)
                lineToRelative(2.1f, -4.116f)
                curveToRelative(0.045f, -0.087f, 0.011f, -0.158f, -0.076f, -0.158f)
                moveToRelative(-2.494f, 0.996f)
                lineToRelative(-1.244f, 2.437f)
                horizontalLineToRelative(-5.232f)
                verticalLineToRelative(1.708f)
                horizontalLineTo(9.07f)
                verticalLineToRelative(-1.708f)
                horizontalLineTo(2.595f)
                lineTo(3.84f, 10.78f)
                horizontalLineToRelative(5.232f)
                verticalLineTo(9.073f)
                horizontalLineToRelative(5.864f)
                verticalLineToRelative(1.707f)
                close()
            }
        }
        .build()
        return _chevrolet!!
    }

private var _chevrolet: ImageVector? = null
