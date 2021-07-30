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

public val BrandsGroup.Modx: ImageVector
    get() {
        if (_modx != null) {
            return _modx!!
        }
        _modx = Builder(name = "Modx", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(356.0f, 241.8f)
                lineToRelative(36.7f, 23.7f)
                lineTo(392.7f, 480.0f)
                lineToRelative(-133.0f, -83.8f)
                lineTo(356.0f, 241.8f)
                close()
                moveTo(440.0f, 75.0f)
                lineTo(226.3f, 75.0f)
                lineToRelative(-23.0f, 37.8f)
                lineToRelative(153.5f, 96.5f)
                lineTo(440.0f, 75.0f)
                close()
                moveTo(351.0f, 217.8f)
                lineTo(55.2f, 32.0f)
                verticalLineToRelative(214.5f)
                lineToRelative(46.0f, 29.0f)
                lineTo(351.0f, 217.8f)
                close()
                moveTo(97.0f, 294.2f)
                lineTo(8.0f, 437.0f)
                horizontalLineToRelative(213.7f)
                lineToRelative(125.0f, -200.5f)
                lineTo(97.0f, 294.2f)
                close()
            }
        }
        .build()
        return _modx!!
    }

private var _modx: ImageVector? = null
