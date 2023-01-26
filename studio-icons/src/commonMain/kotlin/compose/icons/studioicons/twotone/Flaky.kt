package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Flaky: ImageVector
    get() {
        if (_flaky != null) {
            return _flaky!!
        }
        _flaky = Builder(name = "Flaky", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.05f, 17.58f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(1.35f, 1.35f)
                lineTo(16.54f, 13.0f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-3.54f, 3.54f)
                lineTo(14.05f, 17.58f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.34f, 6.28f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.06f, 1.06f)
                lineTo(9.81f, 8.75f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(8.75f, 9.81f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(1.41f, -1.41f)
                lineTo(6.28f, 7.34f)
                lineTo(7.34f, 6.28f)
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
