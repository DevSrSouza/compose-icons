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

public val SharpGroup.ReportOff: ImageVector
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
                verticalLineToRelative(2.33f)
                lineToRelative(7.2f, 7.2f)
                lineToRelative(0.8f, -0.8f)
                lineTo(21.0f, 8.27f)
                lineTo(15.73f, 3.0f)
                lineTo(8.27f, 3.0f)
                lineToRelative(-0.8f, 0.8f)
                lineTo(11.0f, 7.33f)
                close()
                moveTo(2.41f, 1.58f)
                lineTo(1.0f, 2.99f)
                lineToRelative(3.64f, 3.64f)
                lineTo(3.0f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21.0f)
                horizontalLineToRelative(7.46f)
                lineToRelative(1.64f, -1.64f)
                lineTo(21.01f, 23.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.41f, 1.58f)
                close()
                moveTo(11.0f, 12.99f)
                lineToRelative(0.01f, 0.01f)
                lineTo(11.0f, 13.0f)
                verticalLineToRelative(-0.01f)
                close()
                moveTo(12.0f, 17.3f)
                curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f)
                curveToRelative(0.0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f)
                reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f)
                curveToRelative(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f)
                close()
            }
        }
        .build()
        return _reportOff!!
    }

private var _reportOff: ImageVector? = null
