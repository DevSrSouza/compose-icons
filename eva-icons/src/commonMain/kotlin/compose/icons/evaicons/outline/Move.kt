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

public val OutlineGroup.Move: ImageVector
    get() {
        if (_move != null) {
            return _move!!
        }
        _move = Builder(name = "Move", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(21.71f, 11.31f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineTo(18.58f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.41f)
                lineToRelative(1.29f, 1.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.71f, -0.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineToRelative(-3.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.7f, 0.29f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.71f, 6.71f)
                lineTo(11.0f, 5.42f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.41f)
                lineToRelative(1.3f, -1.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.29f, 8.29f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.29f, 0.71f)
                lineToRelative(3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.71f, -0.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineTo(5.42f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(5.59f)
                lineToRelative(-1.29f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineToRelative(3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 22.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.7f, -0.29f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.42f)
                lineTo(13.0f, 18.58f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(5.59f)
                lineToRelative(-1.3f, 1.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.71f, -0.29f)
                lineToRelative(3.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.71f, 11.31f)
                close()
            }
        }
        .build()
        return _move!!
    }

private var _move: ImageVector? = null
