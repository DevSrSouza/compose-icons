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

public val RoundGroup.AirplanemodeInactive: ImageVector
    get() {
        if (_airplanemodeInactive != null) {
            return _airplanemodeInactive!!
        }
        _airplanemodeInactive = Builder(name = "AirplanemodeInactive", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.6f)
                curveToRelative(0.0f, 0.7f, -0.67f, 1.2f, -1.34f, 1.01f)
                lineToRelative(-3.15f, -0.93f)
                lineTo(10.5f, 7.67f)
                verticalLineTo(3.5f)
                curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(9.0f)
                lineToRelative(7.98f, 4.7f)
                curveTo(21.8f, 13.88f, 22.0f, 14.23f, 22.0f, 14.6f)
                close()
                moveTo(13.5f, 13.5f)
                lineTo(9.56f, 9.56f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(5.67f, 5.67f)
                lineTo(2.52f, 13.7f)
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
                verticalLineToRelative(-2.67f)
                lineToRelative(5.57f, 5.57f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(13.5f, 13.5f)
                close()
            }
        }
        .build()
        return _airplanemodeInactive!!
    }

private var _airplanemodeInactive: ImageVector? = null
