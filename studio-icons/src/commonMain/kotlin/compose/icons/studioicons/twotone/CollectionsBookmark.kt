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

public val TwotoneGroup.CollectionsBookmark: ImageVector
    get() {
        if (_collectionsBookmark != null) {
            return _collectionsBookmark!!
        }
        _collectionsBookmark = Builder(name = "CollectionsBookmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(-3.0f, -2.25f)
                lineTo(13.0f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(8.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(-1.0f, -0.75f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 4.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(3.0f, -2.25f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _collectionsBookmark!!
    }

private var _collectionsBookmark: ImageVector? = null
