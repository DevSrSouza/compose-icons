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

public val CssGgIcons.Linear: ImageVector
    get() {
        if (_linear != null) {
            return _linear!!
        }
        _linear = Builder(name = "Linear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0351f, 12.9431f)
                curveTo(3.2424f, 14.9227f, 4.1047f, 16.8468f, 5.6219f, 18.364f)
                curveTo(7.139f, 19.8811f, 9.0631f, 20.7434f, 11.0428f, 20.9508f)
                lineTo(3.0351f, 12.9431f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.4938f)
                lineTo(12.4921f, 20.9858f)
                curveTo(13.2976f, 20.9407f, 14.0981f, 20.7879f, 14.8704f, 20.5273f)
                lineTo(3.4585f, 9.1155f)
                curveTo(3.1979f, 9.8877f, 3.0451f, 10.6883f, 3.0f, 11.4938f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8672f, 8.11f)
                lineTo(15.8758f, 20.1186f)
                curveTo(16.4988f, 19.8201f, 17.0946f, 19.4458f, 17.6493f, 18.9956f)
                lineTo(4.9902f, 6.3366f)
                curveTo(4.5401f, 6.8913f, 4.1657f, 7.487f, 3.8672f, 8.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.663f, 5.5952f)
                curveTo(9.1809f, 2.1214f, 14.8488f, 2.135f, 18.3498f, 5.636f)
                curveTo(21.8508f, 9.1371f, 21.8645f, 14.8049f, 18.3907f, 18.3228f)
                lineTo(5.663f, 5.5952f)
                close()
            }
        }
        .build()
        return _linear!!
    }

private var _linear: ImageVector? = null
