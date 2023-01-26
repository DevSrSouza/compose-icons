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

public val BaselineGroup.HearingDisabled: ImageVector
    get() {
        if (_hearingDisabled != null) {
            return _hearingDisabled!!
        }
        _hearingDisabled = Builder(name = "HearingDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.03f, 3.2f)
                curveTo(7.15f, 2.44f, 8.51f, 2.0f, 10.0f, 2.0f)
                curveToRelative(3.93f, 0.0f, 7.0f, 3.07f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.26f, -0.38f, 2.65f, -1.07f, 3.9f)
                curveToRelative(-0.02f, 0.04f, -0.05f, 0.08f, -0.08f, 0.13f)
                lineToRelative(-1.48f, -1.48f)
                curveTo(14.77f, 10.69f, 15.0f, 9.8f, 15.0f, 9.0f)
                curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f)
                curveTo(9.08f, 4.0f, 8.24f, 4.26f, 7.5f, 4.67f)
                lineTo(6.03f, 3.2f)
                close()
                moveTo(17.21f, 14.38f)
                lineToRelative(1.43f, 1.43f)
                curveTo(20.11f, 13.93f, 21.0f, 11.57f, 21.0f, 9.0f)
                curveToRelative(0.0f, -3.04f, -1.23f, -5.79f, -3.22f, -7.78f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(17.99f, 4.26f, 19.0f, 6.51f, 19.0f, 9.0f)
                curveTo(19.0f, 11.02f, 18.33f, 12.88f, 17.21f, 14.38f)
                close()
                moveTo(10.0f, 6.5f)
                curveToRelative(-0.21f, 0.0f, -0.4f, 0.03f, -0.59f, 0.08f)
                lineToRelative(3.01f, 3.01f)
                curveTo(12.47f, 9.4f, 12.5f, 9.21f, 12.5f, 9.0f)
                curveTo(12.5f, 7.62f, 11.38f, 6.5f, 10.0f, 6.5f)
                close()
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(2.13f, 2.13f)
                curveTo(3.19f, 7.16f, 3.0f, 8.05f, 3.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.36f, 0.05f, -0.71f, 0.12f, -1.05f)
                lineToRelative(6.61f, 6.61f)
                curveToRelative(-0.88f, 0.68f, -1.78f, 1.41f, -2.27f, 2.9f)
                curveToRelative(-0.5f, 1.5f, -1.0f, 2.01f, -1.71f, 2.38f)
                curveTo(7.56f, 19.94f, 7.29f, 20.0f, 7.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                horizontalLineTo(3.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.57f, 0.0f, 1.13f, -0.12f, 1.64f, -0.35f)
                curveToRelative(1.36f, -0.71f, 2.13f, -1.73f, 2.73f, -3.55f)
                curveToRelative(0.32f, -0.98f, 0.9f, -1.43f, 1.71f, -2.05f)
                curveToRelative(0.03f, -0.02f, 0.05f, -0.04f, 0.08f, -0.06f)
                lineToRelative(6.62f, 6.62f)
                lineTo(21.19f, 21.19f)
                close()
            }
        }
        .build()
        return _hearingDisabled!!
    }

private var _hearingDisabled: ImageVector? = null
