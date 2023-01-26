package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ViewInAr: ImageVector
    get() {
        if (_viewInAr != null) {
            return _viewInAr!!
        }
        _viewInAr = Builder(name = "ViewInAr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.97f)
                lineToRelative(-7.0f, -4.03f)
                lineTo(5.0f, 7.97f)
                verticalLineToRelative(8.06f)
                lineToRelative(7.0f, 4.03f)
                lineToRelative(7.0f, -4.03f)
                verticalLineTo(7.97f)
                close()
                moveTo(11.0f, 17.17f)
                lineToRelative(-4.0f, -2.3f)
                verticalLineToRelative(-4.63f)
                lineToRelative(4.0f, 2.33f)
                verticalLineTo(17.17f)
                close()
                moveTo(12.0f, 10.84f)
                lineTo(8.04f, 8.53f)
                lineTo(12.0f, 6.25f)
                lineToRelative(3.96f, 2.28f)
                lineTo(12.0f, 10.84f)
                close()
                moveTo(17.0f, 14.87f)
                lineToRelative(-4.0f, 2.3f)
                verticalLineToRelative(-4.6f)
                lineToRelative(4.0f, -2.33f)
                verticalLineTo(14.87f)
                close()
            }
        }
        .build()
        return _viewInAr!!
    }

private var _viewInAr: ImageVector? = null
