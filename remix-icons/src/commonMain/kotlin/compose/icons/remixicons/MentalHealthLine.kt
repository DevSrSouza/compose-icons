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

public val RemixIcons.MentalHealthLine: ImageVector
    get() {
        if (_mentalHealthLine != null) {
            return _mentalHealthLine!!
        }
        _mentalHealthLine = Builder(name = "MentalHealthLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveToRelative(4.068f, 0.0f, 7.426f, 3.036f, 7.934f, 6.965f)
                lineToRelative(2.25f, 3.539f)
                curveToRelative(0.148f, 0.233f, 0.118f, 0.58f, -0.225f, 0.728f)
                lineTo(19.0f, 14.07f)
                lineTo(19.0f, 17.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.999f)
                lineTo(15.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                verticalLineToRelative(-3.694f)
                curveToRelative(0.0f, -1.18f, -0.436f, -2.297f, -1.244f, -3.305f)
                curveTo(3.657f, 13.631f, 3.0f, 11.892f, 3.0f, 10.0f)
                curveToRelative(0.0f, -4.418f, 3.582f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(11.0f, 4.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.385f, 0.468f, 2.693f, 1.316f, 3.75f)
                curveTo(7.41f, 15.114f, 8.0f, 16.667f, 8.0f, 18.306f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.002f, -3.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-4.248f)
                lineToRelative(1.55f, -0.664f)
                lineToRelative(-1.543f, -2.425f)
                lineToRelative(-0.057f, -0.442f)
                curveTo(16.566f, 6.251f, 14.024f, 4.0f, 11.0f, 4.0f)
                close()
                moveTo(10.47f, 7.763f)
                lineToRelative(0.53f, 0.53f)
                lineToRelative(0.53f, -0.53f)
                curveToRelative(0.684f, -0.684f, 1.792f, -0.684f, 2.475f, 0.0f)
                curveToRelative(0.684f, 0.683f, 0.684f, 1.791f, 0.0f, 2.474f)
                lineTo(11.0f, 13.243f)
                lineToRelative(-3.005f, -3.006f)
                curveToRelative(-0.684f, -0.683f, -0.684f, -1.791f, 0.0f, -2.474f)
                curveToRelative(0.683f, -0.684f, 1.791f, -0.684f, 2.475f, 0.0f)
                close()
            }
        }
        .build()
        return _mentalHealthLine!!
    }

private var _mentalHealthLine: ImageVector? = null
