package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Broadcast16: ImageVector
    get() {
        if (_broadcast16 != null) {
            return _broadcast16!!
        }
        _broadcast16 = Builder(name = "Broadcast16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.267f, 1.457f)
                curveToRelative(0.3f, 0.286f, 0.312f, 0.76f, 0.026f, 1.06f)
                arcTo(6.475f, 6.475f, 0.0f, false, false, 1.5f, 7.0f)
                arcToRelative(6.472f, 6.472f, 0.0f, false, false, 1.793f, 4.483f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.086f, 1.034f)
                arcToRelative(8.89f, 8.89f, 0.0f, false, true, -0.276f, -0.304f)
                lineToRelative(0.569f, -0.49f)
                lineToRelative(-0.569f, 0.49f)
                arcTo(7.971f, 7.971f, 0.0f, false, true, 0.0f, 7.0f)
                curveToRelative(0.0f, -2.139f, 0.84f, -4.083f, 2.207f, -5.517f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -0.026f)
                close()
                moveTo(12.733f, 1.457f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.026f)
                arcTo(7.975f, 7.975f, 0.0f, false, true, 16.0f, 7.0f)
                curveToRelative(0.0f, 2.139f, -0.84f, 4.083f, -2.207f, 5.517f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.086f, -1.034f)
                arcTo(6.475f, 6.475f, 0.0f, false, false, 14.5f, 7.0f)
                arcToRelative(6.475f, 6.475f, 0.0f, false, false, -1.793f, -4.483f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.026f, -1.06f)
                close()
                moveTo(8.75f, 8.582f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -1.5f, 0.0f)
                verticalLineToRelative(5.668f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(8.75f, 8.582f)
                close()
                moveTo(5.331f, 4.736f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.143f, -0.972f)
                arcTo(4.983f, 4.983f, 0.0f, false, false, 3.0f, 7.0f)
                curveToRelative(0.0f, 1.227f, 0.443f, 2.352f, 1.177f, 3.222f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.146f, -0.967f)
                arcTo(3.483f, 3.483f, 0.0f, false, true, 4.5f, 7.0f)
                curveToRelative(0.0f, -0.864f, 0.312f, -1.654f, 0.831f, -2.264f)
                close()
                moveTo(11.823f, 3.778f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.146f, 0.967f)
                curveToRelative(0.514f, 0.61f, 0.823f, 1.395f, 0.823f, 2.255f)
                curveToRelative(0.0f, 0.86f, -0.31f, 1.646f, -0.823f, 2.255f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.146f, 0.967f)
                arcTo(4.983f, 4.983f, 0.0f, false, false, 13.0f, 7.0f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, -1.177f, -3.222f)
                close()
            }
        }
        .build()
        return _broadcast16!!
    }

private var _broadcast16: ImageVector? = null
