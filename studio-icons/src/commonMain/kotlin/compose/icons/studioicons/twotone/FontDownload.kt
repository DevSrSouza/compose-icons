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

public val TwotoneGroup.FontDownload: ImageVector
    get() {
        if (_fontDownload != null) {
            return _fontDownload!!
        }
        _fontDownload = Builder(name = "FontDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(11.07f, 5.5f)
                horizontalLineToRelative(1.86f)
                lineToRelative(5.11f, 13.0f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(-1.14f, -3.0f)
                lineTo(9.17f, 15.5f)
                lineToRelative(-1.12f, 3.0f)
                lineTo(5.96f, 18.5f)
                lineToRelative(5.11f, -13.0f)
                close()
                moveTo(12.0f, 7.98f)
                lineTo(9.93f, 13.5f)
                horizontalLineToRelative(4.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.17f, 15.5f)
                horizontalLineToRelative(5.64f)
                lineToRelative(1.14f, 3.0f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-5.11f, -13.0f)
                horizontalLineToRelative(-1.86f)
                lineToRelative(-5.11f, 13.0f)
                horizontalLineToRelative(2.09f)
                lineToRelative(1.12f, -3.0f)
                close()
                moveTo(12.0f, 7.98f)
                lineToRelative(2.07f, 5.52f)
                lineTo(9.93f, 13.5f)
                lineTo(12.0f, 7.98f)
                close()
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _fontDownload!!
    }

private var _fontDownload: ImageVector? = null
