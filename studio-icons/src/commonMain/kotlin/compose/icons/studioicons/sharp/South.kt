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

public val SharpGroup.South: ImageVector
    get() {
        if (_south != null) {
            return _south!!
        }
        _south = Builder(name = "South", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(13.0f, 18.17f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(16.17f)
                lineToRelative(-4.59f, -4.59f)
                lineTo(5.0f, 15.0f)
                lineToRelative(7.0f, 7.0f)
                lineTo(19.0f, 15.0f)
                close()
            }
        }
        .build()
        return _south!!
    }

private var _south: ImageVector? = null
