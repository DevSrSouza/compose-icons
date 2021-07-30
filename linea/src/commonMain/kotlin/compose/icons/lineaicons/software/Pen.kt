package compose.icons.lineaicons.software

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
import compose.icons.lineaicons.SoftwareGroup

public val SoftwareGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp, viewportWidth
                = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 57.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 47.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-26.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(41.0f, 47.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(7.0f, -13.0f)
                lineToRelative(-16.0f, -29.0f)
                lineToRelative(-16.0f, 29.0f)
                lineToRelative(7.0f, 13.0f)
                lineToRelative(0.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 28.875f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 1.0f)
                lineTo(32.0f, 25.0f)
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
