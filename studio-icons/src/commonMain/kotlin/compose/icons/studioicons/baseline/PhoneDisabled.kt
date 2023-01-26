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

public val BaselineGroup.PhoneDisabled: ImageVector
    get() {
        if (_phoneDisabled != null) {
            return _phoneDisabled!!
        }
        _phoneDisabled = Builder(name = "PhoneDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.34f, 14.54f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(0.56f, -0.73f, 1.05f, -1.5f, 1.47f, -2.32f)
                lineToRelative(-2.2f, -2.2f)
                curveToRelative(-0.28f, -0.28f, -0.36f, -0.67f, -0.25f, -1.02f)
                curveToRelative(0.37f, -1.12f, 0.57f, -2.32f, 0.57f, -3.57f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 3.98f, -1.37f, 7.64f, -3.66f, 10.54f)
                close()
                moveTo(14.52f, 17.35f)
                curveTo(11.63f, 19.64f, 7.97f, 21.0f, 4.0f, 21.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.49f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(1.24f, 0.0f, 2.45f, -0.2f, 3.57f, -0.57f)
                curveToRelative(0.35f, -0.12f, 0.75f, -0.03f, 1.02f, 0.24f)
                lineToRelative(2.2f, 2.2f)
                curveToRelative(0.81f, -0.42f, 1.58f, -0.9f, 2.3f, -1.46f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.42f, -1.41f)
                lineTo(21.19f, 21.2f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-5.26f, -5.26f)
                close()
            }
        }
        .build()
        return _phoneDisabled!!
    }

private var _phoneDisabled: ImageVector? = null
