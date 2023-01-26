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

public val RoundGroup.ConnectingAirports: ImageVector
    get() {
        if (_connectingAirports != null) {
            return _connectingAirports!!
        }
        _connectingAirports = Builder(name = "ConnectingAirports", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.93f, 10.6f)
                curveToRelative(0.39f, 0.0f, 0.66f, 0.37f, 0.55f, 0.74f)
                lineTo(15.4f, 15.0f)
                horizontalLineToRelative(2.85f)
                lineToRelative(0.59f, -0.78f)
                curveToRelative(0.1f, -0.14f, 0.26f, -0.22f, 0.43f, -0.22f)
                curveToRelative(0.36f, 0.0f, 0.62f, 0.35f, 0.52f, 0.7f)
                lineTo(19.4f, 16.0f)
                lineToRelative(0.39f, 1.3f)
                curveToRelative(0.1f, 0.35f, -0.16f, 0.7f, -0.52f, 0.7f)
                curveToRelative(-0.17f, 0.0f, -0.33f, -0.08f, -0.43f, -0.22f)
                lineTo(18.25f, 17.0f)
                horizontalLineTo(15.4f)
                lineToRelative(1.08f, 3.66f)
                curveToRelative(0.11f, 0.37f, -0.17f, 0.74f, -0.55f, 0.74f)
                curveToRelative(-0.2f, 0.0f, -0.39f, -0.11f, -0.5f, -0.28f)
                lineTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.97f)
                curveToRelative(-0.53f, 0.0f, -1.0f, -0.4f, -1.03f, -0.93f)
                curveTo(8.96f, 15.48f, 9.43f, 15.0f, 10.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(2.43f, -4.12f)
                curveTo(15.54f, 10.71f, 15.73f, 10.6f, 15.93f, 10.6f)
                close()
                moveTo(8.07f, 2.6f)
                curveToRelative(-0.39f, 0.0f, -0.66f, 0.37f, -0.55f, 0.74f)
                lineTo(8.6f, 7.0f)
                horizontalLineTo(5.75f)
                lineTo(5.16f, 6.22f)
                curveTo(5.06f, 6.08f, 4.9f, 6.0f, 4.73f, 6.0f)
                curveTo(4.37f, 6.0f, 4.11f, 6.35f, 4.21f, 6.7f)
                lineTo(4.6f, 8.0f)
                lineTo(4.21f, 9.3f)
                curveTo(4.11f, 9.65f, 4.37f, 10.0f, 4.73f, 10.0f)
                curveToRelative(0.17f, 0.0f, 0.33f, -0.08f, 0.43f, -0.22f)
                lineTo(5.75f, 9.0f)
                horizontalLineTo(8.6f)
                lineToRelative(-1.08f, 3.66f)
                curveToRelative(-0.11f, 0.37f, 0.17f, 0.74f, 0.55f, 0.74f)
                curveToRelative(0.2f, 0.0f, 0.39f, -0.11f, 0.5f, -0.28f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(2.97f)
                curveToRelative(0.53f, 0.0f, 1.0f, -0.4f, 1.03f, -0.93f)
                curveTo(15.04f, 7.48f, 14.57f, 7.0f, 14.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(8.57f, 2.88f)
                curveTo(8.46f, 2.71f, 8.27f, 2.6f, 8.07f, 2.6f)
                close()
            }
        }
        .build()
        return _connectingAirports!!
    }

private var _connectingAirports: ImageVector? = null
