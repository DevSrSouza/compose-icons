package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.AllOut: ImageVector
    get() {
        if (_allOut != null) {
            return _allOut!!
        }
        _allOut = Builder(name = "AllOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.21f, 4.16f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(20.21f, 16.16f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(8.21f, 20.16f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(4.21f, 8.16f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(17.16f, 7.21f)
                curveToRelative(-2.73f, -2.73f, -7.17f, -2.73f, -9.9f, 0.0f)
                reflectiveCurveToRelative(-2.73f, 7.17f, 0.0f, 9.9f)
                reflectiveCurveToRelative(7.17f, 2.73f, 9.9f, 0.0f)
                reflectiveCurveToRelative(2.73f, -7.16f, 0.0f, -9.9f)
                close()
                moveTo(16.06f, 16.01f)
                curveToRelative(-2.13f, 2.13f, -5.57f, 2.13f, -7.7f, 0.0f)
                reflectiveCurveToRelative(-2.13f, -5.57f, 0.0f, -7.7f)
                reflectiveCurveToRelative(5.57f, -2.13f, 7.7f, 0.0f)
                reflectiveCurveToRelative(2.13f, 5.57f, 0.0f, 7.7f)
                close()
            }
        }
        .build()
        return _allOut!!
    }

private var _allOut: ImageVector? = null
