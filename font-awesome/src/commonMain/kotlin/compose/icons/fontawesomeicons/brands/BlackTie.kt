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

public val BrandsGroup.BlackTie: ImageVector
    get() {
        if (_blackTie != null) {
            return _blackTie!!
        }
        _blackTie = Builder(name = "BlackTie", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                verticalLineToRelative(448.0f)
                horizontalLineToRelative(448.0f)
                lineTo(448.0f, 32.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(316.5f, 357.2f)
                lineTo(224.0f, 445.9f)
                lineToRelative(-92.5f, -88.7f)
                lineToRelative(64.5f, -184.0f)
                lineToRelative(-64.5f, -86.6f)
                horizontalLineToRelative(184.9f)
                lineTo(252.0f, 173.2f)
                lineToRelative(64.5f, 184.0f)
                close()
            }
        }
        .build()
        return _blackTie!!
    }

private var _blackTie: ImageVector? = null
