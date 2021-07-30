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

public val SimpleIcons.Microsoftazure: ImageVector
    get() {
        if (_microsoftazure != null) {
            return _microsoftazure!!
        }
        _microsoftazure = Builder(name = "Microsoftazure", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.483f, 21.3f)
                horizontalLineTo(24.0f)
                lineTo(14.025f, 4.013f)
                lineToRelative(-3.038f, 8.347f)
                lineToRelative(5.836f, 6.938f)
                lineTo(5.483f, 21.3f)
                close()
                moveTo(13.23f, 2.7f)
                lineTo(6.105f, 8.677f)
                lineTo(0.0f, 19.253f)
                horizontalLineToRelative(5.505f)
                verticalLineToRelative(0.014f)
                lineTo(13.23f, 2.7f)
                close()
            }
        }
        .build()
        return _microsoftazure!!
    }

private var _microsoftazure: ImageVector? = null
