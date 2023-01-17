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
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 44.2f, -100.3f, 80.0f, -224.0f, 80.0f)
                reflectiveCurveTo(0.0f, 172.2f, 0.0f, 128.0f)
                verticalLineTo(80.0f)
                curveTo(0.0f, 35.8f, 100.3f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(448.0f, 35.8f, 448.0f, 80.0f)
                close()
                moveTo(393.2f, 214.7f)
                curveToRelative(20.8f, -7.4f, 39.9f, -16.9f, 54.8f, -28.6f)
                verticalLineTo(288.0f)
                curveToRelative(0.0f, 44.2f, -100.3f, 80.0f, -224.0f, 80.0f)
                reflectiveCurveTo(0.0f, 332.2f, 0.0f, 288.0f)
                verticalLineTo(186.1f)
                curveToRelative(14.9f, 11.8f, 34.0f, 21.2f, 54.8f, 28.6f)
                curveTo(99.7f, 230.7f, 159.5f, 240.0f, 224.0f, 240.0f)
                reflectiveCurveToRelative(124.3f, -9.3f, 169.2f, -25.3f)
                close()
                moveTo(0.0f, 346.1f)
                curveToRelative(14.9f, 11.8f, 34.0f, 21.2f, 54.8f, 28.6f)
                curveTo(99.7f, 390.7f, 159.5f, 400.0f, 224.0f, 400.0f)
                reflectiveCurveToRelative(124.3f, -9.3f, 169.2f, -25.3f)
                curveToRelative(20.8f, -7.4f, 39.9f, -16.9f, 54.8f, -28.6f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 44.2f, -100.3f, 80.0f, -224.0f, 80.0f)
                reflectiveCurveTo(0.0f, 476.2f, 0.0f, 432.0f)
                verticalLineTo(346.1f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
