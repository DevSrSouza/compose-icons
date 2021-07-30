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

public val SimpleIcons.Abletonlive: ImageVector
    get() {
        if (_abletonlive != null) {
            return _abletonlive!!
        }
        _abletonlive = Builder(name = "Abletonlive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.4f)
                verticalLineToRelative(11.2f)
                horizontalLineToRelative(1.6f)
                lineTo(1.6f, 6.4f)
                close()
                moveTo(3.2f, 6.4f)
                verticalLineToRelative(11.2f)
                horizontalLineToRelative(1.6f)
                lineTo(4.8f, 6.4f)
                close()
                moveTo(6.4f, 6.4f)
                verticalLineToRelative(11.2f)
                lineTo(8.0f, 17.6f)
                lineTo(8.0f, 6.4f)
                close()
                moveTo(9.6f, 6.4f)
                verticalLineToRelative(11.2f)
                horizontalLineToRelative(1.6f)
                lineTo(11.2f, 6.4f)
                close()
                moveTo(12.8f, 6.4f)
                lineTo(12.8f, 8.0f)
                lineTo(24.0f, 8.0f)
                lineTo(24.0f, 6.4f)
                close()
                moveTo(12.8f, 9.6f)
                verticalLineToRelative(1.6f)
                lineTo(24.0f, 11.2f)
                lineTo(24.0f, 9.6f)
                close()
                moveTo(12.8f, 12.8f)
                verticalLineToRelative(1.6f)
                lineTo(24.0f, 14.4f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(12.8f, 16.0f)
                verticalLineToRelative(1.6f)
                lineTo(24.0f, 17.6f)
                lineTo(24.0f, 16.0f)
                close()
            }
        }
        .build()
        return _abletonlive!!
    }

private var _abletonlive: ImageVector? = null
