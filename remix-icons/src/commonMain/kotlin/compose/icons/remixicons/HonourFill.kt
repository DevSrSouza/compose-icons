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

public val RemixIcons.HonourFill: ImageVector
    get() {
        if (_honourFill != null) {
            return _honourFill!!
        }
        _honourFill = Builder(name = "HonourFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(14.721f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.298f, 0.458f)
                lineTo(12.0f, 23.03f)
                lineTo(3.298f, 19.18f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 18.72f)
                lineTo(3.0f, 4.0f)
                lineTo(1.0f, 4.0f)
                lineTo(1.0f, 2.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 12.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _honourFill!!
    }

private var _honourFill: ImageVector? = null
