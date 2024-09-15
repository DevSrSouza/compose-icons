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

public val LineAwesomeIcons.Rocketchat: ImageVector
    get() {
        if (_rocketchat != null) {
            return _rocketchat!!
        }
        _rocketchat = Builder(name = "Rocketchat", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.549f, 5.0f)
                curveTo(6.264f, 5.0f, 5.055f, 5.309f, 4.0f, 5.85f)
                curveTo(5.422f, 6.969f, 6.432f, 8.527f, 6.836f, 10.301f)
                curveTo(5.065f, 11.854f, 4.0f, 13.839f, 4.0f, 16.0f)
                curveTo(4.0f, 18.1f, 5.003f, 20.111f, 6.84f, 21.717f)
                curveTo(6.55f, 22.967f, 5.948f, 24.134f, 5.082f, 25.123f)
                lineTo(4.014f, 26.346f)
                lineTo(5.586f, 26.752f)
                curveTo(6.226f, 26.918f, 6.887f, 27.0f, 7.549f, 27.0f)
                curveTo(9.777f, 27.0f, 11.842f, 26.198f, 13.424f, 24.729f)
                curveTo(14.426f, 24.909f, 15.458f, 25.0f, 16.5f, 25.0f)
                curveTo(23.393f, 25.0f, 29.0f, 20.962f, 29.0f, 16.0f)
                curveTo(29.0f, 11.038f, 23.393f, 7.0f, 16.5f, 7.0f)
                curveTo(15.441f, 7.0f, 14.418f, 7.106f, 13.436f, 7.285f)
                curveTo(11.914f, 5.877f, 9.844f, 5.0f, 7.549f, 5.0f)
                close()
                moveTo(16.5f, 9.0f)
                curveTo(22.29f, 9.0f, 27.0f, 12.14f, 27.0f, 16.0f)
                curveTo(27.0f, 19.86f, 22.29f, 23.0f, 16.5f, 23.0f)
                curveTo(15.412f, 23.0f, 14.339f, 22.889f, 13.309f, 22.668f)
                lineTo(12.758f, 22.549f)
                lineTo(12.371f, 22.957f)
                curveTo(11.147f, 24.252f, 9.47f, 24.976f, 7.641f, 25.0f)
                curveTo(8.291f, 23.917f, 8.728f, 22.725f, 8.922f, 21.479f)
                lineTo(9.014f, 20.896f)
                lineTo(8.549f, 20.535f)
                curveTo(6.906f, 19.256f, 6.0f, 17.646f, 6.0f, 16.0f)
                curveTo(6.0f, 12.14f, 10.71f, 9.0f, 16.5f, 9.0f)
                close()
                moveTo(11.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 15.0f)
                close()
                moveTo(16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 15.0f)
                close()
                moveTo(21.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.5f, 15.0f)
                close()
            }
        }
        .build()
        return _rocketchat!!
    }

private var _rocketchat: ImageVector? = null
