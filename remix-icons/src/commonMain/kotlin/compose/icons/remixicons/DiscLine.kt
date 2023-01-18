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

public val RemixIcons.DiscLine: ImageVector
    get() {
        if (_discLine != null) {
            return _discLine!!
        }
        _discLine = Builder(name = "DiscLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.582f)
                verticalLineTo(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.0f, -2.83f)
                verticalLineTo(2.05f)
                curveToRelative(5.053f, 0.501f, 9.0f, 4.765f, 9.0f, 9.95f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -5.185f, 3.947f, -9.449f, 9.0f, -9.95f)
                verticalLineToRelative(2.012f)
                arcTo(8.001f, 8.001f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, -15.418f)
                close()
            }
        }
        .build()
        return _discLine!!
    }

private var _discLine: ImageVector? = null
