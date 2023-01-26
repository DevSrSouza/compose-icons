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

public val SharpGroup.Beenhere: ImageVector
    get() {
        if (_beenhere != null) {
            return _beenhere!!
        }
        _beenhere = Builder(name = "Beenhere", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.01f, 1.0f)
                lineTo(3.0f, 17.0f)
                lineToRelative(9.0f, 6.0f)
                lineToRelative(8.99f, -6.0f)
                lineTo(21.0f, 1.0f)
                horizontalLineTo(3.01f)
                close()
                moveTo(10.0f, 16.0f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(1.41f, -1.42f)
                lineTo(10.0f, 13.17f)
                lineToRelative(7.59f, -7.59f)
                lineTo(19.0f, 7.0f)
                lineToRelative(-9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _beenhere!!
    }

private var _beenhere: ImageVector? = null
