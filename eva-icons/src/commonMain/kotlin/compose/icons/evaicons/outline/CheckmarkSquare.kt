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

public val OutlineGroup.CheckmarkSquare: ImageVector
    get() {
        if (_checkmarkSquare != null) {
            return _checkmarkSquare!!
        }
        _checkmarkSquare = Builder(name = "CheckmarkSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineTo(18.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.6f, 0.6f)
                horizontalLineTo(5.6f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.6f, -0.6f)
                verticalLineTo(5.6f)
                arcTo(0.6f, 0.6f, 0.0f, false, true, 5.6f, 5.0f)
                horizontalLineToRelative(9.57f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineTo(5.6f)
                arcTo(2.61f, 2.61f, 0.0f, false, false, 3.0f, 5.6f)
                verticalLineTo(18.4f)
                arcTo(2.61f, 2.61f, 0.0f, false, false, 5.6f, 21.0f)
                horizontalLineTo(18.4f)
                arcTo(2.61f, 2.61f, 0.0f, false, false, 21.0f, 18.4f)
                verticalLineTo(12.83f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 11.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.72f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.44f, 1.38f)
                lineToRelative(2.22f, 2.33f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.72f, 0.31f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.72f, -0.3f)
                lineToRelative(6.78f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.44f, -1.4f)
                lineToRelative(-6.05f, 6.26f)
                close()
            }
        }
        .build()
        return _checkmarkSquare!!
    }

private var _checkmarkSquare: ImageVector? = null
