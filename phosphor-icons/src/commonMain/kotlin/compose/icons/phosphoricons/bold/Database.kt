package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 35.5f)
                curveTo(177.6f, 25.5f, 153.5f, 20.0f, 128.0f, 20.0f)
                reflectiveCurveTo(78.4f, 25.5f, 60.0f, 35.5f)
                curveTo(39.4f, 46.8f, 28.0f, 62.6f, 28.0f, 80.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.4f, 11.4f, 33.2f, 32.0f, 44.5f)
                curveToRelative(18.4f, 10.0f, 42.5f, 15.5f, 68.0f, 15.5f)
                reflectiveCurveToRelative(49.6f, -5.5f, 68.0f, -15.5f)
                curveToRelative(20.6f, -11.3f, 32.0f, -27.1f, 32.0f, -44.5f)
                lineTo(228.0f, 80.0f)
                curveTo(228.0f, 62.6f, 216.6f, 46.8f, 196.0f, 35.5f)
                close()
                moveTo(204.0f, 128.0f)
                curveToRelative(0.0f, 17.0f, -31.2f, 36.0f, -76.0f, 36.0f)
                reflectiveCurveToRelative(-76.0f, -19.0f, -76.0f, -36.0f)
                verticalLineToRelative(-8.5f)
                arcToRelative(90.3f, 90.3f, 0.0f, false, false, 8.0f, 5.0f)
                curveToRelative(18.4f, 10.0f, 42.5f, 15.5f, 68.0f, 15.5f)
                reflectiveCurveToRelative(49.6f, -5.5f, 68.0f, -15.5f)
                arcToRelative(90.3f, 90.3f, 0.0f, false, false, 8.0f, -5.0f)
                close()
                moveTo(128.0f, 44.0f)
                curveToRelative(44.8f, 0.0f, 76.0f, 19.0f, 76.0f, 36.0f)
                reflectiveCurveToRelative(-31.2f, 36.0f, -76.0f, 36.0f)
                reflectiveCurveTo(52.0f, 97.0f, 52.0f, 80.0f)
                reflectiveCurveTo(83.2f, 44.0f, 128.0f, 44.0f)
                close()
                moveTo(128.0f, 212.0f)
                curveToRelative(-44.8f, 0.0f, -76.0f, -19.0f, -76.0f, -36.0f)
                verticalLineToRelative(-8.5f)
                arcToRelative(90.3f, 90.3f, 0.0f, false, false, 8.0f, 5.0f)
                curveToRelative(18.4f, 10.0f, 42.5f, 15.5f, 68.0f, 15.5f)
                reflectiveCurveToRelative(49.6f, -5.5f, 68.0f, -15.5f)
                arcToRelative(90.3f, 90.3f, 0.0f, false, false, 8.0f, -5.0f)
                lineTo(204.0f, 176.0f)
                curveTo(204.0f, 193.0f, 172.8f, 212.0f, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
