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

public val BrandsGroup.Vuejs: ImageVector
    get() {
        if (_vuejs != null) {
            return _vuejs!!
        }
        _vuejs = Builder(name = "Vuejs", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(356.9f, 64.3f)
                lineTo(280.0f, 64.3f)
                lineToRelative(-56.0f, 88.6f)
                lineToRelative(-48.0f, -88.6f)
                lineTo(0.0f, 64.3f)
                lineTo(224.0f, 448.0f)
                lineTo(448.0f, 64.3f)
                horizontalLineToRelative(-91.1f)
                close()
                moveTo(55.7f, 96.3f)
                horizontalLineToRelative(53.8f)
                lineTo(224.0f, 294.5f)
                lineTo(338.4f, 96.3f)
                horizontalLineToRelative(53.8f)
                lineTo(224.0f, 384.5f)
                lineTo(55.7f, 96.3f)
                close()
            }
        }
        .build()
        return _vuejs!!
    }

private var _vuejs: ImageVector? = null
