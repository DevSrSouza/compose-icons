package compose.icons.lineaicons.music

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.MusicGroup

public val MusicGroup.Recordplayer: ImageVector
    get() {
        if (_recordplayer != null) {
            return _recordplayer!!
        }
        _recordplayer = Builder(name = "Recordplayer", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 1.0f)
                horizontalLineToRelative(62.0f)
                verticalLineToRelative(62.0f)
                horizontalLineToRelative(-62.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(53.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.5f, 27.5f)
                moveToRelative(-22.5f, 0.0f)
                arcToRelative(22.5f, 22.5f, 0.0f, true, true, 45.0f, 0.0f)
                arcToRelative(22.5f, 22.5f, 0.0f, true, true, -45.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.5f, 27.5f)
                moveToRelative(-6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(57.0f, 15.0f)
                lineTo(57.0f, 48.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(57.0f, 49.0f)
                lineToRelative(-6.0f, 3.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(6.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 56.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 56.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _recordplayer!!
    }

private var _recordplayer: ImageVector? = null
