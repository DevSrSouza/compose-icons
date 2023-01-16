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

public val MaterialDesignIcons.PuzzleCheck: ImageVector
    get() {
        if (_puzzleCheck != null) {
            return _puzzleCheck!!
        }
        _puzzleCheck = Builder(name = "PuzzleCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 17.0f)
                lineTo(18.5f, 22.0f)
                lineTo(15.0f, 18.5f)
                lineTo(16.5f, 17.0f)
                lineTo(18.5f, 19.0f)
                lineTo(22.0f, 15.5f)
                lineTo(23.5f, 17.0f)
                moveTo(20.5f, 11.0f)
                curveTo(21.88f, 11.0f, 23.0f, 12.12f, 23.0f, 13.5f)
                curveTo(23.0f, 13.81f, 22.94f, 14.11f, 22.84f, 14.39f)
                curveTo(21.8f, 13.5f, 20.46f, 13.0f, 19.0f, 13.0f)
                curveTo(15.69f, 13.0f, 13.0f, 15.69f, 13.0f, 19.0f)
                verticalLineTo(19.54f)
                curveTo(12.64f, 18.5f, 11.65f, 17.8f, 10.5f, 17.8f)
                curveTo(9.0f, 17.8f, 7.8f, 19.0f, 7.8f, 20.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(16.2f)
                horizontalLineTo(3.5f)
                curveTo(5.0f, 16.2f, 6.2f, 15.0f, 6.2f, 13.5f)
                reflectiveCurveTo(5.0f, 10.8f, 3.5f, 10.8f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.89f, 2.9f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.5f)
                curveTo(8.0f, 2.12f, 9.12f, 0.998f, 10.5f, 0.998f)
                reflectiveCurveTo(13.0f, 2.12f, 13.0f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 5.0f, 19.0f, 5.89f, 19.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.5f)
            }
        }
        .build()
        return _puzzleCheck!!
    }

private var _puzzleCheck: ImageVector? = null
