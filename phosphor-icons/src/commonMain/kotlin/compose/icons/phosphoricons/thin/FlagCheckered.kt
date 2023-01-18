package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.8f, 44.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.4f)
                curveToRelative(-30.1f, 22.6f, -56.3f, 11.4f, -84.0f, -0.5f)
                reflectiveCurveToRelative(-58.1f, -24.9f, -92.0f, 0.5f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 36.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(44.0f, 170.1f)
                curveToRelative(29.5f, -21.1f, 55.2f, -10.1f, 82.4f, 1.6f)
                curveToRelative(16.5f, 7.0f, 33.2f, 14.2f, 50.9f, 14.2f)
                curveToRelative(13.1f, 0.0f, 26.7f, -3.9f, 41.1f, -14.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 168.0f)
                lineTo(220.0f, 48.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 217.8f, 44.4f)
                close()
                moveTo(212.0f, 55.6f)
                verticalLineToRelative(48.5f)
                curveToRelative(-18.4f, 13.1f, -35.3f, 13.8f, -52.0f, 9.6f)
                lineTo(160.0f, 63.8f)
                curveTo(176.5f, 67.6f, 193.6f, 67.0f, 212.0f, 55.6f)
                close()
                moveTo(152.0f, 61.6f)
                verticalLineToRelative(49.8f)
                curveToRelative(-7.4f, -2.5f, -14.9f, -5.7f, -22.4f, -8.9f)
                reflectiveCurveToRelative(-16.9f, -7.3f, -25.6f, -10.0f)
                lineTo(104.0f, 42.8f)
                curveToRelative(7.4f, 2.5f, 14.9f, 5.6f, 22.4f, 8.9f)
                arcTo(265.2f, 265.2f, 0.0f, false, false, 152.0f, 61.6f)
                close()
                moveTo(96.0f, 40.5f)
                lineTo(96.0f, 90.4f)
                curveToRelative(-16.5f, -3.8f, -33.6f, -3.3f, -52.0f, 8.2f)
                lineTo(44.0f, 50.1f)
                curveTo(62.4f, 36.9f, 79.3f, 36.3f, 96.0f, 40.5f)
                close()
                moveTo(44.0f, 160.4f)
                lineTo(44.0f, 108.2f)
                curveToRelative(18.4f, -13.1f, 35.3f, -13.8f, 52.0f, -9.6f)
                verticalLineToRelative(53.6f)
                curveTo(79.5f, 148.4f, 62.4f, 149.0f, 44.0f, 160.4f)
                close()
                moveTo(104.0f, 154.4f)
                lineTo(104.0f, 100.9f)
                curveToRelative(7.4f, 2.5f, 14.9f, 5.7f, 22.4f, 8.9f)
                reflectiveCurveToRelative(16.9f, 7.3f, 25.6f, 10.0f)
                verticalLineToRelative(53.4f)
                curveToRelative(-7.4f, -2.5f, -14.9f, -5.6f, -22.4f, -8.9f)
                arcTo(265.2f, 265.2f, 0.0f, false, false, 104.0f, 154.4f)
                close()
                moveTo(160.0f, 175.6f)
                lineTo(160.0f, 121.9f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 17.3f, 2.1f)
                curveToRelative(11.2f, 0.0f, 22.7f, -2.8f, 34.7f, -10.3f)
                lineTo(212.0f, 166.0f)
                curveTo(193.6f, 179.1f, 176.7f, 179.7f, 160.0f, 175.6f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
