package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CompressLeft: ImageVector
    get() {
        if (_compressLeft != null) {
            return _compressLeft!!
        }
        _compressLeft = Builder(name = "CompressLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.979f, 9.457f)
                lineTo(4.409f, 9.454f)
                lineTo(4.407f, 11.454f)
                lineTo(11.407f, 11.46f)
                lineTo(11.413f, 4.46f)
                lineTo(9.413f, 4.458f)
                lineTo(9.41f, 8.06f)
                lineTo(3.096f, 1.769f)
                lineTo(1.685f, 3.186f)
                lineTo(7.979f, 9.457f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.562f, 14.552f)
                lineTo(19.553f, 12.552f)
                lineTo(12.554f, 12.58f)
                lineTo(12.581f, 19.58f)
                lineTo(14.581f, 19.572f)
                lineTo(14.567f, 15.971f)
                lineTo(20.91f, 22.231f)
                lineTo(22.315f, 20.807f)
                lineTo(15.991f, 14.566f)
                lineTo(19.562f, 14.552f)
                close()
            }
        }
        .build()
        return _compressLeft!!
    }

private var _compressLeft: ImageVector? = null
