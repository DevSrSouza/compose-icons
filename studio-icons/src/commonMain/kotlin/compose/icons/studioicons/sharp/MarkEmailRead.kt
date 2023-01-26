package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.MarkEmailRead: ImageVector
    get() {
        if (_markEmailRead != null) {
            return _markEmailRead!!
        }
        _markEmailRead = Builder(name = "MarkEmailRead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveToRelative(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f)
                curveToRelative(1.08f, 0.0f, 2.09f, 0.25f, 3.0f, 0.68f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(10.08f)
                curveTo(12.03f, 19.67f, 12.0f, 19.34f, 12.0f, 19.0f)
                close()
                moveTo(4.0f, 6.0f)
                lineToRelative(8.0f, 5.0f)
                lineToRelative(8.0f, -5.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-8.0f, 5.0f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(17.34f, 22.0f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineTo(23.0f, 16.34f)
                lineTo(17.34f, 22.0f)
                close()
            }
        }
        .build()
        return _markEmailRead!!
    }

private var _markEmailRead: ImageVector? = null
