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

public val SharpGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(1.0f, -7.0f)
                horizontalLineTo(6.74f)
                curveToRelative(0.0f, 0.0f, 3.68f, -6.46f, 6.26f, -11.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-1.0f, 7.0f)
                horizontalLineToRelative(4.28f)
                lineTo(11.0f, 21.0f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
