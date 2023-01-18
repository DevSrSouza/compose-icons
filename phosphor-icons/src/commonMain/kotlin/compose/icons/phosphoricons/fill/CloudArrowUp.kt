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

public val FillGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.1f, 40.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 81.3f, 88.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(86.6f, 86.6f, 0.0f, false, false, -9.3f, 39.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -7.4f, 8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.6f, -8.0f)
                arcToRelative(105.0f, 105.0f, 0.0f, false, true, 5.3f, -32.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.7f, -5.2f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 8.0f, 152.0f)
                curveToRelative(0.0f, 35.2f, 29.8f, 64.0f, 64.9f, 64.0f)
                lineTo(160.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 0.1f, -176.0f)
                close()
                moveTo(191.6f, 151.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, -2.3f)
                lineTo(160.0f, 131.3f)
                lineTo(160.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(144.0f, 131.3f)
                lineToRelative(-20.3f, 20.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -11.3f)
                lineToRelative(33.9f, -34.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(33.9f, 34.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 191.6f, 151.6f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
