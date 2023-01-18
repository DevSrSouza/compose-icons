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

public val RemixIcons.ShareForward2Fill: ImageVector
    get() {
        if (_shareForward2Fill != null) {
            return _shareForward2Fill!!
        }
        _shareForward2Fill = Builder(name = "ShareForward2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(12.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                arcToRelative(5.992f, 5.992f, 0.0f, false, false, -4.854f, 2.473f)
                arcTo(8.003f, 8.003f, 0.0f, false, true, 12.0f, 6.0f)
                lineTo(12.0f, 2.0f)
                lineToRelative(8.0f, 6.0f)
                lineToRelative(-8.0f, 6.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _shareForward2Fill!!
    }

private var _shareForward2Fill: ImageVector? = null
