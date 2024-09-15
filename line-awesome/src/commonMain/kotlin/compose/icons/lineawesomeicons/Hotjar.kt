package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Hotjar: ImageVector
    get() {
        if (_hotjar != null) {
            return _hotjar!!
        }
        _hotjar = Builder(name = "Hotjar", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(10.727f, 5.908f)
                curveTo(10.742f, 5.925f, 12.181f, 7.589f, 11.947f, 9.537f)
                curveTo(11.798f, 10.781f, 10.987f, 11.93f, 9.545f, 12.941f)
                curveTo(5.306f, 15.813f, 4.02f, 19.677f, 5.777f, 23.426f)
                curveTo(7.099f, 26.248f, 9.997f, 28.0f, 13.113f, 28.0f)
                lineTo(14.928f, 28.0f)
                lineTo(13.791f, 26.389f)
                curveTo(12.883f, 25.215f, 12.9f, 23.873f, 13.117f, 22.873f)
                curveTo(14.662f, 24.042f, 16.467f, 23.893f, 17.721f, 23.094f)
                curveTo(18.872f, 22.36f, 19.686f, 21.038f, 19.713f, 19.461f)
                curveTo(19.971f, 19.869f, 20.184f, 20.344f, 20.336f, 20.871f)
                curveTo(20.778f, 22.402f, 20.724f, 24.737f, 19.121f, 26.279f)
                lineTo(17.451f, 28.0f)
                lineTo(19.025f, 28.0f)
                curveTo(19.916f, 28.0f, 20.81f, 27.833f, 21.607f, 27.438f)
                curveTo(24.096f, 26.202f, 25.776f, 23.947f, 26.662f, 20.686f)
                curveTo(27.383f, 18.031f, 26.922f, 14.524f, 25.396f, 11.795f)
                curveTo(21.857f, 5.444f, 11.999f, 4.298f, 11.582f, 4.252f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(13.453f, 6.615f)
                curveTo(16.36f, 7.269f, 21.514f, 8.934f, 23.652f, 12.77f)
                curveTo(24.915f, 15.027f, 25.327f, 17.868f, 24.727f, 20.188f)
                curveTo(24.23f, 22.128f, 23.448f, 23.579f, 22.33f, 24.6f)
                curveTo(22.725f, 23.102f, 22.616f, 21.558f, 22.258f, 20.316f)
                curveTo(21.603f, 18.048f, 20.05f, 16.403f, 18.203f, 16.021f)
                lineTo(16.0f, 15.561f)
                lineTo(17.143f, 17.512f)
                curveTo(18.204f, 19.296f, 17.628f, 20.78f, 16.646f, 21.406f)
                curveTo(15.863f, 21.905f, 14.584f, 21.954f, 13.551f, 20.438f)
                lineTo(12.598f, 19.037f)
                lineTo(11.832f, 20.549f)
                curveTo(11.567f, 21.072f, 10.54f, 23.331f, 11.232f, 25.705f)
                curveTo(9.772f, 25.231f, 8.297f, 24.171f, 7.531f, 22.451f)
                curveTo(5.91f, 18.813f, 8.343f, 16.172f, 10.68f, 14.588f)
                curveTo(12.628f, 13.223f, 13.724f, 11.596f, 13.938f, 9.754f)
                curveTo(14.075f, 8.563f, 13.812f, 7.479f, 13.453f, 6.615f)
                close()
            }
        }
        .build()
        return _hotjar!!
    }

private var _hotjar: ImageVector? = null
