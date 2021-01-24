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

public val SolidGroup.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.2f, 64.0f)
                lineTo(47.8f, 64.0f)
                curveTo(21.4f, 64.0f, 0.0f, 85.4f, 0.0f, 111.8f)
                verticalLineToRelative(288.4f)
                curveTo(0.0f, 426.6f, 21.4f, 448.0f, 47.8f, 448.0f)
                horizontalLineToRelative(288.4f)
                curveToRelative(26.4f, 0.0f, 47.8f, -21.4f, 47.8f, -47.8f)
                lineTo(384.0f, 111.8f)
                curveToRelative(0.0f, -26.4f, -21.4f, -47.8f, -47.8f, -47.8f)
                close()
                moveTo(525.6f, 101.7f)
                lineTo(416.0f, 177.3f)
                verticalLineToRelative(157.4f)
                lineToRelative(109.6f, 75.5f)
                curveToRelative(21.2f, 14.6f, 50.4f, -0.3f, 50.4f, -25.8f)
                lineTo(576.0f, 127.5f)
                curveToRelative(0.0f, -25.4f, -29.1f, -40.4f, -50.4f, -25.8f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
