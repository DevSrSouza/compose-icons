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

public val SharpGroup.AutoGraph: ImageVector
    get() {
        if (_autoGraph != null) {
            return _autoGraph!!
        }
        _autoGraph = Builder(name = "AutoGraph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.06f, 9.94f)
                lineTo(12.0f, 9.0f)
                lineToRelative(2.06f, -0.94f)
                lineTo(15.0f, 6.0f)
                lineToRelative(0.94f, 2.06f)
                lineTo(18.0f, 9.0f)
                lineToRelative(-2.06f, 0.94f)
                lineTo(15.0f, 12.0f)
                lineTo(14.06f, 9.94f)
                close()
                moveTo(4.0f, 14.0f)
                lineToRelative(0.94f, -2.06f)
                lineTo(7.0f, 11.0f)
                lineToRelative(-2.06f, -0.94f)
                lineTo(4.0f, 8.0f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(1.0f, 11.0f)
                lineToRelative(2.06f, 0.94f)
                lineTo(4.0f, 14.0f)
                close()
                moveTo(8.5f, 9.0f)
                lineToRelative(1.09f, -2.41f)
                lineTo(12.0f, 5.5f)
                lineTo(9.59f, 4.41f)
                lineTo(8.5f, 2.0f)
                lineTo(7.41f, 4.41f)
                lineTo(5.0f, 5.5f)
                lineToRelative(2.41f, 1.09f)
                lineTo(8.5f, 9.0f)
                close()
                moveTo(4.5f, 20.5f)
                lineToRelative(6.0f, -6.01f)
                lineToRelative(4.0f, 4.0f)
                lineTo(23.0f, 8.93f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-7.09f, 7.97f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(3.0f, 19.0f)
                lineTo(4.5f, 20.5f)
                close()
            }
        }
        .build()
        return _autoGraph!!
    }

private var _autoGraph: ImageVector? = null
