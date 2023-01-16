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

public val MaterialDesignIcons.PuzzlePlusOutline: ImageVector
    get() {
        if (_puzzlePlusOutline != null) {
            return _puzzlePlusOutline!!
        }
        _puzzlePlusOutline = Builder(name = "PuzzlePlusOutline", defaultWidth = 24.0.dp,
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
                curveTo(20.7f, 10.28f, 22.0f, 11.74f, 22.0f, 13.5f)
                curveTo(22.0f, 13.6f, 22.0f, 13.7f, 21.97f, 13.79f)
                curveTo(21.35f, 13.44f, 20.67f, 13.2f, 19.93f, 13.08f)
                curveTo(19.75f, 12.46f, 19.18f, 12.0f, 18.5f, 12.0f)
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
                curveTo(11.47f, 17.0f, 12.37f, 17.3f, 13.12f, 17.81f)
                curveTo(13.04f, 18.19f, 13.0f, 18.59f, 13.0f, 19.0f)
                curveTo(13.0f, 20.1f, 13.3f, 21.12f, 13.81f, 22.0f)
                horizontalLineTo(13.2f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _puzzlePlusOutline!!
    }

private var _puzzlePlusOutline: ImageVector? = null
