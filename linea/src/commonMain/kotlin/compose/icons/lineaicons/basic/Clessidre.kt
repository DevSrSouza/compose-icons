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

public val BasicGroup.Clessidre: ImageVector
    get() {
        if (_clessidre != null) {
            return _clessidre!!
        }
        _clessidre = Builder(name = "Clessidre", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 1.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-36.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 59.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-36.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 59.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -14.0f)
                reflectiveCurveToRelative(29.0f, -19.0f, 29.0f, -25.0f)
                curveToRelative(0.0f, -2.0f, 0.0f, -15.0f, 0.0f, -15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(47.0f, 59.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -14.0f)
                reflectiveCurveTo(18.0f, 26.0f, 18.0f, 20.0f)
                curveToRelative(0.0f, -2.0f, 0.0f, -15.0f, 0.0f, -15.0f)
            }
        }
        .build()
        return _clessidre!!
    }

private var _clessidre: ImageVector? = null
