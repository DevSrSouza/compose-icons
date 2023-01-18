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

public val RemixIcons.BlurOffLine: ImageVector
    get() {
        if (_blurOffLine != null) {
            return _blurOffLine!!
        }
        _blurOffLine = Builder(name = "BlurOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.154f, 19.568f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 5.432f, 6.846f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(19.799f, 19.8f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-3.038f, -3.04f)
                close()
                moveTo(6.847f, 8.262f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 9.891f, 9.89f)
                lineToRelative(-9.89f, -9.89f)
                close()
                moveTo(20.414f, 16.2f)
                lineToRelative(-1.599f, -1.599f)
                arcToRelative(6.995f, 6.995f, 0.0f, false, false, -1.865f, -6.55f)
                lineTo(12.0f, 3.1f)
                lineTo(9.657f, 5.443f)
                lineTo(8.243f, 4.03f)
                lineTo(12.0f, 0.272f)
                lineToRelative(6.364f, 6.364f)
                arcToRelative(9.002f, 9.002f, 0.0f, false, true, 2.05f, 9.564f)
                close()
            }
        }
        .build()
        return _blurOffLine!!
    }

private var _blurOffLine: ImageVector? = null
