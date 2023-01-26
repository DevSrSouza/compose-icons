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

public val BaselineGroup.FiberPin: ImageVector
    get() {
        if (_fiberPin != null) {
            return _fiberPin!!
        }
        _fiberPin = Builder(name = "FiberPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(9.0f, 11.5f)
                curveToRelative(0.0f, 0.85f, -0.65f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.85f, 0.0f, 1.5f, 0.65f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.5f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-2.55f, -3.5f)
                lineTo(16.25f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(1.25f)
                lineToRelative(2.5f, 3.5f)
                lineTo(18.75f, 9.0f)
                lineTo(20.0f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _fiberPin!!
    }

private var _fiberPin: ImageVector? = null
