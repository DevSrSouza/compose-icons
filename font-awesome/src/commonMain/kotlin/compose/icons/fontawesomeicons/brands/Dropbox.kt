package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Dropbox: ImageVector
    get() {
        if (_dropbox != null) {
            return _dropbox!!
        }
        _dropbox = Builder(name = "Dropbox", defaultWidth = 528.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 528.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(264.4f, 116.3f)
                lineToRelative(-132.0f, 84.3f)
                lineToRelative(132.0f, 84.3f)
                lineToRelative(-132.0f, 84.3f)
                lineTo(0.0f, 284.1f)
                lineToRelative(132.3f, -84.3f)
                lineTo(0.0f, 116.3f)
                lineTo(132.3f, 32.0f)
                lineToRelative(132.1f, 84.3f)
                close()
                moveTo(131.6f, 395.7f)
                lineToRelative(132.0f, -84.3f)
                lineToRelative(132.0f, 84.3f)
                lineToRelative(-132.0f, 84.3f)
                lineToRelative(-132.0f, -84.3f)
                close()
                moveTo(264.4f, 284.1f)
                lineToRelative(132.0f, -84.3f)
                lineToRelative(-132.0f, -83.6f)
                lineTo(395.7f, 32.0f)
                lineTo(528.0f, 116.3f)
                lineToRelative(-132.3f, 84.3f)
                lineTo(528.0f, 284.8f)
                lineToRelative(-132.3f, 84.3f)
                lineToRelative(-131.3f, -85.0f)
                close()
            }
        }
        .build()
        return _dropbox!!
    }

private var _dropbox: ImageVector? = null
