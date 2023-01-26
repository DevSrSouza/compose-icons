package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.DirectionsOff: ImageVector
    get() {
        if (_directionsOff != null) {
            return _directionsOff!!
        }
        _directionsOff = Builder(name = "DirectionsOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.83f, 10.0f)
                horizontalLineToRelative(0.67f)
                verticalLineTo(7.5f)
                lineTo(17.0f, 11.0f)
                lineToRelative(-1.59f, 1.59f)
                lineTo(18.83f, 16.0f)
                lineToRelative(2.59f, -2.59f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-7.99f, -8.0f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineTo(8.0f, 5.17f)
                lineTo(12.83f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(5.17f, 8.0f)
                lineToRelative(-2.59f, 2.59f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(8.01f, 8.0f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineTo(16.0f, 18.83f)
                lineToRelative(3.78f, 3.78f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.05f, 0.02f, -0.09f, 0.03f, -0.14f)
                lineTo(10.0f, 12.83f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _directionsOff!!
    }

private var _directionsOff: ImageVector? = null
