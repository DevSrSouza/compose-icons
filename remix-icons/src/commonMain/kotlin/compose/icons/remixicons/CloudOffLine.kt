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

public val RemixIcons.CloudOffLine: ImageVector
    get() {
        if (_cloudOffLine != null) {
            return _cloudOffLine!!
        }
        _cloudOffLine = Builder(name = "CloudOffLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(7.0f, 9.0f)
                curveToRelative(0.0f, 0.081f, 0.002f, 0.163f, 0.006f, 0.243f)
                lineToRelative(0.07f, 1.488f)
                lineToRelative(-1.404f, 0.494f)
                arcTo(4.002f, 4.002f, 0.0f, false, false, 7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.186f, 0.0f, 0.369f, -0.013f, 0.548f, -0.037f)
                lineTo(7.03f, 8.445f)
                curveTo(7.01f, 8.627f, 7.0f, 8.812f, 7.0f, 9.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 6.992f, 7.339f)
                arcToRelative(6.003f, 6.003f, 0.0f, false, true, 3.212f, 8.65f)
                lineToRelative(-1.493f, -1.493f)
                arcToRelative(3.999f, 3.999f, 0.0f, false, false, -5.207f, -5.206f)
                lineTo(14.01f, 9.795f)
                curveTo(14.891f, 9.29f, 15.911f, 9.0f, 17.0f, 9.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.876f, -4.09f)
                lineToRelative(-1.43f, -1.43f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cloudOffLine!!
    }

private var _cloudOffLine: ImageVector? = null
