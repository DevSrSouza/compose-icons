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

public val FillGroup.CornerRightDown: ImageVector
    get() {
        if (_cornerRightDown != null) {
            return _cornerRightDown!!
        }
        _cornerRightDown = Builder(name = "CornerRightDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(18.78f, 14.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -0.16f)
                lineTo(14.0f, 16.92f)
                verticalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.92f)
                lineToRelative(-3.38f, -2.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.24f, 1.56f)
                lineToRelative(5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.24f, 0.0f)
                lineToRelative(5.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.78f, 14.38f)
                close()
            }
        }
        .build()
        return _cornerRightDown!!
    }

private var _cornerRightDown: ImageVector? = null
