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

public val MaterialDesignIcons.PuzzleCheckOutline: ImageVector
    get() {
        if (_puzzleCheckOutline != null) {
            return _puzzleCheckOutline!!
        }
        _puzzleCheckOutline = Builder(name = "PuzzleCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(22.0f, 13.5f)
                lineTo(22.0f, 13.8f)
                curveTo(21.37f, 13.44f, 20.67f, 13.19f, 19.94f, 13.07f)
                curveTo(19.75f, 12.45f, 19.18f, 12.0f, 18.5f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.5f)
                curveTo(12.0f, 4.67f, 11.33f, 4.0f, 10.5f, 4.0f)
                curveTo(9.67f, 4.0f, 9.0f, 4.67f, 9.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 9.12f)
                curveTo(5.76f, 9.8f, 7.0f, 11.5f, 7.0f, 13.5f)
                curveTo(7.0f, 15.5f, 5.75f, 17.2f, 4.0f, 17.88f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.12f)
                curveTo(6.8f, 18.25f, 8.5f, 17.0f, 10.5f, 17.0f)
                curveTo(11.47f, 17.0f, 12.37f, 17.3f, 13.12f, 17.8f)
                lineTo(13.0f, 19.0f)
                curveTo(13.0f, 20.09f, 13.29f, 21.12f, 13.8f, 22.0f)
                horizontalLineTo(13.2f)
                verticalLineTo(21.7f)
                curveTo(13.2f, 20.21f, 12.0f, 19.0f, 10.5f, 19.0f)
                curveTo(9.0f, 19.0f, 7.8f, 20.21f, 7.8f, 21.7f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(16.2f)
                horizontalLineTo(2.3f)
                curveTo(3.79f, 16.2f, 5.0f, 15.0f, 5.0f, 13.5f)
                curveTo(5.0f, 12.0f, 3.79f, 10.8f, 2.3f, 10.8f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.9f, 2.9f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(7.04f)
                curveTo(7.28f, 3.3f, 8.74f, 2.0f, 10.5f, 2.0f)
                curveTo(12.26f, 2.0f, 13.72f, 3.3f, 13.96f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 5.0f, 19.0f, 5.9f, 19.0f, 7.0f)
                verticalLineTo(10.04f)
                curveTo(20.7f, 10.28f, 22.0f, 11.74f, 22.0f, 13.5f)
                close()
            }
        }
        .build()
        return _puzzleCheckOutline!!
    }

private var _puzzleCheckOutline: ImageVector? = null
