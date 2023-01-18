package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) {
            return _thermometerCold!!
        }
        _thermometerCold = Builder(name = "ThermometerCold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.9f, 77.7f)
                lineToRelative(-20.0f, 6.5f)
                lineToRelative(12.4f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.8f, 11.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.2f, -1.8f)
                lineTo(212.0f, 93.6f)
                lineToRelative(-12.3f, 17.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.2f, 1.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.8f, -11.2f)
                lineToRelative(12.4f, -17.0f)
                lineToRelative(-20.0f, -6.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 174.0f, 67.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 10.0f, -5.1f)
                lineTo(204.0f, 69.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(69.0f)
                lineToRelative(20.0f, -6.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 10.0f, 5.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 244.9f, 77.7f)
                close()
                moveTo(180.0f, 188.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -120.0f, 0.0f)
                arcToRelative(59.4f, 59.4f, 0.0f, false, true, 20.0f, -44.7f)
                verticalLineTo(48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                verticalLineToRelative(95.3f)
                arcTo(59.4f, 59.4f, 0.0f, false, true, 180.0f, 188.0f)
                close()
                moveTo(96.0f, 48.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
