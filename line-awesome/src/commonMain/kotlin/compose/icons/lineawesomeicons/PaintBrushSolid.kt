package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.PaintBrushSolid: ImageVector
    get() {
        if (_paintBrushSolid != null) {
            return _paintBrushSolid!!
        }
        _paintBrushSolid = Builder(name = "PaintBrushSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.813f, 4.031f)
                curveTo(23.977f, 4.031f, 23.133f, 4.367f, 22.5f, 5.0f)
                lineTo(9.813f, 17.5f)
                lineTo(9.188f, 18.094f)
                curveTo(8.438f, 18.234f, 7.723f, 18.602f, 7.156f, 19.219f)
                curveTo(6.324f, 20.129f, 6.16f, 21.242f, 5.844f, 22.438f)
                curveTo(5.527f, 23.633f, 5.125f, 24.965f, 4.156f, 26.438f)
                lineTo(3.156f, 28.0f)
                lineTo(5.0f, 28.0f)
                curveTo(8.914f, 28.0f, 11.496f, 26.129f, 12.813f, 24.813f)
                lineTo(12.844f, 24.781f)
                curveTo(13.445f, 24.164f, 13.781f, 23.387f, 13.906f, 22.594f)
                lineTo(14.406f, 22.125f)
                lineTo(27.094f, 9.625f)
                lineTo(27.094f, 9.594f)
                curveTo(28.359f, 8.328f, 28.359f, 6.266f, 27.094f, 5.0f)
                curveTo(26.461f, 4.367f, 25.648f, 4.031f, 24.813f, 4.031f)
                close()
                moveTo(24.813f, 6.0f)
                curveTo(25.125f, 6.0f, 25.422f, 6.141f, 25.688f, 6.406f)
                curveTo(26.223f, 6.941f, 26.223f, 7.652f, 25.688f, 8.188f)
                lineTo(16.656f, 17.125f)
                lineTo(14.844f, 15.313f)
                lineTo(23.906f, 6.406f)
                curveTo(24.172f, 6.141f, 24.5f, 6.0f, 24.813f, 6.0f)
                close()
                moveTo(13.406f, 16.719f)
                lineTo(15.219f, 18.531f)
                lineTo(13.719f, 20.0f)
                lineTo(11.906f, 18.188f)
                close()
                moveTo(9.969f, 20.031f)
                curveTo(10.473f, 20.047f, 11.02f, 20.242f, 11.438f, 20.625f)
                curveTo(12.215f, 21.336f, 12.234f, 22.578f, 11.406f, 23.406f)
                curveTo(10.539f, 24.273f, 9.0f, 25.391f, 6.75f, 25.813f)
                curveTo(7.23f, 24.762f, 7.566f, 23.781f, 7.781f, 22.969f)
                curveTo(8.113f, 21.715f, 8.359f, 20.855f, 8.625f, 20.563f)
                curveTo(8.973f, 20.184f, 9.465f, 20.016f, 9.969f, 20.031f)
                close()
            }
        }
        .build()
        return _paintBrushSolid!!
    }

private var _paintBrushSolid: ImageVector? = null
