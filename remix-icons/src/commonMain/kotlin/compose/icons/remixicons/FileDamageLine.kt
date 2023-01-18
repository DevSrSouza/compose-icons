package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FileDamageLine: ImageVector
    get() {
        if (_fileDamageLine != null) {
            return _fileDamageLine!!
        }
        _fileDamageLine = Builder(name = "FileDamageLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(7.857f)
                lineToRelative(1.5f, 1.393f)
                lineTo(10.0f, 9.5f)
                lineToRelative(3.0f, 5.0f)
                lineToRelative(2.0f, -2.5f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, -0.5f)
                lineToRelative(-2.0f, 2.5f)
                lineToRelative(-3.0f, -4.0f)
                lineToRelative(-3.0f, 3.5f)
                lineToRelative(-2.0f, -1.25f)
                lineTo(5.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 9.0f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineToRelative(12.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.007f, 22.0f)
                lineTo(3.993f, 22.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.455f, 3.449f, 2.0f, 4.002f, 2.0f)
                horizontalLineToRelative(10.995f)
                lineTo(21.0f, 8.0f)
                close()
            }
        }
        .build()
        return _fileDamageLine!!
    }

private var _fileDamageLine: ImageVector? = null
