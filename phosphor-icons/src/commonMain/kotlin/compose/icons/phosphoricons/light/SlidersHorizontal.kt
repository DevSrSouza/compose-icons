package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) {
            return _slidersHorizontal!!
        }
        _slidersHorizontal = Builder(name = "SlidersHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 166.0f)
                lineTo(193.3f, 166.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -50.6f, 0.0f)
                lineTo(40.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(142.7f, 178.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 50.6f, 0.0f)
                lineTo(216.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(168.0f, 186.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 168.0f, 186.0f)
                close()
                moveTo(40.0f, 90.0f)
                lineTo(78.7f, 90.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 50.6f, 0.0f)
                lineTo(216.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(129.3f, 78.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -50.6f, 0.0f)
                lineTo(40.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(104.0f, 70.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 90.0f, 84.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 104.0f, 70.0f)
                close()
            }
        }
        .build()
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
