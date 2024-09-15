package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.FormatColor: ImageVector
    get() {
        if (_formatColor != null) {
            return _formatColor!!
        }
        _formatColor = Builder(name = "FormatColor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.948f, 3.209f)
                curveTo(12.772f, 2.832f, 12.391f, 2.616f, 12.0f, 2.633f)
                curveTo(11.609f, 2.617f, 11.228f, 2.833f, 11.052f, 3.209f)
                lineTo(5.135f, 15.898f)
                curveTo(4.902f, 16.398f, 5.119f, 16.993f, 5.619f, 17.227f)
                curveTo(6.12f, 17.46f, 6.715f, 17.244f, 6.948f, 16.743f)
                lineTo(8.399f, 13.632f)
                horizontalLineTo(15.601f)
                lineTo(17.052f, 16.743f)
                curveTo(17.285f, 17.243f, 17.88f, 17.46f, 18.381f, 17.227f)
                curveTo(18.881f, 16.993f, 19.098f, 16.398f, 18.865f, 15.898f)
                lineTo(12.948f, 3.209f)
                close()
                moveTo(14.669f, 11.632f)
                lineTo(12.0f, 5.909f)
                lineTo(9.331f, 11.632f)
                horizontalLineTo(14.669f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.368f)
                curveTo(5.448f, 19.368f, 5.0f, 19.816f, 5.0f, 20.368f)
                curveTo(5.0f, 20.92f, 5.448f, 21.368f, 6.0f, 21.368f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 21.368f, 19.0f, 20.92f, 19.0f, 20.368f)
                curveTo(19.0f, 19.816f, 18.552f, 19.368f, 18.0f, 19.368f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _formatColor!!
    }

private var _formatColor: ImageVector? = null
