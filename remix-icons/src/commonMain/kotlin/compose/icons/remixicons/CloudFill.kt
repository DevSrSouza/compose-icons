package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CloudFill: ImageVector
    get() {
        if (_cloudFill != null) {
            return _cloudFill!!
        }
        _cloudFill = Builder(name = "CloudFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, false, -7.493f, 5.19f)
                lineToRelative(1.874f, 0.703f)
                arcTo(6.002f, 6.002f, 0.0f, false, true, 23.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(7.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 5.008f, 9.339f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 13.757f, -2.143f)
                arcTo(8.027f, 8.027f, 0.0f, false, false, 17.0f, 7.0f)
                close()
            }
        }
        .build()
        return _cloudFill!!
    }

private var _cloudFill: ImageVector? = null
