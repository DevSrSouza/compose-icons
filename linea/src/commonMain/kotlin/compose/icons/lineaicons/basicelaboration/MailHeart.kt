package compose.icons.lineaicons.basicelaboration

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
import compose.icons.lineaicons.BasicElaborationGroup

public val BasicElaborationGroup.MailHeart: ImageVector
    get() {
        if (_mailHeart != null) {
            return _mailHeart!!
        }
        _mailHeart = Builder(name = "MailHeart", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 26.0f)
                lineToRelative(31.0f, 19.434f)
                lineToRelative(31.0f, -19.434f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.334f, 21.667f)
                lineToRelative(-10.334f, 4.333f)
                lineToRelative(0.0f, 37.0f)
                lineToRelative(62.0f, 0.0f)
                lineToRelative(0.0f, -37.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-10.334f, -4.333f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 32.0f)
                lineToRelative(0.0f, -31.0f)
                lineToRelative(42.0f, 0.0f)
                lineToRelative(0.0f, 31.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 6.666f, 10.0f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveToRelative(10.0f, -5.334f, 10.0f, -12.0f)
                curveToRelative(0.0f, -2.762f, -2.0f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-2.762f, 0.0f, -5.0f, 2.238f, -5.0f, 5.0f)
                curveToRelative(0.0f, -2.762f, -2.238f, -5.0f, -5.0f, -5.0f)
                curveTo(24.0f, 14.0f, 22.0f, 16.238f, 22.0f, 19.0f)
                close()
            }
        }
        .build()
        return _mailHeart!!
    }

private var _mailHeart: ImageVector? = null
