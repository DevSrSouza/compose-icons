package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.XTwitter: ImageVector
    get() {
        if (_xTwitter != null) {
            return _xTwitter!!
        }
        _xTwitter = Builder(name = "XTwitter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(389.2f, 48.0f)
                horizontalLineToRelative(70.6f)
                lineTo(305.6f, 224.2f)
                lineTo(487.0f, 464.0f)
                horizontalLineTo(345.0f)
                lineTo(233.7f, 318.6f)
                lineTo(106.5f, 464.0f)
                horizontalLineTo(35.8f)
                lineTo(200.7f, 275.5f)
                lineTo(26.8f, 48.0f)
                horizontalLineTo(172.4f)
                lineTo(272.9f, 180.9f)
                lineTo(389.2f, 48.0f)
                close()
                moveTo(364.4f, 421.8f)
                horizontalLineToRelative(39.1f)
                lineTo(151.1f, 88.0f)
                horizontalLineToRelative(-42.0f)
                lineTo(364.4f, 421.8f)
                close()
            }
        }
        .build()
        return _xTwitter!!
    }

private var _xTwitter: ImageVector? = null
