package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.WandMagic: ImageVector
    get() {
        if (_wandMagic != null) {
            return _wandMagic!!
        }
        _wandMagic = Builder(name = "WandMagic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1f, 463.3f)
                curveToRelative(-18.7f, -18.7f, -18.7f, -49.1f, 0.0f, -67.9f)
                lineTo(395.4f, 14.1f)
                curveToRelative(18.7f, -18.7f, 49.1f, -18.7f, 67.9f, 0.0f)
                lineToRelative(34.6f, 34.6f)
                curveToRelative(18.7f, 18.7f, 18.7f, 49.1f, 0.0f, 67.9f)
                lineTo(116.5f, 497.9f)
                curveToRelative(-18.7f, 18.7f, -49.1f, 18.7f, -67.9f, 0.0f)
                lineTo(14.1f, 463.3f)
                close()
                moveTo(347.6f, 187.6f)
                lineToRelative(105.0f, -105.0f)
                lineTo(429.4f, 59.3f)
                lineToRelative(-105.0f, 105.0f)
                lineToRelative(23.3f, 23.3f)
                close()
            }
        }
        .build()
        return _wandMagic!!
    }

private var _wandMagic: ImageVector? = null
