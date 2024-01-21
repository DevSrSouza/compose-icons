package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.NoEntryFill12: ImageVector
    get() {
        if (_noEntryFill12 != null) {
            return _noEntryFill12!!
        }
        _noEntryFill12 = Builder(name = "NoEntryFill12", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
                moveTo(9.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _noEntryFill12!!
    }

private var _noEntryFill12: ImageVector? = null
