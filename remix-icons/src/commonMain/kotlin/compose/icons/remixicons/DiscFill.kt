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

public val RemixIcons.DiscFill: ImageVector
    get() {
        if (_discFill != null) {
            return _discFill!!
        }
        _discFill = Builder(name = "DiscFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.17f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 15.0f, 12.0f)
                verticalLineTo(2.458f)
                curveToRelative(4.057f, 1.274f, 7.0f, 5.064f, 7.0f, 9.542f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.337f, 0.0f, 0.671f, 0.017f, 1.0f, 0.05f)
                verticalLineToRelative(7.12f)
                close()
            }
        }
        .build()
        return _discFill!!
    }

private var _discFill: ImageVector? = null
