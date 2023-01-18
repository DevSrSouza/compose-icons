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

public val RemixIcons.CloudOffFill: ImageVector
    get() {
        if (_cloudOffFill != null) {
            return _cloudOffFill!!
        }
        _cloudOffFill = Builder(name = "CloudOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.515f, 2.1f)
                lineToRelative(19.092f, 19.092f)
                lineToRelative(-1.415f, 1.415f)
                lineToRelative(-2.014f, -2.015f)
                arcTo(5.985f, 5.985f, 0.0f, false, true, 17.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 5.008f, 9.339f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, true, 0.353f, -2.563f)
                lineTo(2.1f, 3.514f)
                lineTo(3.515f, 2.1f)
                close()
                moveTo(17.0f, 9.0f)
                arcToRelative(6.003f, 6.003f, 0.0f, false, true, 5.204f, 8.989f)
                lineTo(14.01f, 9.796f)
                curveTo(14.89f, 9.29f, 15.91f, 9.0f, 17.0f, 9.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.003f, 7.003f, 0.0f, false, true, 6.765f, 5.195f)
                arcToRelative(8.027f, 8.027f, 0.0f, false, false, -6.206f, 1.15f)
                lineTo(7.694f, 3.48f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cloudOffFill!!
    }

private var _cloudOffFill: ImageVector? = null
