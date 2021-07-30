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

public val BasicGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 40.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(22.0f)
                lineToRelative(0.001f, -5.107f)
                curveTo(49.0f, 36.195f, 53.0f, 29.564f, 53.0f, 22.0f)
                curveToRelative(0.0f, -11.598f, -9.402f, -21.0f, -21.0f, -21.0f)
                reflectiveCurveToRelative(-21.0f, 9.402f, -21.0f, 21.0f)
                curveTo(11.0f, 29.565f, 14.998f, 36.304f, 21.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(28.0f, 45.0f)
                lineTo(25.0f, 25.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(36.0f, 45.0f)
                lineTo(39.0f, 25.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.0f, 26.0f)
                lineToRelative(4.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(4.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 45.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 51.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.0f, 57.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-14.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
