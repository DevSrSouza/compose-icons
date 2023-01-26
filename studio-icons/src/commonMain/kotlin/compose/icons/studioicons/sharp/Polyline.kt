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

public val SharpGroup.Polyline: ImageVector
    get() {
        if (_polyline != null) {
            return _polyline!!
        }
        _polyline = Builder(name = "Polyline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                lineToRelative(0.0f, 1.26f)
                lineToRelative(-6.0f, -3.0f)
                lineToRelative(0.0f, -3.17f)
                lineToRelative(2.7f, -3.09f)
                lineToRelative(4.3f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-6.0f, 0.0f)
                lineToRelative(0.0f, 4.9f)
                lineToRelative(-2.7f, 3.1f)
                lineToRelative(-4.3f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(7.0f, 3.5f)
                lineToRelative(0.0f, 2.5f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _polyline!!
    }

private var _polyline: ImageVector? = null
