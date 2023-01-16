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

public val MaterialDesignIcons.PuzzleOutline: ImageVector
    get() {
        if (_puzzleOutline != null) {
            return _puzzleOutline!!
        }
        _puzzleOutline = Builder(name = "PuzzleOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.5f)
                curveTo(22.0f, 15.26f, 20.7f, 16.72f, 19.0f, 16.96f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 22.0f)
                horizontalLineTo(13.2f)
                verticalLineTo(21.7f)
                arcTo(2.7f, 2.7f, 0.0f, false, false, 10.5f, 19.0f)
                curveTo(9.0f, 19.0f, 7.8f, 20.21f, 7.8f, 21.7f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(16.2f)
                horizontalLineTo(2.3f)
                curveTo(3.79f, 16.2f, 5.0f, 15.0f, 5.0f, 13.5f)
                curveTo(5.0f, 12.0f, 3.79f, 10.8f, 2.3f, 10.8f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 5.0f)
                horizontalLineTo(7.04f)
                curveTo(7.28f, 3.3f, 8.74f, 2.0f, 10.5f, 2.0f)
                curveTo(12.26f, 2.0f, 13.72f, 3.3f, 13.96f, 5.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 7.0f)
                verticalLineTo(10.04f)
                curveTo(20.7f, 10.28f, 22.0f, 11.74f, 22.0f, 13.5f)
                moveTo(17.0f, 15.0f)
                horizontalLineTo(18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.12f)
                curveTo(5.76f, 9.8f, 7.0f, 11.5f, 7.0f, 13.5f)
                curveTo(7.0f, 15.5f, 5.75f, 17.2f, 4.0f, 17.88f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.12f)
                curveTo(6.8f, 18.25f, 8.5f, 17.0f, 10.5f, 17.0f)
                curveTo(12.5f, 17.0f, 14.2f, 18.25f, 14.88f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _puzzleOutline!!
    }

private var _puzzleOutline: ImageVector? = null
