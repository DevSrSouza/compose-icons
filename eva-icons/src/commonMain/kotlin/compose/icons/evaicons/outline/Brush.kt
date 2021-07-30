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

public val OutlineGroup.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.0f, 6.83f)
                arcToRelative(2.76f, 2.76f, 0.0f, false, false, -0.82f, -2.0f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, -4.0f, 0.0f)
                lineTo(8.58f, 11.43f)
                lineToRelative(-0.22f, 0.0f)
                arcToRelative(4.42f, 4.42f, 0.0f, false, false, -4.3f, 4.31f)
                lineTo(4.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.29f, 0.73f)
                arcTo(1.05f, 1.05f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineTo(5.0f)
                lineToRelative(3.26f, -0.06f)
                arcToRelative(4.42f, 4.42f, 0.0f, false, false, 4.31f, -4.3f)
                curveToRelative(0.0f, -0.08f, 0.0f, -0.15f, 0.0f, -0.23f)
                lineToRelative(6.61f, -6.6f)
                arcTo(2.74f, 2.74f, 0.0f, false, false, 20.0f, 6.83f)
                close()
                moveTo(8.25f, 17.94f)
                lineTo(6.0f, 18.0f)
                lineToRelative(0.0f, -2.23f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 8.4f, 13.41f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, true, 2.15f, 2.19f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 8.25f, 17.94f)
                close()
                moveTo(17.77f, 7.39f)
                lineTo(11.9f, 13.26f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, false, -0.52f, -0.64f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, -0.64f, -0.52f)
                lineToRelative(5.87f, -5.86f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, 1.16f, 0.0f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, 0.23f, 0.59f)
                arcTo(0.79f, 0.79f, 0.0f, false, true, 17.77f, 7.39f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
