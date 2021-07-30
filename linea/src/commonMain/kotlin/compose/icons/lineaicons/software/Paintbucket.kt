package compose.icons.lineaicons.software

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.SoftwareGroup

public val SoftwareGroup.Paintbucket: ImageVector
    get() {
        if (_paintbucket != null) {
            return _paintbucket!!
        }
        _paintbucket = Builder(name = "Paintbucket", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 38.0f)
                lineToRelative(25.0f, 25.0f)
                lineToRelative(26.0f, -26.0f)
                lineToRelative(7.0f, -1.0f)
                lineToRelative(-28.0f, -28.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 27.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -2.762f, -2.238f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.238f, -5.0f, 5.0f)
                verticalLineToRelative(13.0f)
            }
        }
        .build()
        return _paintbucket!!
    }

private var _paintbucket: ImageVector? = null
