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

public val BrandsGroup.Yahoo: ImageVector
    get() {
        if (_yahoo != null) {
            return _yahoo!!
        }
        _yahoo = Builder(name = "Yahoo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.69f, 141.06f)
                lineTo(167.0f, 284.23f)
                lineTo(111.0f, 141.06f)
                lineTo(14.93f, 141.06f)
                lineTo(120.76f, 390.19f)
                lineTo(82.19f, 480.0f)
                horizontalLineToRelative(94.17f)
                lineTo(317.27f, 141.06f)
                close()
                moveTo(329.09f, 276.85f)
                arcToRelative(58.22f, 58.22f, 0.0f, true, false, 58.22f, 58.22f)
                arcTo(58.22f, 58.22f, 0.0f, false, false, 329.09f, 276.85f)
                close()
                moveTo(394.65f, 32.0f)
                lineToRelative(-93.0f, 223.47f)
                lineTo(406.44f, 255.47f)
                lineTo(499.07f, 32.0f)
                close()
            }
        }
        .build()
        return _yahoo!!
    }

private var _yahoo: ImageVector? = null
