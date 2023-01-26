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

public val TwotoneGroup.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) {
            return _thumbDown!!
        }
        _thumbDown = Builder(name = "ThumbDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-1.34f, 5.34f)
                lineTo(15.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                curveToRelative(-0.83f, 0.0f, -1.54f, 0.5f, -1.84f, 1.22f)
                lineToRelative(-3.02f, 7.05f)
                curveToRelative(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.31f)
                lineToRelative(-0.95f, 4.57f)
                lineToRelative(-0.03f, 0.32f)
                curveToRelative(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f)
                lineTo(9.83f, 23.0f)
                lineToRelative(6.59f, -6.59f)
                curveToRelative(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f)
                lineTo(17.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineToRelative(-4.34f, 4.34f)
                lineTo(12.0f, 14.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, -7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
