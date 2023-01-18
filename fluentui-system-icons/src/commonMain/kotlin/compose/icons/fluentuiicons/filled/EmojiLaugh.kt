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

public val FilledGroup.EmojiLaugh: ImageVector
    get() {
        if (_emojiLaugh != null) {
            return _emojiLaugh!!
        }
        _emojiLaugh = Builder(name = "EmojiLaugh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.492f, 9.3598f)
                curveTo(14.4314f, 9.7696f, 14.05f, 10.0526f, 13.6403f, 9.9919f)
                curveTo(13.2305f, 9.9313f, 12.9475f, 9.5499f, 13.0082f, 9.1402f)
                curveTo(13.1696f, 8.0495f, 14.1313f, 7.25f, 15.2501f, 7.25f)
                curveTo(16.3689f, 7.25f, 17.3306f, 8.0495f, 17.492f, 9.1402f)
                curveTo(17.5527f, 9.5499f, 17.2697f, 9.9313f, 16.8599f, 9.9919f)
                curveTo(16.4502f, 10.0526f, 16.0688f, 9.7696f, 16.0082f, 9.3598f)
                curveTo(15.9604f, 9.0372f, 15.6586f, 8.75f, 15.2501f, 8.75f)
                curveTo(14.8416f, 8.75f, 14.5398f, 9.0372f, 14.492f, 9.3598f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(8.8576f, 18.0f, 6.7626f, 15.6375f, 6.5f, 12.75f)
                horizontalLineTo(17.5f)
                curveTo(17.2373f, 15.6375f, 15.1424f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(8.7501f, 8.75f)
                curveTo(8.3416f, 8.75f, 8.0398f, 9.0372f, 7.992f, 9.3598f)
                curveTo(7.9314f, 9.7696f, 7.55f, 10.0526f, 7.1403f, 9.9919f)
                curveTo(6.7305f, 9.9313f, 6.4475f, 9.5499f, 6.5082f, 9.1402f)
                curveTo(6.6696f, 8.0495f, 7.6313f, 7.25f, 8.7501f, 7.25f)
                curveTo(9.8689f, 7.25f, 10.8306f, 8.0495f, 10.992f, 9.1402f)
                curveTo(11.0527f, 9.5499f, 10.7697f, 9.9313f, 10.3599f, 9.9919f)
                curveTo(9.9502f, 10.0526f, 9.5688f, 9.7696f, 9.5082f, 9.3598f)
                curveTo(9.4604f, 9.0372f, 9.1586f, 8.75f, 8.7501f, 8.75f)
                close()
            }
        }
        .build()
        return _emojiLaugh!!
    }

private var _emojiLaugh: ImageVector? = null
