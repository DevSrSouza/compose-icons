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

public val TwotoneGroup.AreaChart: ImageVector
    get() {
        if (_areaChart != null) {
            return _areaChart!!
        }
        _areaChart = Builder(name = "AreaChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.95f)
                lineToRelative(-7.0f, -5.45f)
                lineToRelative(-4.0f, 5.5f)
                lineToRelative(-3.0f, -2.4f)
                lineToRelative(0.0f, -3.6f)
                lineToRelative(2.44f, 1.83f)
                lineToRelative(4.96f, -6.95f)
                lineToRelative(3.9f, 3.12f)
                lineToRelative(2.7f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                lineToRelative(-5.0f, -4.0f)
                lineToRelative(-5.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(19.0f, 16.95f)
                lineToRelative(-7.0f, -5.45f)
                lineTo(8.0f, 17.0f)
                lineToRelative(-3.0f, -2.4f)
                verticalLineTo(11.0f)
                lineToRelative(2.44f, 1.83f)
                lineToRelative(4.96f, -6.95f)
                lineTo(16.3f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.95f)
                close()
            }
        }
        .build()
        return _areaChart!!
    }

private var _areaChart: ImageVector? = null
