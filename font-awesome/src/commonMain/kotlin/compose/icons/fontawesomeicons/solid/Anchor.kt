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

public val SolidGroup.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.97f, 352.0f)
                horizontalLineToRelative(32.39f)
                curveTo(67.17f, 454.73f, 181.94f, 512.0f, 288.0f, 512.0f)
                curveToRelative(106.23f, 0.0f, 220.85f, -57.38f, 242.63f, -160.0f)
                horizontalLineToRelative(32.39f)
                curveToRelative(10.69f, 0.0f, 16.05f, -12.93f, 8.48f, -20.49f)
                lineToRelative(-67.03f, -67.03f)
                curveToRelative(-4.69f, -4.69f, -12.28f, -4.69f, -16.97f, 0.0f)
                lineToRelative(-67.03f, 67.03f)
                curveToRelative(-7.56f, 7.56f, -2.21f, 20.49f, 8.48f, 20.49f)
                horizontalLineToRelative(35.15f)
                curveToRelative(-20.29f, 54.32f, -84.96f, 86.59f, -144.12f, 94.01f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(52.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-52.0f)
                verticalLineToRelative(-5.47f)
                curveToRelative(37.28f, -13.18f, 63.99f, -48.72f, 64.0f, -90.52f)
                curveTo(384.01f, 43.77f, 341.61f, 0.74f, 289.37f, 0.01f)
                curveTo(235.72f, -0.74f, 192.0f, 42.53f, 192.0f, 96.0f)
                curveToRelative(0.0f, 41.8f, 26.72f, 77.35f, 64.0f, 90.53f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(-52.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(190.01f)
                curveToRelative(-58.94f, -7.4f, -123.82f, -39.68f, -144.12f, -94.01f)
                horizontalLineToRelative(35.15f)
                curveToRelative(10.69f, 0.0f, 16.05f, -12.93f, 8.48f, -20.49f)
                lineToRelative(-67.03f, -67.03f)
                curveToRelative(-4.69f, -4.69f, -12.28f, -4.69f, -16.97f, 0.0f)
                lineTo(4.49f, 331.52f)
                curveTo(-3.07f, 339.07f, 2.28f, 352.0f, 12.97f, 352.0f)
                close()
                moveTo(288.0f, 64.0f)
                curveToRelative(17.65f, 0.0f, 32.0f, 14.35f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.35f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.35f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.35f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
