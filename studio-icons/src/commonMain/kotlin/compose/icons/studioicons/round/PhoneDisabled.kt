package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PhoneDisabled: ImageVector
    get() {
        if (_phoneDisabled != null) {
            return _phoneDisabled!!
        }
        _phoneDisabled = Builder(name = "PhoneDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.54f, 17.37f)
                curveToRelative(-2.63f, 2.08f, -5.89f, 3.39f, -9.45f, 3.61f)
                curveToRelative(-1.13f, 0.07f, -2.07f, -0.87f, -2.07f, -2.0f)
                verticalLineToRelative(-1.73f)
                curveToRelative(-0.01f, -1.01f, 0.75f, -1.86f, 1.76f, -1.98f)
                lineToRelative(2.54f, -0.29f)
                curveToRelative(0.61f, -0.07f, 1.21f, 0.14f, 1.64f, 0.57f)
                lineToRelative(1.84f, 1.84f)
                curveToRelative(0.81f, -0.41f, 1.59f, -0.9f, 2.31f, -1.45f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0.0f)
                lineTo(20.49f, 20.5f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f)
                lineTo(14.54f, 17.37f)
                close()
                moveTo(17.39f, 10.8f)
                lineToRelative(-1.85f, -1.85f)
                curveToRelative(-0.43f, -0.43f, -0.64f, -1.03f, -0.57f, -1.64f)
                lineToRelative(0.29f, -2.52f)
                curveToRelative(0.12f, -1.01f, 0.97f, -1.77f, 1.99f, -1.77f)
                horizontalLineToRelative(1.73f)
                curveToRelative(1.13f, 0.0f, 2.07f, 0.94f, 2.0f, 2.07f)
                curveToRelative(-0.22f, 3.57f, -1.54f, 6.83f, -3.62f, 9.47f)
                lineToRelative(-1.43f, -1.43f)
                curveTo(16.48f, 12.4f, 16.97f, 11.62f, 17.39f, 10.8f)
                close()
            }
        }
        .build()
        return _phoneDisabled!!
    }

private var _phoneDisabled: ImageVector? = null
