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

public val BaselineGroup.PhoneEnabled: ImageVector
    get() {
        if (_phoneEnabled != null) {
            return _phoneEnabled!!
        }
        _phoneEnabled = Builder(name = "PhoneEnabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.38f, 10.79f)
                lineToRelative(-2.2f, -2.2f)
                curveToRelative(-0.28f, -0.28f, -0.36f, -0.67f, -0.25f, -1.02f)
                curveToRelative(0.37f, -1.12f, 0.57f, -2.32f, 0.57f, -3.57f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(20.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 9.39f, -7.61f, 17.0f, -17.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.49f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(1.24f, 0.0f, 2.45f, -0.2f, 3.57f, -0.57f)
                curveToRelative(0.35f, -0.12f, 0.75f, -0.03f, 1.02f, 0.24f)
                lineToRelative(2.2f, 2.2f)
                curveToRelative(2.83f, -1.45f, 5.15f, -3.76f, 6.59f, -6.59f)
                close()
            }
        }
        .build()
        return _phoneEnabled!!
    }

private var _phoneEnabled: ImageVector? = null
