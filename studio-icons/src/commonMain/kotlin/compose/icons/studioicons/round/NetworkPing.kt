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

public val RoundGroup.NetworkPing: ImageVector
    get() {
        if (_networkPing != null) {
            return _networkPing!!
        }
        _networkPing = Builder(name = "NetworkPing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.71f, 6.79f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(10.5f, 16.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(5.15f, -5.15f)
                curveTo(18.91f, 10.95f, 19.2f, 11.0f, 19.5f, 11.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(20.88f, 6.0f, 19.5f, 6.0f)
                reflectiveCurveTo(17.0f, 7.12f, 17.0f, 8.5f)
                curveToRelative(0.0f, 0.35f, 0.07f, 0.67f, 0.2f, 0.97f)
                lineToRelative(-5.2f, 5.2f)
                lineTo(4.12f, 6.79f)
                curveTo(3.73f, 6.4f, 3.1f, 6.4f, 2.71f, 6.79f)
                close()
            }
        }
        .build()
        return _networkPing!!
    }

private var _networkPing: ImageVector? = null
