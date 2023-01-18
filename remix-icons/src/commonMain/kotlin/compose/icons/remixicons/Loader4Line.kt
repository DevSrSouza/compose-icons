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

public val RemixIcons.Loader4Line: ImageVector
    get() {
        if (_loader4Line != null) {
            return _loader4Line!!
        }
        _loader4Line = Builder(name = "Loader4Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 5.636f)
                lineTo(16.95f, 7.05f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 19.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -2.636f, -6.364f)
                close()
            }
        }
        .build()
        return _loader4Line!!
    }

private var _loader4Line: ImageVector? = null
