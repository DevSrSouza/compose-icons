package compose.icons.lineaicons.basic

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
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(36.0f, 34.0f)
                lineTo(41.0f, 39.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.0008f, 54.9997f)
                lineToRelative(-5.9997f, 5.9997f)
                lineToRelative(-18.9998f, -18.9998f)
                lineToRelative(5.9997f, -5.9997f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(-10.0f, -6.0f)
                lineToRelative(-2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(28.0f, 26.0f)
                lineTo(15.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(58.0f, 12.5f)
                lineToRelative(-8.0f, 3.75f)
                lineToRelative(-4.0f, -4.125f)
                lineToRelative(3.5f, -8.062f)
                lineToRelative(0.0f, 0.0f)
                curveTo(39.5f, 4.062f, 37.0f, 9.0f, 37.0f, 14.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.5f, 52.0f)
                lineToRelative(-1.75f, 6.0f)
                lineToRelative(2.125f, 2.0f)
                lineToRelative(6.062f, -1.5f)
                lineTo(44.0f, 25.0f)
                horizontalLineToRelative(4.0f)
                curveTo(53.0f, 25.0f, 58.0f, 22.5f, 58.0f, 12.5f)
                lineTo(58.0f, 12.5f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
