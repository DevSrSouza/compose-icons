package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Tornado: ImageVector
    get() {
        if (_tornado != null) {
            return _tornado!!
        }
        _tornado = Builder(name = "Tornado", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1f, 13.0f)
                lineToRelative(5.8f, 0.0f)
                lineToRelative(1.74f, -3.0f)
                lineToRelative(-9.28f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.01f)
                lineToRelative(1.74f, -3.01f)
                lineToRelative(-3.48f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.47f, 5.0f)
                lineToRelative(1.74f, 3.0f)
                lineToRelative(11.58f, 0.0f)
                lineToRelative(1.74f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.0f)
                lineToRelative(11.0f, 19.0f)
                lineTo(23.0f, 3.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(12.0f, 18.01f)
                lineTo(10.26f, 15.0f)
                horizontalLineToRelative(3.48f)
                lineTo(12.0f, 18.01f)
                close()
                moveTo(14.9f, 13.0f)
                horizontalLineTo(9.1f)
                lineToRelative(-1.74f, -3.0f)
                horizontalLineToRelative(9.27f)
                lineTo(14.9f, 13.0f)
                close()
                moveTo(6.21f, 8.0f)
                lineTo(4.47f, 5.0f)
                horizontalLineToRelative(15.06f)
                lineToRelative(-1.74f, 3.0f)
                horizontalLineTo(6.21f)
                close()
            }
        }
        .build()
        return _tornado!!
    }

private var _tornado: ImageVector? = null
