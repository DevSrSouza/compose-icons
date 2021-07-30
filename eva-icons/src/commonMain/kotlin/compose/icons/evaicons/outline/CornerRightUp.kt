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

public val OutlineGroup.CornerRightUp: ImageVector
    get() {
        if (_cornerRightUp != null) {
            return _cornerRightUp!!
        }
        _cornerRightUp = Builder(name = "CornerRightUp", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(18.62f, 8.22f)
                lineToRelative(-5.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.24f, 0.0f)
                lineToRelative(-5.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.62f, 9.78f)
                lineTo(12.0f, 7.08f)
                verticalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(7.08f)
                lineToRelative(3.38f, 2.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -0.38f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.62f, 8.22f)
                close()
            }
        }
        .build()
        return _cornerRightUp!!
    }

private var _cornerRightUp: ImageVector? = null
