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

public val FillGroup.Layers: ImageVector
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
                moveTo(3.24f, 7.29f)
                lineToRelative(8.52f, 4.63f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, 0.48f, 0.0f)
                lineToRelative(8.52f, -4.63f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.05f, -0.81f)
                lineTo(12.19f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.38f, 0.0f)
                lineTo(3.29f, 6.48f)
                arcTo(0.44f, 0.44f, 0.0f, false, false, 3.24f, 7.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 10.66f)
                lineToRelative(-1.83f, -0.78f)
                lineToRelative(-6.64f, 3.61f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.48f, 0.0f)
                lineTo(5.12f, 9.88f)
                lineToRelative(-1.83f, 0.78f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, 0.0f, 0.85f)
                lineToRelative(8.52f, 4.9f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.48f, 0.0f)
                lineToRelative(8.52f, -4.9f)
                arcTo(0.48f, 0.48f, 0.0f, false, false, 20.71f, 10.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 15.1f)
                lineToRelative(-1.56f, -0.68f)
                lineToRelative(-6.91f, 3.76f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.48f, 0.0f)
                lineTo(4.85f, 14.42f)
                lineToRelative(-1.56f, 0.68f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, 0.0f, 0.87f)
                lineToRelative(8.52f, 5.0f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, 0.48f, 0.0f)
                lineToRelative(8.52f, -5.0f)
                arcTo(0.49f, 0.49f, 0.0f, false, false, 20.71f, 15.1f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
