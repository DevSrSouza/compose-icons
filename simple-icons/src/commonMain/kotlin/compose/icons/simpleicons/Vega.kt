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

public val SimpleIcons.Vega: ImageVector
    get() {
        if (_vega != null) {
            return _vega!!
        }
        _vega = Builder(name = "Vega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.39f, 8.693f)
                lineTo(24.0f, 8.693f)
                lineToRelative(-3.123f, -6.68f)
                close()
                moveTo(6.68f, 1.987f)
                lineTo(0.0f, 1.987f)
                lineTo(7.098f, 22.03f)
                horizontalLineToRelative(0.008f)
                lineToRelative(2.86f, -10.73f)
                close()
                moveTo(20.877f, 1.971f)
                lineTo(13.779f, 22.013f)
                horizontalLineToRelative(-6.68f)
                lineTo(14.195f, 1.97f)
            }
        }
        .build()
        return _vega!!
    }

private var _vega: ImageVector? = null
