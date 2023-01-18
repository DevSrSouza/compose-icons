package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ViewDesktopMobile: ImageVector
    get() {
        if (_viewDesktopMobile != null) {
            return _viewDesktopMobile!!
        }
        _viewDesktopMobile = Builder(name = "ViewDesktopMobile", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.9926f, 16.9926f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 3.5f, 7.5f, 3.8358f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.1642f, 7.8358f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 20.5f, 16.5f, 20.1642f, 16.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.8358f, 16.1642f, 3.5f, 15.75f, 3.5f)
                close()
                moveTo(13.2489f, 17.5f)
                curveTo(13.6631f, 17.4994f, 13.9994f, 17.8347f, 14.0f, 18.2489f)
                curveTo(14.0006f, 18.6631f, 13.6653f, 18.9994f, 13.2511f, 19.0f)
                lineTo(10.7511f, 19.0038f)
                curveTo(10.3369f, 19.0044f, 10.0006f, 18.6691f, 10.0f, 18.2549f)
                curveTo(9.9994f, 17.8407f, 10.3347f, 17.5044f, 10.7489f, 17.5038f)
                lineTo(13.2489f, 17.5f)
                close()
                moveTo(14.5f, 8.9986f)
                curveTo(14.7455f, 8.9986f, 14.9496f, 9.1755f, 14.9919f, 9.4087f)
                lineTo(15.0f, 9.4986f)
                verticalLineTo(15.5013f)
                curveTo(15.0f, 15.7467f, 14.8231f, 15.9509f, 14.5899f, 15.9932f)
                lineTo(14.5f, 16.0013f)
                horizontalLineTo(9.5f)
                curveTo(9.2545f, 16.0013f, 9.0504f, 15.8244f, 9.0081f, 15.5912f)
                lineTo(9.0f, 15.5013f)
                verticalLineTo(9.4986f)
                curveTo(9.0f, 9.2532f, 9.1769f, 9.049f, 9.4101f, 9.0067f)
                lineTo(9.5f, 8.9986f)
                horizontalLineTo(14.5f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(14.7455f, 5.0f, 14.9496f, 5.1769f, 14.9919f, 5.4101f)
                lineTo(15.0f, 5.5f)
                verticalLineTo(7.5046f)
                curveTo(15.0f, 7.7501f, 14.8231f, 7.9542f, 14.5899f, 7.9965f)
                lineTo(14.5f, 8.0046f)
                horizontalLineTo(9.5f)
                curveTo(9.2545f, 8.0046f, 9.0504f, 7.8277f, 9.0081f, 7.5945f)
                lineTo(9.0f, 7.5046f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 5.2545f, 9.1769f, 5.0504f, 9.4101f, 5.0081f)
                lineTo(9.5f, 5.0f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _viewDesktopMobile!!
    }

private var _viewDesktopMobile: ImageVector? = null
