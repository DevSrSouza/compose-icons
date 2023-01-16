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

public val MaterialDesignIcons.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 5.0f)
                curveTo(20.0f, 5.81f, 19.5f, 6.5f, 18.83f, 6.82f)
                lineTo(17.0f, 13.15f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.15f)
                lineTo(5.17f, 6.82f)
                curveTo(4.5f, 6.5f, 4.0f, 5.81f, 4.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 5.0f)
                curveTo(8.0f, 5.5f, 7.82f, 5.95f, 7.5f, 6.3f)
                lineTo(10.3f, 9.35f)
                lineTo(10.83f, 5.62f)
                curveTo(10.33f, 5.26f, 10.0f, 4.67f, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 4.0f)
                curveTo(14.0f, 4.67f, 13.67f, 5.26f, 13.17f, 5.62f)
                lineTo(13.7f, 9.35f)
                lineTo(16.47f, 6.29f)
                curveTo(16.18f, 5.94f, 16.0f, 5.5f, 16.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 3.0f)
                moveTo(5.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
