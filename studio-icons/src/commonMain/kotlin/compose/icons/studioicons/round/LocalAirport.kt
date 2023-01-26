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

public val RoundGroup.LocalAirport: ImageVector
    get() {
        if (_localAirport != null) {
            return _localAirport!!
        }
        _localAirport = Builder(name = "LocalAirport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.48f, 13.7f)
                lineTo(13.5f, 9.0f)
                verticalLineTo(3.5f)
                curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(9.0f)
                lineToRelative(-7.98f, 4.7f)
                curveTo(2.2f, 13.88f, 2.0f, 14.23f, 2.0f, 14.6f)
                curveToRelative(0.0f, 0.7f, 0.67f, 1.2f, 1.34f, 1.01f)
                lineToRelative(7.16f, -2.1f)
                verticalLineTo(19.0f)
                lineToRelative(-2.26f, 1.35f)
                curveTo(8.09f, 20.44f, 8.0f, 20.61f, 8.0f, 20.78f)
                lineToRelative(0.0f, 0.5f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.08f)
                curveToRelative(0.0f, 0.33f, 0.31f, 0.57f, 0.62f, 0.49f)
                lineToRelative(2.92f, -0.73f)
                lineTo(12.0f, 21.0f)
                lineToRelative(0.38f, 0.09f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(0.42f, 0.11f)
                lineToRelative(1.9f, 0.48f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.67f, 0.17f)
                curveToRelative(0.32f, 0.08f, 0.62f, -0.16f, 0.62f, -0.49f)
                verticalLineToRelative(-0.37f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(-0.21f)
                curveToRelative(0.0f, -0.18f, -0.09f, -0.34f, -0.24f, -0.43f)
                lineTo(13.5f, 19.0f)
                verticalLineToRelative(-5.5f)
                lineToRelative(7.16f, 2.1f)
                curveTo(21.33f, 15.8f, 22.0f, 15.3f, 22.0f, 14.6f)
                curveTo(22.0f, 14.23f, 21.8f, 13.88f, 21.48f, 13.7f)
                close()
            }
        }
        .build()
        return _localAirport!!
    }

private var _localAirport: ImageVector? = null
