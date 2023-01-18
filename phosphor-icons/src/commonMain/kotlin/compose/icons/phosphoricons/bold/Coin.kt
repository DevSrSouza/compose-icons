package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.4f, 60.3f)
                curveTo(188.1f, 49.6f, 159.9f, 44.0f, 128.0f, 44.0f)
                reflectiveCurveTo(67.9f, 49.6f, 46.6f, 60.3f)
                reflectiveCurveTo(12.0f, 87.2f, 12.0f, 104.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 16.8f, 12.6f, 32.7f, 34.6f, 43.7f)
                reflectiveCurveTo(96.1f, 212.0f, 128.0f, 212.0f)
                reflectiveCurveToRelative(60.1f, -5.6f, 81.4f, -16.3f)
                reflectiveCurveTo(244.0f, 168.8f, 244.0f, 152.0f)
                lineTo(244.0f, 104.0f)
                curveTo(244.0f, 87.2f, 231.4f, 71.3f, 209.4f, 60.3f)
                close()
                moveTo(57.4f, 81.7f)
                curveTo(75.1f, 72.9f, 100.2f, 68.0f, 128.0f, 68.0f)
                reflectiveCurveToRelative(52.9f, 4.9f, 70.6f, 13.7f)
                curveTo(211.8f, 88.3f, 220.0f, 96.9f, 220.0f, 104.0f)
                reflectiveCurveToRelative(-8.2f, 15.7f, -21.4f, 22.3f)
                curveTo(180.9f, 135.1f, 155.8f, 140.0f, 128.0f, 140.0f)
                reflectiveCurveToRelative(-52.9f, -4.9f, -70.6f, -13.7f)
                curveTo(44.2f, 119.7f, 36.0f, 111.1f, 36.0f, 104.0f)
                reflectiveCurveTo(44.2f, 88.3f, 57.4f, 81.7f)
                close()
                moveTo(180.0f, 181.4f)
                arcToRelative(182.2f, 182.2f, 0.0f, false, true, -40.0f, 6.3f)
                verticalLineToRelative(-24.0f)
                arcToRelative(204.3f, 204.3f, 0.0f, false, false, 40.0f, -5.5f)
                close()
                moveTo(76.0f, 158.2f)
                arcToRelative(204.3f, 204.3f, 0.0f, false, false, 40.0f, 5.5f)
                verticalLineToRelative(24.0f)
                arcToRelative(182.2f, 182.2f, 0.0f, false, true, -40.0f, -6.3f)
                close()
                moveTo(36.0f, 152.0f)
                lineTo(36.0f, 141.5f)
                arcToRelative(89.5f, 89.5f, 0.0f, false, false, 10.6f, 6.2f)
                lineToRelative(5.4f, 2.5f)
                verticalLineToRelative(21.1f)
                curveTo(42.0f, 165.2f, 36.0f, 158.1f, 36.0f, 152.0f)
                close()
                moveTo(204.0f, 171.3f)
                lineTo(204.0f, 150.2f)
                lineToRelative(5.4f, -2.5f)
                arcToRelative(89.5f, 89.5f, 0.0f, false, false, 10.6f, -6.2f)
                lineTo(220.0f, 152.0f)
                curveTo(220.0f, 158.1f, 214.0f, 165.2f, 204.0f, 171.3f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
