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

public val SimpleIcons.Thunderstore: ImageVector
    get() {
        if (_thunderstore != null) {
            return _thunderstore!!
        }
        _thunderstore = Builder(name = "Thunderstore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.322f, 13.174f)
                lineToRelative(4.706f, 8.192f)
                lineTo(7.2f, 16.855f)
                lineTo(4.824f, 12.72f)
                arcToRelative(1.416f, 1.416f, 0.0f, false, true, 0.0f, -1.444f)
                lineToRelative(2.965f, -5.16f)
                curveToRelative(0.265f, -0.46f, 0.718f, -0.723f, 1.245f, -0.723f)
                horizontalLineToRelative(1.595f)
                lineToRelative(-3.086f, 6.953f)
                horizontalLineToRelative(3.812f)
                lineTo(6.171f, 22.403f)
                lineTo(16.583f, 9.914f)
                horizontalLineToRelative(-3.201f)
                lineToRelative(2.184f, -4.52f)
                horizontalLineToRelative(6.052f)
                lineTo(24.0f, 1.25f)
                horizontalLineTo(7.175f)
                curveToRelative(-0.86f, 0.0f, -1.598f, 0.428f, -2.028f, 1.174f)
                lineToRelative(-4.825f, 8.4f)
                arcToRelative(2.306f, 2.306f, 0.0f, false, false, 0.0f, 2.35f)
                moveToRelative(7.213f, 9.576f)
                horizontalLineToRelative(9.29f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, 2.03f, -1.176f)
                lineToRelative(4.825f, -8.4f)
                arcToRelative(2.317f, 2.317f, 0.0f, false, false, 0.0f, -2.35f)
                lineToRelative(-1.93f, -3.36f)
                horizontalLineToRelative(-4.763f)
                lineToRelative(2.19f, 3.813f)
                curveToRelative(0.262f, 0.46f, 0.262f, 0.987f, 0.0f, 1.444f)
                lineToRelative(-2.964f, 5.162f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, -1.248f, 0.723f)
                horizontalLineToRelative(-2.154f)
                lineToRelative(-1.497f, -0.017f)
                close()
            }
        }
        .build()
        return _thunderstore!!
    }

private var _thunderstore: ImageVector? = null
