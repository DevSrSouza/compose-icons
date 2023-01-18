package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ZcoolFill: ImageVector
    get() {
        if (_zcoolFill != null) {
            return _zcoolFill!!
        }
        _zcoolFill = Builder(name = "ZcoolFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.902f, 21.839f)
                arcTo(7.903f, 7.903f, 0.0f, false, true, 2.0f, 13.935f)
                curveTo(2.0f, 10.29f, 4.467f, 7.06f, 7.824f, 6.31f)
                curveTo(11.745f, 5.43f, 13.528f, 4.742f, 14.9f, 2.0f)
                curveToRelative(0.998f, 1.935f, 0.323f, 3.71f, 0.0f, 4.677f)
                curveToRelative(4.698f, -1.129f, 6.371f, -3.28f, 6.774f, -3.548f)
                curveToRelative(0.0f, 3.952f, -1.231f, 6.452f, -2.419f, 8.065f)
                curveToRelative(1.476f, -0.056f, 2.009f, -0.484f, 2.744f, -0.587f)
                curveToRelative(-0.325f, 1.448f, -1.5f, 3.49f, -4.33f, 4.795f)
                arcToRelative(7.905f, 7.905f, 0.0f, false, true, -7.768f, 6.437f)
                close()
                moveTo(13.612f, 15.387f)
                curveToRelative(0.0f, 0.323f, -0.053f, 0.484f, -0.403f, 0.484f)
                lineToRelative(-3.15f, 0.002f)
                lineToRelative(2.96f, -3.248f)
                curveToRelative(0.86f, -0.86f, 0.86f, -1.29f, 0.86f, -2.388f)
                curveToRelative(0.0f, -0.334f, -0.048f, -0.717f, 0.048f, -1.05f)
                curveToRelative(0.047f, -0.144f, -0.048f, -0.192f, -0.191f, -0.144f)
                curveToRelative(-0.335f, 0.095f, -0.908f, 0.095f, -1.863f, 0.095f)
                lineTo(7.575f, 9.138f)
                curveToRelative(-0.239f, 0.0f, -0.335f, -0.143f, -0.239f, -0.334f)
                curveToRelative(0.0f, -0.048f, 0.0f, -0.191f, -0.096f, -0.191f)
                curveToRelative(-0.62f, 0.286f, -0.764f, 1.576f, -0.716f, 2.388f)
                curveToRelative(0.0f, 0.43f, 0.239f, 0.669f, 0.573f, 0.669f)
                horizontalLineToRelative(3.391f)
                lineToRelative(-3.486f, 3.725f)
                curveToRelative(-0.24f, 0.287f, -0.478f, 0.669f, -0.478f, 1.194f)
                verticalLineToRelative(1.051f)
                curveToRelative(0.0f, 0.478f, 0.287f, 0.764f, 0.812f, 0.86f)
                horizontalLineToRelative(5.988f)
                curveToRelative(0.555f, 0.0f, 0.933f, -0.233f, 0.933f, -0.855f)
                verticalLineToRelative(-1.129f)
                curveToRelative(0.0f, -0.208f, 0.0f, -0.968f, -0.645f, -1.129f)
                close()
            }
        }
        .build()
        return _zcoolFill!!
    }

private var _zcoolFill: ImageVector? = null
