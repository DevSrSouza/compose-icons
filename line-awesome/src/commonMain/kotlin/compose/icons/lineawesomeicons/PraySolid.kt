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

public val LineAwesomeIcons.PraySolid: ImageVector
    get() {
        if (_praySolid != null) {
            return _praySolid!!
        }
        _praySolid = Builder(name = "PraySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 4.0f)
                curveTo(15.57f, 4.0f, 14.0f, 5.57f, 14.0f, 7.5f)
                curveTo(14.0f, 9.43f, 15.57f, 11.0f, 17.5f, 11.0f)
                curveTo(19.43f, 11.0f, 21.0f, 9.43f, 21.0f, 7.5f)
                curveTo(21.0f, 5.57f, 19.43f, 4.0f, 17.5f, 4.0f)
                close()
                moveTo(17.5f, 6.0f)
                curveTo(18.327f, 6.0f, 19.0f, 6.673f, 19.0f, 7.5f)
                curveTo(19.0f, 8.327f, 18.327f, 9.0f, 17.5f, 9.0f)
                curveTo(16.673f, 9.0f, 16.0f, 8.327f, 16.0f, 7.5f)
                curveTo(16.0f, 6.673f, 16.673f, 6.0f, 17.5f, 6.0f)
                close()
                moveTo(13.156f, 12.0f)
                curveTo(12.053f, 12.0f, 11.061f, 12.655f, 10.627f, 13.67f)
                lineTo(8.66f, 18.256f)
                curveTo(8.141f, 19.468f, 8.464f, 20.859f, 9.525f, 21.764f)
                lineTo(13.943f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 27.0f)
                lineTo(15.484f, 27.0f)
                curveTo(16.133f, 27.0f, 16.706f, 26.588f, 16.908f, 25.971f)
                curveTo(17.11f, 25.354f, 16.892f, 24.682f, 16.369f, 24.299f)
                lineTo(10.768f, 20.197f)
                curveTo(10.434f, 19.911f, 10.325f, 19.449f, 10.498f, 19.045f)
                lineTo(12.465f, 14.457f)
                curveTo(12.668f, 13.983f, 13.369f, 13.866f, 13.715f, 14.244f)
                lineTo(16.148f, 18.232f)
                lineTo(16.221f, 18.336f)
                curveTo(16.536f, 18.729f, 17.006f, 18.971f, 17.508f, 18.998f)
                curveTo(18.019f, 19.024f, 18.502f, 18.836f, 18.857f, 18.48f)
                lineTo(22.779f, 13.629f)
                lineTo(21.223f, 12.371f)
                lineTo(17.631f, 16.822f)
                lineTo(15.381f, 13.137f)
                lineTo(15.309f, 13.033f)
                curveTo(14.783f, 12.376f, 13.997f, 12.0f, 13.156f, 12.0f)
                close()
            }
        }
        .build()
        return _praySolid!!
    }

private var _praySolid: ImageVector? = null
