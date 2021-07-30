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

public val SoftwareGroup.Magnete: ImageVector
    get() {
        if (_magnete != null) {
            return _magnete!!
        }
        _magnete = Builder(name = "Magnete", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 42.0f)
                curveToRelative(0.0f, 4.418f, 3.582f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.582f, 8.0f, -8.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(41.0f)
                curveToRelative(0.0f, 11.598f, -9.402f, 21.0f, -21.0f, 21.0f)
                reflectiveCurveToRelative(-21.0f, -9.402f, -21.0f, -21.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(13.0f)
                verticalLineTo(42.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 10.0f)
                lineTo(24.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 10.0f)
                lineTo(53.0f, 10.0f)
            }
        }
        .build()
        return _magnete!!
    }

private var _magnete: ImageVector? = null
