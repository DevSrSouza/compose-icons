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

public val FillGroup.CornerUpLeft: ImageVector
    get() {
        if (_cornerUpLeft != null) {
            return _cornerUpLeft!!
        }
        _cornerUpLeft = Builder(name = "CornerUpLeft", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(16.0f, 10.0f)
                horizontalLineTo(7.08f)
                lineToRelative(2.7f, -3.38f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 8.22f, 5.38f)
                lineToRelative(-4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.24f)
                lineToRelative(4.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.62f, -0.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.16f, -1.4f)
                lineTo(7.08f, 12.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _cornerUpLeft!!
    }

private var _cornerUpLeft: ImageVector? = null
