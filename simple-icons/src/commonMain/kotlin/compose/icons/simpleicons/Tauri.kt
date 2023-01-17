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

public val SimpleIcons.Tauri: ImageVector
    get() {
        if (_tauri != null) {
            return _tauri!!
        }
        _tauri = Builder(name = "Tauri", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.657f, 17.282f)
                arcToRelative(8.7339f, 8.7339f, 0.0f, false, false, 3.0125f, -1.2251f)
                arcToRelative(8.728f, 8.728f, 0.0f, false, false, 3.2216f, -3.7452f)
                arcToRelative(8.7232f, 8.7232f, 0.0f, false, false, 0.6717f, -4.8932f)
                arcToRelative(8.7247f, 8.7247f, 0.0f, false, false, -2.0931f, -4.474f)
                curveTo(19.3375f, 1.6857f, 17.8833f, 0.7753f, 16.264f, 0.3225f)
                arcToRelative(8.7358f, 8.7358f, 0.0f, false, false, -4.941f, 0.07f)
                arcToRelative(8.7318f, 8.7318f, 0.0f, false, false, -4.1117f, 2.7393f)
                arcToRelative(8.726f, 8.726f, 0.0f, false, false, -1.6336f, 2.9933f)
                arcToRelative(10.1908f, 10.1908f, 0.0f, false, true, 3.3484f, -0.972f)
                arcToRelative(6.1356f, 6.1356f, 0.0f, false, true, 3.1666f, -2.2827f)
                arcToRelative(6.1387f, 6.1387f, 0.0f, false, true, 3.4721f, -0.0492f)
                arcToRelative(6.1365f, 6.1365f, 0.0f, false, true, 2.9427f, 1.8425f)
                arcToRelative(6.1326f, 6.1326f, 0.0f, false, true, 1.4709f, 3.1439f)
                arcToRelative(6.1305f, 6.1305f, 0.0f, false, true, -0.4721f, 3.4384f)
                arcToRelative(6.133f, 6.133f, 0.0f, false, true, -2.2638f, 2.6317f)
                arcToRelative(6.1312f, 6.1312f, 0.0f, false, true, -1.3123f, 0.6409f)
                curveToRelative(0.0303f, 0.2471f, 0.046f, 0.4987f, 0.046f, 0.754f)
                arcToRelative(6.1166f, 6.1166f, 0.0f, false, true, -0.3372f, 2.0094f)
                close()
                moveTo(13.93f, 11.0129f)
                curveToRelative(1.263f, 0.0f, 2.2868f, -1.0234f, 2.2868f, -2.2857f)
                curveToRelative(0.0f, -1.2624f, -1.0238f, -2.2857f, -2.2868f, -2.2857f)
                reflectiveCurveToRelative(-2.2868f, 1.0233f, -2.2868f, 2.2857f)
                curveToRelative(0.0f, 1.2623f, 1.0238f, 2.2857f, 2.2868f, 2.2857f)
                close()
                moveTo(8.3665f, 6.7132f)
                arcToRelative(8.7342f, 8.7342f, 0.0f, false, false, -3.0365f, 1.23f)
                arcToRelative(8.7287f, 8.7287f, 0.0f, false, false, -3.2215f, 3.745f)
                arcToRelative(8.7235f, 8.7235f, 0.0f, false, false, -0.6718f, 4.8932f)
                arcTo(8.7255f, 8.7255f, 0.0f, false, false, 3.53f, 21.0555f)
                arcToRelative(8.7318f, 8.7318f, 0.0f, false, false, 4.1877f, 2.6219f)
                arcToRelative(8.7364f, 8.7364f, 0.0f, false, false, 4.941f, -0.0698f)
                arcToRelative(8.7326f, 8.7326f, 0.0f, false, false, 4.1117f, -2.7394f)
                arcToRelative(8.7258f, 8.7258f, 0.0f, false, false, 1.6363f, -3.0021f)
                arcToRelative(10.1905f, 10.1905f, 0.0f, false, true, -3.3497f, 0.9789f)
                arcToRelative(6.1569f, 6.1569f, 0.0f, false, true, -0.2787f, 0.3596f)
                arcToRelative(6.1352f, 6.1352f, 0.0f, false, true, -2.8893f, 1.925f)
                arcToRelative(6.139f, 6.139f, 0.0f, false, true, -3.4721f, 0.0492f)
                arcToRelative(6.1363f, 6.1363f, 0.0f, false, true, -2.9427f, -1.8425f)
                arcToRelative(6.1317f, 6.1317f, 0.0f, false, true, -1.4709f, -3.1439f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, true, 0.472f, -3.4385f)
                arcToRelative(6.1338f, 6.1338f, 0.0f, false, true, 2.2639f, -2.6317f)
                arcToRelative(6.1372f, 6.1372f, 0.0f, false, true, 1.2865f, -0.6318f)
                arcToRelative(6.1961f, 6.1961f, 0.0f, false, true, -0.035f, -0.6592f)
                curveToRelative(0.0f, -0.7444f, 0.1327f, -1.458f, 0.376f, -2.118f)
                close()
                moveTo(10.0663f, 12.987f)
                curveToRelative(-1.263f, 0.0f, -2.2868f, 1.0234f, -2.2868f, 2.2858f)
                curveToRelative(0.0f, 1.2623f, 1.0239f, 2.2856f, 2.2868f, 2.2856f)
                curveToRelative(1.263f, 0.0f, 2.2868f, -1.0233f, 2.2868f, -2.2856f)
                curveToRelative(0.0f, -1.2624f, -1.0238f, -2.2858f, -2.2868f, -2.2858f)
                close()
            }
        }
        .build()
        return _tauri!!
    }

private var _tauri: ImageVector? = null
