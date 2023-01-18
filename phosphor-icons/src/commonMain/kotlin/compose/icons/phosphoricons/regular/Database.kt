package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                curveTo(74.2f, 24.0f, 32.0f, 48.6f, 32.0f, 80.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 31.4f, 42.2f, 56.0f, 96.0f, 56.0f)
                reflectiveCurveToRelative(96.0f, -24.6f, 96.0f, -56.0f)
                lineTo(224.0f, 80.0f)
                curveTo(224.0f, 48.6f, 181.8f, 24.0f, 128.0f, 24.0f)
                close()
                moveTo(208.0f, 128.0f)
                curveToRelative(0.0f, 9.6f, -7.9f, 19.4f, -21.6f, 26.9f)
                curveTo(170.9f, 163.4f, 150.2f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(-42.9f, -4.6f, -58.4f, -13.1f)
                curveTo(55.9f, 147.4f, 48.0f, 137.6f, 48.0f, 128.0f)
                lineTo(48.0f, 111.4f)
                curveTo(65.1f, 126.3f, 94.2f, 136.0f, 128.0f, 136.0f)
                reflectiveCurveToRelative(62.9f, -9.7f, 80.0f, -24.6f)
                close()
                moveTo(69.6f, 53.1f)
                curveTo(85.1f, 44.6f, 105.8f, 40.0f, 128.0f, 40.0f)
                reflectiveCurveToRelative(42.9f, 4.6f, 58.4f, 13.1f)
                curveTo(200.1f, 60.6f, 208.0f, 70.4f, 208.0f, 80.0f)
                reflectiveCurveToRelative(-7.9f, 19.4f, -21.6f, 26.9f)
                curveTo(170.9f, 115.4f, 150.2f, 120.0f, 128.0f, 120.0f)
                reflectiveCurveToRelative(-42.9f, -4.6f, -58.4f, -13.1f)
                curveTo(55.9f, 99.4f, 48.0f, 89.6f, 48.0f, 80.0f)
                reflectiveCurveTo(55.9f, 60.6f, 69.6f, 53.1f)
                close()
                moveTo(186.4f, 202.9f)
                curveTo(170.9f, 211.4f, 150.2f, 216.0f, 128.0f, 216.0f)
                reflectiveCurveToRelative(-42.9f, -4.6f, -58.4f, -13.1f)
                curveTo(55.9f, 195.4f, 48.0f, 185.6f, 48.0f, 176.0f)
                lineTo(48.0f, 159.4f)
                curveTo(65.1f, 174.3f, 94.2f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(62.9f, -9.7f, 80.0f, -24.6f)
                lineTo(208.0f, 176.0f)
                curveTo(208.0f, 185.6f, 200.1f, 195.4f, 186.4f, 202.9f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
