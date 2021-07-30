package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Cast: ImageVector
    get() {
        if (_cast != null) {
            return _cast!!
        }
        _cast = Builder(name = "Cast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4f, 3.0f)
                horizontalLineTo(5.6f)
                arcTo(2.7f, 2.7f, 0.0f, false, false, 3.0f, 5.78f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 7.0f)
                verticalLineTo(5.78f)
                arcTo(0.72f, 0.72f, 0.0f, false, true, 5.6f, 5.0f)
                horizontalLineTo(18.4f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.6f, 0.78f)
                verticalLineTo(18.22f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -0.6f, 0.78f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.4f)
                arcTo(2.7f, 2.7f, 0.0f, false, false, 21.0f, 18.22f)
                verticalLineTo(5.78f)
                arcTo(2.7f, 2.7f, 0.0f, false, false, 18.4f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.86f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 15.17f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.14f, 16.0f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, 2.12f, 0.72f)
                arcToRelative(2.52f, 2.52f, 0.0f, false, true, 0.51f, 2.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.48f, 1.33f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, 0.42f, 0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.91f, -0.58f)
                arcTo(4.52f, 4.52f, 0.0f, false, false, 3.86f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.86f, 10.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.28f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.09f, 1.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.53f, 5.95f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.44f, 21.0f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.28f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.82f, -10.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _cast!!
    }

private var _cast: ImageVector? = null
