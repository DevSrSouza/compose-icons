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

public val FillGroup.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) {
            return _arrowCircleUp!!
        }
        _arrowCircleUp = Builder(name = "ArrowCircleUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                close()
                moveTo(8.31f, 10.14f)
                lineToRelative(3.0f, -2.86f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.15f, -0.1f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.16f, -0.1f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 0.76f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.33f, 0.21f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 1.42f)
                lineTo(13.0f, 10.41f)
                verticalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(10.34f)
                lineTo(9.69f, 11.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.38f, -1.45f)
                close()
            }
        }
        .build()
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
