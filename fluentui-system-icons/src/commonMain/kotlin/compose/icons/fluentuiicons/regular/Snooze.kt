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

public val RegularGroup.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = Builder(name = "Snooze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2441f, 13.0038f)
                curveTo(8.8223f, 13.0038f, 9.1697f, 13.6222f, 8.9057f, 14.1079f)
                lineTo(8.8489f, 14.1973f)
                lineTo(4.2266f, 20.4993f)
                lineTo(8.2441f, 20.4996f)
                curveTo(8.6238f, 20.4996f, 8.9376f, 20.7818f, 8.9873f, 21.1478f)
                lineTo(8.9941f, 21.2496f)
                curveTo(8.9941f, 21.6293f, 8.712f, 21.9431f, 8.3459f, 21.9928f)
                lineTo(8.2441f, 21.9996f)
                horizontalLineTo(2.7474f)
                curveTo(2.1693f, 21.9996f, 1.8219f, 21.3812f, 2.0859f, 20.8954f)
                lineTo(2.1426f, 20.8061f)
                lineTo(6.7636f, 14.5033f)
                lineTo(2.7484f, 14.5038f)
                curveTo(2.3687f, 14.5038f, 2.0549f, 14.2216f, 2.0052f, 13.8555f)
                lineTo(1.9984f, 13.7538f)
                curveTo(1.9984f, 13.3741f, 2.2805f, 13.0603f, 2.6466f, 13.0106f)
                lineTo(2.7484f, 13.0038f)
                horizontalLineTo(8.2441f)
                close()
                moveTo(21.2518f, 2.001f)
                curveTo(21.851f, 2.001f, 22.1946f, 2.66f, 21.8903f, 3.1452f)
                lineTo(21.8298f, 3.2289f)
                lineTo(13.3386f, 13.4973f)
                lineTo(21.2518f, 13.4974f)
                curveTo(21.6314f, 13.4974f, 21.9452f, 13.7795f, 21.9949f, 14.1456f)
                lineTo(22.0018f, 14.2474f)
                curveTo(22.0018f, 14.6271f, 21.7196f, 14.9408f, 21.3535f, 14.9905f)
                lineTo(21.2518f, 14.9974f)
                horizontalLineTo(11.7474f)
                curveTo(11.1482f, 14.9974f, 10.8046f, 14.3383f, 11.1089f, 13.8531f)
                lineTo(11.1694f, 13.7695f)
                lineTo(19.6586f, 3.5003f)
                lineTo(11.7474f, 3.501f)
                curveTo(11.3677f, 3.501f, 11.0539f, 3.2188f, 11.0043f, 2.8528f)
                lineTo(10.9974f, 2.751f)
                curveTo(10.9974f, 2.3713f, 11.2796f, 2.0575f, 11.6457f, 2.0078f)
                lineTo(11.7474f, 2.001f)
                horizontalLineTo(21.2518f)
                close()
            }
        }
        .build()
        return _snooze!!
    }

private var _snooze: ImageVector? = null
