package compose.icons.lineaicons.music

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
import compose.icons.lineaicons.MusicGroup

public val MusicGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 55.0f)
                horizontalLineToRelative(25.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-7.0f, -7.0f)
                verticalLineTo(25.0f)
                curveToRelative(0.0f, -9.941f, -8.059f, -18.0f, -18.0f, -18.0f)
                reflectiveCurveToRelative(-18.0f, 8.059f, -18.0f, 18.0f)
                verticalLineToRelative(19.0f)
                lineToRelative(-7.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(32.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 41.0f)
                lineTo(50.0f, 41.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 35.0f)
                lineTo(50.0f, 35.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(39.0f, 55.0f)
                curveToRelative(0.0f, 4.418f, -3.582f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.582f, -8.0f, -8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(28.0f, 7.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
