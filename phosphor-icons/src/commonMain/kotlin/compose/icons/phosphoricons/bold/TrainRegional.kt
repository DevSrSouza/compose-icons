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

public val BoldGroup.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) {
            return _trainRegional!!
        }
        _trainRegional = Builder(name = "TrainRegional", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.9f, 121.6f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 0.1f, -1.5f)
                verticalLineToRelative(-0.3f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, -0.1f, -1.2f)
                verticalLineToRelative(-0.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, -0.3f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.2f, -0.8f)
                verticalLineToRelative(-0.3f)
                lineTo(205.2f, 34.7f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 185.9f, 20.0f)
                horizontalLineTo(70.1f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 50.8f, 34.7f)
                lineTo(28.4f, 116.8f)
                verticalLineToRelative(0.3f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.2f, 0.8f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, 0.3f)
                verticalLineToRelative(0.4f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, -0.1f, 1.2f)
                verticalLineToRelative(0.3f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.3f, 1.3f)
                verticalLineToRelative(0.2f)
                lineToRelative(22.4f, 82.1f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 70.1f, 220.0f)
                horizontalLineTo(72.0f)
                lineToRelative(-9.6f, 12.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.4f, 16.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.8f, -2.4f)
                lineTo(102.0f, 220.0f)
                horizontalLineToRelative(52.0f)
                lineToRelative(20.4f, 27.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.8f, 2.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.4f, -16.8f)
                lineTo(184.0f, 220.0f)
                horizontalLineToRelative(1.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 19.3f, -14.7f)
                lineToRelative(22.4f, -82.1f)
                verticalLineTo(123.0f)
                lineToRelative(0.3f, -1.3f)
                close()
                moveTo(73.2f, 44.0f)
                horizontalLineTo(182.8f)
                lineTo(201.0f, 110.5f)
                lineToRelative(-73.0f, 13.3f)
                lineTo(55.0f, 110.5f)
                close()
                moveTo(56.6f, 135.2f)
                lineTo(116.0f, 146.0f)
                verticalLineToRelative(50.0f)
                horizontalLineTo(73.2f)
                close()
                moveTo(182.8f, 196.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(146.0f)
                lineToRelative(59.4f, -10.8f)
                close()
                moveTo(84.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 76.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 88.0f)
                close()
            }
        }
        .build()
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
