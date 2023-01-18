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

public val RemixIcons.ZhihuLine: ImageVector
    get() {
        if (_zhihuLine != null) {
            return _zhihuLine!!
        }
        _zhihuLine = Builder(name = "ZhihuLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.344f, 17.963f)
                lineToRelative(-1.688f, 1.074f)
                lineToRelative(-2.131f, -3.35f)
                curveToRelative(-0.44f, 1.402f, -1.172f, 2.665f, -2.139f, 3.825f)
                curveToRelative(-0.402f, 0.483f, -0.82f, 0.918f, -1.301f, 1.375f)
                curveToRelative(-0.155f, 0.147f, -0.775f, 0.717f, -0.878f, 0.82f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(0.139f, -0.139f, 0.787f, -0.735f, 0.915f, -0.856f)
                curveToRelative(0.43f, -0.408f, 0.795f, -0.79f, 1.142f, -1.206f)
                curveToRelative(1.266f, -1.518f, 2.03f, -3.21f, 2.137f, -5.231f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(-0.868f)
                curveToRelative(-0.689f, 1.266f, -1.558f, 2.222f, -2.618f, 2.857f)
                lineTo(2.486f, 8.143f)
                curveToRelative(1.395f, -0.838f, 2.425f, -2.604f, 3.038f, -5.36f)
                lineToRelative(1.952f, 0.434f)
                curveToRelative(-0.14f, 0.633f, -0.303f, 1.227f, -0.489f, 1.783f)
                lineTo(11.5f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                lineTo(9.185f, 13.0f)
                lineToRelative(3.159f, 4.963f)
                close()
                moveTo(16.182f, 17.893f)
                lineTo(17.298f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(0.736f)
                lineToRelative(0.446f, 0.893f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.5f, 2.0f)
                lineToRelative(-1.0f, -2.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 5.0f)
                close()
            }
        }
        .build()
        return _zhihuLine!!
    }

private var _zhihuLine: ImageVector? = null
