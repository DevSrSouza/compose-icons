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

public val OutlineGroup.Pantone: ImageVector
    get() {
        if (_pantone != null) {
            return _pantone!!
        }
        _pantone = Builder(name = "Pantone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.0f, 13.18f)
                lineTo(15.94f, 13.18f)
                lineToRelative(2.3f, -2.47f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.41f)
                lineTo(14.05f, 5.44f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, -0.71f, -0.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.7f, 0.31f)
                lineToRelative(-1.82f, 2.0f)
                lineTo(10.82f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(4.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 4.0f)
                lineTo(3.0f, 17.09f)
                arcTo(3.91f, 3.91f, 0.0f, false, false, 6.91f, 21.0f)
                lineTo(20.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(21.0f, 14.18f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 13.18f)
                close()
                moveTo(13.42f, 7.59f)
                lineToRelative(2.67f, 2.49f)
                lineToRelative(-5.27f, 5.66f)
                lineTo(10.82f, 10.38f)
                close()
                moveTo(8.82f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 13.0f)
                lineTo(5.0f, 10.0f)
                close()
                moveTo(8.82f, 5.0f)
                lineTo(8.82f, 8.0f)
                lineTo(5.0f, 8.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(5.0f, 17.09f)
                lineTo(5.0f, 15.0f)
                lineTo(8.82f, 15.0f)
                verticalLineToRelative(2.09f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, -3.82f, 0.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(10.51f, 19.0f)
                lineToRelative(3.56f, -3.82f)
                lineTo(19.0f, 15.18f)
                close()
            }
        }
        .build()
        return _pantone!!
    }

private var _pantone: ImageVector? = null
