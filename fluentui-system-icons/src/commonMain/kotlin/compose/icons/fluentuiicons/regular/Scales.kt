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

public val RegularGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.75f)
                curveTo(3.0f, 3.3358f, 3.3358f, 3.0f, 3.75f, 3.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 3.0f, 21.0f, 3.3358f, 21.0f, 3.75f)
                curveTo(21.0f, 4.1642f, 20.6642f, 4.5f, 20.25f, 4.5f)
                horizontalLineTo(19.208f)
                lineTo(21.9446f, 11.217f)
                curveTo(21.9812f, 11.3069f, 22.0f, 11.403f, 22.0f, 11.5f)
                curveTo(22.0f, 13.433f, 20.433f, 15.0f, 18.5f, 15.0f)
                curveTo(16.567f, 15.0f, 15.0f, 13.433f, 15.0f, 11.5f)
                curveTo(15.0f, 11.403f, 15.0188f, 11.3069f, 15.0554f, 11.217f)
                lineTo(17.792f, 4.5f)
                horizontalLineTo(12.75f)
                lineTo(12.75f, 16.5f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 16.5f, 19.0f, 17.5074f, 19.0f, 18.75f)
                curveTo(19.0f, 19.9926f, 17.9926f, 21.0f, 16.75f, 21.0f)
                horizontalLineTo(7.2529f)
                curveTo(6.0103f, 21.0f, 5.0029f, 19.9926f, 5.0029f, 18.75f)
                curveTo(5.0029f, 17.5074f, 6.0103f, 16.5f, 7.2529f, 16.5f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 4.5f)
                horizontalLineTo(6.208f)
                lineTo(8.9446f, 11.217f)
                curveTo(8.9812f, 11.3069f, 9.0f, 11.403f, 9.0f, 11.5f)
                curveTo(9.0f, 13.433f, 7.433f, 15.0f, 5.5f, 15.0f)
                curveTo(3.567f, 15.0f, 2.0f, 13.433f, 2.0f, 11.5f)
                curveTo(2.0f, 11.403f, 2.0188f, 11.3069f, 2.0554f, 11.217f)
                lineTo(4.792f, 4.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 4.5f, 3.0f, 4.1642f, 3.0f, 3.75f)
                close()
                moveTo(6.5029f, 18.75f)
                curveTo(6.5029f, 19.1642f, 6.8387f, 19.5f, 7.2529f, 19.5f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 19.5f, 17.5f, 19.1642f, 17.5f, 18.75f)
                curveTo(17.5f, 18.3358f, 17.1642f, 18.0f, 16.75f, 18.0f)
                horizontalLineTo(7.2529f)
                curveTo(6.8387f, 18.0f, 6.5029f, 18.3358f, 6.5029f, 18.75f)
                close()
                moveTo(7.3546f, 12.25f)
                horizontalLineTo(3.6454f)
                curveTo(3.9421f, 12.983f, 4.6607f, 13.5f, 5.5f, 13.5f)
                curveTo(6.3393f, 13.5f, 7.0579f, 12.983f, 7.3546f, 12.25f)
                close()
                moveTo(7.1346f, 10.75f)
                lineTo(5.5f, 6.7378f)
                lineTo(3.8654f, 10.75f)
                horizontalLineTo(7.1346f)
                close()
                moveTo(18.5f, 13.5f)
                curveTo(19.3393f, 13.5f, 20.0579f, 12.983f, 20.3546f, 12.25f)
                horizontalLineTo(16.6454f)
                curveTo(16.9421f, 12.983f, 17.6607f, 13.5f, 18.5f, 13.5f)
                close()
                moveTo(16.8654f, 10.75f)
                horizontalLineTo(20.1346f)
                lineTo(18.5f, 6.7378f)
                lineTo(16.8654f, 10.75f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null
