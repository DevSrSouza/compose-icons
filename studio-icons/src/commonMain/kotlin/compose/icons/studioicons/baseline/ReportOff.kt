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

public val BaselineGroup.ReportOff: ImageVector
    get() {
        if (_reportOff != null) {
            return _reportOff!!
        }
        _reportOff = Builder(name = "ReportOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.92f)
                lineToRelative(6.91f, 6.91f)
                lineToRelative(1.09f, -1.1f)
                lineTo(21.0f, 8.27f)
                lineTo(15.73f, 3.0f)
                lineTo(8.27f, 3.0f)
                lineTo(7.18f, 4.1f)
                lineTo(11.0f, 7.92f)
                close()
                moveTo(22.27f, 21.73f)
                lineToRelative(-20.0f, -20.01f)
                lineTo(1.0f, 2.99f)
                lineToRelative(3.64f, 3.64f)
                lineTo(3.0f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21.0f)
                horizontalLineToRelative(7.46f)
                lineToRelative(1.64f, -1.63f)
                lineTo(21.0f, 23.0f)
                lineToRelative(1.27f, -1.27f)
                close()
                moveTo(12.0f, 17.3f)
                curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f)
                reflectiveCurveToRelative(0.58f, -1.3f, 1.3f, -1.3f)
                reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f)
                reflectiveCurveToRelative(-0.58f, 1.3f, -1.3f, 1.3f)
                close()
            }
        }
        .build()
        return _reportOff!!
    }

private var _reportOff: ImageVector? = null
