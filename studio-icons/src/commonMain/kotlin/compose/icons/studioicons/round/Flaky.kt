package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Flaky: ImageVector
    get() {
        if (_flaky != null) {
            return _flaky!!
        }
        _flaky = Builder(name = "Flaky", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.16f, 15.72f)
                curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f)
                lineToRelative(0.82f, 0.82f)
                lineToRelative(1.96f, -1.96f)
                curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-2.65f, 2.65f)
                curveToRelative(-0.19f, 0.19f, -0.51f, 0.2f, -0.7f, 0.0f)
                lineTo(12.16f, 15.72f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.87f, 6.81f)
                lineToRelative(0.88f, 0.88f)
                lineToRelative(0.88f, -0.88f)
                curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f)
                lineTo(9.81f, 8.75f)
                lineToRelative(0.88f, 0.88f)
                curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f)
                lineTo(8.75f, 9.81f)
                lineToRelative(-0.88f, 0.88f)
                curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f)
                lineToRelative(0.88f, -0.88f)
                lineTo(6.81f, 7.87f)
                curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f)
                lineToRelative(0.0f, 0.0f)
                curveTo(7.1f, 6.51f, 7.57f, 6.51f, 7.87f, 6.81f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-2.2f, 0.0f, -4.2f, -0.9f, -5.7f, -2.3f)
                lineTo(17.7f, 6.3f)
                curveTo(19.1f, 7.8f, 20.0f, 9.8f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4f, 16.4f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _flaky!!
    }

private var _flaky: ImageVector? = null
