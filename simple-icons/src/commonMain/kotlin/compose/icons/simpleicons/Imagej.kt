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

public val SimpleIcons.Imagej: ImageVector
    get() {
        if (_imagej != null) {
            return _imagej!!
        }
        _imagej = Builder(name = "Imagej", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1286f, 17.5084f)
                horizontalLineToRelative(-8.072f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, -0.187f, -0.187f)
                verticalLineToRelative(-0.4442f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, 0.187f, -0.187f)
                horizontalLineToRelative(8.0721f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, 0.187f, 0.187f)
                verticalLineToRelative(0.4442f)
                arcToRelative(0.1872f, 0.1872f, 0.0f, false, true, -0.1871f, 0.187f)
                close()
                moveTo(18.752f, 5.3134f)
                curveToRelative(-1.4233f, 0.0033f, -4.2184f, -0.0098f, -5.6414f, -0.0065f)
                arcToRelative(0.4035f, 0.4035f, 0.0f, false, false, -0.4035f, 0.4035f)
                verticalLineToRelative(3.6061f)
                curveToRelative(0.0f, 0.2229f, 0.1807f, 0.4035f, 0.4035f, 0.4035f)
                horizontalLineToRelative(1.7475f)
                verticalLineToRelative(8.19f)
                arcToRelative(1.8275f, 1.8275f, 0.0f, false, true, -0.9112f, 1.5761f)
                arcToRelative(1.8277f, 1.8277f, 0.0f, false, true, -1.8224f, 0.0f)
                arcToRelative(1.8276f, 1.8276f, 0.0f, false, true, -0.9113f, -1.5784f)
                lineTo(6.941f, 17.9077f)
                curveToRelative(0.0f, 2.1705f, 1.1677f, 4.193f, 3.0473f, 5.2782f)
                curveToRelative(0.9398f, 0.5428f, 1.9936f, 0.8141f, 3.0474f, 0.8141f)
                reflectiveCurveToRelative(2.1076f, -0.2713f, 3.0474f, -0.8139f)
                curveToRelative(1.8795f, -1.0837f, 3.0444f, -3.1089f, 3.0473f, -5.274f)
                lineTo(19.1304f, 5.692f)
                arcToRelative(0.3785f, 0.3785f, 0.0f, false, false, -0.3784f, -0.3786f)
                close()
                moveTo(7.4546f, 15.2306f)
                horizontalLineToRelative(3.276f)
                arcToRelative(0.6403f, 0.6403f, 0.0f, false, false, 0.6403f, -0.6403f)
                lineTo(11.3709f, 0.6403f)
                arcTo(0.6403f, 0.6403f, 0.0f, false, false, 10.7306f, 0.0f)
                horizontalLineToRelative(-3.276f)
                arcToRelative(0.6403f, 0.6403f, 0.0f, false, false, -0.6403f, 0.6403f)
                verticalLineToRelative(13.95f)
                curveToRelative(0.0f, 0.3536f, 0.2867f, 0.6403f, 0.6403f, 0.6403f)
                close()
            }
        }
        .build()
        return _imagej!!
    }

private var _imagej: ImageVector? = null
