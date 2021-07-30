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

public val FillGroup.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = Builder(name = "ArrowCircleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(10.14f, 15.69f)
                lineToRelative(-2.86f, -3.0f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.1f, -0.15f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.1f, -0.16f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 0.0f, -0.76f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.21f, -0.33f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 1.42f)
                lineTo(10.41f, 11.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(10.34f)
                lineToRelative(1.25f, 1.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.45f, 1.38f)
                close()
            }
        }
        .build()
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
