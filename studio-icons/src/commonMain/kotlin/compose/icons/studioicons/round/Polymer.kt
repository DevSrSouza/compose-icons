package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Polymer: ImageVector
    get() {
        if (_polymer != null) {
            return _polymer!!
        }
        _polymer = Builder(name = "Polymer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(7.11f, 16.63f)
                lineTo(4.5f, 12.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineTo(5.0f)
                lineTo(0.5f, 12.0f)
                lineTo(5.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(7.89f, -12.63f)
                lineTo(19.5f, 12.0f)
                lineTo(15.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(4.5f, -8.0f)
                lineTo(19.0f, 4.0f)
                close()
            }
        }
        .build()
        return _polymer!!
    }

private var _polymer: ImageVector? = null
