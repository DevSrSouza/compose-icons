package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AllOut: ImageVector
    get() {
        if (_allOut != null) {
            return _allOut!!
        }
        _allOut = Builder(name = "AllOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.5f)
                lineTo(4.0f, 8.0f)
                lineToRelative(4.0f, -4.0f)
                lineTo(4.5f, 4.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
                moveTo(16.0f, 4.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(20.0f, 4.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(16.0f, 4.0f)
                close()
                moveTo(20.0f, 19.5f)
                lineTo(20.0f, 16.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(4.5f, 20.0f)
                lineTo(8.0f, 20.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.13f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.13f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _allOut!!
    }

private var _allOut: ImageVector? = null
