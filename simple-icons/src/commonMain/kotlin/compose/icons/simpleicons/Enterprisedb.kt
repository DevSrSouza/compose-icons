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

public val SimpleIcons.Enterprisedb: ImageVector
    get() {
        if (_enterprisedb != null) {
            return _enterprisedb!!
        }
        _enterprisedb = Builder(name = "Enterprisedb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.44f, 7.75f)
                curveToRelative(0.072f, 0.0f, 0.148f, 0.004f, 0.222f, 0.012f)
                lineToRelative(1.815f, 0.18f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, true, 0.345f, 0.369f)
                verticalLineToRelative(6.636f)
                curveToRelative(0.0f, 0.186f, -0.154f, 0.32f, -0.345f, 0.301f)
                lineToRelative(-1.815f, -0.18f)
                curveTo(5.47f, 14.95f, 4.5f, 13.918f, 4.5f, 12.762f)
                curveToRelative(0.0f, -0.62f, 0.279f, -1.15f, 0.72f, -1.49f)
                curveToRelative(-0.441f, -0.428f, -0.72f, -1.011f, -0.72f, -1.631f)
                curveToRelative(0.0f, -1.084f, 0.85f, -1.892f, 1.94f, -1.89f)
                close()
                moveTo(17.56f, 7.75f)
                curveToRelative(1.09f, 0.0f, 1.94f, 0.807f, 1.94f, 1.89f)
                curveToRelative(0.0f, 0.62f, -0.278f, 1.204f, -0.72f, 1.631f)
                curveToRelative(0.442f, 0.34f, 0.72f, 0.87f, 0.72f, 1.49f)
                curveToRelative(0.0f, 1.157f, -0.967f, 2.19f, -2.16f, 2.307f)
                lineToRelative(-1.817f, 0.18f)
                curveToRelative(-0.191f, 0.02f, -0.345f, -0.116f, -0.345f, -0.3f)
                lineTo(15.178f, 8.31f)
                curveToRelative(0.0f, -0.185f, 0.154f, -0.35f, 0.345f, -0.369f)
                lineToRelative(1.817f, -0.18f)
                curveToRelative(0.074f, -0.007f, 0.148f, -0.011f, 0.22f, -0.011f)
                close()
                moveTo(10.186f, 9.75f)
                lineTo(12.0f, 9.75f)
                curveToRelative(1.194f, 0.0f, 2.16f, 0.93f, 2.16f, 2.074f)
                verticalLineToRelative(3.09f)
                curveToRelative(0.0f, 1.145f, -0.972f, 2.086f, -2.166f, 2.086f)
                lineTo(10.18f, 17.0f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, true, -0.34f, -0.344f)
                verticalLineToRelative(-0.092f)
                curveToRelative(0.0f, -0.34f, 0.187f, -0.331f, 0.27f, -0.34f)
                lineToRelative(0.136f, -0.011f)
                curveToRelative(1.216f, -0.13f, 1.735f, -0.404f, 1.754f, -0.766f)
                horizontalLineToRelative(-1.82f)
                curveToRelative(-0.202f, 0.0f, -0.34f, -0.195f, -0.34f, -0.388f)
                verticalLineToRelative(-4.977f)
                curveToRelative(0.0f, -0.184f, 0.154f, -0.332f, 0.346f, -0.332f)
                close()
            }
        }
        .build()
        return _enterprisedb!!
    }

private var _enterprisedb: ImageVector? = null
