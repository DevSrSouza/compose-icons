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

public val SharpGroup.FontDownload: ImageVector
    get() {
        if (_fontDownload != null) {
            return _fontDownload!!
        }
        _fontDownload = Builder(name = "FontDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.93f, 13.5f)
                horizontalLineToRelative(4.14f)
                lineTo(12.0f, 7.98f)
                lineTo(9.93f, 13.5f)
                close()
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 2.0f)
                close()
                moveTo(15.95f, 18.5f)
                lineToRelative(-1.14f, -3.0f)
                lineTo(9.17f, 15.5f)
                lineToRelative(-1.12f, 3.0f)
                lineTo(5.96f, 18.5f)
                lineToRelative(5.11f, -13.0f)
                horizontalLineToRelative(1.86f)
                lineToRelative(5.11f, 13.0f)
                horizontalLineToRelative(-2.09f)
                close()
            }
        }
        .build()
        return _fontDownload!!
    }

private var _fontDownload: ImageVector? = null
