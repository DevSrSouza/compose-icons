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

public val SolidGroup.Hotdog: ImageVector
    get() {
        if (_hotdog != null) {
            return _hotdog!!
        }
        _hotdog = Builder(name = "Hotdog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.56f, 23.44f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -113.12f, 0.0f)
                lineToRelative(-352.0f, 352.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 113.12f, 113.12f)
                lineToRelative(352.0f, -352.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -113.12f)
                close()
                moveTo(438.63f, 118.63f)
                curveToRelative(-19.6f, 19.59f, -37.52f, 22.67f, -51.93f, 25.14f)
                curveTo(373.76f, 146.0f, 364.4f, 147.6f, 352.0f, 160.0f)
                reflectiveCurveToRelative(-14.0f, 21.76f, -16.23f, 34.71f)
                curveToRelative(-2.48f, 14.4f, -5.55f, 32.33f, -25.15f, 51.92f)
                reflectiveCurveToRelative(-37.52f, 22.67f, -51.92f, 25.15f)
                curveTo(245.75f, 274.0f, 236.4f, 275.6f, 224.0f, 288.0f)
                reflectiveCurveToRelative(-14.0f, 21.75f, -16.23f, 34.7f)
                curveToRelative(-2.47f, 14.4f, -5.54f, 32.33f, -25.14f, 51.92f)
                reflectiveCurveToRelative(-37.53f, 22.68f, -51.93f, 25.15f)
                curveTo(117.76f, 402.0f, 108.4f, 403.6f, 96.0f, 416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.63f)
                curveToRelative(19.6f, -19.59f, 37.52f, -22.67f, 51.92f, -25.14f)
                curveToRelative(13.0f, -2.22f, 22.3f, -3.82f, 34.71f, -16.23f)
                reflectiveCurveToRelative(14.0f, -21.75f, 16.22f, -34.7f)
                curveToRelative(2.48f, -14.4f, 5.55f, -32.33f, 25.15f, -51.92f)
                reflectiveCurveToRelative(37.52f, -22.67f, 51.92f, -25.14f)
                curveToRelative(13.0f, -2.22f, 22.3f, -3.83f, 34.7f, -16.23f)
                reflectiveCurveToRelative(14.0f, -21.76f, 16.24f, -34.71f)
                curveToRelative(2.47f, -14.4f, 5.54f, -32.33f, 25.14f, -51.92f)
                reflectiveCurveToRelative(37.52f, -22.68f, 51.92f, -25.15f)
                curveTo(394.24f, 110.0f, 403.59f, 108.41f, 416.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f)
                close()
                moveTo(31.44f, 322.18f)
                lineTo(322.18f, 31.44f)
                lineToRelative(-11.54f, -11.55f)
                curveToRelative(-25.0f, -25.0f, -63.85f, -26.66f, -86.79f, -3.72f)
                lineTo(16.17f, 223.85f)
                curveToRelative(-22.94f, 22.94f, -21.27f, 61.79f, 3.72f, 86.78f)
                close()
                moveTo(480.56f, 189.82f)
                lineTo(189.82f, 480.56f)
                lineToRelative(11.54f, 11.55f)
                curveToRelative(25.0f, 25.0f, 63.85f, 26.66f, 86.79f, 3.72f)
                lineToRelative(207.68f, -207.68f)
                curveToRelative(22.94f, -22.94f, 21.27f, -61.79f, -3.72f, -86.79f)
                close()
            }
        }
        .build()
        return _hotdog!!
    }

private var _hotdog: ImageVector? = null
