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

public val FillGroup.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) {
            return _appleLogo!!
        }
        _appleLogo = Builder(name = "AppleLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.7f, 29.6f)
                arcTo(40.2f, 40.2f, 0.0f, false, true, 168.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -22.4f, 15.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.5f, 5.1f)
                arcToRelative(9.2f, 9.2f, 0.0f, false, true, -2.8f, -0.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 130.7f, 29.6f)
                close()
                moveTo(222.0f, 155.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -2.7f, -70.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 221.5f, 74.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 128.0f, 61.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 20.0f, 116.0f)
                arcToRelative(135.0f, 135.0f, 0.0f, false, false, 22.9f, 74.0f)
                curveToRelative(14.4f, 21.3f, 32.7f, 34.0f, 49.1f, 34.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(22.5f, 0.0f, 47.9f, -23.9f, 61.9f, -58.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 222.0f, 155.8f)
                close()
            }
        }
        .build()
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
