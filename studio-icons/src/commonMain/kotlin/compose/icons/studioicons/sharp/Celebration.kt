package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Celebration: ImageVector
    get() {
        if (_celebration != null) {
            return _celebration!!
        }
        _celebration = Builder(name = "Celebration", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                lineToRelative(14.0f, -5.0f)
                lineToRelative(-9.0f, -9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.53f, 12.53f)
                lineTo(21.0f, 6.05f)
                lineToRelative(1.48f, 1.48f)
                lineToRelative(1.06f, -1.06f)
                lineTo(21.0f, 3.93f)
                lineToRelative(-7.53f, 7.53f)
                lineTo(14.53f, 12.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.94f, 6.0f)
                lineTo(9.47f, 7.47f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(-2.54f, -2.53f)
                lineTo(9.47f, 4.53f)
                lineTo(10.94f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.97f, 9.97f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(1.06f, 1.06f)
                lineTo(19.0f, 12.06f)
                lineToRelative(2.5f, 2.49f)
                lineToRelative(1.06f, -1.06f)
                lineTo(18.97f, 9.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.97f, 4.97f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(1.06f, 1.06f)
                lineTo(18.07f, 5.0f)
                lineToRelative(-3.53f, -3.53f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(15.97f, 4.97f)
                close()
            }
        }
        .build()
        return _celebration!!
    }

private var _celebration: ImageVector? = null
