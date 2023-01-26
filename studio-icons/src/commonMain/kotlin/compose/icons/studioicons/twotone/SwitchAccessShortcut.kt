package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SwitchAccessShortcut: ImageVector
    get() {
        if (_switchAccessShortcut != null) {
            return _switchAccessShortcut!!
        }
        _switchAccessShortcut = Builder(name = "SwitchAccessShortcut", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.06f, 8.94f)
                lineTo(5.0f, 8.0f)
                lineToRelative(2.06f, -0.94f)
                lineTo(8.0f, 5.0f)
                lineToRelative(0.94f, 2.06f)
                lineTo(11.0f, 8.0f)
                lineTo(8.94f, 8.94f)
                lineTo(8.0f, 11.0f)
                lineTo(7.06f, 8.94f)
                close()
                moveTo(8.0f, 21.0f)
                lineToRelative(0.94f, -2.06f)
                lineTo(11.0f, 18.0f)
                lineToRelative(-2.06f, -0.94f)
                lineTo(8.0f, 15.0f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(5.0f, 18.0f)
                lineToRelative(2.06f, 0.94f)
                lineTo(8.0f, 21.0f)
                close()
                moveTo(4.37f, 12.37f)
                lineTo(3.0f, 13.0f)
                lineToRelative(1.37f, 0.63f)
                lineTo(5.0f, 15.0f)
                lineToRelative(0.63f, -1.37f)
                lineTo(7.0f, 13.0f)
                lineToRelative(-1.37f, -0.63f)
                lineTo(5.0f, 11.0f)
                lineTo(4.37f, 12.37f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(0.0f, -2.73f, 1.08f, -5.27f, 2.75f, -7.25f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-2.82f, -2.82f)
                curveTo(14.84f, 7.82f, 14.0f, 9.88f, 14.0f, 12.0f)
                curveToRelative(0.0f, 3.32f, 2.1f, 6.36f, 5.0f, 7.82f)
                lineTo(19.0f, 22.0f)
                curveTo(14.91f, 20.41f, 12.0f, 16.35f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _switchAccessShortcut!!
    }

private var _switchAccessShortcut: ImageVector? = null
