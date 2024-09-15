package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                curveToRelative(35.35f, 0.0f, 64.0f, 28.65f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.65f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, -28.65f, -64.0f, -64.0f)
                reflectiveCurveTo(92.65f, 0.0f, 128.0f, 0.0f)
                moveToRelative(119.28f, 354.18f)
                lineToRelative(-48.0f, -192.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 144.0f)
                horizontalLineToRelative(-11.36f)
                curveToRelative(-22.71f, 10.44f, -49.59f, 10.89f, -73.28f, 0.0f)
                horizontalLineTo(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -23.28f, 18.18f)
                lineToRelative(-48.0f, 192.0f)
                curveTo(4.93f, 369.3f, 16.38f, 384.0f, 32.0f, 384.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(15.59f, 0.0f, 27.07f, -14.67f, 23.28f, -29.82f)
                close()
            }
        }
        .build()
        return _female!!
    }

private var _female: ImageVector? = null
