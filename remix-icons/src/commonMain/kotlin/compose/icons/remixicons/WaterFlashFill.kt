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

public val RemixIcons.WaterFlashFill: ImageVector
    get() {
        if (_waterFlashFill != null) {
            return _waterFlashFill!!
        }
        _waterFlashFill = Builder(name = "WaterFlashFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 6.636f)
                lineTo(12.0f, 0.272f)
                lineToRelative(6.364f, 6.364f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -12.728f, 0.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineTo(6.5f)
                lineTo(8.5f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(4.5f)
                lineToRelative(4.5f, -6.5f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _waterFlashFill!!
    }

private var _waterFlashFill: ImageVector? = null
