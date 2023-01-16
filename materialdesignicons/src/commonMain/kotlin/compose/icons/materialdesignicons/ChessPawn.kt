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

public val MaterialDesignIcons.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                moveTo(16.0f, 18.0f)
                horizontalLineTo(8.0f)
                lineTo(10.18f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.72f)
                lineTo(10.79f, 7.74f)
                curveTo(10.1f, 7.44f, 9.55f, 6.89f, 9.25f, 6.2f)
                curveTo(8.58f, 4.68f, 9.27f, 2.91f, 10.79f, 2.25f)
                curveTo(12.31f, 1.58f, 14.08f, 2.27f, 14.74f, 3.79f)
                curveTo(15.41f, 5.31f, 14.72f, 7.07f, 13.2f, 7.74f)
                lineTo(13.27f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.82f)
                lineTo(16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
