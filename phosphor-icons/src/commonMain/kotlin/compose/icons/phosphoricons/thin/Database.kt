package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.1f, 42.5f)
                curveTo(174.9f, 33.2f, 152.2f, 28.0f, 128.0f, 28.0f)
                reflectiveCurveTo(81.1f, 33.2f, 63.9f, 42.5f)
                reflectiveCurveTo(36.0f, 65.6f, 36.0f, 80.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 14.4f, 9.9f, 27.7f, 27.9f, 37.5f)
                reflectiveCurveTo(103.8f, 228.0f, 128.0f, 228.0f)
                reflectiveCurveToRelative(46.9f, -5.2f, 64.1f, -14.5f)
                reflectiveCurveTo(220.0f, 190.4f, 220.0f, 176.0f)
                lineTo(220.0f, 80.0f)
                curveTo(220.0f, 65.6f, 210.1f, 52.3f, 192.1f, 42.5f)
                close()
                moveTo(67.7f, 49.6f)
                curveTo(83.7f, 40.8f, 105.2f, 36.0f, 128.0f, 36.0f)
                reflectiveCurveToRelative(44.3f, 4.8f, 60.3f, 13.6f)
                reflectiveCurveTo(212.0f, 68.7f, 212.0f, 80.0f)
                reflectiveCurveToRelative(-8.4f, 22.1f, -23.7f, 30.4f)
                reflectiveCurveTo(150.8f, 124.0f, 128.0f, 124.0f)
                reflectiveCurveToRelative(-44.3f, -4.8f, -60.3f, -13.6f)
                reflectiveCurveTo(44.0f, 91.3f, 44.0f, 80.0f)
                reflectiveCurveTo(52.4f, 57.9f, 67.7f, 49.6f)
                close()
                moveTo(212.0f, 176.0f)
                curveToRelative(0.0f, 11.3f, -8.4f, 22.1f, -23.7f, 30.4f)
                reflectiveCurveTo(150.8f, 220.0f, 128.0f, 220.0f)
                reflectiveCurveToRelative(-44.3f, -4.8f, -60.3f, -13.6f)
                reflectiveCurveTo(44.0f, 187.3f, 44.0f, 176.0f)
                lineTo(44.0f, 149.5f)
                curveToRelative(4.7f, 5.9f, 11.4f, 11.3f, 19.9f, 16.0f)
                curveTo(81.1f, 174.8f, 103.8f, 180.0f, 128.0f, 180.0f)
                reflectiveCurveToRelative(46.9f, -5.2f, 64.1f, -14.5f)
                curveToRelative(8.5f, -4.7f, 15.2f, -10.1f, 19.9f, -16.0f)
                close()
                moveTo(212.0f, 128.0f)
                curveToRelative(0.0f, 11.3f, -8.4f, 22.1f, -23.7f, 30.4f)
                reflectiveCurveTo(150.8f, 172.0f, 128.0f, 172.0f)
                reflectiveCurveToRelative(-44.3f, -4.8f, -60.3f, -13.6f)
                reflectiveCurveTo(44.0f, 139.3f, 44.0f, 128.0f)
                lineTo(44.0f, 101.5f)
                curveToRelative(4.7f, 5.9f, 11.4f, 11.3f, 19.9f, 16.0f)
                curveTo(81.1f, 126.8f, 103.8f, 132.0f, 128.0f, 132.0f)
                reflectiveCurveToRelative(46.9f, -5.2f, 64.1f, -14.5f)
                curveToRelative(8.5f, -4.7f, 15.2f, -10.1f, 19.9f, -16.0f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
