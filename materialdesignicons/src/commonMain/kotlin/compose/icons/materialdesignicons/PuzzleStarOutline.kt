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

public val MaterialDesignIcons.PuzzleStarOutline: ImageVector
    get() {
        if (_puzzleStarOutline != null) {
            return _puzzleStarOutline!!
        }
        _puzzleStarOutline = Builder(name = "PuzzleStarOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2f, 22.0f)
                verticalLineTo(21.7f)
                curveTo(13.2f, 20.21f, 12.0f, 19.0f, 10.5f, 19.0f)
                curveTo(9.0f, 19.0f, 7.8f, 20.21f, 7.8f, 21.7f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(16.2f)
                horizontalLineTo(2.3f)
                curveTo(3.79f, 16.2f, 5.0f, 15.0f, 5.0f, 13.5f)
                reflectiveCurveTo(3.79f, 10.8f, 2.3f, 10.8f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.9f, 2.9f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(7.04f)
                curveTo(7.28f, 3.3f, 8.74f, 2.0f, 10.5f, 2.0f)
                reflectiveCurveTo(13.72f, 3.3f, 13.96f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 5.0f, 19.0f, 5.9f, 19.0f, 7.0f)
                verticalLineTo(10.04f)
                curveTo(20.45f, 10.25f, 21.61f, 11.34f, 21.91f, 12.76f)
                curveTo(21.05f, 12.28f, 20.06f, 12.0f, 19.0f, 12.0f)
                curveTo(18.89f, 12.0f, 18.78f, 12.0f, 18.67f, 12.0f)
                curveTo(18.61f, 12.0f, 18.56f, 12.0f, 18.5f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.5f)
                curveTo(12.0f, 4.67f, 11.33f, 4.0f, 10.5f, 4.0f)
                reflectiveCurveTo(9.0f, 4.67f, 9.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.12f)
                curveTo(5.76f, 9.8f, 7.0f, 11.5f, 7.0f, 13.5f)
                reflectiveCurveTo(5.75f, 17.2f, 4.0f, 17.88f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.12f)
                curveTo(6.8f, 18.25f, 8.5f, 17.0f, 10.5f, 17.0f)
                curveTo(11.43f, 17.0f, 12.29f, 17.28f, 13.0f, 17.74f)
                curveTo(13.0f, 17.83f, 13.0f, 17.91f, 13.0f, 18.0f)
                curveTo(13.0f, 19.54f, 13.58f, 20.94f, 14.54f, 22.0f)
                horizontalLineTo(13.2f)
                moveTo(19.0f, 20.09f)
                lineTo(16.5f, 21.58f)
                lineTo(17.18f, 18.77f)
                lineTo(15.0f, 16.89f)
                lineTo(17.87f, 16.64f)
                lineTo(19.0f, 14.0f)
                lineTo(20.11f, 16.64f)
                lineTo(23.0f, 16.89f)
                lineTo(20.8f, 18.77f)
                lineTo(21.45f, 21.58f)
                lineTo(19.0f, 20.09f)
            }
        }
        .build()
        return _puzzleStarOutline!!
    }

private var _puzzleStarOutline: ImageVector? = null
