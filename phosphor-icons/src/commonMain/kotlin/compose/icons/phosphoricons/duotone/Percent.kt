package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(180.0f, 180.0f)
                moveToRelative(-28.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 56.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -56.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(76.0f, 76.0f)
                moveToRelative(-28.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 56.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -56.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.7f, 50.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineToRelative(-144.0f, 144.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(144.0f, -144.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 205.7f, 50.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 112.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, true, false, -25.5f, -10.5f)
                arcTo(36.2f, 36.2f, 0.0f, false, false, 76.0f, 112.0f)
                close()
                moveTo(61.9f, 61.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 28.2f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, 28.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, -28.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.5f, 154.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -51.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 51.0f, 0.0f)
                close()
                moveTo(194.1f, 194.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, true, true, -28.2f, -28.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, 28.2f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
