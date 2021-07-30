package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp, viewportWidth
                = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.051f, 56.0f)
                curveToRelative(0.0f, -13.416f, -4.804f, -25.711f, -12.786f, -35.256f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(50.265f, 20.744f)
                curveTo(40.177f, 8.677f, 25.01f, 1.0f, 8.051f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(51.769f, 56.0f)
                curveToRelative(0.0f, -24.145f, -19.574f, -43.718f, -43.718f, -43.718f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.486f, 56.0f)
                curveToRelative(0.0f, -17.913f, -14.523f, -32.436f, -32.436f, -32.436f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.205f, 56.0f)
                curveToRelative(0.0f, -11.684f, -9.472f, -21.154f, -21.154f, -21.154f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.051f, 56.0f)
                moveToRelative(-7.051f, 0.0f)
                arcToRelative(7.051f, 7.051f, 0.0f, true, true, 14.102f, 0.0f)
                arcToRelative(7.051f, 7.051f, 0.0f, true, true, -14.102f, 0.0f)
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
