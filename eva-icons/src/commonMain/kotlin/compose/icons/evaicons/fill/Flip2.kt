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

public val FillGroup.Flip2: ImageVector
    get() {
        if (_flip2 != null) {
            return _flip2!!
        }
        _flip2 = Builder(name = "Flip2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.09f, 19.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-1.3f, 1.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 1.42f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineTo(18.09f, 17.0f)
                horizontalLineToRelative(-12.0f)
                arcTo(1.56f, 1.56f, 0.0f, false, true, 4.5f, 15.47f)
                verticalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(2.47f)
                arcTo(3.56f, 3.56f, 0.0f, false, false, 6.09f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.79f, 9.71f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 7.21f, 8.29f)
                lineTo(5.91f, 7.0f)
                horizontalLineToRelative(12.0f)
                arcTo(1.56f, 1.56f, 0.0f, false, true, 19.5f, 8.53f)
                verticalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(8.53f)
                arcTo(3.56f, 3.56f, 0.0f, false, false, 17.91f, 5.0f)
                horizontalLineToRelative(-12.0f)
                lineToRelative(1.3f, -1.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                close()
            }
        }
        .build()
        return _flip2!!
    }

private var _flip2: ImageVector? = null
