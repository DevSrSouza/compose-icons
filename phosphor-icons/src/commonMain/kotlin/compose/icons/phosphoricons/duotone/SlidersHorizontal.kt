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

public val DuotoneGroup.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) {
            return _slidersHorizontal!!
        }
        _slidersHorizontal = Builder(name = "SlidersHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(104.0f, 84.0f)
                moveToRelative(-20.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 40.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -40.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 164.0f)
                lineTo(194.8f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -53.6f, 0.0f)
                lineTo(40.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(141.2f, 180.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 53.6f, 0.0f)
                lineTo(216.0f, 180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(168.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 184.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 92.0f)
                lineTo(77.2f, 92.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 53.6f, 0.0f)
                lineTo(216.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(130.8f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -53.6f, 0.0f)
                lineTo(40.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(104.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 92.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 72.0f)
                close()
            }
        }
        .build()
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
