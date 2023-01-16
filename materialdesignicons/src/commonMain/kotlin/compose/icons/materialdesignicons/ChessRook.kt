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

public val MaterialDesignIcons.ChessRook: ImageVector
    get() {
        if (_chessRook != null) {
            return _chessRook!!
        }
        _chessRook = Builder(name = "ChessRook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                moveTo(17.0f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
