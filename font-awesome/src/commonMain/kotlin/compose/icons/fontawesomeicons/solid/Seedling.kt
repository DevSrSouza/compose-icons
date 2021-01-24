package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Seedling: ImageVector
    get() {
        if (_seedling != null) {
            return _seedling!!
        }
        _seedling = Builder(name = "Seedling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 96.0f)
                lineTo(0.0f, 96.0f)
                curveToRelative(0.0f, 123.7f, 100.3f, 224.0f, 224.0f, 224.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(288.0f, 320.0f)
                curveTo(288.0f, 196.3f, 187.7f, 96.0f, 64.0f, 96.0f)
                close()
                moveTo(448.0f, 32.0f)
                curveToRelative(-84.2f, 0.0f, -157.4f, 46.5f, -195.7f, 115.2f)
                curveToRelative(27.7f, 30.2f, 48.2f, 66.9f, 59.0f, 107.6f)
                curveTo(424.0f, 243.1f, 512.0f, 147.9f, 512.0f, 32.0f)
                horizontalLineToRelative(-64.0f)
                close()
            }
        }
        .build()
        return _seedling!!
    }

private var _seedling: ImageVector? = null
