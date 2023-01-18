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

public val FillGroup.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.9f, 210.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.5f, 11.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineToRelative(-10.3f, -11.3f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 160.0f, 216.0f)
                horizontalLineTo(72.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 72.0f, 88.0f)
                arcToRelative(58.2f, 58.2f, 0.0f, false, true, 9.3f, 0.7f)
                verticalLineToRelative(-0.2f)
                lineTo(42.1f, 45.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.9f, 34.6f)
                close()
                moveTo(160.0f, 40.0f)
                arcToRelative(87.2f, 87.2f, 0.0f, false, false, -52.1f, 17.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.2f, 5.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 2.0f, 6.2f)
                lineTo(213.8f, 186.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 5.9f, 2.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.9f, -2.7f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 160.0f, 40.0f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
