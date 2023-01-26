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

public val TwotoneGroup.LocalConvenienceStore: ImageVector
    get() {
        if (_localConvenienceStore != null) {
            return _localConvenienceStore!!
        }
        _localConvenienceStore = Builder(name = "LocalConvenienceStore", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _localConvenienceStore!!
    }

private var _localConvenienceStore: ImageVector? = null
