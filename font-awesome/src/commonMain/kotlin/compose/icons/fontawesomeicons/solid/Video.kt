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
                moveTo(0.0f, 128.0f)
                curveTo(0.0f, 92.7f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(320.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(128.0f)
                close()
                moveTo(559.1f, 99.8f)
                curveToRelative(10.4f, 5.6f, 16.9f, 16.4f, 16.9f, 28.2f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, 11.8f, -6.5f, 22.6f, -16.9f, 28.2f)
                reflectiveCurveToRelative(-23.0f, 5.0f, -32.9f, -1.6f)
                lineToRelative(-96.0f, -64.0f)
                lineTo(416.0f, 337.1f)
                verticalLineTo(320.0f)
                verticalLineTo(192.0f)
                verticalLineTo(174.9f)
                lineToRelative(14.2f, -9.5f)
                lineToRelative(96.0f, -64.0f)
                curveToRelative(9.8f, -6.5f, 22.4f, -7.2f, 32.9f, -1.6f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
