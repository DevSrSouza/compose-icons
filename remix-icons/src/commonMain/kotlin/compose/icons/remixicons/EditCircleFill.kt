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

public val RemixIcons.EditCircleFill: ImageVector
    get() {
        if (_editCircleFill != null) {
            return _editCircleFill!!
        }
        _editCircleFill = Builder(name = "EditCircleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.626f, 3.132f)
                lineTo(9.29f, 10.466f)
                lineToRelative(0.008f, 4.247f)
                lineToRelative(4.238f, -0.007f)
                lineToRelative(7.331f, -7.332f)
                arcTo(9.957f, 9.957f, 0.0f, false, true, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                curveToRelative(1.669f, 0.0f, 3.242f, 0.409f, 4.626f, 1.132f)
                close()
                moveTo(20.486f, 2.101f)
                lineToRelative(1.413f, 1.414f)
                lineToRelative(-9.192f, 9.192f)
                lineToRelative(-1.412f, 0.003f)
                lineToRelative(-0.002f, -1.417f)
                lineTo(20.485f, 2.1f)
                close()
            }
        }
        .build()
        return _editCircleFill!!
    }

private var _editCircleFill: ImageVector? = null
