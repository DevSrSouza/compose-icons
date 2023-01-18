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

public val RemixIcons.WaterFlashLine: ImageVector
    get() {
        if (_waterFlashLine != null) {
            return _waterFlashLine!!
        }
        _waterFlashLine = Builder(name = "WaterFlashLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.1f)
                lineTo(7.05f, 8.05f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 9.9f, 0.0f)
                lineTo(12.0f, 3.1f)
                close()
                moveTo(12.0f, 0.272f)
                lineToRelative(6.364f, 6.364f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -12.728f, 0.0f)
                lineTo(12.0f, 0.272f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(2.5f)
                lineTo(11.0f, 17.5f)
                lineTo(11.0f, 13.0f)
                lineTo(8.5f, 13.0f)
                lineTo(13.0f, 6.5f)
                lineTo(13.0f, 11.0f)
                close()
            }
        }
        .build()
        return _waterFlashLine!!
    }

private var _waterFlashLine: ImageVector? = null
