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

public val BrandsGroup.Jira: ImageVector
    get() {
        if (_jira != null) {
            return _jira!!
        }
        _jira = Builder(name = "Jira", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.0f, 241.7f)
                curveTo(417.1f, 169.0f, 320.6f, 71.8f, 248.5f, 0.0f)
                curveTo(83.0f, 164.9f, 6.0f, 241.7f, 6.0f, 241.7f)
                curveToRelative(-7.9f, 7.9f, -7.9f, 20.7f, 0.0f, 28.7f)
                curveTo(138.8f, 402.7f, 67.8f, 331.9f, 248.5f, 512.0f)
                curveToRelative(379.4f, -378.0f, 15.7f, -16.7f, 241.5f, -241.7f)
                curveToRelative(8.0f, -7.9f, 8.0f, -20.7f, 0.0f, -28.6f)
                close()
                moveTo(248.5f, 331.7f)
                lineToRelative(-76.0f, -75.7f)
                lineToRelative(76.0f, -75.7f)
                lineToRelative(76.0f, 75.7f)
                lineToRelative(-76.0f, 75.7f)
                close()
            }
        }
        .build()
        return _jira!!
    }

private var _jira: ImageVector? = null
