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

public val RegularGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 128.0f)
                lineTo(272.0f, 128.0f)
                lineToRelative(-54.63f, -54.63f)
                curveToRelative(-6.0f, -6.0f, -14.14f, -9.37f, -22.63f, -9.37f)
                lineTo(48.0f, 64.0f)
                curveTo(21.49f, 64.0f, 0.0f, 85.49f, 0.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(512.0f, 176.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(464.0f, 400.0f)
                lineTo(48.0f, 400.0f)
                lineTo(48.0f, 112.0f)
                horizontalLineToRelative(140.12f)
                lineToRelative(54.63f, 54.63f)
                curveToRelative(6.0f, 6.0f, 14.14f, 9.37f, 22.63f, 9.37f)
                lineTo(464.0f, 176.0f)
                verticalLineToRelative(224.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
