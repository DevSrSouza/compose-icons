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

public val FillGroup.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) {
            return _trainRegional!!
        }
        _trainRegional = Builder(name = "TrainRegional", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 88.0f)
                close()
                moveTo(224.0f, 120.1f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.1f, 0.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -0.2f, 0.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-22.4f, 82.1f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 185.9f, 216.0f)
                lineTo(176.0f, 216.0f)
                lineToRelative(14.4f, 19.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.6f, 11.2f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 184.0f, 248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -3.2f)
                lineTo(156.0f, 216.0f)
                lineTo(100.0f, 216.0f)
                lineTo(78.4f, 244.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 248.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -4.8f, -1.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.6f, -11.2f)
                lineTo(80.0f, 216.0f)
                lineTo(70.1f, 216.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -15.4f, -11.8f)
                lineTo(32.3f, 122.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -0.2f, -0.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.1f, -0.9f)
                verticalLineToRelative(-0.2f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.1f, -0.8f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.1f, -0.2f, 0.1f, -0.4f, 0.2f, -0.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(22.4f, -82.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 70.1f, 24.0f)
                lineTo(185.9f, 24.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 15.4f, 11.8f)
                lineToRelative(22.4f, 82.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.1f, 0.2f, 0.1f, 0.4f, 0.2f, 0.6f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.1f, 0.8f)
                close()
                moveTo(136.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(206.0f, 113.7f)
                lineTo(185.9f, 40.0f)
                lineTo(70.1f, 40.0f)
                lineTo(50.0f, 113.7f)
                lineToRelative(78.0f, 14.2f)
                close()
            }
        }
        .build()
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
