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

public val SharpGroup.Traffic: ImageVector
    get() {
        if (_traffic != null) {
            return _traffic!!
        }
        _traffic = Builder(name = "Traffic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 8.86f)
                curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                lineTo(7.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                lineTo(7.0f, 15.0f)
                lineTo(4.0f, 15.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                lineTo(7.0f, 21.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.14f)
                curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.89f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _traffic!!
    }

private var _traffic: ImageVector? = null
