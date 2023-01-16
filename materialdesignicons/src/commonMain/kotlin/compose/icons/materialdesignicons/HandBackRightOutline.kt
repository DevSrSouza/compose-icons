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

public val MaterialDesignIcons.HandBackRightOutline: ImageVector
    get() {
        if (_handBackRightOutline != null) {
            return _handBackRightOutline!!
        }
        _handBackRightOutline = Builder(name = "HandBackRightOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                curveTo(21.0f, 5.62f, 19.88f, 4.5f, 18.5f, 4.5f)
                curveTo(18.33f, 4.5f, 18.16f, 4.5f, 18.0f, 4.55f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 2.62f, 16.88f, 1.5f, 15.5f, 1.5f)
                curveTo(15.27f, 1.5f, 15.04f, 1.53f, 14.83f, 1.59f)
                curveTo(14.46f, 0.66f, 13.56f, 0.0f, 12.5f, 0.0f)
                curveTo(11.27f, 0.0f, 10.25f, 0.89f, 10.04f, 2.06f)
                curveTo(9.87f, 2.0f, 9.69f, 2.0f, 9.5f, 2.0f)
                curveTo(8.12f, 2.0f, 7.0f, 3.12f, 7.0f, 4.5f)
                verticalLineTo(10.39f)
                curveTo(6.66f, 10.08f, 6.24f, 9.85f, 5.78f, 9.73f)
                lineTo(5.0f, 9.5f)
                curveTo(4.18f, 9.29f, 3.31f, 9.61f, 2.82f, 10.35f)
                curveTo(2.44f, 10.92f, 2.42f, 11.66f, 2.67f, 12.3f)
                lineTo(5.23f, 18.73f)
                curveTo(6.5f, 21.91f, 9.57f, 24.0f, 13.0f, 24.0f)
                curveTo(17.42f, 24.0f, 21.0f, 20.42f, 21.0f, 16.0f)
                verticalLineTo(7.0f)
                moveTo(19.0f, 16.0f)
                curveTo(19.0f, 19.31f, 16.31f, 22.0f, 13.0f, 22.0f)
                curveTo(10.39f, 22.0f, 8.05f, 20.41f, 7.09f, 18.0f)
                lineTo(4.5f, 11.45f)
                lineTo(5.0f, 11.59f)
                curveTo(5.5f, 11.71f, 5.85f, 12.05f, 6.0f, 12.5f)
                lineTo(7.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.5f)
                curveTo(9.0f, 4.22f, 9.22f, 4.0f, 9.5f, 4.0f)
                reflectiveCurveTo(10.0f, 4.22f, 10.0f, 4.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f)
                reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                curveTo(15.0f, 3.72f, 15.22f, 3.5f, 15.5f, 3.5f)
                reflectiveCurveTo(16.0f, 3.72f, 16.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 6.72f, 18.22f, 6.5f, 18.5f, 6.5f)
                reflectiveCurveTo(19.0f, 6.72f, 19.0f, 7.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _handBackRightOutline!!
    }

private var _handBackRightOutline: ImageVector? = null
