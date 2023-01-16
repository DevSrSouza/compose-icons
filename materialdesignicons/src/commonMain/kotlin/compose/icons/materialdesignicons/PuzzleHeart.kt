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

public val MaterialDesignIcons.PuzzleHeart: ImageVector
    get() {
        if (_puzzleHeart != null) {
            return _puzzleHeart!!
        }
        _puzzleHeart = Builder(name = "PuzzleHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.3f)
                lineTo(18.4f, 21.8f)
                curveTo(16.4f, 19.9f, 15.0f, 18.7f, 15.0f, 17.2f)
                curveTo(15.0f, 16.0f, 16.0f, 15.0f, 17.2f, 15.0f)
                curveTo(17.9f, 15.0f, 18.6f, 15.3f, 19.0f, 15.8f)
                curveTo(19.4f, 15.3f, 20.1f, 15.0f, 20.8f, 15.0f)
                curveTo(22.0f, 15.0f, 23.0f, 15.9f, 23.0f, 17.2f)
                curveTo(23.0f, 18.7f, 21.6f, 19.9f, 19.6f, 21.8f)
                lineTo(19.0f, 22.3f)
                moveTo(20.5f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 5.89f, 18.1f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                curveTo(13.0f, 2.12f, 11.88f, 1.0f, 10.5f, 1.0f)
                reflectiveCurveTo(8.0f, 2.12f, 8.0f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f)
                verticalLineTo(10.8f)
                horizontalLineTo(3.5f)
                curveTo(5.0f, 10.8f, 6.2f, 12.0f, 6.2f, 13.5f)
                reflectiveCurveTo(5.0f, 16.2f, 3.5f, 16.2f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(7.8f)
                verticalLineTo(20.5f)
                curveTo(7.8f, 19.0f, 9.0f, 17.8f, 10.5f, 17.8f)
                curveTo(11.44f, 17.8f, 12.27f, 18.27f, 12.75f, 19.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.67f, 13.0f, 18.34f, 13.0f, 18.0f)
                curveTo(13.0f, 14.69f, 15.69f, 12.0f, 19.0f, 12.0f)
                curveTo(20.54f, 12.0f, 21.94f, 12.58f, 23.0f, 13.53f)
                curveTo(23.0f, 13.5f, 23.0f, 13.5f, 23.0f, 13.5f)
                curveTo(23.0f, 12.12f, 21.88f, 11.0f, 20.5f, 11.0f)
                close()
            }
        }
        .build()
        return _puzzleHeart!!
    }

private var _puzzleHeart: ImageVector? = null
