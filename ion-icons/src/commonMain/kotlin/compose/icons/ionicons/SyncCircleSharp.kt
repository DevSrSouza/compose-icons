package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SyncCircleSharp: ImageVector
    get() {
        if (_syncCircleSharp != null) {
            return _syncCircleSharp!!
        }
        _syncCircleSharp = Builder(name = "SyncCircleSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(256.0f, 368.0f)
                arcToRelative(112.19f, 112.19f, 0.0f, false, true, -111.27f, -98.23f)
                lineToRelative(-8.86f, 8.86f)
                lineTo(113.24f, 256.0f)
                lineToRelative(46.0f, -46.0f)
                lineToRelative(47.55f, 45.48f)
                lineToRelative(-22.12f, 23.12f)
                lineToRelative(-7.2f, -6.88f)
                arcToRelative(80.26f, 80.26f, 0.0f, false, false, 138.48f, 37.5f)
                lineToRelative(23.77f, 21.41f)
                arcTo(112.82f, 112.82f, 0.0f, false, true, 256.0f, 368.0f)
                close()
                moveTo(352.79f, 302.0f)
                lineTo(305.24f, 256.5f)
                lineToRelative(22.12f, -23.12f)
                lineToRelative(6.86f, 6.55f)
                arcTo(80.2f, 80.2f, 0.0f, false, false, 196.0f, 202.64f)
                lineToRelative(-23.82f, -21.37f)
                arcTo(112.18f, 112.18f, 0.0f, false, true, 367.0f, 242.49f)
                lineToRelative(9.11f, -9.12f)
                lineTo(398.76f, 256.0f)
                close()
            }
        }
        .build()
        return _syncCircleSharp!!
    }

private var _syncCircleSharp: ImageVector? = null
