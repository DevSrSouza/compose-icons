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

public val FillGroup.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.22f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.76f)
                arcToRelative(8.91f, 8.91f, 0.0f, false, false, -7.8f, -6.69f)
                verticalLineToRelative(1.12f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, -1.09f, 1.64f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.18f, 16.0f)
                lineTo(3.12f, 11.59f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 0.0f, -2.68f)
                lineTo(8.18f, 4.49f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.18f, -0.3f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, 1.09f, 1.64f)
                verticalLineTo(7.0f)
                arcTo(10.89f, 10.89f, 0.0f, false, true, 21.5f, 17.75f)
                arcToRelative(10.29f, 10.29f, 0.0f, false, true, -0.31f, 2.49f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 0.76f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
