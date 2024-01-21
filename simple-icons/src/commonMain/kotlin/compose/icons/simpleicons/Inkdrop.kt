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

public val SimpleIcons.Inkdrop: ImageVector
    get() {
        if (_inkdrop != null) {
            return _inkdrop!!
        }
        _inkdrop = Builder(name = "Inkdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8538f, 1.8124f)
                curveTo(9.423f, 0.8338f, 10.471f, 0.1434f, 11.607f, 0.0204f)
                curveToRelative(0.9389f, -0.1016f, 1.9145f, 0.1801f, 2.6558f, 0.7704f)
                arcToRelative(3.665f, 3.665f, 0.0f, false, true, 0.873f, 1.0085f)
                curveToRelative(2.1647f, 3.7212f, 4.314f, 7.4514f, 6.471f, 11.1772f)
                curveToRelative(0.3424f, 0.5943f, 0.5005f, 1.282f, 0.4751f, 1.9621f)
                curveToRelative(-0.0216f, 0.5791f, -0.1762f, 1.1527f, -0.4632f, 1.6586f)
                curveToRelative(-1.067f, 1.8622f, -2.1418f, 3.72f, -3.2127f, 5.58f)
                curveToRelative(-0.6375f, 1.1018f, -1.868f, 1.8129f, -3.134f, 1.8209f)
                curveToRelative(-2.1693f, 0.0043f, -4.3387f, 0.0f, -6.508f, 0.0f)
                curveToRelative(-1.2684f, -0.0027f, -2.4975f, -0.711f, -3.1373f, -1.8003f)
                curveToRelative(-1.0817f, -1.8593f, -2.1556f, -3.7232f, -3.2335f, -5.585f)
                curveToRelative(-0.6362f, -1.1042f, -0.6358f, -2.5271f, -0.0076f, -3.6282f)
                curveToRelative(2.1483f, -3.7285f, 4.312f, -7.4481f, 6.468f, -11.1721f)
                close()
                moveTo(4.625f, 14.1495f)
                arcToRelative(1.1916f, 1.1916f, 0.0f, false, false, 0.0f, 1.183f)
                curveToRelative(1.074f, 1.864f, 2.085f, 3.6278f, 3.1744f, 5.4828f)
                arcToRelative(1.1875f, 1.1875f, 0.0f, false, false, 1.019f, 0.5845f)
                curveToRelative(2.1693f, 0.0046f, 4.2194f, 0.0135f, 6.3887f, 0.0f)
                arcToRelative(1.1873f, 1.1873f, 0.0f, false, false, 1.0179f, -0.5912f)
                curveToRelative(1.0746f, -1.858f, 2.0949f, -3.6112f, 3.154f, -5.4781f)
                arcToRelative(1.1876f, 1.1876f, 0.0f, false, false, -0.004f, -1.176f)
                curveToRelative(-2.1496f, -3.73f, -4.1723f, -7.26f, -6.3524f, -10.9724f)
                curveToRelative(-0.2298f, -0.3875f, -0.666f, -0.6167f, -1.1181f, -0.5809f)
                arcToRelative(1.1856f, 1.1856f, 0.0f, false, false, -0.9324f, 0.5853f)
                arcToRelative(2974.983f, 2974.983f, 0.0f, false, false, -6.347f, 10.963f)
                close()
                moveTo(13.0909f, 18.2132f)
                arcToRelative(1.2598f, 1.2598f, 0.0f, false, true, -2.182f, 0.0f)
                lineTo(8.745f, 14.465f)
                arcToRelative(1.2597f, 1.2597f, 0.0f, false, true, 1.091f, -1.8896f)
                horizontalLineToRelative(4.328f)
                arcToRelative(1.2597f, 1.2597f, 0.0f, false, true, 1.091f, 1.8896f)
                lineToRelative(-2.164f, 3.7481f)
                close()
            }
        }
        .build()
        return _inkdrop!!
    }

private var _inkdrop: ImageVector? = null
