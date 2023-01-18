package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(13.1287f)
                curveTo(21.0f, 13.7254f, 20.7629f, 14.2977f, 20.341f, 14.7197f)
                lineTo(14.7197f, 20.341f)
                curveTo(14.2977f, 20.7629f, 13.7254f, 21.0f, 13.1287f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(13.0f)
                lineTo(13.0009f, 16.4365f)
                curveTo(12.7798f, 16.4695f, 12.555f, 16.4914f, 12.3268f, 16.502f)
                lineTo(12.0009f, 16.5096f)
                curveTo(10.6524f, 16.5096f, 9.4199f, 16.1277f, 8.3233f, 15.3693f)
                curveTo(7.9827f, 15.1337f, 7.8975f, 14.6665f, 8.1331f, 14.3259f)
                curveTo(8.3688f, 13.9852f, 8.8359f, 13.9f, 9.1766f, 14.1357f)
                curveTo(10.0214f, 14.72f, 10.9562f, 15.0096f, 12.0009f, 15.0096f)
                curveTo(12.4632f, 15.0096f, 12.904f, 14.9529f, 13.325f, 14.839f)
                curveTo(13.8209f, 13.8102f, 14.8412f, 13.0847f, 16.0382f, 13.0069f)
                lineTo(16.2512f, 13.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(18.439f, 14.5f)
                horizontalLineTo(16.2514f)
                curveTo(15.3332f, 14.5003f, 14.58f, 15.2074f, 14.5066f, 16.1066f)
                lineTo(14.5007f, 16.2501f)
                lineTo(14.5f, 18.439f)
                lineTo(18.439f, 14.5f)
                close()
                moveTo(9.0005f, 7.7512f)
                curveTo(9.6904f, 7.7512f, 10.2497f, 8.3105f, 10.2497f, 9.0005f)
                curveTo(10.2497f, 9.6904f, 9.6904f, 10.2497f, 9.0005f, 10.2497f)
                curveTo(8.3105f, 10.2497f, 7.7512f, 9.6904f, 7.7512f, 9.0005f)
                curveTo(7.7512f, 8.3105f, 8.3105f, 7.7512f, 9.0005f, 7.7512f)
                close()
                moveTo(15.0004f, 7.7512f)
                curveTo(15.6904f, 7.7512f, 16.2497f, 8.3105f, 16.2497f, 9.0005f)
                curveTo(16.2497f, 9.6904f, 15.6904f, 10.2497f, 15.0004f, 10.2497f)
                curveTo(14.3105f, 10.2497f, 13.7512f, 9.6904f, 13.7512f, 9.0005f)
                curveTo(13.7512f, 8.3105f, 14.3105f, 7.7512f, 15.0004f, 7.7512f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
