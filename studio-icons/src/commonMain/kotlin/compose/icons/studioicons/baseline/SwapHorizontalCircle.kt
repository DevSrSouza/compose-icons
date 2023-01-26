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

public val BaselineGroup.SwapHorizontalCircle: ImageVector
    get() {
        if (_swapHorizontalCircle != null) {
            return _swapHorizontalCircle!!
        }
        _swapHorizontalCircle = Builder(name = "SwapHorizontalCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                close()
                moveTo(15.0f, 6.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
                lineTo(15.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(15.0f, 6.5f)
                close()
                moveTo(9.0f, 17.5f)
                lineTo(5.5f, 14.0f)
                lineTo(9.0f, 10.5f)
                lineTo(9.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _swapHorizontalCircle!!
    }

private var _swapHorizontalCircle: ImageVector? = null
