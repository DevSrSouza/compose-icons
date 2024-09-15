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

public val SolidGroup.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(567.94f, 243.91f)
                lineTo(462.25f, 85.37f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 422.31f, 64.0f)
                horizontalLineTo(153.69f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -39.94f, 21.37f)
                lineTo(8.06f, 243.91f)
                arcTo(47.99f, 47.99f, 0.0f, false, false, 0.0f, 270.53f)
                verticalLineTo(400.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineTo(270.53f)
                arcToRelative(47.99f, 47.99f, 0.0f, false, false, -8.06f, -26.63f)
                close()
                moveTo(162.25f, 128.0f)
                horizontalLineToRelative(251.5f)
                lineToRelative(85.33f, 128.0f)
                horizontalLineTo(376.0f)
                lineToRelative(-32.0f, 64.0f)
                horizontalLineTo(232.0f)
                lineToRelative(-32.0f, -64.0f)
                horizontalLineTo(76.92f)
                lineToRelative(85.33f, -128.0f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
