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

public val SimpleIcons.Opensearch: ImageVector
    get() {
        if (_opensearch != null) {
            return _opensearch!!
        }
        _opensearch = Builder(name = "Opensearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.1515f, 8.8125f)
                arcToRelative(0.8484f, 0.8484f, 0.0f, false, false, -0.8484f, 0.8485f)
                curveToRelative(0.0f, 6.982f, -5.6601f, 12.6421f, -12.6421f, 12.6421f)
                arcToRelative(0.8485f, 0.8485f, 0.0f, false, false, 0.0f, 1.6969f)
                curveTo(17.5802f, 24.0f, 24.0f, 17.5802f, 24.0f, 9.661f)
                arcToRelative(0.8485f, 0.8485f, 0.0f, false, false, -0.8485f, -0.8485f)
                close()
                moveTo(18.0305f, 14.25f)
                curveToRelative(0.816f, -1.3311f, 1.6051f, -3.1058f, 1.4498f, -5.5905f)
                curveToRelative(-0.3216f, -5.1468f, -4.9832f, -9.0512f, -9.3851f, -8.6281f)
                curveTo(8.372f, 0.1971f, 6.6025f, 1.6017f, 6.7598f, 4.1177f)
                curveToRelative(0.0683f, 1.0934f, 0.6034f, 1.7386f, 1.473f, 2.2348f)
                curveToRelative(0.8279f, 0.4722f, 1.8914f, 0.7713f, 3.097f, 1.1104f)
                curveToRelative(1.4563f, 0.4096f, 3.1455f, 0.8697f, 4.4438f, 1.8265f)
                curveToRelative(1.5561f, 1.1467f, 2.6198f, 2.4759f, 2.2569f, 4.9606f)
                close()
                moveTo(1.4695f, 5.25f)
                curveTo(0.6535f, 6.581f, -0.1355f, 8.3558f, 0.0197f, 10.8405f)
                curveToRelative(0.3216f, 5.1468f, 4.9832f, 9.0512f, 9.385f, 8.6281f)
                curveToRelative(1.7233f, -0.1657f, 3.4927f, -1.5703f, 3.3355f, -4.0863f)
                curveToRelative(-0.0683f, -1.0934f, -0.6034f, -1.7386f, -1.4731f, -2.2348f)
                curveToRelative(-0.8278f, -0.4722f, -1.8913f, -0.7713f, -3.0969f, -1.1104f)
                curveToRelative(-1.4563f, -0.4096f, -3.1455f, -0.8697f, -4.4438f, -1.8265f)
                curveToRelative(-1.5561f, -1.1467f, -2.6198f, -2.476f, -2.257f, -4.9606f)
                close()
            }
        }
        .build()
        return _opensearch!!
    }

private var _opensearch: ImageVector? = null
