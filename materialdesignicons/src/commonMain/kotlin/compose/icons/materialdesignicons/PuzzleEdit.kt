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

public val MaterialDesignIcons.PuzzleEdit: ImageVector
    get() {
        if (_puzzleEdit != null) {
            return _puzzleEdit!!
        }
        _puzzleEdit = Builder(name = "PuzzleEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.04f, 12.13f)
                curveTo(20.9f, 12.13f, 20.76f, 12.19f, 20.65f, 12.3f)
                lineTo(19.65f, 13.3f)
                lineTo(21.7f, 15.35f)
                lineTo(22.7f, 14.35f)
                curveTo(22.92f, 14.14f, 22.92f, 13.79f, 22.7f, 13.58f)
                lineTo(21.42f, 12.3f)
                curveTo(21.31f, 12.19f, 21.18f, 12.13f, 21.04f, 12.13f)
                moveTo(19.07f, 13.88f)
                lineTo(13.0f, 19.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 15.93f)
                lineTo(19.07f, 13.88f)
                moveTo(19.0f, 11.12f)
                lineTo(11.91f, 18.2f)
                curveTo(11.5f, 17.95f, 11.0f, 17.8f, 10.5f, 17.8f)
                curveTo(9.0f, 17.8f, 7.8f, 19.0f, 7.8f, 20.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(16.2f)
                horizontalLineTo(3.5f)
                curveTo(5.0f, 16.2f, 6.2f, 15.0f, 6.2f, 13.5f)
                reflectiveCurveTo(5.0f, 10.8f, 3.5f, 10.8f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.9f, 2.9f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.5f)
                curveTo(8.0f, 2.12f, 9.12f, 1.0f, 10.5f, 1.0f)
                reflectiveCurveTo(13.0f, 2.12f, 13.0f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 5.0f, 19.0f, 5.89f, 19.0f, 7.0f)
                verticalLineTo(11.12f)
                close()
            }
        }
        .build()
        return _puzzleEdit!!
    }

private var _puzzleEdit: ImageVector? = null
