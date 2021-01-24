package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 73.143f)
                verticalLineToRelative(45.714f)
                curveTo(448.0f, 159.143f, 347.667f, 192.0f, 224.0f, 192.0f)
                reflectiveCurveTo(0.0f, 159.143f, 0.0f, 118.857f)
                lineTo(0.0f, 73.143f)
                curveTo(0.0f, 32.857f, 100.333f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveToRelative(224.0f, 32.857f, 224.0f, 73.143f)
                close()
                moveTo(448.0f, 176.0f)
                verticalLineToRelative(102.857f)
                curveTo(448.0f, 319.143f, 347.667f, 352.0f, 224.0f, 352.0f)
                reflectiveCurveTo(0.0f, 319.143f, 0.0f, 278.857f)
                lineTo(0.0f, 176.0f)
                curveToRelative(48.125f, 33.143f, 136.208f, 48.572f, 224.0f, 48.572f)
                reflectiveCurveTo(399.874f, 209.143f, 448.0f, 176.0f)
                close()
                moveTo(448.0f, 336.0f)
                verticalLineToRelative(102.857f)
                curveTo(448.0f, 479.143f, 347.667f, 512.0f, 224.0f, 512.0f)
                reflectiveCurveTo(0.0f, 479.143f, 0.0f, 438.857f)
                lineTo(0.0f, 336.0f)
                curveToRelative(48.125f, 33.143f, 136.208f, 48.572f, 224.0f, 48.572f)
                reflectiveCurveTo(399.874f, 369.143f, 448.0f, 336.0f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
