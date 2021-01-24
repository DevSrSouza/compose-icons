package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 192.0f)
                horizontalLineTo(365.71f)
                lineTo(260.61f, 8.06f)
                arcTo(16.014f, 16.014f, 0.0f, false, false, 246.71f, 0.0f)
                horizontalLineToRelative(-65.5f)
                curveToRelative(-10.63f, 0.0f, -18.3f, 10.17f, -15.38f, 20.39f)
                lineTo(214.86f, 192.0f)
                horizontalLineTo(112.0f)
                lineToRelative(-43.2f, -57.6f)
                curveToRelative(-3.02f, -4.03f, -7.77f, -6.4f, -12.8f, -6.4f)
                horizontalLineTo(16.01f)
                curveTo(5.6f, 128.0f, -2.04f, 137.78f, 0.49f, 147.88f)
                lineTo(32.0f, 256.0f)
                lineTo(0.49f, 364.12f)
                curveTo(-2.04f, 374.22f, 5.6f, 384.0f, 16.01f, 384.0f)
                horizontalLineTo(56.0f)
                curveToRelative(5.04f, 0.0f, 9.78f, -2.37f, 12.8f, -6.4f)
                lineTo(112.0f, 320.0f)
                horizontalLineToRelative(102.86f)
                lineToRelative(-49.03f, 171.6f)
                curveToRelative(-2.92f, 10.22f, 4.75f, 20.4f, 15.38f, 20.4f)
                horizontalLineToRelative(65.5f)
                curveToRelative(5.74f, 0.0f, 11.04f, -3.08f, 13.89f, -8.06f)
                lineTo(365.71f, 320.0f)
                horizontalLineTo(480.0f)
                curveToRelative(35.35f, 0.0f, 96.0f, -28.65f, 96.0f, -64.0f)
                reflectiveCurveToRelative(-60.65f, -64.0f, -96.0f, -64.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
