package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.6f, 40.8f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.4f, 0.8f)
                curveToRelative(-28.3f, 21.2f, -52.3f, 11.0f, -80.0f, -0.9f)
                reflectiveCurveToRelative(-60.3f, -25.9f, -96.0f, 0.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(172.1f)
                curveToRelative(26.9f, -18.1f, 50.1f, -8.2f, 76.8f, 3.3f)
                curveToRelative(16.3f, 6.9f, 33.8f, 14.4f, 52.6f, 14.4f)
                curveToRelative(13.8f, 0.0f, 28.3f, -4.0f, 43.4f, -15.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 224.0f, 168.0f)
                verticalLineTo(48.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 219.6f, 40.8f)
                close()
                moveTo(156.0f, 170.3f)
                verticalLineTo(116.8f)
                curveToRelative(-18.9f, -5.4f, -37.1f, -15.9f, -56.0f, -21.3f)
                verticalLineToRelative(53.6f)
                curveToRelative(-16.3f, -4.2f, -33.6f, -4.8f, -52.0f, 4.5f)
                verticalLineTo(100.8f)
                curveToRelative(18.3f, -10.6f, 35.4f, -10.0f, 52.0f, -5.3f)
                verticalLineTo(45.7f)
                arcToRelative(243.3f, 243.3f, 0.0f, false, true, 24.8f, 9.7f)
                curveToRelative(10.0f, 4.2f, 20.4f, 8.7f, 31.2f, 11.5f)
                verticalLineToRelative(49.9f)
                curveToRelative(16.6f, 4.7f, 33.7f, 5.3f, 52.0f, -5.3f)
                verticalLineToRelative(52.4f)
                curveTo(189.7f, 176.2f, 173.1f, 175.6f, 156.0f, 170.3f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
