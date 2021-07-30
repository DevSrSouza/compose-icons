package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Anydesk: ImageVector
    get() {
        if (_anydesk != null) {
            return _anydesk!!
        }
        _anydesk = Builder(name = "Anydesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.322f, 3.677f)
                lineTo(0.0f, 12.0f)
                lineToRelative(8.322f, 8.323f)
                lineTo(16.645f, 12.0f)
                close()
                moveTo(15.693f, 3.687f)
                lineToRelative(-1.849f, 1.85f)
                lineToRelative(6.49f, 6.456f)
                lineToRelative(-6.49f, 6.49f)
                lineToRelative(1.85f, 1.817f)
                lineTo(24.0f, 11.993f)
                close()
            }
        }
        .build()
        return _anydesk!!
    }

private var _anydesk: ImageVector? = null
