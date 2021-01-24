package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(128.0f, 160.0f)
                lineTo(0.0f, 160.0f)
                verticalLineToRelative(320.0f)
                close()
                moveTo(579.16f, 288.0f)
                curveToRelative(17.86f, -17.39f, 28.84f, -37.34f, 28.84f, -58.91f)
                curveToRelative(0.0f, -52.86f, -41.79f, -93.79f, -87.92f, -122.9f)
                curveToRelative(-41.94f, -26.47f, -80.63f, -57.77f, -111.96f, -96.22f)
                lineTo(400.0f, 0.0f)
                lineToRelative(-8.12f, 9.97f)
                curveToRelative(-31.33f, 38.45f, -70.01f, 69.76f, -111.96f, 96.22f)
                curveTo(233.79f, 135.3f, 192.0f, 176.23f, 192.0f, 229.09f)
                curveToRelative(0.0f, 21.57f, 10.98f, 41.52f, 28.84f, 58.91f)
                horizontalLineToRelative(358.32f)
                close()
                moveTo(608.0f, 320.0f)
                lineTo(192.0f, 320.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -17.67f, 14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-72.0f)
                curveToRelative(0.0f, -48.0f, 48.0f, -72.0f, 48.0f, -72.0f)
                reflectiveCurveToRelative(48.0f, 24.0f, 48.0f, 72.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -17.67f, 14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(640.0f, 352.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(64.0f, 0.0f)
                reflectiveCurveTo(0.0f, 32.0f, 0.0f, 96.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 96.0f)
                curveToRelative(0.0f, -64.0f, -64.0f, -96.0f, -64.0f, -96.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
