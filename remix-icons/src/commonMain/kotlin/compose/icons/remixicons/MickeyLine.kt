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

public val RemixIcons.MickeyLine: ImageVector
    get() {
        if (_mickeyLine != null) {
            return _mickeyLine!!
        }
        _mickeyLine = Builder(name = "MickeyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.883f, 8.913f)
                lineToRelative(0.011f, 0.027f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.145f, 11.056f)
                lineTo(12.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.382f, -11.088f)
                arcTo(4.499f, 4.499f, 0.0f, false, true, 5.5f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.493f, 4.254f)
                lineToRelative(0.073f, -0.019f)
                arcTo(8.018f, 8.018f, 0.0f, false, true, 12.0f, 6.0f)
                lineToRelative(0.25f, 0.004f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.756f, 0.25f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 18.5f, 2.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(5.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                lineToRelative(0.164f, -0.005f)
                lineToRelative(0.103f, -0.01f)
                arcTo(8.044f, 8.044f, 0.0f, false, true, 7.594f, 7.32f)
                lineToRelative(0.33f, -0.206f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 4.0f)
                close()
                moveTo(18.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.466f, 2.916f)
                lineToRelative(0.043f, 0.2f)
                lineToRelative(0.028f, 0.016f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, 2.128f, 1.852f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 18.5f, 4.0f)
                close()
            }
        }
        .build()
        return _mickeyLine!!
    }

private var _mickeyLine: ImageVector? = null
