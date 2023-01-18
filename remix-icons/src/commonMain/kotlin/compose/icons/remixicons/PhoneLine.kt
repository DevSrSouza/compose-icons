package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PhoneLine: ImageVector
    get() {
        if (_phoneLine != null) {
            return _phoneLine!!
        }
        _phoneLine = Builder(name = "PhoneLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.366f, 10.682f)
                arcToRelative(10.556f, 10.556f, 0.0f, false, false, 3.952f, 3.952f)
                lineToRelative(0.884f, -1.238f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.294f, -0.296f)
                arcToRelative(11.422f, 11.422f, 0.0f, false, false, 4.583f, 1.364f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.921f, 0.997f)
                verticalLineToRelative(4.462f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.898f, 0.995f)
                curveToRelative(-0.53f, 0.055f, -1.064f, 0.082f, -1.602f, 0.082f)
                curveTo(9.94f, 21.0f, 3.0f, 14.06f, 3.0f, 5.5f)
                curveToRelative(0.0f, -0.538f, 0.027f, -1.072f, 0.082f, -1.602f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.077f, 3.0f)
                horizontalLineToRelative(4.462f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.997f, 0.921f)
                arcTo(11.422f, 11.422f, 0.0f, false, false, 10.9f, 8.504f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.296f, 1.294f)
                lineToRelative(-1.238f, 0.884f)
                close()
                moveTo(6.844f, 10.025f)
                lineToRelative(1.9f, -1.357f)
                arcTo(13.41f, 13.41f, 0.0f, false, true, 7.647f, 5.0f)
                lineTo(5.01f, 5.0f)
                curveToRelative(-0.006f, 0.166f, -0.009f, 0.333f, -0.009f, 0.5f)
                curveTo(5.0f, 12.956f, 11.044f, 19.0f, 18.5f, 19.0f)
                curveToRelative(0.167f, 0.0f, 0.334f, -0.003f, 0.5f, -0.01f)
                verticalLineToRelative(-2.637f)
                arcToRelative(13.41f, 13.41f, 0.0f, false, true, -3.668f, -1.097f)
                lineToRelative(-1.357f, 1.9f)
                arcToRelative(12.442f, 12.442f, 0.0f, false, true, -1.588f, -0.75f)
                lineToRelative(-0.058f, -0.033f)
                arcToRelative(12.556f, 12.556f, 0.0f, false, true, -4.702f, -4.702f)
                lineToRelative(-0.033f, -0.058f)
                arcToRelative(12.442f, 12.442f, 0.0f, false, true, -0.75f, -1.588f)
                close()
            }
        }
        .build()
        return _phoneLine!!
    }

private var _phoneLine: ImageVector? = null
