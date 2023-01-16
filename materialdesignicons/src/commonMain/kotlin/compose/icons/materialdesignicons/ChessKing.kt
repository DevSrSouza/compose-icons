package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 10.0f)
                curveTo(15.58f, 10.0f, 14.26f, 10.77f, 13.55f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.45f)
                curveTo(9.35f, 10.09f, 6.9f, 9.43f, 5.0f, 10.54f)
                curveTo(3.07f, 11.64f, 2.42f, 14.09f, 3.5f, 16.0f)
                curveTo(4.24f, 17.24f, 5.57f, 18.0f, 7.0f, 18.0f)
                horizontalLineTo(17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 21.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 17.0f, 10.0f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
