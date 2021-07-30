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

public val SolidGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(462.3f, 62.6f)
                curveTo(407.5f, 15.9f, 326.0f, 24.3f, 275.7f, 76.2f)
                lineTo(256.0f, 96.5f)
                lineToRelative(-19.7f, -20.3f)
                curveTo(186.1f, 24.3f, 104.5f, 15.9f, 49.7f, 62.6f)
                curveToRelative(-62.8f, 53.6f, -66.1f, 149.8f, -9.9f, 207.9f)
                lineToRelative(193.5f, 199.8f)
                curveToRelative(12.5f, 12.9f, 32.8f, 12.9f, 45.3f, 0.0f)
                lineToRelative(193.5f, -199.8f)
                curveToRelative(56.3f, -58.1f, 53.0f, -154.3f, -9.8f, -207.9f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
