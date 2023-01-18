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

public val RemixIcons.MentalHealthFill: ImageVector
    get() {
        if (_mentalHealthFill != null) {
            return _mentalHealthFill!!
        }
        _mentalHealthFill = Builder(name = "MentalHealthFill", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(10.47f, 7.763f)
                curveToRelative(-0.684f, -0.684f, -1.792f, -0.684f, -2.475f, 0.0f)
                curveToRelative(-0.684f, 0.683f, -0.684f, 1.791f, 0.0f, 2.474f)
                lineTo(11.0f, 13.243f)
                lineToRelative(3.005f, -3.006f)
                curveToRelative(0.684f, -0.683f, 0.684f, -1.791f, 0.0f, -2.474f)
                curveToRelative(-0.683f, -0.684f, -1.791f, -0.684f, -2.475f, 0.0f)
                lineToRelative(-0.53f, 0.53f)
                lineToRelative(-0.53f, -0.53f)
                close()
            }
        }
        .build()
        return _mentalHealthFill!!
    }

private var _mentalHealthFill: ImageVector? = null
