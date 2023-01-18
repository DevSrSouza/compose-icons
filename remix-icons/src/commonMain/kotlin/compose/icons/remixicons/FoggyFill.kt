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

public val RemixIcons.FoggyFill: ImageVector
    get() {
        if (_foggyFill != null) {
            return _foggyFill!!
        }
        _foggyFill = Builder(name = "FoggyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.584f, 13.007f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.873f, -5.908f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 6.52f, 5.908f)
                lineTo(1.584f, 13.007f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _foggyFill!!
    }

private var _foggyFill: ImageVector? = null
