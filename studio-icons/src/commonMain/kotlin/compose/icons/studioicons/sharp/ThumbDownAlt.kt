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

public val SharpGroup.ThumbDownAlt: ImageVector
    get() {
        if (_thumbDownAlt != null) {
            return _thumbDownAlt!!
        }
        _thumbDownAlt = Builder(name = "ThumbDownAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.6f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(8.31f)
                lineToRelative(-1.12f, 5.38f)
                lineTo(9.83f, 23.0f)
                lineTo(17.0f, 15.82f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.69f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _thumbDownAlt!!
    }

private var _thumbDownAlt: ImageVector? = null
