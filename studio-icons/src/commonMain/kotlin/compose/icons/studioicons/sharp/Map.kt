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

public val SharpGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.1f)
                lineTo(9.0f, 3.0f)
                lineTo(3.0f, 5.02f)
                verticalLineToRelative(16.2f)
                lineToRelative(6.0f, -2.33f)
                lineToRelative(6.0f, 2.1f)
                lineToRelative(6.0f, -2.02f)
                lineTo(21.0f, 2.77f)
                lineTo(15.0f, 5.1f)
                close()
                moveTo(15.0f, 18.89f)
                lineToRelative(-6.0f, -2.11f)
                lineTo(9.0f, 5.11f)
                lineToRelative(6.0f, 2.11f)
                verticalLineToRelative(11.67f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
