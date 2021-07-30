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

public val SimpleIcons.Polymerproject: ImageVector
    get() {
        if (_polymerproject != null) {
            return _polymerproject!!
        }
        _polymerproject = Builder(name = "Polymerproject", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 3.686f)
                lineTo(7.2f, 16.16f)
                lineTo(4.8f, 12.0f)
                lineToRelative(4.8f, -8.314f)
                horizontalLineTo(4.8f)
                lineTo(0.0f, 12.0f)
                lineToRelative(2.4f, 4.159f)
                lineToRelative(2.4f, 4.155f)
                horizontalLineToRelative(4.8f)
                lineToRelative(7.2f, -12.469f)
                lineTo(19.2f, 12.0f)
                lineToRelative(-4.8f, 8.314f)
                horizontalLineToRelative(4.8f)
                lineToRelative(2.4f, -4.155f)
                lineTo(24.0f, 12.0f)
                lineToRelative(-2.4f, -4.155f)
                lineToRelative(-2.4f, -4.159f)
                close()
            }
        }
        .build()
        return _polymerproject!!
    }

private var _polymerproject: ImageVector? = null
