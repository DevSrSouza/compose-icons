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

public val TwotoneGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.09f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 4.91f)
                lineTo(5.0f, 4.91f)
                verticalLineToRelative(14.18f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 3.5f)
                lineTo(18.0f, 2.0f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(15.0f, 2.0f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(12.0f, 2.0f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(9.0f, 2.0f)
                lineTo(7.5f, 3.5f)
                lineTo(6.0f, 2.0f)
                lineTo(4.5f, 3.5f)
                lineTo(3.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineToRelative(1.5f, -1.5f)
                lineTo(6.0f, 22.0f)
                lineToRelative(1.5f, -1.5f)
                lineTo(9.0f, 22.0f)
                lineToRelative(1.5f, -1.5f)
                lineTo(12.0f, 22.0f)
                lineToRelative(1.5f, -1.5f)
                lineTo(15.0f, 22.0f)
                lineToRelative(1.5f, -1.5f)
                lineTo(18.0f, 22.0f)
                lineToRelative(1.5f, -1.5f)
                lineTo(21.0f, 22.0f)
                lineTo(21.0f, 2.0f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(19.0f, 19.09f)
                lineTo(5.0f, 19.09f)
                lineTo(5.0f, 4.91f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.18f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 17.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 13.0f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 9.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
