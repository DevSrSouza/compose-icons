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

public val RoundGroup.BatteryUnknown: ImageVector
    get() {
        if (_batteryUnknown != null) {
            return _batteryUnknown!!
        }
        _batteryUnknown = Builder(name = "BatteryUnknown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.67f, 4.0f)
                lineTo(14.0f, 4.0f)
                lineTo(14.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.33f, 4.0f)
                curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f)
                verticalLineToRelative(15.33f)
                curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.34f, 22.0f)
                horizontalLineToRelative(7.32f)
                curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f)
                lineTo(17.0f, 5.33f)
                curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.3f, 12.69f)
                reflectiveCurveToRelative(-0.38f, 0.42f, -0.67f, 0.71f)
                curveToRelative(-0.14f, 0.14f, -0.27f, 0.31f, -0.39f, 0.47f)
                lineToRelative(-0.09f, 0.15f)
                curveToRelative(-0.08f, 0.12f, -0.14f, 0.25f, -0.19f, 0.37f)
                curveToRelative(-0.09f, 0.22f, -0.16f, 0.43f, -0.16f, 0.61f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(0.0f, -0.42f, 0.12f, -0.8f, 0.29f, -1.13f)
                curveToRelative(0.06f, -0.11f, 0.13f, -0.21f, 0.2f, -0.31f)
                curveToRelative(0.03f, -0.05f, 0.06f, -0.11f, 0.1f, -0.16f)
                curveToRelative(0.11f, -0.14f, 0.23f, -0.28f, 0.34f, -0.4f)
                lineToRelative(0.93f, -0.94f)
                curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.65f, 0.0f, -1.21f, 0.41f, -1.41f, 0.99f)
                curveToRelative(-0.11f, 0.31f, -0.39f, 0.51f, -0.71f, 0.51f)
                curveToRelative(-0.52f, 0.0f, -0.88f, -0.52f, -0.71f, -1.01f)
                curveTo(9.59f, 8.83f, 10.69f, 8.0f, 12.0f, 8.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.66f, -0.27f, 1.26f, -0.7f, 1.69f)
                close()
            }
        }
        .build()
        return _batteryUnknown!!
    }

private var _batteryUnknown: ImageVector? = null
