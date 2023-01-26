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

public val SharpGroup.Hevc: ImageVector
    get() {
        if (_hevc != null) {
            return _hevc!!
        }
        _hevc = Builder(name = "Hevc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 11.0f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(0.0f, -2.5f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, 2.5f)
                lineToRelative(1.5f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-1.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 13.5f)
                lineToRelative(-0.75f, -4.5f)
                lineToRelative(-1.5f, 0.0f)
                lineToRelative(1.0f, 6.0f)
                lineToRelative(2.5f, 0.0f)
                lineToRelative(1.0f, -6.0f)
                lineToRelative(-1.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(3.5f, 0.0f)
                lineToRelative(0.0f, -1.5f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -1.5f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -0.5f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -1.5f)
                close()
            }
        }
        .build()
        return _hevc!!
    }

private var _hevc: ImageVector? = null
