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

public val SharpGroup.Dangerous: ImageVector
    get() {
        if (_dangerous != null) {
            return _dangerous!!
        }
        _dangerous = Builder(name = "Dangerous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.73f, 3.0f)
                horizontalLineTo(8.27f)
                lineTo(3.0f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21.0f)
                horizontalLineToRelative(7.46f)
                lineTo(21.0f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3.0f)
                close()
                moveTo(16.24f, 14.83f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12.0f, 13.41f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(10.59f, 12.0f)
                lineTo(7.76f, 9.17f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.0f, 10.59f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(1.41f, 1.41f)
                lineTo(13.41f, 12.0f)
                lineTo(16.24f, 14.83f)
                close()
            }
        }
        .build()
        return _dangerous!!
    }

private var _dangerous: ImageVector? = null
