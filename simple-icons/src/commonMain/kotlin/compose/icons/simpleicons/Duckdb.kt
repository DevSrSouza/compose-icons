package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Duckdb: ImageVector
    get() {
        if (_duckdb != null) {
            return _duckdb!!
        }
        _duckdb = Builder(name = "Duckdb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.363f, 0.0f, 0.0f, 5.363f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.363f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.363f, 12.0f, -12.0f)
                reflectiveCurveTo(18.637f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(9.502f, 7.03f)
                arcToRelative(4.974f, 4.974f, 0.0f, false, true, 4.97f, 4.97f)
                arcToRelative(4.974f, 4.974f, 0.0f, false, true, -4.97f, 4.97f)
                arcTo(4.974f, 4.974f, 0.0f, false, true, 4.532f, 12.0f)
                arcToRelative(4.974f, 4.974f, 0.0f, false, true, 4.97f, -4.97f)
                close()
                moveTo(16.065f, 10.213f)
                horizontalLineToRelative(2.351f)
                curveToRelative(0.98f, 0.0f, 1.787f, 0.782f, 1.787f, 1.762f)
                reflectiveCurveToRelative(-0.807f, 1.789f, -1.787f, 1.789f)
                horizontalLineToRelative(-2.351f)
                verticalLineToRelative(-3.551f)
                close()
            }
        }
        .build()
        return _duckdb!!
    }

private var _duckdb: ImageVector? = null
