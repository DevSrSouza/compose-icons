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

public val SolidGroup.Bong: ImageVector
    get() {
        if (_bong != null) {
            return _bong!!
        }
        _bong = Builder(name = "Bong", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(302.5f, 512.0f)
                curveToRelative(23.18f, 0.0f, 44.43f, -12.58f, 56.0f, -32.66f)
                curveTo(374.69f, 451.26f, 384.0f, 418.75f, 384.0f, 384.0f)
                curveToRelative(0.0f, -36.12f, -10.08f, -69.81f, -27.44f, -98.62f)
                lineTo(400.0f, 241.94f)
                lineToRelative(9.38f, 9.38f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineToRelative(11.3f, -11.32f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0.0f, -22.63f)
                lineToRelative(-52.69f, -52.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineToRelative(-11.31f, 11.31f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(9.38f, 9.38f)
                lineToRelative(-39.41f, 39.41f)
                curveToRelative(-11.56f, -11.37f, -24.53f, -21.33f, -38.65f, -29.51f)
                verticalLineTo(63.74f)
                lineToRelative(15.97f, -0.02f)
                curveToRelative(8.82f, -0.01f, 15.97f, -7.16f, 15.98f, -15.98f)
                lineToRelative(0.04f, -31.72f)
                curveTo(320.0f, 7.17f, 312.82f, -0.01f, 303.97f, 0.0f)
                lineTo(80.03f, 0.26f)
                curveToRelative(-8.82f, 0.01f, -15.97f, 7.16f, -15.98f, 15.98f)
                lineToRelative(-0.04f, 31.73f)
                curveToRelative(-0.01f, 8.85f, 7.17f, 16.02f, 16.02f, 16.01f)
                lineTo(96.0f, 63.96f)
                verticalLineToRelative(153.93f)
                curveTo(38.67f, 251.1f, 0.0f, 312.97f, 0.0f, 384.0f)
                curveToRelative(0.0f, 34.75f, 9.31f, 67.27f, 25.5f, 95.34f)
                curveTo(37.08f, 499.42f, 58.33f, 512.0f, 81.5f, 512.0f)
                horizontalLineToRelative(221.0f)
                close()
                moveTo(120.06f, 259.43f)
                lineTo(144.0f, 245.56f)
                verticalLineTo(63.91f)
                lineToRelative(96.0f, -0.11f)
                verticalLineToRelative(181.76f)
                lineToRelative(23.94f, 13.87f)
                curveToRelative(24.81f, 14.37f, 44.12f, 35.73f, 56.56f, 60.57f)
                horizontalLineToRelative(-257.0f)
                curveToRelative(12.45f, -24.84f, 31.75f, -46.2f, 56.56f, -60.57f)
                close()
            }
        }
        .build()
        return _bong!!
    }

private var _bong: ImageVector? = null
