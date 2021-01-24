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

public val SolidGroup.StickyNote: ImageVector
    get() {
        if (_stickyNote != null) {
            return _stickyNote!!
        }
        _stickyNote = Builder(name = "StickyNote", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 320.0f)
                horizontalLineToRelative(136.0f)
                lineTo(448.0f, 56.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(24.0f, 32.0f)
                curveTo(10.7f, 32.0f, 0.0f, 42.7f, 0.0f, 56.0f)
                verticalLineToRelative(400.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(264.0f)
                lineTo(288.0f, 344.0f)
                curveToRelative(0.0f, -13.2f, 10.8f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(441.0f, 375.0f)
                lineToRelative(-98.0f, 98.0f)
                curveToRelative(-4.5f, 4.5f, -10.6f, 7.0f, -17.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(320.0f, 352.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(6.1f)
                curveToRelative(0.0f, 6.3f, -2.5f, 12.4f, -7.0f, 16.9f)
                close()
            }
        }
        .build()
        return _stickyNote!!
    }

private var _stickyNote: ImageVector? = null
