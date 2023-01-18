package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.EmojiSmileSlight: ImageVector
    get() {
        if (_emojiSmileSlight != null) {
            return _emojiSmileSlight!!
        }
        _emojiSmileSlight = Builder(name = "EmojiSmileSlight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0016f, 12.0016f)
                curveTo(22.0016f, 6.4778f, 17.5238f, 2.0f, 12.0001f, 2.0f)
                curveTo(6.4764f, 2.0f, 1.9985f, 6.4778f, 1.9985f, 12.0016f)
                curveTo(1.9985f, 17.5253f, 6.4764f, 22.0031f, 12.0001f, 22.0031f)
                curveTo(17.5238f, 22.0031f, 22.0016f, 17.5253f, 22.0016f, 12.0016f)
                close()
                moveTo(7.7512f, 10.0015f)
                curveTo(7.7512f, 9.3115f, 8.3106f, 8.7522f, 9.0005f, 8.7522f)
                curveTo(9.6905f, 8.7522f, 10.2498f, 9.3115f, 10.2498f, 10.0015f)
                curveTo(10.2498f, 10.6914f, 9.6905f, 11.2508f, 9.0005f, 11.2508f)
                curveTo(8.3106f, 11.2508f, 7.7512f, 10.6914f, 7.7512f, 10.0015f)
                close()
                moveTo(13.7512f, 10.0015f)
                curveTo(13.7512f, 9.3115f, 14.3106f, 8.7522f, 15.0005f, 8.7522f)
                curveTo(15.6905f, 8.7522f, 16.2498f, 9.3115f, 16.2498f, 10.0015f)
                curveTo(16.2498f, 10.6914f, 15.6905f, 11.2508f, 15.0005f, 11.2508f)
                curveTo(14.3106f, 11.2508f, 13.7512f, 10.6914f, 13.7512f, 10.0015f)
                close()
                moveTo(10.1359f, 15.1079f)
                curveTo(10.619f, 15.3978f, 11.2906f, 15.5635f, 12.0f, 15.5635f)
                curveTo(12.7094f, 15.5635f, 13.381f, 15.3978f, 13.8642f, 15.108f)
                curveTo(14.2194f, 14.8949f, 14.6801f, 15.0101f, 14.8932f, 15.3653f)
                curveTo(15.1062f, 15.7205f, 14.991f, 16.1812f, 14.6358f, 16.3943f)
                curveTo(13.869f, 16.8543f, 12.9156f, 17.0635f, 12.0f, 17.0635f)
                curveTo(11.0844f, 17.0635f, 10.131f, 16.8542f, 9.3641f, 16.3941f)
                curveTo(9.0089f, 16.181f, 8.8938f, 15.7203f, 9.1069f, 15.3651f)
                curveTo(9.32f, 15.0099f, 9.7807f, 14.8947f, 10.1359f, 15.1079f)
                close()
            }
        }
        .build()
        return _emojiSmileSlight!!
    }

private var _emojiSmileSlight: ImageVector? = null
