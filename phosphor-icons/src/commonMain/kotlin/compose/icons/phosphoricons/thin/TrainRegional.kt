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

public val ThinGroup.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) {
            return _trainRegional!!
        }
        _trainRegional = Builder(name = "TrainRegional", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 120.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.1f, -0.7f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.3f)
                lineTo(197.5f, 36.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 185.9f, 28.0f)
                lineTo(70.1f, 28.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -11.6f, 8.8f)
                lineTo(36.1f, 118.9f)
                verticalLineToRelative(0.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.1f, 0.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, 0.1f, 0.6f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.2f)
                lineToRelative(22.4f, 82.1f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 70.1f, 212.0f)
                lineTo(88.0f, 212.0f)
                lineTo(68.8f, 237.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.8f, 5.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.2f, -1.6f)
                lineTo(98.0f, 212.0f)
                horizontalLineToRelative(60.0f)
                lineToRelative(22.8f, 30.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 184.0f, 244.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, -0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.8f, -5.6f)
                lineTo(168.0f, 212.0f)
                horizontalLineToRelative(17.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 11.6f, -8.8f)
                lineToRelative(22.4f, -82.1f)
                verticalLineToRelative(-0.2f)
                horizontalLineToRelative(0.0f)
                arcTo(1.3f, 1.3f, 0.0f, false, false, 220.0f, 120.2f)
                close()
                moveTo(66.3f, 38.9f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 70.1f, 36.0f)
                lineTo(185.9f, 36.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.8f, 2.9f)
                lineTo(211.0f, 116.8f)
                lineToRelative(-83.0f, 15.1f)
                lineTo(45.0f, 116.8f)
                close()
                moveTo(66.3f, 201.1f)
                lineTo(45.5f, 125.1f)
                lineTo(124.0f, 139.3f)
                lineTo(124.0f, 204.0f)
                lineTo(70.1f, 204.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 66.3f, 201.1f)
                close()
                moveTo(189.7f, 201.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.8f, 2.9f)
                lineTo(132.0f, 204.0f)
                lineTo(132.0f, 139.3f)
                lineToRelative(78.5f, -14.2f)
                close()
                moveTo(92.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 88.0f)
                close()
            }
        }
        .build()
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
