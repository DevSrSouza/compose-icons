package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                curveTo(75.3f, 26.0f, 34.0f, 49.7f, 34.0f, 80.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 30.3f, 41.3f, 54.0f, 94.0f, 54.0f)
                reflectiveCurveToRelative(94.0f, -23.7f, 94.0f, -54.0f)
                lineTo(222.0f, 80.0f)
                curveTo(222.0f, 49.7f, 180.7f, 26.0f, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 38.0f)
                curveToRelative(44.4f, 0.0f, 82.0f, 19.2f, 82.0f, 42.0f)
                reflectiveCurveToRelative(-37.6f, 42.0f, -82.0f, 42.0f)
                reflectiveCurveTo(46.0f, 102.8f, 46.0f, 80.0f)
                reflectiveCurveTo(83.6f, 38.0f, 128.0f, 38.0f)
                close()
                moveTo(210.0f, 176.0f)
                curveToRelative(0.0f, 22.8f, -37.6f, 42.0f, -82.0f, 42.0f)
                reflectiveCurveToRelative(-82.0f, -19.2f, -82.0f, -42.0f)
                lineTo(46.0f, 154.8f)
                curveTo(62.0f, 171.2f, 92.4f, 182.0f, 128.0f, 182.0f)
                reflectiveCurveToRelative(66.0f, -10.8f, 82.0f, -27.2f)
                close()
                moveTo(210.0f, 128.0f)
                curveToRelative(0.0f, 22.8f, -37.6f, 42.0f, -82.0f, 42.0f)
                reflectiveCurveToRelative(-82.0f, -19.2f, -82.0f, -42.0f)
                lineTo(46.0f, 106.8f)
                curveTo(62.0f, 123.2f, 92.4f, 134.0f, 128.0f, 134.0f)
                reflectiveCurveToRelative(66.0f, -10.8f, 82.0f, -27.2f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
