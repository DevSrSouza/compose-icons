package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.Flip: ImageVector
    get() {
        if (_flip != null) {
            return _flip!!
        }
        _flip = Builder(name = "Flip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                lineToRelative(0.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.09f)
                verticalLineToRelative(12.0f)
                lineToRelative(-1.29f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineTo(7.0f, 18.09f)
                verticalLineToRelative(-12.0f)
                arcTo(1.56f, 1.56f, 0.0f, false, true, 8.53f, 4.5f)
                horizontalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(8.53f)
                arcTo(3.56f, 3.56f, 0.0f, false, false, 5.0f, 6.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.29f, 5.79f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 1.42f)
                lineTo(17.0f, 5.91f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, true, -1.53f, 1.59f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.47f)
                arcTo(3.56f, 3.56f, 0.0f, false, false, 19.0f, 17.91f)
                verticalLineToRelative(-12.0f)
                lineToRelative(1.29f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                close()
            }
        }
        .build()
        return _flip!!
    }

private var _flip: ImageVector? = null
