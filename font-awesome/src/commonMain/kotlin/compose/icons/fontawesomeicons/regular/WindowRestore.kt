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

public val RegularGroup.WindowRestore: ImageVector
    get() {
        if (_windowRestore != null) {
            return _windowRestore!!
        }
        _windowRestore = Builder(name = "WindowRestore", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 0.0f)
                lineTo(144.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(48.0f)
                lineTo(48.0f, 96.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(512.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(368.0f, 464.0f)
                lineTo(48.0f, 464.0f)
                lineTo(48.0f, 256.0f)
                horizontalLineToRelative(320.0f)
                verticalLineToRelative(208.0f)
                close()
                moveTo(464.0f, 368.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(416.0f, 144.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(144.0f, 96.0f)
                lineTo(144.0f, 48.0f)
                horizontalLineToRelative(320.0f)
                verticalLineToRelative(320.0f)
                close()
            }
        }
        .build()
        return _windowRestore!!
    }

private var _windowRestore: ImageVector? = null
