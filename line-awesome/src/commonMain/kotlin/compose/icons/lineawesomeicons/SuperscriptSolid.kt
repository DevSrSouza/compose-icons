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

public val LineAwesomeIcons.SuperscriptSolid: ImageVector
    get() {
        if (_superscriptSolid != null) {
            return _superscriptSolid!!
        }
        _superscriptSolid = Builder(name = "SuperscriptSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.969f, 3.0f)
                curveTo(23.344f, 3.0f, 22.0f, 4.344f, 22.0f, 5.969f)
                lineTo(22.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 5.969f)
                curveTo(24.0f, 5.422f, 24.422f, 5.0f, 24.969f, 5.0f)
                lineTo(25.031f, 5.0f)
                curveTo(25.578f, 5.0f, 26.0f, 5.422f, 26.0f, 5.969f)
                curveTo(26.0f, 6.285f, 25.855f, 6.57f, 25.594f, 6.75f)
                lineTo(23.469f, 8.219f)
                curveTo(22.555f, 8.848f, 22.0f, 9.891f, 22.0f, 11.0f)
                lineTo(22.0f, 12.0f)
                lineTo(28.0f, 12.0f)
                lineTo(28.0f, 10.0f)
                lineTo(24.531f, 10.0f)
                curveTo(24.57f, 9.969f, 24.551f, 9.902f, 24.594f, 9.875f)
                lineTo(26.719f, 8.406f)
                curveTo(27.523f, 7.852f, 28.0f, 6.945f, 28.0f, 5.969f)
                curveTo(28.0f, 4.344f, 26.656f, 3.0f, 25.031f, 3.0f)
                close()
                moveTo(4.156f, 8.0f)
                lineTo(5.156f, 9.531f)
                lineTo(9.313f, 16.0f)
                lineTo(5.156f, 22.469f)
                lineTo(4.156f, 24.0f)
                lineTo(10.531f, 24.0f)
                lineTo(10.844f, 23.531f)
                lineTo(12.5f, 20.969f)
                lineTo(14.156f, 23.531f)
                lineTo(14.469f, 24.0f)
                lineTo(20.844f, 24.0f)
                lineTo(19.844f, 22.469f)
                lineTo(15.688f, 16.0f)
                lineTo(19.844f, 9.531f)
                lineTo(20.844f, 8.0f)
                lineTo(14.469f, 8.0f)
                lineTo(14.156f, 8.469f)
                lineTo(12.5f, 11.031f)
                lineTo(10.844f, 8.469f)
                lineTo(10.531f, 8.0f)
                close()
                moveTo(7.813f, 10.0f)
                lineTo(9.469f, 10.0f)
                lineTo(11.656f, 13.438f)
                lineTo(12.5f, 14.75f)
                lineTo(13.344f, 13.438f)
                lineTo(15.531f, 10.0f)
                lineTo(17.188f, 10.0f)
                lineTo(13.656f, 15.469f)
                lineTo(13.313f, 16.0f)
                lineTo(13.656f, 16.531f)
                lineTo(17.188f, 22.0f)
                lineTo(15.531f, 22.0f)
                lineTo(13.344f, 18.563f)
                lineTo(12.5f, 17.25f)
                lineTo(11.656f, 18.563f)
                lineTo(9.469f, 22.0f)
                lineTo(7.813f, 22.0f)
                lineTo(11.344f, 16.531f)
                lineTo(11.688f, 16.0f)
                lineTo(11.344f, 15.469f)
                close()
            }
        }
        .build()
        return _superscriptSolid!!
    }

private var _superscriptSolid: ImageVector? = null
