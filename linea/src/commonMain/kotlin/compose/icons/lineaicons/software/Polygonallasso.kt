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

public val SoftwareGroup.Polygonallasso: ImageVector
    get() {
        if (_polygonallasso != null) {
            return _polygonallasso!!
        }
        _polygonallasso = Builder(name = "Polygonallasso", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 53.0f)
                arcToRelative(6.0f, 4.0f, 0.0f, true, false, 12.0f, 0.0f)
                arcToRelative(6.0f, 4.0f, 0.0f, true, false, -12.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.0f, 56.0f)
                curveToRelative(0.0f, 0.0f, 2.0f, 1.0f, 2.0f, 4.0f)
                reflectiveCurveToRelative(-2.0f, 3.0f, -2.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 49.0f)
                lineToRelative(-17.0f, -37.0f)
                lineToRelative(35.0f, 6.0f)
                lineToRelative(19.0f, -17.0f)
                lineToRelative(0.0f, 40.0f)
                lineToRelative(-33.0f, 10.0f)
            }
        }
        .build()
        return _polygonallasso!!
    }

private var _polygonallasso: ImageVector? = null
