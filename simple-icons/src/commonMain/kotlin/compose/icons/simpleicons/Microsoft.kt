package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Microsoft: ImageVector
    get() {
        if (_microsoft != null) {
            return _microsoft!!
        }
        _microsoft = Builder(name = "Microsoft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(11.408f)
                horizontalLineToRelative(11.408f)
                lineTo(11.408f, 0.0f)
                close()
                moveTo(12.594f, 0.0f)
                verticalLineToRelative(11.408f)
                lineTo(24.0f, 11.408f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(0.0f, 12.594f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(11.408f)
                lineTo(11.408f, 12.594f)
                close()
                moveTo(12.594f, 12.594f)
                lineTo(12.594f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 12.594f)
                close()
            }
        }
        .build()
        return _microsoft!!
    }

private var _microsoft: ImageVector? = null
