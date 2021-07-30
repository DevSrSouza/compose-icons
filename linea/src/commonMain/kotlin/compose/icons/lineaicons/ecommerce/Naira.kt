package compose.icons.lineaicons.ecommerce

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
import compose.icons.lineaicons.EcommerceGroup

public val EcommerceGroup.Naira: ImageVector
    get() {
        if (_naira != null) {
            return _naira!!
        }
        _naira = Builder(name = "Naira", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(53.92f, 10.081f)
                curveToRelative(12.107f, 12.105f, 12.107f, 31.732f, 0.0f, 43.838f)
                curveToRelative(-12.106f, 12.108f, -31.734f, 12.108f, -43.84f, 0.0f)
                curveToRelative(-12.107f, -12.105f, -12.107f, -31.732f, 0.0f, -43.838f)
                curveTo(22.186f, -2.027f, 41.813f, -2.027f, 53.92f, 10.081f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 49.0f)
                lineToRelative(0.0f, -31.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(16.0f, 30.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, -31.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 30.0f)
                lineTo(45.0f, 30.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 36.0f)
                lineTo(45.0f, 36.0f)
            }
        }
        .build()
        return _naira!!
    }

private var _naira: ImageVector? = null
