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

public val OutlineGroup.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(21.0f, 11.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.61f, -0.86f)
                lineToRelative(-2.15f, -0.92f)
                lineToRelative(2.26f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, -0.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.61f, -0.86f)
                lineToRelative(-8.0f, -3.41f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.78f, 0.0f)
                lineToRelative(-8.0f, 3.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 7.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, 0.92f)
                lineToRelative(2.26f, 1.3f)
                lineToRelative(-2.15f, 0.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.61f, 0.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, 0.92f)
                lineToRelative(2.26f, 1.3f)
                lineToRelative(-2.15f, 0.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.61f, 0.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, 0.92f)
                lineToRelative(8.0f, 4.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.0f)
                lineToRelative(8.0f, -4.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, -0.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.61f, -0.86f)
                lineToRelative(-2.15f, -0.92f)
                lineToRelative(2.26f, -1.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 11.35f)
                close()
                moveTo(12.0f, 5.09f)
                lineToRelative(5.76f, 2.45f)
                lineTo(12.0f, 10.85f)
                lineTo(6.24f, 7.54f)
                close()
                moveTo(11.5f, 12.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.0f)
                lineToRelative(3.57f, -2.0f)
                lineToRelative(1.69f, 0.72f)
                lineTo(12.0f, 14.85f)
                lineTo(6.24f, 11.54f)
                lineToRelative(1.69f, -0.72f)
                close()
                moveTo(17.76f, 15.54f)
                lineTo(12.0f, 18.85f)
                lineTo(6.24f, 15.54f)
                lineToRelative(1.69f, -0.72f)
                lineToRelative(3.57f, 2.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.0f)
                lineToRelative(3.57f, -2.05f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
