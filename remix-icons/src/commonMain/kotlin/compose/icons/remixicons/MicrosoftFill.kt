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

public val RemixIcons.MicrosoftFill: ImageVector
    get() {
        if (_microsoftFill != null) {
            return _microsoftFill!!
        }
        _microsoftFill = Builder(name = "MicrosoftFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.0f)
                verticalLineToRelative(8.5f)
                lineTo(3.0f, 11.5f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(11.5f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(8.5f)
                lineTo(11.5f, 21.0f)
                close()
                moveTo(12.5f, 3.0f)
                lineTo(21.0f, 3.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-8.5f)
                lineTo(12.5f, 3.0f)
                close()
                moveTo(21.0f, 12.5f)
                lineTo(21.0f, 21.0f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-8.5f)
                lineTo(21.0f, 12.5f)
                close()
            }
        }
        .build()
        return _microsoftFill!!
    }

private var _microsoftFill: ImageVector? = null
