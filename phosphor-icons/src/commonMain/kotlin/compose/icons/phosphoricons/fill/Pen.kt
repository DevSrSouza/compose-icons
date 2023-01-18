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

public val FillGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.7f, 88.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 224.0f, 76.7f)
                lineTo(179.3f, 32.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(36.7f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -3.6f, 5.4f)
                lineToRelative(-0.3f, 0.8f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -0.8f, 5.1f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(92.7f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, 5.1f, -0.9f)
                lineToRelative(0.8f, -0.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.4f, -3.6f)
                lineToRelative(83.7f, -83.7f)
                lineToRelative(3.4f, 13.9f)
                lineToRelative(-36.8f, 36.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 2.1f, -7.6f)
                lineToRelative(-6.9f, -27.6f)
                lineTo(224.0f, 99.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 228.7f, 88.0f)
                close()
                moveTo(192.0f, 108.7f)
                lineTo(147.3f, 64.0f)
                lineTo(168.0f, 43.3f)
                lineTo(212.7f, 88.0f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
