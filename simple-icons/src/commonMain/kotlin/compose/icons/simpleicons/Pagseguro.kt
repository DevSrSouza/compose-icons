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

public val SimpleIcons.Pagseguro: ImageVector
    get() {
        if (_pagseguro != null) {
            return _pagseguro!!
        }
        _pagseguro = Builder(name = "Pagseguro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.482f, 9.712f)
                curveToRelative(1.64f, 0.0f, 3.108f, 0.69f, 4.1f, 1.813f)
                curveToRelative(0.044f, -0.388f, 0.087f, -0.777f, 0.087f, -1.208f)
                curveTo(21.67f, 5.007f, 17.353f, 0.69f, 12.0f, 0.69f)
                curveToRelative(-5.353f, 0.0f, -9.67f, 4.316f, -9.67f, 9.626f)
                curveToRelative(0.0f, 0.345f, 0.0f, 0.69f, 0.044f, 1.036f)
                arcToRelative(8.688f, 8.688f, 0.0f, false, true, 7.943f, -5.137f)
                curveToRelative(2.848f, 0.0f, 5.352f, 1.381f, 6.95f, 3.496f)
                horizontalLineToRelative(0.215f)
                close()
                moveTo(10.36f, 6.992f)
                curveToRelative(-4.36f, 0.0f, -7.9f, 3.54f, -7.9f, 7.9f)
                reflectiveCurveToRelative(3.54f, 7.9f, 7.9f, 7.9f)
                curveToRelative(2.158f, 0.0f, 4.1f, -0.864f, 5.525f, -2.245f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, true, -3.928f, -5.31f)
                curveToRelative(0.0f, -2.676f, 1.9f, -4.92f, 4.446f, -5.438f)
                curveToRelative(-1.468f, -1.684f, -3.626f, -2.806f, -6.043f, -2.806f)
                close()
                moveTo(4.79f, 21.583f)
                arcTo(11.958f, 11.958f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.0f, 5.353f, 5.396f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.396f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.396f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-1.554f, 0.0f, -3.022f, -0.302f, -4.36f, -0.82f)
                curveToRelative(-1.079f, -0.389f, -2.028f, -0.907f, -2.849f, -1.597f)
                close()
                moveTo(17.567f, 20.073f)
                arcToRelative(4.827f, 4.827f, 0.0f, false, false, 4.835f, -4.835f)
                arcToRelative(4.827f, 4.827f, 0.0f, false, false, -4.835f, -4.834f)
                arcToRelative(4.827f, 4.827f, 0.0f, false, false, -4.834f, 4.834f)
                arcToRelative(4.827f, 4.827f, 0.0f, false, false, 4.834f, 4.835f)
                close()
            }
        }
        .build()
        return _pagseguro!!
    }

private var _pagseguro: ImageVector? = null
