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

public val BaselineGroup.PrintDisabled: ImageVector
    get() {
        if (_printDisabled != null) {
            return _printDisabled!!
        }
        _printDisabled = Builder(name = "PrintDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1f, 17.0f)
                lineTo(22.0f, 17.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.7f, -1.3f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-9.0f)
                lineToRelative(9.1f, 9.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(18.0f, 7.0f)
                lineTo(18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(1.1f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(1.2f, 1.8f)
                lineTo(0.0f, 3.0f)
                lineToRelative(4.9f, 5.0f)
                curveTo(3.3f, 8.1f, 2.0f, 9.4f, 2.0f, 11.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(11.9f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(-21.0f, -20.9f)
                close()
                moveTo(8.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.9f)
                lineToRelative(5.0f, 5.0f)
                lineTo(8.0f, 19.0f)
                close()
            }
        }
        .build()
        return _printDisabled!!
    }

private var _printDisabled: ImageVector? = null
