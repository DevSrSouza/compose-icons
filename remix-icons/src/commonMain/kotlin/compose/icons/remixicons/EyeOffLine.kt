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

public val RemixIcons.EyeOffLine: ImageVector
    get() {
        if (_eyeOffLine != null) {
            return _eyeOffLine!!
        }
        _eyeOffLine = Builder(name = "EyeOffLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.882f, 19.297f)
                arcTo(10.949f, 10.949f, 0.0f, false, true, 12.0f, 21.0f)
                curveToRelative(-5.392f, 0.0f, -9.878f, -3.88f, -10.819f, -9.0f)
                arcToRelative(10.982f, 10.982f, 0.0f, false, true, 3.34f, -6.066f)
                lineTo(1.392f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(19.799f, 19.8f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-3.31f, -3.31f)
                close()
                moveTo(5.935f, 7.35f)
                arcTo(8.965f, 8.965f, 0.0f, false, false, 3.223f, 12.0f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, false, 13.201f, 5.838f)
                lineToRelative(-2.028f, -2.028f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.19f, 9.604f)
                lineTo(5.935f, 7.35f)
                close()
                moveTo(12.914f, 14.328f)
                lineToRelative(-3.242f, -3.242f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.241f, 3.241f)
                close()
                moveTo(20.807f, 16.592f)
                lineToRelative(-1.431f, -1.43f)
                arcTo(8.935f, 8.935f, 0.0f, false, false, 20.777f, 12.0f)
                arcTo(9.005f, 9.005f, 0.0f, false, false, 9.552f, 5.338f)
                lineTo(7.974f, 3.76f)
                curveTo(9.221f, 3.27f, 10.58f, 3.0f, 12.0f, 3.0f)
                curveToRelative(5.392f, 0.0f, 9.878f, 3.88f, 10.819f, 9.0f)
                arcToRelative(10.947f, 10.947f, 0.0f, false, true, -2.012f, 4.592f)
                close()
                moveTo(11.723f, 7.508f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.769f, 4.769f)
                lineToRelative(-4.77f, -4.769f)
                close()
            }
        }
        .build()
        return _eyeOffLine!!
    }

private var _eyeOffLine: ImageVector? = null
