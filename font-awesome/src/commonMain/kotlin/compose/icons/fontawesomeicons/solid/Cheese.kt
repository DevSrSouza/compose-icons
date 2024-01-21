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

public val SolidGroup.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 240.2f)
                lineTo(512.0f, 256.0f)
                lineTo(0.0f, 256.0f)
                curveToRelative(0.0f, -20.0f, 10.0f, -38.7f, 26.6f, -49.8f)
                lineTo(274.9f, 40.7f)
                curveToRelative(8.6f, -5.7f, 18.6f, -8.7f, 28.9f, -8.7f)
                curveTo(418.8f, 32.0f, 512.0f, 125.2f, 512.0f, 240.2f)
                close()
                moveTo(512.0f, 288.0f)
                lineTo(512.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 288.0f)
                lineTo(512.0f, 288.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
