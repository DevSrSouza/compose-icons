package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ChromeReaderMode: ImageVector
    get() {
        if (_chromeReaderMode != null) {
            return _chromeReaderMode!!
        }
        _chromeReaderMode = Builder(name = "ChromeReaderMode", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(13.0f, 9.5f)
                horizontalLineToRelative(7.0f)
                lineTo(20.0f, 11.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 9.5f)
                close()
                moveTo(13.0f, 14.5f)
                horizontalLineToRelative(7.0f)
                lineTo(20.0f, 16.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(23.0f, 4.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 4.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _chromeReaderMode!!
    }

private var _chromeReaderMode: ImageVector? = null
