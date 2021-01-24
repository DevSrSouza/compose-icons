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

public val SolidGroup.Tint: ImageVector
    get() {
        if (_tint != null) {
            return _tint!!
        }
        _tint = Builder(name = "Tint", defaultWidth = 352.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 352.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.22f, 22.09f)
                curveToRelative(-7.94f, -28.78f, -49.44f, -30.12f, -58.44f, 0.0f)
                curveTo(100.01f, 179.85f, 0.0f, 222.72f, 0.0f, 333.91f)
                curveTo(0.0f, 432.35f, 78.72f, 512.0f, 176.0f, 512.0f)
                reflectiveCurveToRelative(176.0f, -79.65f, 176.0f, -178.09f)
                curveToRelative(0.0f, -111.75f, -99.79f, -153.34f, -146.78f, -311.82f)
                close()
                moveTo(176.0f, 448.0f)
                curveToRelative(-61.75f, 0.0f, -112.0f, -50.25f, -112.0f, -112.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                curveToRelative(0.0f, 44.11f, 35.89f, 80.0f, 80.0f, 80.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _tint!!
    }

private var _tint: ImageVector? = null
