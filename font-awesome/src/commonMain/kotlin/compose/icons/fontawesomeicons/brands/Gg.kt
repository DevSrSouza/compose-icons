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

public val BrandsGroup.Gg: ImageVector
    get() {
        if (_gg != null) {
            return _gg!!
        }
        _gg = Builder(name = "Gg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.2f, 230.4f)
                lineToRelative(102.4f, 102.4f)
                lineToRelative(-102.4f, 102.4f)
                lineTo(0.0f, 256.0f)
                lineTo(179.2f, 76.8f)
                lineToRelative(44.8f, 44.8f)
                lineToRelative(-25.6f, 25.6f)
                lineToRelative(-19.2f, -19.2f)
                lineToRelative(-128.0f, 128.0f)
                lineToRelative(128.0f, 128.0f)
                lineToRelative(51.5f, -51.5f)
                lineToRelative(-77.1f, -76.5f)
                lineToRelative(25.6f, -25.6f)
                close()
                moveTo(332.8f, 76.8f)
                lineTo(230.4f, 179.2f)
                lineToRelative(102.4f, 102.4f)
                lineToRelative(25.6f, -25.6f)
                lineToRelative(-77.1f, -76.5f)
                lineToRelative(51.5f, -51.5f)
                lineToRelative(128.0f, 128.0f)
                lineToRelative(-128.0f, 128.0f)
                lineToRelative(-19.2f, -19.2f)
                lineToRelative(-25.6f, 25.6f)
                lineToRelative(44.8f, 44.8f)
                lineTo(512.0f, 256.0f)
                lineTo(332.8f, 76.8f)
                close()
            }
        }
        .build()
        return _gg!!
    }

private var _gg: ImageVector? = null
