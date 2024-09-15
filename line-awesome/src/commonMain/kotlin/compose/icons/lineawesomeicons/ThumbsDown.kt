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

public val LineAwesomeIcons.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.156f, 6.0f)
                curveTo(8.746f, 6.0f, 7.516f, 6.996f, 7.219f, 8.375f)
                lineTo(5.063f, 18.375f)
                curveTo(4.668f, 20.223f, 6.113f, 22.0f, 8.0f, 22.0f)
                lineTo(13.75f, 22.0f)
                lineTo(13.563f, 22.75f)
                curveTo(13.359f, 22.906f, 13.23f, 22.973f, 12.938f, 23.375f)
                curveTo(12.469f, 24.016f, 12.0f, 25.008f, 12.0f, 26.344f)
                curveTo(12.0f, 27.77f, 13.289f, 29.0f, 14.906f, 29.0f)
                lineTo(15.313f, 29.0f)
                lineTo(15.625f, 28.719f)
                lineTo(22.406f, 22.0f)
                lineTo(27.0f, 22.0f)
                lineTo(27.0f, 6.0f)
                close()
                moveTo(10.156f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 20.594f)
                lineTo(14.594f, 26.906f)
                curveTo(14.172f, 26.824f, 14.0f, 26.652f, 14.0f, 26.344f)
                curveTo(14.0f, 25.441f, 14.273f, 24.883f, 14.531f, 24.531f)
                curveTo(14.789f, 24.18f, 14.969f, 24.094f, 14.969f, 24.094f)
                lineTo(15.313f, 23.906f)
                lineTo(15.438f, 23.5f)
                lineTo(16.031f, 21.25f)
                lineTo(16.344f, 20.0f)
                lineTo(8.0f, 20.0f)
                curveTo(7.34f, 20.0f, 6.895f, 19.426f, 7.031f, 18.781f)
                lineTo(9.156f, 8.781f)
                curveTo(9.258f, 8.313f, 9.68f, 8.0f, 10.156f, 8.0f)
                close()
                moveTo(23.0f, 8.0f)
                lineTo(25.0f, 8.0f)
                lineTo(25.0f, 20.0f)
                lineTo(23.0f, 20.0f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
