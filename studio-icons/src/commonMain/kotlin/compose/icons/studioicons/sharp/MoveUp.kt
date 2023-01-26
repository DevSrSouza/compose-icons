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

public val SharpGroup.MoveUp: ImageVector
    get() {
        if (_moveUp != null) {
            return _moveUp!!
        }
        _moveUp = Builder(name = "MoveUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                curveToRelative(0.0f, -2.45f, 1.76f, -4.47f, 4.08f, -4.91f)
                lineTo(5.59f, 9.59f)
                lineTo(7.0f, 11.0f)
                lineToRelative(4.0f, -4.01f)
                lineTo(7.0f, 3.0f)
                lineTo(5.59f, 4.41f)
                lineToRelative(1.58f, 1.58f)
                lineToRelative(0.0f, 0.06f)
                curveTo(3.7f, 6.46f, 1.0f, 9.42f, 1.0f, 13.0f)
                curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.24f, 18.0f, 3.0f, 15.76f, 3.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _moveUp!!
    }

private var _moveUp: ImageVector? = null
