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

public val RemixIcons.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.154f, 14.0f)
                curveToRelative(0.23f, 0.516f, 0.346f, 1.09f, 0.346f, 1.72f)
                curveToRelative(0.0f, 1.342f, -0.524f, 2.392f, -1.571f, 3.147f)
                curveTo(14.88f, 19.622f, 13.433f, 20.0f, 11.586f, 20.0f)
                curveToRelative(-1.64f, 0.0f, -3.263f, -0.381f, -4.87f, -1.144f)
                lineTo(6.716f, 16.6f)
                curveToRelative(1.52f, 0.877f, 3.075f, 1.316f, 4.666f, 1.316f)
                curveToRelative(2.551f, 0.0f, 3.83f, -0.732f, 3.839f, -2.197f)
                arcToRelative(2.21f, 2.21f, 0.0f, false, false, -0.648f, -1.603f)
                lineToRelative(-0.12f, -0.117f)
                lineTo(3.0f, 13.999f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.846f)
                close()
                moveTo(13.076f, 11.0f)
                lineTo(7.629f, 11.0f)
                arcToRelative(4.086f, 4.086f, 0.0f, false, true, -0.481f, -0.522f)
                curveTo(6.716f, 9.92f, 6.5f, 9.246f, 6.5f, 8.452f)
                curveToRelative(0.0f, -1.236f, 0.466f, -2.287f, 1.397f, -3.153f)
                curveTo(8.83f, 4.433f, 10.271f, 4.0f, 12.222f, 4.0f)
                curveToRelative(1.471f, 0.0f, 2.879f, 0.328f, 4.222f, 0.984f)
                verticalLineToRelative(2.152f)
                curveToRelative(-1.2f, -0.687f, -2.515f, -1.03f, -3.946f, -1.03f)
                curveToRelative(-2.48f, 0.0f, -3.719f, 0.782f, -3.719f, 2.346f)
                curveToRelative(0.0f, 0.42f, 0.218f, 0.786f, 0.654f, 1.099f)
                curveToRelative(0.436f, 0.313f, 0.974f, 0.562f, 1.613f, 0.75f)
                curveToRelative(0.62f, 0.18f, 1.297f, 0.414f, 2.03f, 0.699f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
