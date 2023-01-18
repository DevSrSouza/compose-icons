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

public val FilledGroup.EmojiSadSlight: ImageVector
    get() {
        if (_emojiSadSlight != null) {
            return _emojiSadSlight!!
        }
        _emojiSadSlight = Builder(name = "EmojiSadSlight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.75f, 14.001f)
                horizontalLineTo(16.35f)
                curveTo(16.7642f, 14.001f, 17.1f, 14.3368f, 17.1f, 14.751f)
                curveTo(17.1f, 15.1652f, 16.7642f, 15.501f, 16.35f, 15.501f)
                horizontalLineTo(15.75f)
                curveTo(15.1317f, 15.501f, 14.4129f, 15.6616f, 13.7525f, 15.9187f)
                curveTo(13.0833f, 16.1791f, 12.5548f, 16.5068f, 12.2803f, 16.7813f)
                curveTo(11.9874f, 17.0742f, 11.5126f, 17.0742f, 11.2197f, 16.7813f)
                curveTo(10.9268f, 16.4884f, 10.9268f, 16.0135f, 11.2197f, 15.7206f)
                curveTo(11.6952f, 15.2451f, 12.4324f, 14.8228f, 13.2085f, 14.5208f)
                curveTo(13.9934f, 14.2153f, 14.8995f, 14.001f, 15.75f, 14.001f)
                close()
            }
        }
        .build()
        return _emojiSadSlight!!
    }

private var _emojiSadSlight: ImageVector? = null
