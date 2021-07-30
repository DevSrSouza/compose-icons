package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Lbry: ImageVector
    get() {
        if (_lbry != null) {
            return _lbry!!
        }
        _lbry = Builder(name = "Lbry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.3493f, 14.1894f)
                lineToRelative(0.169f, -1.0651f)
                lineToRelative(-1.0315f, -0.1775f)
                lineToRelative(0.0676f, -0.4142f)
                lineToRelative(1.4456f, 0.245f)
                lineToRelative(-0.2365f, 1.4795f)
                close()
                moveTo(23.5013f, 8.6944f)
                verticalLineToRelative(1.1921f)
                lineToRelative(-11.7338f, 7.211f)
                lineToRelative(-8.8425f, -4.3367f)
                lineToRelative(0.0169f, -0.6677f)
                lineToRelative(8.7918f, 4.3282f)
                lineToRelative(11.1759f, -6.8644f)
                verticalLineToRelative(-0.4904f)
                lineTo(12.3592f, 3.9773f)
                lineTo(0.5917f, 11.2561f)
                verticalLineToRelative(3.2547f)
                lineToRelative(11.142f, 5.5119f)
                lineToRelative(11.6322f, -7.135f)
                lineToRelative(0.33f, 0.5074f)
                lineToRelative(-11.9284f, 7.3038f)
                lineTo(0.0f, 14.8828f)
                verticalLineToRelative(-3.9563f)
                lineTo(12.3254f, 3.301f)
                close()
            }
        }
        .build()
        return _lbry!!
    }

private var _lbry: ImageVector? = null
