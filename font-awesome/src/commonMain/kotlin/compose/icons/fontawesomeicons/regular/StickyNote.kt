package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(448.0f, 348.106f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(351.988f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(268.118f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 33.941f, -14.059f)
                lineToRelative(83.882f, -83.882f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 448.0f, 348.106f)
                close()
                moveTo(320.0f, 428.106f)
                verticalLineToRelative(-76.118f)
                horizontalLineToRelative(76.118f)
                lineTo(320.0f, 428.106f)
                close()
                moveTo(400.0f, 80.0f)
                verticalLineToRelative(223.988f)
                lineTo(296.0f, 303.988f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(104.0f)
                lineTo(48.0f, 431.988f)
                lineTo(48.0f, 80.0f)
                horizontalLineToRelative(352.0f)
                close()
            }
        }
        .build()
        return _stickyNote!!
    }

private var _stickyNote: ImageVector? = null
