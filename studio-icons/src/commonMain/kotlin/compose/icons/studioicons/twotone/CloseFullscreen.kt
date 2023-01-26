package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.CloseFullscreen: ImageVector
    get() {
        if (_closeFullscreen != null) {
            return _closeFullscreen!!
        }
        _closeFullscreen = Builder(name = "CloseFullscreen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.41f)
                lineToRelative(-5.29f, 5.29f)
                lineTo(20.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(4.0f)
                lineToRelative(3.29f, 3.29f)
                lineTo(20.59f, 2.0f)
                lineTo(22.0f, 3.41f)
                close()
                moveTo(3.41f, 22.0f)
                lineToRelative(5.29f, -5.29f)
                lineTo(12.0f, 20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(4.0f)
                lineToRelative(3.29f, 3.29f)
                lineTo(2.0f, 20.59f)
                lineTo(3.41f, 22.0f)
                close()
            }
        }
        .build()
        return _closeFullscreen!!
    }

private var _closeFullscreen: ImageVector? = null
