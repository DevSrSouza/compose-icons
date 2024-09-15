package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(448.0f, 73.14f)
                verticalLineToRelative(45.71f)
                curveTo(448.0f, 159.14f, 347.67f, 192.0f, 224.0f, 192.0f)
                reflectiveCurveTo(0.0f, 159.14f, 0.0f, 118.86f)
                lineTo(0.0f, 73.14f)
                curveTo(0.0f, 32.86f, 100.33f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveToRelative(224.0f, 32.86f, 224.0f, 73.14f)
                close()
                moveTo(448.0f, 176.0f)
                verticalLineToRelative(102.86f)
                curveTo(448.0f, 319.14f, 347.67f, 352.0f, 224.0f, 352.0f)
                reflectiveCurveTo(0.0f, 319.14f, 0.0f, 278.86f)
                lineTo(0.0f, 176.0f)
                curveToRelative(48.13f, 33.14f, 136.21f, 48.57f, 224.0f, 48.57f)
                reflectiveCurveTo(399.87f, 209.14f, 448.0f, 176.0f)
                close()
                moveTo(448.0f, 336.0f)
                verticalLineToRelative(102.86f)
                curveTo(448.0f, 479.14f, 347.67f, 512.0f, 224.0f, 512.0f)
                reflectiveCurveTo(0.0f, 479.14f, 0.0f, 438.86f)
                lineTo(0.0f, 336.0f)
                curveToRelative(48.13f, 33.14f, 136.21f, 48.57f, 224.0f, 48.57f)
                reflectiveCurveTo(399.87f, 369.14f, 448.0f, 336.0f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
