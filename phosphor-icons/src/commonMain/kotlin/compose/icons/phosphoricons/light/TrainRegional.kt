package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) {
            return _trainRegional!!
        }
        _trainRegional = Builder(name = "TrainRegional", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.9f, 120.8f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.1f, -0.8f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.6f)
                curveToRelative(-0.1f, -0.1f, -0.1f, -0.1f, -0.1f, -0.2f)
                verticalLineToRelative(-0.2f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-22.4f, -82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 185.9f, 26.0f)
                lineTo(70.1f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.6f, 36.3f)
                lineToRelative(-22.4f, 82.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.2f, -0.1f, 0.3f, -0.1f, 0.4f)
                verticalLineToRelative(0.2f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.1f, -0.1f, 0.2f)
                verticalLineToRelative(0.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.1f, 0.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.1f, 0.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(22.4f, 82.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 70.1f, 214.0f)
                lineTo(84.0f, 214.0f)
                lineTo(67.2f, 236.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.6f, 7.2f)
                lineTo(99.0f, 214.0f)
                horizontalLineToRelative(58.0f)
                lineToRelative(22.2f, 29.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, -7.2f)
                lineTo(172.0f, 214.0f)
                horizontalLineToRelative(13.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.5f, -10.3f)
                lineToRelative(22.4f, -82.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.1f, -0.7f)
                close()
                moveTo(68.2f, 39.5f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 70.1f, 38.0f)
                lineTo(185.9f, 38.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.9f, 1.5f)
                lineToRelative(20.7f, 75.8f)
                lineTo(128.0f, 129.9f)
                lineTo(47.5f, 115.3f)
                close()
                moveTo(68.2f, 200.5f)
                lineTo(48.3f, 127.6f)
                lineTo(122.0f, 141.0f)
                verticalLineToRelative(61.0f)
                lineTo(70.1f, 202.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 68.2f, 200.5f)
                close()
                moveTo(187.8f, 200.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.9f, 1.5f)
                lineTo(134.0f, 202.0f)
                lineTo(134.0f, 141.0f)
                lineToRelative(73.7f, -13.4f)
                close()
                moveTo(90.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 94.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 88.0f)
                close()
            }
        }
        .build()
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
