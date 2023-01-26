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

public val SharpGroup.Plumbing: ImageVector
    get() {
        if (_plumbing != null) {
            return _plumbing!!
        }
        _plumbing = Builder(name = "Plumbing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.16f, 5.64f)
                lineToRelative(3.54f, 3.54f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(2.12f, 2.12f)
                lineTo(16.16f, 5.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.842f, 12.7081f)
                lineToRelative(3.5355f, -3.5355f)
                lineToRelative(2.1213f, 2.1213f)
                lineToRelative(-3.5355f, 3.5355f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.45f, 7.76f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(9.79f, 4.93f)
                lineTo(7.67f, 7.05f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(-8.49f, 8.49f)
                lineToRelative(2.83f, 2.83f)
                lineTo(16.86f, 12.0f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(1.41f, -1.41f)
                lineTo(15.45f, 7.76f)
                close()
            }
        }
        .build()
        return _plumbing!!
    }

private var _plumbing: ImageVector? = null
