package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(name = "PieChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineToRelative(20.0f)
                curveToRelative(-5.07f, -0.5f, -9.0f, -4.79f, -9.0f, -10.0f)
                reflectiveCurveToRelative(3.93f, -9.5f, 9.0f, -10.0f)
                close()
                moveTo(13.03f, 2.0f)
                verticalLineToRelative(8.99f)
                lineTo(22.0f, 10.99f)
                curveToRelative(-0.47f, -4.74f, -4.24f, -8.52f, -8.97f, -8.99f)
                close()
                moveTo(13.03f, 13.01f)
                lineTo(13.03f, 22.0f)
                curveToRelative(4.74f, -0.47f, 8.5f, -4.25f, 8.97f, -8.99f)
                horizontalLineToRelative(-8.97f)
                close()
            }
        }
        .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
