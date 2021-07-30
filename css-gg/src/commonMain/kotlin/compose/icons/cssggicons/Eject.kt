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

public val CssGgIcons.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9498f, 14.3948f)
                lineTo(18.364f, 12.9805f)
                lineTo(12.0f, 6.6166f)
                lineTo(5.6361f, 12.9805f)
                lineTo(7.0503f, 14.3948f)
                lineTo(12.0f, 9.445f)
                lineTo(16.9498f, 14.3948f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0001f, 17.3835f)
                horizontalLineTo(18.0001f)
                verticalLineTo(15.3835f)
                horizontalLineTo(6.0001f)
                verticalLineTo(17.3835f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
