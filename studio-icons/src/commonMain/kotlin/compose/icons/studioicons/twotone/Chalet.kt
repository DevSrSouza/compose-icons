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

public val TwotoneGroup.Chalet: ImageVector
    get() {
        if (_chalet != null) {
            return _chalet!!
        }
        _chalet = Builder(name = "Chalet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 18.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -4.67f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 15.0f)
                lineTo(10.0f, 7.5f)
                lineTo(2.5f, 15.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(5.0f, 15.33f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-4.67f)
                lineToRelative(1.09f, 1.09f)
                lineTo(17.5f, 15.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-4.67f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(22.0f, 7.5f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(19.39f, 7.5f)
                horizontalLineTo(18.5f)
                verticalLineToRelative(0.89f)
                lineToRelative(1.45f, 1.45f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(18.5f, 9.81f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.81f)
                lineToRelative(-0.75f, 0.75f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(1.45f, -1.45f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-1.45f, 1.45f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(0.75f, -0.75f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.19f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(1.45f, 1.45f)
                horizontalLineToRelative(0.89f)
                verticalLineTo(5.61f)
                lineToRelative(-1.45f, -1.45f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(0.75f, 0.75f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.19f)
                lineToRelative(0.75f, -0.75f)
                lineToRelative(0.71f, 0.71f)
                lineTo(18.5f, 5.61f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(0.89f)
                lineToRelative(1.45f, -1.45f)
                lineToRelative(0.71f, 0.71f)
                lineTo(20.81f, 6.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _chalet!!
    }

private var _chalet: ImageVector? = null
