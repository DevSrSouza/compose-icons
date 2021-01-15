package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.GoogleDrive: ImageVector
    get() {
        if (_googleDrive != null) {
            return _googleDrive!!
        }
        _googleDrive = Builder(name = "GoogleDrive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.433f, 22.396f)
                lineToRelative(4.0f, -6.929f)
                lineTo(24.0f, 15.467f)
                lineToRelative(-4.0f, 6.929f)
                lineTo(4.433f, 22.396f)
                close()
                moveTo(7.999f, 15.467f)
                lineToRelative(-3.998f, 6.929f)
                lineTo(0.0f, 15.467f)
                lineTo(7.785f, 1.98f)
                lineToRelative(3.999f, 6.931f)
                lineToRelative(-3.785f, 6.556f)
                close()
                moveTo(23.783f, 15.092f)
                horizontalLineToRelative(-7.999f)
                lineTo(7.999f, 1.605f)
                horizontalLineToRelative(8.002f)
                lineToRelative(7.785f, 13.486f)
                horizontalLineToRelative(-0.003f)
                close()
            }
        }
        .build()
        return _googleDrive!!
    }

private var _googleDrive: ImageVector? = null
