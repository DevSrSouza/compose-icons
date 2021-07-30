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

public val BasicGroup.PictureMultiple: ImageVector
    get() {
        if (_pictureMultiple != null) {
            return _pictureMultiple!!
        }
        _pictureMultiple = Builder(name = "PictureMultiple", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 16.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-52.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(53.0f, 0.0f)
                lineToRelative(0.0f, 40.0f)
                lineToRelative(-8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 46.0f)
                lineToRelative(14.0f, -14.0f)
                lineToRelative(14.0f, 16.0f)
                lineToRelative(10.0f, -6.0f)
                lineToRelative(14.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 29.0f)
                moveToRelative(-5.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -10.0f, 0.0f)
            }
        }
        .build()
        return _pictureMultiple!!
    }

private var _pictureMultiple: ImageVector? = null
