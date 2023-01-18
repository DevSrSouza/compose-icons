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

public val RemixIcons.MoonCloudyFill: ImageVector
    get() {
        if (_moonCloudyFill != null) {
            return _moonCloudyFill!!
        }
        _moonCloudyFill = Builder(name = "MoonCloudyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.67f, 5.007f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.55f, -3.901f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 5.674f, 5.674f)
                curveToRelative(0.07f, 0.396f, 0.106f, 0.804f, 0.106f, 1.22f)
                arcToRelative(6.969f, 6.969f, 0.0f, false, true, -0.865f, 3.373f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.5f, 21.0f)
                lineTo(9.0f, 21.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.33f, -15.993f)
                close()
                moveTo(10.847f, 5.214f)
                arcToRelative(8.016f, 8.016f, 0.0f, false, true, 5.61f, 4.885f)
                arcToRelative(5.529f, 5.529f, 0.0f, false, true, 2.96f, 0.245f)
                curveToRelative(0.226f, -0.425f, 0.393f, -0.885f, 0.488f, -1.37f)
                arcToRelative(6.502f, 6.502f, 0.0f, false, true, -5.878f, -5.88f)
                arcToRelative(5.003f, 5.003f, 0.0f, false, false, -3.18f, 2.12f)
                close()
            }
        }
        .build()
        return _moonCloudyFill!!
    }

private var _moonCloudyFill: ImageVector? = null
