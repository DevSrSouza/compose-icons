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

public val SolidGroup.Female: ImageVector
    get() {
        if (_female != null) {
            return _female!!
        }
        _female = Builder(name = "Female", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 0.0f)
                curveToRelative(35.346f, 0.0f, 64.0f, 28.654f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.654f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-35.346f, 0.0f, -64.0f, -28.654f, -64.0f, -64.0f)
                reflectiveCurveTo(92.654f, 0.0f, 128.0f, 0.0f)
                moveToRelative(119.283f, 354.179f)
                lineToRelative(-48.0f, -192.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 144.0f)
                horizontalLineToRelative(-11.36f)
                curveToRelative(-22.711f, 10.443f, -49.59f, 10.894f, -73.28f, 0.0f)
                horizontalLineTo(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -23.283f, 18.179f)
                lineToRelative(-48.0f, 192.0f)
                curveTo(4.935f, 369.305f, 16.383f, 384.0f, 32.0f, 384.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(15.591f, 0.0f, 27.071f, -14.671f, 23.283f, -29.821f)
                close()
            }
        }
        .build()
        return _female!!
    }

private var _female: ImageVector? = null
