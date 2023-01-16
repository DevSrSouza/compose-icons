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

public val MaterialDesignIcons.PuzzleMinus: ImageVector
    get() {
        if (_puzzleMinus != null) {
            return _puzzleMinus!!
        }
        _puzzleMinus = Builder(name = "PuzzleMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.04f, 19.61f)
                curveTo(12.67f, 18.55f, 11.68f, 17.8f, 10.5f, 17.8f)
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
                verticalLineTo(11.0f)
                horizontalLineTo(20.5f)
                curveTo(21.88f, 11.0f, 23.0f, 12.12f, 23.0f, 13.5f)
                curveTo(23.0f, 13.82f, 22.94f, 14.12f, 22.83f, 14.39f)
                curveTo(21.79f, 13.53f, 20.46f, 13.0f, 19.0f, 13.0f)
                curveTo(15.69f, 13.0f, 13.0f, 15.69f, 13.0f, 19.0f)
                curveTo(13.0f, 19.2f, 13.0f, 19.41f, 13.04f, 19.61f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _puzzleMinus!!
    }

private var _puzzleMinus: ImageVector? = null
