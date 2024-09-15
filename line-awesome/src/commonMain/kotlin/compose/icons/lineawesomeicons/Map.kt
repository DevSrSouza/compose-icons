package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 4.469f)
                lineTo(26.594f, 5.094f)
                lineTo(19.969f, 7.938f)
                lineTo(12.344f, 5.063f)
                lineTo(11.969f, 4.938f)
                lineTo(11.594f, 5.094f)
                lineTo(4.594f, 8.094f)
                lineTo(4.0f, 8.344f)
                lineTo(4.0f, 27.531f)
                lineTo(5.406f, 26.906f)
                lineTo(12.031f, 24.063f)
                lineTo(19.656f, 26.938f)
                lineTo(20.031f, 27.063f)
                lineTo(20.406f, 26.906f)
                lineTo(27.406f, 23.906f)
                lineTo(28.0f, 23.656f)
                close()
                moveTo(13.0f, 7.438f)
                lineTo(19.0f, 9.688f)
                lineTo(19.0f, 24.563f)
                lineTo(13.0f, 22.313f)
                close()
                moveTo(11.0f, 7.5f)
                lineTo(11.0f, 22.344f)
                lineTo(6.0f, 24.5f)
                lineTo(6.0f, 9.656f)
                close()
                moveTo(26.0f, 7.5f)
                lineTo(26.0f, 22.344f)
                lineTo(21.0f, 24.5f)
                lineTo(21.0f, 9.656f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
