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

public val SimpleIcons.Vorondesign: ImageVector
    get() {
        if (_vorondesign != null) {
            return _vorondesign!!
        }
        _vorondesign = Builder(name = "Vorondesign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.6078f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.3922f, -6.0f)
                lineTo(22.3922f, 6.0f)
                lineTo(12.0001f, 0.0f)
                close()
                moveTo(8.3242f, 5.3765f)
                horizontalLineToRelative(3.0f)
                lineTo(7.5f, 12.0001f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(3.8241f, -6.6236f)
                close()
                moveTo(14.3242f, 5.3765f)
                horizontalLineToRelative(3.0f)
                lineTo(9.676f, 18.6235f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(7.6482f, -13.247f)
                close()
                moveTo(16.5002f, 12.0001f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.8242f, 6.6235f)
                horizontalLineToRelative(-3.0f)
                lineTo(16.5f, 12.0f)
                close()
            }
        }
        .build()
        return _vorondesign!!
    }

private var _vorondesign: ImageVector? = null
