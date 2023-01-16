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

public val MaterialDesignIcons.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                moveTo(13.0f, 2.0f)
                verticalLineTo(2.0f)
                curveTo(11.75f, 2.0f, 10.58f, 2.62f, 9.89f, 3.66f)
                lineTo(7.0f, 8.0f)
                lineTo(9.0f, 10.0f)
                lineTo(11.06f, 8.63f)
                curveTo(11.5f, 8.32f, 12.14f, 8.44f, 12.45f, 8.9f)
                curveTo(12.47f, 8.93f, 12.5f, 8.96f, 12.5f, 9.0f)
                verticalLineTo(9.0f)
                curveTo(12.8f, 9.59f, 12.69f, 10.3f, 12.22f, 10.77f)
                lineTo(7.42f, 15.57f)
                curveTo(6.87f, 16.13f, 6.87f, 17.03f, 7.43f, 17.58f)
                curveTo(7.69f, 17.84f, 8.05f, 18.0f, 8.42f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 13.0f, 2.0f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
