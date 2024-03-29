package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Safari: ImageVector
    get() {
        if (_safari != null) {
            return _safari!!
        }
        _safari = Builder(name = "Safari", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 23.25f)
                curveToRelative(6.213f, 0.0f, 11.25f, -5.037f, 11.25f, -11.25f)
                reflectiveCurveTo(18.213f, 0.75f, 12.0f, 0.75f)
                reflectiveCurveTo(0.75f, 5.787f, 0.75f, 12.0f)
                reflectiveCurveTo(5.787f, 23.25f, 12.0f, 23.25f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                close()
                moveTo(19.071f, 4.929f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.353f)
                lineToRelative(-0.707f, 0.708f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.354f, -0.354f)
                lineToRelative(0.708f, -0.707f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.353f, 0.0f)
                close()
                moveTo(5.99f, 18.01f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.354f)
                lineToRelative(-0.708f, 0.707f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.353f, -0.353f)
                lineToRelative(0.707f, -0.708f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.354f, 0.0f)
                close()
                moveTo(4.929f, 4.93f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.353f, 0.0f)
                lineToRelative(0.708f, 0.707f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.354f, 0.354f)
                lineToRelative(-0.707f, -0.708f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.353f)
                close()
                moveTo(18.01f, 18.01f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.354f, 0.0f)
                lineToRelative(0.707f, 0.708f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.353f, 0.353f)
                lineToRelative(-0.708f, -0.707f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.354f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                horizontalLineToRelative(-1.0f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 2.0f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                close()
                moveTo(15.907f, 2.795f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.133f, 0.328f)
                lineToRelative(-0.391f, 0.92f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.46f, -0.195f)
                lineToRelative(0.39f, -0.92f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.328f, -0.133f)
                close()
                moveTo(8.68f, 19.825f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.132f, 0.327f)
                lineToRelative(-0.39f, 0.92f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.46f, -0.195f)
                lineToRelative(0.39f, -0.92f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.328f, -0.133f)
                close()
                moveTo(21.272f, 8.253f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.138f, 0.325f)
                lineToRelative(-0.927f, 0.375f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.188f, -0.464f)
                lineToRelative(0.927f, -0.374f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.326f, 0.138f)
                close()
                moveTo(4.119f, 15.183f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.138f, 0.326f)
                lineToRelative(-0.927f, 0.374f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.188f, -0.463f)
                lineToRelative(0.927f, -0.375f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.326f, 0.138f)
                close()
                moveTo(8.254f, 2.728f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.325f, 0.138f)
                lineToRelative(0.375f, 0.927f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.464f, 0.188f)
                lineToRelative(-0.374f, -0.927f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.138f, -0.326f)
                close()
                moveTo(15.184f, 19.881f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.326f, 0.138f)
                lineToRelative(0.374f, 0.927f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.463f, 0.188f)
                lineToRelative(-0.375f, -0.927f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.138f, -0.326f)
                close()
                moveTo(2.795f, 8.093f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.328f, -0.133f)
                lineToRelative(0.92f, 0.391f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.195f, 0.46f)
                lineToRelative(-0.92f, -0.39f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.133f, -0.328f)
                close()
                moveTo(19.825f, 15.321f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.327f, -0.132f)
                lineToRelative(0.92f, 0.39f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.195f, 0.46f)
                lineToRelative(-0.92f, -0.39f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.133f, -0.328f)
                close()
                moveTo(12.879f, 12.879f)
                lineTo(11.12f, 11.12f)
                lineToRelative(-4.141f, 5.9f)
                lineToRelative(5.899f, -4.142f)
                close()
                moveTo(19.071f, 4.929f)
                lineToRelative(-5.834f, 8.308f)
                lineToRelative(-8.308f, 5.834f)
                lineToRelative(5.834f, -8.308f)
                lineToRelative(8.308f, -5.834f)
                close()
            }
        }
        .build()
        return _safari!!
    }

private var _safari: ImageVector? = null
