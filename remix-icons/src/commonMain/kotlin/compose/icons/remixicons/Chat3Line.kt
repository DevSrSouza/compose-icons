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

public val RemixIcons.Chat3Line: ImageVector
    get() {
        if (_chat3Line != null) {
            return _chat3Line!!
        }
        _chat3Line = Builder(name = "Chat3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.291f, 20.824f)
                lineTo(2.0f, 22.0f)
                lineToRelative(1.176f, -5.291f)
                arcTo(9.956f, 9.956f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                arcToRelative(9.956f, 9.956f, 0.0f, false, true, -4.709f, -1.176f)
                close()
                moveTo(7.581f, 18.711f)
                lineToRelative(0.653f, 0.35f)
                arcTo(7.955f, 7.955f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                curveToRelative(0.0f, 1.334f, 0.325f, 2.618f, 0.94f, 3.766f)
                lineToRelative(0.349f, 0.653f)
                lineToRelative(-0.655f, 2.947f)
                lineToRelative(2.947f, -0.655f)
                close()
            }
        }
        .build()
        return _chat3Line!!
    }

private var _chat3Line: ImageVector? = null
