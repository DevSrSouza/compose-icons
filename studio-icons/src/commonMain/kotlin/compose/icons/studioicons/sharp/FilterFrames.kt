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

public val SharpGroup.FilterFrames: ImageVector
    get() {
        if (_filterFrames != null) {
            return _filterFrames!!
        }
        _filterFrames = Builder(name = "FilterFrames", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(20.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(4.52f)
                lineToRelative(3.52f, -3.5f)
                lineTo(15.52f, 6.0f)
                lineTo(20.0f, 6.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(12.0f)
            }
        }
        .build()
        return _filterFrames!!
    }

private var _filterFrames: ImageVector? = null
