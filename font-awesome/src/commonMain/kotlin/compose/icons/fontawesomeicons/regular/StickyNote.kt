package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.StickyNote: ImageVector
    get() {
        if (_stickyNote != null) {
            return _stickyNote!!
        }
        _stickyNote = Builder(name = "StickyNote", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 348.11f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(351.99f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(268.12f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 33.94f, -14.06f)
                lineToRelative(83.88f, -83.88f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 448.0f, 348.11f)
                close()
                moveTo(320.0f, 428.11f)
                verticalLineToRelative(-76.12f)
                horizontalLineToRelative(76.12f)
                lineTo(320.0f, 428.11f)
                close()
                moveTo(400.0f, 80.0f)
                verticalLineToRelative(223.99f)
                lineTo(296.0f, 303.99f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(104.0f)
                lineTo(48.0f, 431.99f)
                lineTo(48.0f, 80.0f)
                horizontalLineToRelative(352.0f)
                close()
            }
        }
        .build()
        return _stickyNote!!
    }

private var _stickyNote: ImageVector? = null
