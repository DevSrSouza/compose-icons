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

public val SoftwareGroup.FontSmallcaps: ImageVector
    get() {
        if (_fontSmallcaps != null) {
            return _fontSmallcaps!!
        }
        _fontSmallcaps = Builder(name = "FontSmallcaps", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(38.0f, 51.0f)
                lineToRelative(-15.0f, -42.0f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(-15.0f, 42.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 37.0f)
                lineTo(12.0f, 37.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(44.0f, 34.0f)
                curveToRelative(0.0f, 0.0f, 1.5f, -2.0f, 5.5f, -2.0f)
                reflectiveCurveToRelative(5.5f, 3.0f, 5.5f, 5.0f)
                reflectiveCurveToRelative(0.0f, 10.0f, 0.0f, 10.0f)
                reflectiveCurveToRelative(0.0f, 3.0f, 2.5f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(55.0f, 40.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.0f, 0.0f, -7.0f, 0.0f, -7.0f, 5.0f)
                reflectiveCurveToRelative(4.0f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(7.0f, 0.0f, 7.0f, -7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 1.0f)
                horizontalLineToRelative(62.0f)
                verticalLineToRelative(62.0f)
                horizontalLineToRelative(-62.0f)
                close()
            }
        }
        .build()
        return _fontSmallcaps!!
    }

private var _fontSmallcaps: ImageVector? = null
